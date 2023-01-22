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


#import "FITMessage+Internal.h"

#import "FITString.h"

#import "FITSoftwareMesg.h"

@implementation FITSoftwareMesg

- (instancetype)init {
    self = [super initWithFitMesgIndex:fit::Profile::MESG_SOFTWARE];

    return self;
}

// MessageIndex 
- (BOOL)isMessageIndexValid {
	const fit::Field* field = [super getField:254];
	if( FIT_NULL == field ) {
		return FALSE;
	}

	return field->IsValueValid() == FIT_TRUE ? TRUE : FALSE;
}

- (FITMessageIndex)getMessageIndex {
    return ([super getFieldUINT16ValueForField:254 forIndex:0 andSubFieldIndex:FIT_SUBFIELD_INDEX_MAIN_FIELD]);
}

- (void)setMessageIndex:(FITMessageIndex)messageIndex {
    [super setFieldUINT16ValueForField:254 andValue:(messageIndex) forIndex:0 andSubFieldIndex:FIT_SUBFIELD_INDEX_MAIN_FIELD];
} 

// Version 
- (BOOL)isVersionValid {
	const fit::Field* field = [super getField:3];
	if( FIT_NULL == field ) {
		return FALSE;
	}

	return field->IsValueValid() == FIT_TRUE ? TRUE : FALSE;
}

- (FITFloat32)getVersion {
    return ([super getFieldFLOAT32ValueForField:3 forIndex:0 andSubFieldIndex:FIT_SUBFIELD_INDEX_MAIN_FIELD]);
}

- (void)setVersion:(FITFloat32)version {
    [super setFieldFLOAT32ValueForField:3 andValue:(version) forIndex:0 andSubFieldIndex:FIT_SUBFIELD_INDEX_MAIN_FIELD];
} 

// PartNumber 
- (BOOL)isPartNumberValid {
	const fit::Field* field = [super getField:5];
	if( FIT_NULL == field ) {
		return FALSE;
	}

	return field->IsValueValid() == FIT_TRUE ? TRUE : FALSE;
}

- (NSString *)getPartNumber {
    return ([super getFieldSTRINGValueForField:5 forIndex:0 andSubFieldIndex:FIT_SUBFIELD_INDEX_MAIN_FIELD]);
}

- (void)setPartNumber:(NSString *)partNumber {
    [super setFieldSTRINGValueForField:5 andValue:(partNumber) forIndex:0];
} 

@end