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


package com.garmin.fit;



public class LengthMesg extends Mesg implements MesgWithEvent   {

    
    public static final int MessageIndexFieldNum = 254;
    
    public static final int TimestampFieldNum = 253;
    
    public static final int EventFieldNum = 0;
    
    public static final int EventTypeFieldNum = 1;
    
    public static final int StartTimeFieldNum = 2;
    
    public static final int TotalElapsedTimeFieldNum = 3;
    
    public static final int TotalTimerTimeFieldNum = 4;
    
    public static final int TotalStrokesFieldNum = 5;
    
    public static final int AvgSpeedFieldNum = 6;
    
    public static final int SwimStrokeFieldNum = 7;
    
    public static final int AvgSwimmingCadenceFieldNum = 9;
    
    public static final int EventGroupFieldNum = 10;
    
    public static final int TotalCaloriesFieldNum = 11;
    
    public static final int LengthTypeFieldNum = 12;
    
    public static final int PlayerScoreFieldNum = 18;
    
    public static final int OpponentScoreFieldNum = 19;
    
    public static final int StrokeCountFieldNum = 20;
    
    public static final int ZoneCountFieldNum = 21;
    

    protected static final  Mesg lengthMesg;
    static {
        // length
        lengthMesg = new Mesg("length", MesgNum.LENGTH);
        lengthMesg.addField(new Field("message_index", MessageIndexFieldNum, 132, 1, 0, "", false, Profile.Type.MESSAGE_INDEX));
        
        lengthMesg.addField(new Field("timestamp", TimestampFieldNum, 134, 1, 0, "", false, Profile.Type.DATE_TIME));
        
        lengthMesg.addField(new Field("event", EventFieldNum, 0, 1, 0, "", false, Profile.Type.EVENT));
        
        lengthMesg.addField(new Field("event_type", EventTypeFieldNum, 0, 1, 0, "", false, Profile.Type.EVENT_TYPE));
        
        lengthMesg.addField(new Field("start_time", StartTimeFieldNum, 134, 1, 0, "", false, Profile.Type.DATE_TIME));
        
        lengthMesg.addField(new Field("total_elapsed_time", TotalElapsedTimeFieldNum, 134, 1000, 0, "s", false, Profile.Type.UINT32));
        
        lengthMesg.addField(new Field("total_timer_time", TotalTimerTimeFieldNum, 134, 1000, 0, "s", false, Profile.Type.UINT32));
        
        lengthMesg.addField(new Field("total_strokes", TotalStrokesFieldNum, 132, 1, 0, "strokes", false, Profile.Type.UINT16));
        
        lengthMesg.addField(new Field("avg_speed", AvgSpeedFieldNum, 132, 1000, 0, "m/s", false, Profile.Type.UINT16));
        
        lengthMesg.addField(new Field("swim_stroke", SwimStrokeFieldNum, 0, 1, 0, "swim_stroke", false, Profile.Type.SWIM_STROKE));
        
        lengthMesg.addField(new Field("avg_swimming_cadence", AvgSwimmingCadenceFieldNum, 2, 1, 0, "strokes/min", false, Profile.Type.UINT8));
        
        lengthMesg.addField(new Field("event_group", EventGroupFieldNum, 2, 1, 0, "", false, Profile.Type.UINT8));
        
        lengthMesg.addField(new Field("total_calories", TotalCaloriesFieldNum, 132, 1, 0, "kcal", false, Profile.Type.UINT16));
        
        lengthMesg.addField(new Field("length_type", LengthTypeFieldNum, 0, 1, 0, "", false, Profile.Type.LENGTH_TYPE));
        
        lengthMesg.addField(new Field("player_score", PlayerScoreFieldNum, 132, 1, 0, "", false, Profile.Type.UINT16));
        
        lengthMesg.addField(new Field("opponent_score", OpponentScoreFieldNum, 132, 1, 0, "", false, Profile.Type.UINT16));
        
        lengthMesg.addField(new Field("stroke_count", StrokeCountFieldNum, 132, 1, 0, "counts", false, Profile.Type.UINT16));
        
        lengthMesg.addField(new Field("zone_count", ZoneCountFieldNum, 132, 1, 0, "counts", false, Profile.Type.UINT16));
        
    }

    public LengthMesg() {
        super(Factory.createMesg(MesgNum.LENGTH));
    }

    public LengthMesg(final Mesg mesg) {
        super(mesg);
    }


