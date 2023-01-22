///////////////////////////////////////////////////////////////////////////////////
// The following FIT Protocol software provided may be used with FIT protocol
// devices only and remains the copyrighted property of Garmin International, Inc.
// The software is being provided on an "as-is" basis and as an accommodation,
// and therefore all warranties, representations, or guarantees of any kind
// (whether express, implied or statutory) including, without limitation,
// warranties of merchantability, non-infringement, or fitness for a particular
// purpose, are specifically disclaimed.
//
// Copyright 2022 Garmin International, Inc.
///////////////////////////////////////////////////////////////////////////////////
// ****WARNING****  This file is auto-generated!  Do NOT edit this file.
// Profile Version = 21.84Release
// Tag = production/akw/21.84.00-0-g894a113c
///////////////////////////////////////////////////////////////////////////////////


#import <fstream>
#import <fit_encode.hpp>

#import "FITEncoder.h"

#import "FITMessage+Internal.h"

@interface FITEncoder ()
@property (nonatomic, readwrite, assign) fit::Encode *encoder;
@property (nonatomic, readwrite, assign) std::fstream *file;
@end

@implementation FITEncoder

-(instancetype)initWithVersion:(FITProtocolVersion)version {
    self = [super init];
    if (self) {
        _encoder = new fit::Encode(version == FITProtocolVersionV20 ? fit::ProtocolVersion::V20 : fit::ProtocolVersion::V10 );
    }
    return self;
}

-(void)dealloc {
    delete _encoder;
    _encoder = nullptr;

    [self closeFile];
}

-(BOOL)open:(NSString *)filename {
    _file = new std::fstream();
    _file->open(filename.UTF8String, std::ios::in | std::ios::out | std::ios::binary | std::ios::trunc);

    if(!_file->is_open()) {
        return NO;
    }

    _encoder->Open(*_file);

    return YES;
}


-(void)writeMessage:(FITMessage *)message {
    fit::Mesg *mesg = [message getInternalFitMesg];
    _encoder->Write(*mesg);
}

- (void)writeMessages:(NSArray<FITMessage *>*)mesgs {
    for (id mesg in mesgs) {
        [self writeMessage:mesg];
    }
}

-(BOOL)close {
    FIT_BOOL retval = _encoder->Close();

    [self closeFile];

    return retval == FIT_TRUE ? YES : NO;
}

-(void)closeFile {
    if (_file != nullptr) {
        if (_file->is_open()) {
            _file->close();
        }

        delete _file;
        _file = nullptr;
    }
}

@end
