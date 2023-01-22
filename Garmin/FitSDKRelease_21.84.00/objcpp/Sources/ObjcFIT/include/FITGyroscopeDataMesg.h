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

@interface FITGyroscopeDataMesg : FITMessage
- (id)init;
// Timestamp 
- (BOOL)isTimestampValid;
- (FITDate *)getTimestamp;
- (void)setTimestamp:(FITDate *)timestamp;
// TimestampMs 
- (BOOL)isTimestampMsValid;
- (FITUInt16)getTimestampMs;
- (void)setTimestampMs:(FITUInt16)timestampMs;
// SampleTimeOffset 
@property(readonly,nonatomic) uint8_t numSampleTimeOffsetValues;
- (BOOL)isSampleTimeOffsetValidforIndex : (uint8_t)index;
- (FITUInt16)getSampleTimeOffsetforIndex : (uint8_t)index;
- (void)setSampleTimeOffset:(FITUInt16)sampleTimeOffset forIndex:(uint8_t)index;
// GyroX 
@property(readonly,nonatomic) uint8_t numGyroXValues;
- (BOOL)isGyroXValidforIndex : (uint8_t)index;
- (FITUInt16)getGyroXforIndex : (uint8_t)index;
- (void)setGyroX:(FITUInt16)gyroX forIndex:(uint8_t)index;
// GyroY 
@property(readonly,nonatomic) uint8_t numGyroYValues;
- (BOOL)isGyroYValidforIndex : (uint8_t)index;
- (FITUInt16)getGyroYforIndex : (uint8_t)index;
- (void)setGyroY:(FITUInt16)gyroY forIndex:(uint8_t)index;
// GyroZ 
@property(readonly,nonatomic) uint8_t numGyroZValues;
- (BOOL)isGyroZValidforIndex : (uint8_t)index;
- (FITUInt16)getGyroZforIndex : (uint8_t)index;
- (void)setGyroZ:(FITUInt16)gyroZ forIndex:(uint8_t)index;
// CalibratedGyroX 
@property(readonly,nonatomic) uint8_t numCalibratedGyroXValues;
- (BOOL)isCalibratedGyroXValidforIndex : (uint8_t)index;
- (FITFloat32)getCalibratedGyroXforIndex : (uint8_t)index;
- (void)setCalibratedGyroX:(FITFloat32)calibratedGyroX forIndex:(uint8_t)index;
// CalibratedGyroY 
@property(readonly,nonatomic) uint8_t numCalibratedGyroYValues;
- (BOOL)isCalibratedGyroYValidforIndex : (uint8_t)index;
- (FITFloat32)getCalibratedGyroYforIndex : (uint8_t)index;
- (void)setCalibratedGyroY:(FITFloat32)calibratedGyroY forIndex:(uint8_t)index;
// CalibratedGyroZ 
@property(readonly,nonatomic) uint8_t numCalibratedGyroZValues;
- (BOOL)isCalibratedGyroZValidforIndex : (uint8_t)index;
- (FITFloat32)getCalibratedGyroZforIndex : (uint8_t)index;
- (void)setCalibratedGyroZ:(FITFloat32)calibratedGyroZ forIndex:(uint8_t)index;

@end

NS_ASSUME_NONNULL_END