    /**
     * Get message_index field
     *
     * @return message_index
     */
    public Integer getMessageIndex() {
        return getFieldIntegerValue(254, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set message_index field
     *
     * @param messageIndex
     */
    public void setMessageIndex(Integer messageIndex) {
        setFieldValue(254, 0, messageIndex, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get timestamp field
     *
     * @return timestamp
     */
    public DateTime getTimestamp() {
        return timestampToDateTime(getFieldLongValue(253, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
    }

    /**
     * Set timestamp field
     *
     * @param timestamp
     */
    public void setTimestamp(DateTime timestamp) {
        setFieldValue(253, 0, timestamp.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get event field
     *
     * @return event
     */
    public Event getEvent() {
        Short value = getFieldShortValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return Event.getByValue(value);
    }

    /**
     * Set event field
     *
     * @param event
     */
    public void setEvent(Event event) {
        setFieldValue(0, 0, event.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get event_type field
     *
     * @return event_type
     */
    public EventType getEventType() {
        Short value = getFieldShortValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return EventType.getByValue(value);
    }

    /**
     * Set event_type field
     *
     * @param eventType
     */
    public void setEventType(EventType eventType) {
        setFieldValue(1, 0, eventType.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get start_time field
     *
     * @return start_time
     */
    public DateTime getStartTime() {
        return timestampToDateTime(getFieldLongValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
    }

    /**
     * Set start_time field
     *
     * @param startTime
     */
    public void setStartTime(DateTime startTime) {
        setFieldValue(2, 0, startTime.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get total_elapsed_time field
     * Units: s
     *
     * @return total_elapsed_time
     */
    public Float getTotalElapsedTime() {
        return getFieldFloatValue(3, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set total_elapsed_time field
     * Units: s
     *
     * @param totalElapsedTime
     */
    public void setTotalElapsedTime(Float totalElapsedTime) {
        setFieldValue(3, 0, totalElapsedTime, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get total_timer_time field
     * Units: s
     *
     * @return total_timer_time
     */
    public Float getTotalTimerTime() {
        return getFieldFloatValue(4, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set total_timer_time field
     * Units: s
     *
     * @param totalTimerTime
     */
    public void setTotalTimerTime(Float totalTimerTime) {
        setFieldValue(4, 0, totalTimerTime, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get total_strokes field
     * Units: strokes
     *
     * @return total_strokes
     */
    public Integer getTotalStrokes() {
        return getFieldIntegerValue(5, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set total_strokes field
     * Units: strokes
     *
     * @param totalStrokes
     */
    public void setTotalStrokes(Integer totalStrokes) {
        setFieldValue(5, 0, totalStrokes, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get avg_speed field
     * Units: m/s
     *
     * @return avg_speed
     */
    public Float getAvgSpeed() {
        return getFieldFloatValue(6, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set avg_speed field
     * Units: m/s
     *
     * @param avgSpeed
     */
    public void setAvgSpeed(Float avgSpeed) {
        setFieldValue(6, 0, avgSpeed, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get swim_stroke field
     * Units: swim_stroke
     *
     * @return swim_stroke
     */
    public SwimStroke getSwimStroke() {
        Short value = getFieldShortValue(7, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return SwimStroke.getByValue(value);
    }

    /**
     * Set swim_stroke field
     * Units: swim_stroke
     *
     * @param swimStroke
     */
    public void setSwimStroke(SwimStroke swimStroke) {
        setFieldValue(7, 0, swimStroke.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get avg_swimming_cadence field
     * Units: strokes/min
     *
     * @return avg_swimming_cadence
     */
    public Short getAvgSwimmingCadence() {
        return getFieldShortValue(9, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set avg_swimming_cadence field
     * Units: strokes/min
     *
     * @param avgSwimmingCadence
     */
    public void setAvgSwimmingCadence(Short avgSwimmingCadence) {
        setFieldValue(9, 0, avgSwimmingCadence, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get event_group field
     *
     * @return event_group
     */
    public Short getEventGroup() {
        return getFieldShortValue(10, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set event_group field
     *
     * @param eventGroup
     */
    public void setEventGroup(Short eventGroup) {
        setFieldValue(10, 0, eventGroup, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get total_calories field
     * Units: kcal
     *
     * @return total_calories
     */
    public Integer getTotalCalories() {
        return getFieldIntegerValue(11, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set total_calories field
     * Units: kcal
     *
     * @param totalCalories
     */
    public void setTotalCalories(Integer totalCalories) {
        setFieldValue(11, 0, totalCalories, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get length_type field
     *
     * @return length_type
     */
    public LengthType getLengthType() {
        Short value = getFieldShortValue(12, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return LengthType.getByValue(value);
    }

    /**
     * Set length_type field
     *
     * @param lengthType
     */
    public void setLengthType(LengthType lengthType) {
        setFieldValue(12, 0, lengthType.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get player_score field
     *
     * @return player_score
     */
    public Integer getPlayerScore() {
        return getFieldIntegerValue(18, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set player_score field
     *
     * @param playerScore
     */
    public void setPlayerScore(Integer playerScore) {
        setFieldValue(18, 0, playerScore, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get opponent_score field
     *
     * @return opponent_score
     */
    public Integer getOpponentScore() {
        return getFieldIntegerValue(19, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set opponent_score field
     *
     * @param opponentScore
     */
    public void setOpponentScore(Integer opponentScore) {
        setFieldValue(19, 0, opponentScore, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    public Integer[] getStrokeCount() {
        
        return getFieldIntegerValues(20, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        
    }

    /**
     * @return number of stroke_count
     */
    public int getNumStrokeCount() {
        return getNumFieldValues(20, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get stroke_count field
     * Units: counts
     * Comment: stroke_type enum used as the index
     *
     * @param index of stroke_count
     * @return stroke_count
     */
    public Integer getStrokeCount(int index) {
        return getFieldIntegerValue(20, index, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set stroke_count field
     * Units: counts
     * Comment: stroke_type enum used as the index
     *
     * @param index of stroke_count
     * @param strokeCount
     */
    public void setStrokeCount(int index, Integer strokeCount) {
        setFieldValue(20, index, strokeCount, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    public Integer[] getZoneCount() {
        
        return getFieldIntegerValues(21, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        
    }

    /**
     * @return number of zone_count
     */
    public int getNumZoneCount() {
        return getNumFieldValues(21, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get zone_count field
     * Units: counts
     * Comment: zone number used as the index
     *
     * @param index of zone_count
     * @return zone_count
     */
    public Integer getZoneCount(int index) {
        return getFieldIntegerValue(21, index, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set zone_count field
     * Units: counts
     * Comment: zone number used as the index
     *
     * @param index of zone_count
     * @param zoneCount
     */
    public void setZoneCount(int index, Integer zoneCount) {
        setFieldValue(21, index, zoneCount, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

}
