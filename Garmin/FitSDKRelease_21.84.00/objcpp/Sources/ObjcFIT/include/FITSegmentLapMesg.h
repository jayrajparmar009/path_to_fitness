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

@interface FITSegmentLapMesg : FITMessage
- (id)init;
// MessageIndex 
- (BOOL)isMessageIndexValid;
- (FITMessageIndex)getMessageIndex;
- (void)setMessageIndex:(FITMessageIndex)messageIndex;
// Timestamp 
- (BOOL)isTimestampValid;
- (FITDate *)getTimestamp;
- (void)setTimestamp:(FITDate *)timestamp;
// Event 
- (BOOL)isEventValid;
- (FITEvent)getEvent;
- (void)setEvent:(FITEvent)event;
// EventType 
- (BOOL)isEventTypeValid;
- (FITEventType)getEventType;
- (void)setEventType:(FITEventType)eventType;
// StartTime 
- (BOOL)isStartTimeValid;
- (FITDate *)getStartTime;
- (void)setStartTime:(FITDate *)startTime;
// StartPositionLat 
- (BOOL)isStartPositionLatValid;
- (FITSInt32)getStartPositionLat;
- (void)setStartPositionLat:(FITSInt32)startPositionLat;
// StartPositionLong 
- (BOOL)isStartPositionLongValid;
- (FITSInt32)getStartPositionLong;
- (void)setStartPositionLong:(FITSInt32)startPositionLong;
// EndPositionLat 
- (BOOL)isEndPositionLatValid;
- (FITSInt32)getEndPositionLat;
- (void)setEndPositionLat:(FITSInt32)endPositionLat;
// EndPositionLong 
- (BOOL)isEndPositionLongValid;
- (FITSInt32)getEndPositionLong;
- (void)setEndPositionLong:(FITSInt32)endPositionLong;
// TotalElapsedTime 
- (BOOL)isTotalElapsedTimeValid;
- (FITFloat32)getTotalElapsedTime;
- (void)setTotalElapsedTime:(FITFloat32)totalElapsedTime;
// TotalTimerTime 
- (BOOL)isTotalTimerTimeValid;
- (FITFloat32)getTotalTimerTime;
- (void)setTotalTimerTime:(FITFloat32)totalTimerTime;
// TotalDistance 
- (BOOL)isTotalDistanceValid;
- (FITFloat32)getTotalDistance;
- (void)setTotalDistance:(FITFloat32)totalDistance;
// TotalCycles 
- (BOOL)isTotalCyclesValid;
- (FITUInt32)getTotalCycles;
- (void)setTotalCycles:(FITUInt32)totalCycles;
// TotalCycles Sub Fields
- (BOOL)isTotalStrokesValid;
- (FITUInt32) getTotalStrokes;
- (void)setTotalStrokes:(FITUInt32)totalStrokes;
// TotalCalories 
- (BOOL)isTotalCaloriesValid;
- (FITUInt16)getTotalCalories;
- (void)setTotalCalories:(FITUInt16)totalCalories;
// TotalFatCalories 
- (BOOL)isTotalFatCaloriesValid;
- (FITUInt16)getTotalFatCalories;
- (void)setTotalFatCalories:(FITUInt16)totalFatCalories;
// AvgSpeed 
- (BOOL)isAvgSpeedValid;
- (FITFloat32)getAvgSpeed;
- (void)setAvgSpeed:(FITFloat32)avgSpeed;
// MaxSpeed 
- (BOOL)isMaxSpeedValid;
- (FITFloat32)getMaxSpeed;
- (void)setMaxSpeed:(FITFloat32)maxSpeed;
// AvgHeartRate 
- (BOOL)isAvgHeartRateValid;
- (FITUInt8)getAvgHeartRate;
- (void)setAvgHeartRate:(FITUInt8)avgHeartRate;
// MaxHeartRate 
- (BOOL)isMaxHeartRateValid;
- (FITUInt8)getMaxHeartRate;
- (void)setMaxHeartRate:(FITUInt8)maxHeartRate;
// AvgCadence 
- (BOOL)isAvgCadenceValid;
- (FITUInt8)getAvgCadence;
- (void)setAvgCadence:(FITUInt8)avgCadence;
// MaxCadence 
- (BOOL)isMaxCadenceValid;
- (FITUInt8)getMaxCadence;
- (void)setMaxCadence:(FITUInt8)maxCadence;
// AvgPower 
- (BOOL)isAvgPowerValid;
- (FITUInt16)getAvgPower;
- (void)setAvgPower:(FITUInt16)avgPower;
// MaxPower 
- (BOOL)isMaxPowerValid;
- (FITUInt16)getMaxPower;
- (void)setMaxPower:(FITUInt16)maxPower;
// TotalAscent 
- (BOOL)isTotalAscentValid;
- (FITUInt16)getTotalAscent;
- (void)setTotalAscent:(FITUInt16)totalAscent;
// TotalDescent 
- (BOOL)isTotalDescentValid;
- (FITUInt16)getTotalDescent;
- (void)setTotalDescent:(FITUInt16)totalDescent;
// Sport 
- (BOOL)isSportValid;
- (FITSport)getSport;
- (void)setSport:(FITSport)sport;
// EventGroup 
- (BOOL)isEventGroupValid;
- (FITUInt8)getEventGroup;
- (void)setEventGroup:(FITUInt8)eventGroup;
// NecLat 
- (BOOL)isNecLatValid;
- (FITSInt32)getNecLat;
- (void)setNecLat:(FITSInt32)necLat;
// NecLong 
- (BOOL)isNecLongValid;
- (FITSInt32)getNecLong;
- (void)setNecLong:(FITSInt32)necLong;
// SwcLat 
- (BOOL)isSwcLatValid;
- (FITSInt32)getSwcLat;
- (void)setSwcLat:(FITSInt32)swcLat;
// SwcLong 
- (BOOL)isSwcLongValid;
- (FITSInt32)getSwcLong;
- (void)setSwcLong:(FITSInt32)swcLong;
// Name 
- (BOOL)isNameValid;
- (NSString *)getName;
- (void)setName:(NSString *)name;
// NormalizedPower 
- (BOOL)isNormalizedPowerValid;
- (FITUInt16)getNormalizedPower;
- (void)setNormalizedPower:(FITUInt16)normalizedPower;
// LeftRightBalance 
- (BOOL)isLeftRightBalanceValid;
- (FITLeftRightBalance100)getLeftRightBalance;
- (void)setLeftRightBalance:(FITLeftRightBalance100)leftRightBalance;
// SubSport 
- (BOOL)isSubSportValid;
- (FITSubSport)getSubSport;
- (void)setSubSport:(FITSubSport)subSport;
// TotalWork 
- (BOOL)isTotalWorkValid;
- (FITUInt32)getTotalWork;
- (void)setTotalWork:(FITUInt32)totalWork;
// AvgAltitude 
- (BOOL)isAvgAltitudeValid;
- (FITFloat32)getAvgAltitude;
- (void)setAvgAltitude:(FITFloat32)avgAltitude;
// MaxAltitude 
- (BOOL)isMaxAltitudeValid;
- (FITFloat32)getMaxAltitude;
- (void)setMaxAltitude:(FITFloat32)maxAltitude;
// GpsAccuracy 
- (BOOL)isGpsAccuracyValid;
- (FITUInt8)getGpsAccuracy;
- (void)setGpsAccuracy:(FITUInt8)gpsAccuracy;
// AvgGrade 
- (BOOL)isAvgGradeValid;
- (FITFloat32)getAvgGrade;
- (void)setAvgGrade:(FITFloat32)avgGrade;
// AvgPosGrade 
- (BOOL)isAvgPosGradeValid;
- (FITFloat32)getAvgPosGrade;
- (void)setAvgPosGrade:(FITFloat32)avgPosGrade;
// AvgNegGrade 
- (BOOL)isAvgNegGradeValid;
- (FITFloat32)getAvgNegGrade;
- (void)setAvgNegGrade:(FITFloat32)avgNegGrade;
// MaxPosGrade 
- (BOOL)isMaxPosGradeValid;
- (FITFloat32)getMaxPosGrade;
- (void)setMaxPosGrade:(FITFloat32)maxPosGrade;
// MaxNegGrade 
- (BOOL)isMaxNegGradeValid;
- (FITFloat32)getMaxNegGrade;
- (void)setMaxNegGrade:(FITFloat32)maxNegGrade;
// AvgTemperature 
- (BOOL)isAvgTemperatureValid;
- (FITSInt8)getAvgTemperature;
- (void)setAvgTemperature:(FITSInt8)avgTemperature;
// MaxTemperature 
- (BOOL)isMaxTemperatureValid;
- (FITSInt8)getMaxTemperature;
- (void)setMaxTemperature:(FITSInt8)maxTemperature;
// TotalMovingTime 
- (BOOL)isTotalMovingTimeValid;
- (FITFloat32)getTotalMovingTime;
- (void)setTotalMovingTime:(FITFloat32)totalMovingTime;
// AvgPosVerticalSpeed 
- (BOOL)isAvgPosVerticalSpeedValid;
- (FITFloat32)getAvgPosVerticalSpeed;
- (void)setAvgPosVerticalSpeed:(FITFloat32)avgPosVerticalSpeed;
// AvgNegVerticalSpeed 
- (BOOL)isAvgNegVerticalSpeedValid;
- (FITFloat32)getAvgNegVerticalSpeed;
- (void)setAvgNegVerticalSpeed:(FITFloat32)avgNegVerticalSpeed;
// MaxPosVerticalSpeed 
- (BOOL)isMaxPosVerticalSpeedValid;
- (FITFloat32)getMaxPosVerticalSpeed;
- (void)setMaxPosVerticalSpeed:(FITFloat32)maxPosVerticalSpeed;
// MaxNegVerticalSpeed 
- (BOOL)isMaxNegVerticalSpeedValid;
- (FITFloat32)getMaxNegVerticalSpeed;
- (void)setMaxNegVerticalSpeed:(FITFloat32)maxNegVerticalSpeed;
// TimeInHrZone 
@property(readonly,nonatomic) uint8_t numTimeInHrZoneValues;
- (BOOL)isTimeInHrZoneValidforIndex : (uint8_t)index;
- (FITFloat32)getTimeInHrZoneforIndex : (uint8_t)index;
- (void)setTimeInHrZone:(FITFloat32)timeInHrZone forIndex:(uint8_t)index;
// TimeInSpeedZone 
@property(readonly,nonatomic) uint8_t numTimeInSpeedZoneValues;
- (BOOL)isTimeInSpeedZoneValidforIndex : (uint8_t)index;
- (FITFloat32)getTimeInSpeedZoneforIndex : (uint8_t)index;
- (void)setTimeInSpeedZone:(FITFloat32)timeInSpeedZone forIndex:(uint8_t)index;
// TimeInCadenceZone 
@property(readonly,nonatomic) uint8_t numTimeInCadenceZoneValues;
- (BOOL)isTimeInCadenceZoneValidforIndex : (uint8_t)index;
- (FITFloat32)getTimeInCadenceZoneforIndex : (uint8_t)index;
- (void)setTimeInCadenceZone:(FITFloat32)timeInCadenceZone forIndex:(uint8_t)index;
// TimeInPowerZone 
@property(readonly,nonatomic) uint8_t numTimeInPowerZoneValues;
- (BOOL)isTimeInPowerZoneValidforIndex : (uint8_t)index;
- (FITFloat32)getTimeInPowerZoneforIndex : (uint8_t)index;
- (void)setTimeInPowerZone:(FITFloat32)timeInPowerZone forIndex:(uint8_t)index;
// RepetitionNum 
- (BOOL)isRepetitionNumValid;
- (FITUInt16)getRepetitionNum;
- (void)setRepetitionNum:(FITUInt16)repetitionNum;
// MinAltitude 
- (BOOL)isMinAltitudeValid;
- (FITFloat32)getMinAltitude;
- (void)setMinAltitude:(FITFloat32)minAltitude;
// MinHeartRate 
- (BOOL)isMinHeartRateValid;
- (FITUInt8)getMinHeartRate;
- (void)setMinHeartRate:(FITUInt8)minHeartRate;
// ActiveTime 
- (BOOL)isActiveTimeValid;
- (FITFloat32)getActiveTime;
- (void)setActiveTime:(FITFloat32)activeTime;
// WktStepIndex 
- (BOOL)isWktStepIndexValid;
- (FITMessageIndex)getWktStepIndex;
- (void)setWktStepIndex:(FITMessageIndex)wktStepIndex;
// SportEvent 
- (BOOL)isSportEventValid;
- (FITSportEvent)getSportEvent;
- (void)setSportEvent:(FITSportEvent)sportEvent;
// AvgLeftTorqueEffectiveness 
- (BOOL)isAvgLeftTorqueEffectivenessValid;
- (FITFloat32)getAvgLeftTorqueEffectiveness;
- (void)setAvgLeftTorqueEffectiveness:(FITFloat32)avgLeftTorqueEffectiveness;
// AvgRightTorqueEffectiveness 
- (BOOL)isAvgRightTorqueEffectivenessValid;
- (FITFloat32)getAvgRightTorqueEffectiveness;
- (void)setAvgRightTorqueEffectiveness:(FITFloat32)avgRightTorqueEffectiveness;
// AvgLeftPedalSmoothness 
- (BOOL)isAvgLeftPedalSmoothnessValid;
- (FITFloat32)getAvgLeftPedalSmoothness;
- (void)setAvgLeftPedalSmoothness:(FITFloat32)avgLeftPedalSmoothness;
// AvgRightPedalSmoothness 
- (BOOL)isAvgRightPedalSmoothnessValid;
- (FITFloat32)getAvgRightPedalSmoothness;
- (void)setAvgRightPedalSmoothness:(FITFloat32)avgRightPedalSmoothness;
// AvgCombinedPedalSmoothness 
- (BOOL)isAvgCombinedPedalSmoothnessValid;
- (FITFloat32)getAvgCombinedPedalSmoothness;
- (void)setAvgCombinedPedalSmoothness:(FITFloat32)avgCombinedPedalSmoothness;
// Status 
- (BOOL)isStatusValid;
- (FITSegmentLapStatus)getStatus;
- (void)setStatus:(FITSegmentLapStatus)status;
// Uuid 
- (BOOL)isUuidValid;
- (NSString *)getUuid;
- (void)setUuid:(NSString *)uuid;
// AvgFractionalCadence 
- (BOOL)isAvgFractionalCadenceValid;
- (FITFloat32)getAvgFractionalCadence;
- (void)setAvgFractionalCadence:(FITFloat32)avgFractionalCadence;
// MaxFractionalCadence 
- (BOOL)isMaxFractionalCadenceValid;
- (FITFloat32)getMaxFractionalCadence;
- (void)setMaxFractionalCadence:(FITFloat32)maxFractionalCadence;
// TotalFractionalCycles 
- (BOOL)isTotalFractionalCyclesValid;
- (FITFloat32)getTotalFractionalCycles;
- (void)setTotalFractionalCycles:(FITFloat32)totalFractionalCycles;
// FrontGearShiftCount 
- (BOOL)isFrontGearShiftCountValid;
- (FITUInt16)getFrontGearShiftCount;
- (void)setFrontGearShiftCount:(FITUInt16)frontGearShiftCount;
// RearGearShiftCount 
- (BOOL)isRearGearShiftCountValid;
- (FITUInt16)getRearGearShiftCount;
- (void)setRearGearShiftCount:(FITUInt16)rearGearShiftCount;
// TimeStanding 
- (BOOL)isTimeStandingValid;
- (FITFloat32)getTimeStanding;
- (void)setTimeStanding:(FITFloat32)timeStanding;
// StandCount 
- (BOOL)isStandCountValid;
- (FITUInt16)getStandCount;
- (void)setStandCount:(FITUInt16)standCount;
// AvgLeftPco 
- (BOOL)isAvgLeftPcoValid;
- (FITSInt8)getAvgLeftPco;
- (void)setAvgLeftPco:(FITSInt8)avgLeftPco;
// AvgRightPco 
- (BOOL)isAvgRightPcoValid;
- (FITSInt8)getAvgRightPco;
- (void)setAvgRightPco:(FITSInt8)avgRightPco;
// AvgLeftPowerPhase 
@property(readonly,nonatomic) uint8_t numAvgLeftPowerPhaseValues;
- (BOOL)isAvgLeftPowerPhaseValidforIndex : (uint8_t)index;
- (FITFloat32)getAvgLeftPowerPhaseforIndex : (uint8_t)index;
- (void)setAvgLeftPowerPhase:(FITFloat32)avgLeftPowerPhase forIndex:(uint8_t)index;
// AvgLeftPowerPhasePeak 
@property(readonly,nonatomic) uint8_t numAvgLeftPowerPhasePeakValues;
- (BOOL)isAvgLeftPowerPhasePeakValidforIndex : (uint8_t)index;
- (FITFloat32)getAvgLeftPowerPhasePeakforIndex : (uint8_t)index;
- (void)setAvgLeftPowerPhasePeak:(FITFloat32)avgLeftPowerPhasePeak forIndex:(uint8_t)index;
// AvgRightPowerPhase 
@property(readonly,nonatomic) uint8_t numAvgRightPowerPhaseValues;
- (BOOL)isAvgRightPowerPhaseValidforIndex : (uint8_t)index;
- (FITFloat32)getAvgRightPowerPhaseforIndex : (uint8_t)index;
- (void)setAvgRightPowerPhase:(FITFloat32)avgRightPowerPhase forIndex:(uint8_t)index;
// AvgRightPowerPhasePeak 
@property(readonly,nonatomic) uint8_t numAvgRightPowerPhasePeakValues;
- (BOOL)isAvgRightPowerPhasePeakValidforIndex : (uint8_t)index;
- (FITFloat32)getAvgRightPowerPhasePeakforIndex : (uint8_t)index;
- (void)setAvgRightPowerPhasePeak:(FITFloat32)avgRightPowerPhasePeak forIndex:(uint8_t)index;
// AvgPowerPosition 
@property(readonly,nonatomic) uint8_t numAvgPowerPositionValues;
- (BOOL)isAvgPowerPositionValidforIndex : (uint8_t)index;
- (FITUInt16)getAvgPowerPositionforIndex : (uint8_t)index;
- (void)setAvgPowerPosition:(FITUInt16)avgPowerPosition forIndex:(uint8_t)index;
// MaxPowerPosition 
@property(readonly,nonatomic) uint8_t numMaxPowerPositionValues;
- (BOOL)isMaxPowerPositionValidforIndex : (uint8_t)index;
- (FITUInt16)getMaxPowerPositionforIndex : (uint8_t)index;
- (void)setMaxPowerPosition:(FITUInt16)maxPowerPosition forIndex:(uint8_t)index;
// AvgCadencePosition 
@property(readonly,nonatomic) uint8_t numAvgCadencePositionValues;
- (BOOL)isAvgCadencePositionValidforIndex : (uint8_t)index;
- (FITUInt8)getAvgCadencePositionforIndex : (uint8_t)index;
- (void)setAvgCadencePosition:(FITUInt8)avgCadencePosition forIndex:(uint8_t)index;
// MaxCadencePosition 
@property(readonly,nonatomic) uint8_t numMaxCadencePositionValues;
- (BOOL)isMaxCadencePositionValidforIndex : (uint8_t)index;
- (FITUInt8)getMaxCadencePositionforIndex : (uint8_t)index;
- (void)setMaxCadencePosition:(FITUInt8)maxCadencePosition forIndex:(uint8_t)index;
// Manufacturer 
- (BOOL)isManufacturerValid;
- (FITManufacturer)getManufacturer;
- (void)setManufacturer:(FITManufacturer)manufacturer;
// TotalGrit 
- (BOOL)isTotalGritValid;
- (FITFloat32)getTotalGrit;
- (void)setTotalGrit:(FITFloat32)totalGrit;
// TotalFlow 
- (BOOL)isTotalFlowValid;
- (FITFloat32)getTotalFlow;
- (void)setTotalFlow:(FITFloat32)totalFlow;
// AvgGrit 
- (BOOL)isAvgGritValid;
- (FITFloat32)getAvgGrit;
- (void)setAvgGrit:(FITFloat32)avgGrit;
// AvgFlow 
- (BOOL)isAvgFlowValid;
- (FITFloat32)getAvgFlow;
- (void)setAvgFlow:(FITFloat32)avgFlow;
// TotalFractionalAscent 
- (BOOL)isTotalFractionalAscentValid;
- (FITFloat32)getTotalFractionalAscent;
- (void)setTotalFractionalAscent:(FITFloat32)totalFractionalAscent;
// TotalFractionalDescent 
- (BOOL)isTotalFractionalDescentValid;
- (FITFloat32)getTotalFractionalDescent;
- (void)setTotalFractionalDescent:(FITFloat32)totalFractionalDescent;

@end

NS_ASSUME_NONNULL_END
