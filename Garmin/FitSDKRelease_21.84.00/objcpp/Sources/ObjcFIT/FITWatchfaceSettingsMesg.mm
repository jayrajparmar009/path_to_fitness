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


#import "FITWatchfaceSettingsMesg.h"

@implementation FITWatchfaceSettingsMesg

- (instancetype)init {
    self = [super initWithFitMesgIndex:fit::Profile::MESG_WATCHFACE_SETTINGS];

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

// Mode 
- (BOOL)isModeValid {
	const fit::Field* field = [super getField:0];
	if( FIT_NULL == field ) {
		return FALSE;
	}

	return field->IsValueValid() == FIT_TRUE ? TRUE : FALSE;
}

- (FITWatchfaceMode)getMode {
    return ([super getFieldENUMValueForField:0 forIndex:0 andSubFieldIndex:FIT_SUBFIELD_INDEX_MAIN_FIELD]);
}

- (void)setMode:(FITWatchfaceMode)mode {
    [super setFieldENUMValueForField:0 andValue:(mode) forIndex:0 andSubFieldIndex:FIT_SUBFIELD_INDEX_MAIN_FIELD];
} 

// Layout 
- (BOOL)isLayoutValid {
	const fit::Field* field = [super getField:1];
	if( FIT_NULL == field ) {
		return FALSE;
	}

	return field->IsValueValid() == FIT_TRUE ? TRUE : FALSE;
}

- (FITByte)getLayout {
    return ([super getFieldBYTEValueForField:1 forIndex:0 andSubFieldIndex:FIT_SUBFIELD_INDEX_MAIN_FIELD]);
}

- (void)setLayout:(FITByte)layout {
    [super setFieldBYTEValueForField:1 andValue:(layout) forIndex:0 andSubFieldIndex:FIT_SUBFIELD_INDEX_MAIN_FIELD];
} 
// Layout - Sub Fields
// DigitalLayout - Layout Field - Sub Field 
- (BOOL)isDigitalLayoutValid
{
    const fit::Field* field = [super getField:1];
    if( FIT_NULL == field ) {
        return FIT_FALSE;
    }

    if(![super canField:1 supportSubField:(FITUInt16)FITWatchfaceSettingsMesgLayoutFieldDigitalLayoutSubField]) {
        return FIT_FALSE;
    }

    return field->IsValueValid(0, FITWatchfaceSettingsMesgLayoutFieldDigitalLayoutSubField) == FIT_TRUE ? TRUE : FALSE;
}

- (FITDigitalWatchfaceLayout)getDigitalLayout
{
    return ([super getFieldENUMValueForField:1 forIndex:0 andSubFieldIndex:FITWatchfaceSettingsMesgLayoutFieldDigitalLayoutSubField]);
}

- (void)setDigitalLayout:(FITDigitalWatchfaceLayout)digitalLayout
{
    [super setFieldENUMValueForField:1 andValue:(digitalLayout) forIndex:0 andSubFieldIndex:FITWatchfaceSettingsMesgLayoutFieldDigitalLayoutSubField];
} 
// AnalogLayout - Layout Field - Sub Field 
- (BOOL)isAnalogLayoutValid
{
    const fit::Field* field = [super getField:1];
    if( FIT_NULL == field ) {
        return FIT_FALSE;
    }

    if(![super canField:1 supportSubField:(FITUInt16)FITWatchfaceSettingsMesgLayoutFieldAnalogLayoutSubField]) {
        return FIT_FALSE;
    }

    return field->IsValueValid(0, FITWatchfaceSettingsMesgLayoutFieldAnalogLayoutSubField) == FIT_TRUE ? TRUE : FALSE;
}

- (FITAnalogWatchfaceLayout)getAnalogLayout
{
    return ([super getFieldENUMValueForField:1 forIndex:0 andSubFieldIndex:FITWatchfaceSettingsMesgLayoutFieldAnalogLayoutSubField]);
}

- (void)setAnalogLayout:(FITAnalogWatchfaceLayout)analogLayout
{
    [super setFieldENUMValueForField:1 andValue:(analogLayout) forIndex:0 andSubFieldIndex:FITWatchfaceSettingsMesgLayoutFieldAnalogLayoutSubField];
} 

@end
