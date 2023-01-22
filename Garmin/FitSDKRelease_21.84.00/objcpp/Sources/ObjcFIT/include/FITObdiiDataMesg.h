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

@interface FITObdiiDataMesg : FITMessage
- (id)init;
// Timestamp 
- (BOOL)isTimestampValid;
- (FITDate *)getTimestamp;
- (void)setTimestamp:(FITDate *)timestamp;
// TimestampMs 
- (BOOL)isTimestampMsValid;
- (FITUInt16)getTimestampMs;
- (void)setTimestampMs:(FITUInt16)timestampMs;
// TimeOffset 
@property(readonly,nonatomic) uint8_t numTimeOffsetValues;
- (BOOL)isTimeOffsetValidforIndex : (uint8_t)index;
- (FITUInt16)getTimeOffsetforIndex : (uint8_t)index;
- (void)setTimeOffset:(FITUInt16)timeOffset forIndex:(uint8_t)index;
// Pid 
- (BOOL)isPidValid;
- (FITByte)getPid;
- (void)setPid:(FITByte)pid;
// RawData 
@property(readonly,nonatomic) uint8_t numRawDataValues;
- (BOOL)isRawDataValidforIndex : (uint8_t)index;
- (FITByte)getRawDataforIndex : (uint8_t)index;
- (void)setRawData:(FITByte)rawData forIndex:(uint8_t)index;
// PidDataSize 
@property(readonly,nonatomic) uint8_t numPidDataSizeValues;
- (BOOL)isPidDataSizeValidforIndex : (uint8_t)index;
- (FITUInt8)getPidDataSizeforIndex : (uint8_t)index;
- (void)setPidDataSize:(FITUInt8)pidDataSize forIndex:(uint8_t)index;
// SystemTime 
@property(readonly,nonatomic) uint8_t numSystemTimeValues;
- (BOOL)isSystemTimeValidforIndex : (uint8_t)index;
- (FITUInt32)getSystemTimeforIndex : (uint8_t)index;
- (void)setSystemTime:(FITUInt32)systemTime forIndex:(uint8_t)index;
// StartTimestamp 
- (BOOL)isStartTimestampValid;
- (FITDate *)getStartTimestamp;
- (void)setStartTimestamp:(FITDate *)startTimestamp;
// StartTimestampMs 
- (BOOL)isStartTimestampMsValid;
- (FITUInt16)getStartTimestampMs;
- (void)setStartTimestampMs:(FITUInt16)startTimestampMs;

@end

NS_ASSUME_NONNULL_END
