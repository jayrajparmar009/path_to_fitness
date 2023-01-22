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

@interface FITTotalsMesg : FITMessage
- (id)init;
// MessageIndex 
- (BOOL)isMessageIndexValid;
- (FITMessageIndex)getMessageIndex;
- (void)setMessageIndex:(FITMessageIndex)messageIndex;
// Timestamp 
- (BOOL)isTimestampValid;
- (FITDate *)getTimestamp;
- (void)setTimestamp:(FITDate *)timestamp;
// TimerTime 
- (BOOL)isTimerTimeValid;
- (FITUInt32)getTimerTime;
- (void)setTimerTime:(FITUInt32)timerTime;
// Distance 
- (BOOL)isDistanceValid;
- (FITUInt32)getDistance;
- (void)setDistance:(FITUInt32)distance;
// Calories 
- (BOOL)isCaloriesValid;
- (FITUInt32)getCalories;
- (void)setCalories:(FITUInt32)calories;
// Sport 
- (BOOL)isSportValid;
- (FITSport)getSport;
- (void)setSport:(FITSport)sport;
// ElapsedTime 
- (BOOL)isElapsedTimeValid;
- (FITUInt32)getElapsedTime;
- (void)setElapsedTime:(FITUInt32)elapsedTime;
// Sessions 
- (BOOL)isSessionsValid;
- (FITUInt16)getSessions;
- (void)setSessions:(FITUInt16)sessions;
// ActiveTime 
- (BOOL)isActiveTimeValid;
- (FITUInt32)getActiveTime;
- (void)setActiveTime:(FITUInt32)activeTime;
// SportIndex 
- (BOOL)isSportIndexValid;
- (FITUInt8)getSportIndex;
- (void)setSportIndex:(FITUInt8)sportIndex;

@end

NS_ASSUME_NONNULL_END
