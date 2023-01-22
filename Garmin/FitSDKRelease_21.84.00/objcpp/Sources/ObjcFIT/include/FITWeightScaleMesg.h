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


#import <Foundation/Foundation.h>

#import "FITDate.h"
#import "FITMessage.h"
#import "FITTypes.h"

NS_ASSUME_NONNULL_BEGIN

@interface FITWeightScaleMesg : FITMessage
- (id)init;
// Timestamp 
- (BOOL)isTimestampValid;
- (FITDate *)getTimestamp;
- (void)setTimestamp:(FITDate *)timestamp;
// Weight 
- (BOOL)isWeightValid;
- (FITFloat32)getWeight;
- (void)setWeight:(FITFloat32)weight;
// PercentFat 
- (BOOL)isPercentFatValid;
- (FITFloat32)getPercentFat;
- (void)setPercentFat:(FITFloat32)percentFat;
// PercentHydration 
- (BOOL)isPercentHydrationValid;
- (FITFloat32)getPercentHydration;
- (void)setPercentHydration:(FITFloat32)percentHydration;
// VisceralFatMass 
- (BOOL)isVisceralFatMassValid;
- (FITFloat32)getVisceralFatMass;
- (void)setVisceralFatMass:(FITFloat32)visceralFatMass;
// BoneMass 
- (BOOL)isBoneMassValid;
- (FITFloat32)getBoneMass;
- (void)setBoneMass:(FITFloat32)boneMass;
// MuscleMass 
- (BOOL)isMuscleMassValid;
- (FITFloat32)getMuscleMass;
- (void)setMuscleMass:(FITFloat32)muscleMass;
// BasalMet 
- (BOOL)isBasalMetValid;
- (FITFloat32)getBasalMet;
- (void)setBasalMet:(FITFloat32)basalMet;
// PhysiqueRating 
- (BOOL)isPhysiqueRatingValid;
- (FITUInt8)getPhysiqueRating;
- (void)setPhysiqueRating:(FITUInt8)physiqueRating;
// ActiveMet 
- (BOOL)isActiveMetValid;
- (FITFloat32)getActiveMet;
- (void)setActiveMet:(FITFloat32)activeMet;
// MetabolicAge 
- (BOOL)isMetabolicAgeValid;
- (FITUInt8)getMetabolicAge;
- (void)setMetabolicAge:(FITUInt8)metabolicAge;
// VisceralFatRating 
- (BOOL)isVisceralFatRatingValid;
- (FITUInt8)getVisceralFatRating;
- (void)setVisceralFatRating:(FITUInt8)visceralFatRating;
// UserProfileIndex 
- (BOOL)isUserProfileIndexValid;
- (FITMessageIndex)getUserProfileIndex;
- (void)setUserProfileIndex:(FITMessageIndex)userProfileIndex;

@end

NS_ASSUME_NONNULL_END
