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

#import "FITMessage.h"
#import "FITTypes.h"

NS_ASSUME_NONNULL_BEGIN

@interface FITSegmentLeaderboardEntryMesg : FITMessage
- (id)init;
// MessageIndex 
- (BOOL)isMessageIndexValid;
- (FITMessageIndex)getMessageIndex;
- (void)setMessageIndex:(FITMessageIndex)messageIndex;
// Name 
- (BOOL)isNameValid;
- (NSString *)getName;
- (void)setName:(NSString *)name;
// Type 
- (BOOL)isTypeValid;
- (FITSegmentLeaderboardType)getType;
- (void)setType:(FITSegmentLeaderboardType)type;
// GroupPrimaryKey 
- (BOOL)isGroupPrimaryKeyValid;
- (FITUInt32)getGroupPrimaryKey;
- (void)setGroupPrimaryKey:(FITUInt32)groupPrimaryKey;
// ActivityId 
- (BOOL)isActivityIdValid;
- (FITUInt32)getActivityId;
- (void)setActivityId:(FITUInt32)activityId;
// SegmentTime 
- (BOOL)isSegmentTimeValid;
- (FITFloat32)getSegmentTime;
- (void)setSegmentTime:(FITFloat32)segmentTime;
// ActivityIdString 
- (BOOL)isActivityIdStringValid;
- (NSString *)getActivityIdString;
- (void)setActivityIdString:(NSString *)activityIdString;

@end

NS_ASSUME_NONNULL_END