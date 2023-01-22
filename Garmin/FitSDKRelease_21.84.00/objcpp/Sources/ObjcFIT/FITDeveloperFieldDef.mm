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


#import "FITDeveloperFieldDef.h"
#import "FITDeveloperFieldDef+Internal.h"
#import "FITString.h"

@interface FITDeveloperField ()

@property(nonatomic, assign) fit::DeveloperField *fit_developer_field;
@property(nonatomic, assign) FITFieldDescriptionMesg* definition;
@property(nonatomic, assign) FITDeveloperDataIdMesg* developer;

@end

@implementation FITDeveloperField

- (id)initWithFieldDescriptionMesg: (FITFieldDescriptionMesg*) definition andDeveloperDataIdMesg: (FITDeveloperDataIdMesg*) developer {

    if (self = [super init]) {
        self.definition = definition;
        self.developer = developer;
        self.fit_developer_field = [FITDeveloperField createFieldDescriptionMesgFromDefinition:definition andDeveloperDataIdMesg:developer];
    }
    return self;
}

- (void)dealloc {
    delete _fit_developer_field;
    _fit_developer_field = nullptr;
}


- (fit::DeveloperField *)fit_developer_field {
    return _fit_developer_field;
}

- (void)addValue:(NSNumber*)value forIndex:(uint8_t)index {
    _fit_developer_field->AddValue([value doubleValue],index);
}

- (NSNumber*)getValueForIndex:(uint8_t)index {
    FITFloat64 rawValue = _fit_developer_field->GetRawValue(index);

    if(rawValue == FITFloat64Invalid) {
        return nil;
    }

    return [NSNumber numberWithDouble:rawValue];
}

+ (fit::DeveloperField *)createFieldDescriptionMesgFromDefinition:(FITFieldDescriptionMesg*) fitFieldDescriptionMesg andDeveloperDataIdMesg: (FITDeveloperDataIdMesg*) fitDeveloperDataIdMesg {
    fit::FieldDescriptionMesg definition;

    if(fitFieldDescriptionMesg.isDeveloperDataIndexValid) {
        definition.SetDeveloperDataIndex(fitFieldDescriptionMesg.getDeveloperDataIndex);
    }

    if([fitFieldDescriptionMesg isFieldDefinitionNumberValid]) {
        definition.SetFieldDefinitionNumber(fitFieldDescriptionMesg.getFieldDefinitionNumber);
    }

    if([fitFieldDescriptionMesg isFitBaseTypeIdValid]) {
        definition.SetFitBaseTypeId(fitFieldDescriptionMesg.getFitBaseTypeId);
    }

    if([fitFieldDescriptionMesg isNativeFieldNumValid]) {
        definition.SetNativeFieldNum(fitFieldDescriptionMesg.getNativeFieldNum);
    }

    if([fitFieldDescriptionMesg isNativeMesgNumValid]) {
        definition.SetNativeMesgNum(fitFieldDescriptionMesg.getNativeMesgNum);
    }

    uint8_t numFieldNameValues = fitFieldDescriptionMesg.numFieldNameValues;
    for(uint8_t i=0; i<numFieldNameValues; i++ ) {
        if([fitFieldDescriptionMesg isFieldNameValidforIndex:i]){
            definition.SetFieldName(i, FITStringFromString([fitFieldDescriptionMesg getFieldNameforIndex:i]));
        }
    }

    uint8_t numUnitsValues = fitFieldDescriptionMesg.numUnitsValues;
    for(uint8_t i=0; i<numUnitsValues; i++ ) {
        if([fitFieldDescriptionMesg isUnitsValidforIndex:i]){
            definition.SetUnits(i, FITStringFromString([fitFieldDescriptionMesg getUnitsforIndex:i]));
        }
    }

    fit::DeveloperDataIdMesg developer;

    uint8_t numDeveloperIdValues = fitDeveloperDataIdMesg.numDeveloperIdValues;
    for(uint8_t i=0; i<numDeveloperIdValues; i++ ) {
        if([fitDeveloperDataIdMesg isDeveloperIdValidforIndex:i]){
            developer.SetDeveloperId(i, [fitDeveloperDataIdMesg getDeveloperIdforIndex:i]);
        }
    }

    uint8_t numApplicationIdValues = fitDeveloperDataIdMesg.numApplicationIdValues;
    for(uint8_t i=0; i<numApplicationIdValues; i++ ) {
        if([fitDeveloperDataIdMesg isApplicationIdValidforIndex:i]){
            developer.SetApplicationId(i, [fitDeveloperDataIdMesg getApplicationIdforIndex:i]);
        }
    }

    if(fitDeveloperDataIdMesg.isManufacturerIdValid) {
        developer.SetManufacturerId(fitDeveloperDataIdMesg.getManufacturerId);
    }

    if(fitDeveloperDataIdMesg.isDeveloperDataIndexValid) {
        developer.SetDeveloperDataIndex(fitDeveloperDataIdMesg.getDeveloperDataIndex);
    }

    if(fitDeveloperDataIdMesg.isApplicationVersionValid) {
        developer.SetApplicationVersion(fitDeveloperDataIdMesg.getApplicationVersion);
    }

    fit::DeveloperField *developerField = new fit::DeveloperField(definition,developer);

    return developerField;
}

@end
