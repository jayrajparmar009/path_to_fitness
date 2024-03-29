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



public class DiveSettingsMesg extends Mesg   {

    
    public static final int MessageIndexFieldNum = 254;
    
    public static final int NameFieldNum = 0;
    
    public static final int ModelFieldNum = 1;
    
    public static final int GfLowFieldNum = 2;
    
    public static final int GfHighFieldNum = 3;
    
    public static final int WaterTypeFieldNum = 4;
    
    public static final int WaterDensityFieldNum = 5;
    
    public static final int Po2WarnFieldNum = 6;
    
    public static final int Po2CriticalFieldNum = 7;
    
    public static final int Po2DecoFieldNum = 8;
    
    public static final int SafetyStopEnabledFieldNum = 9;
    
    public static final int BottomDepthFieldNum = 10;
    
    public static final int BottomTimeFieldNum = 11;
    
    public static final int ApneaCountdownEnabledFieldNum = 12;
    
    public static final int ApneaCountdownTimeFieldNum = 13;
    
    public static final int BacklightModeFieldNum = 14;
    
    public static final int BacklightBrightnessFieldNum = 15;
    
    public static final int BacklightTimeoutFieldNum = 16;
    
    public static final int RepeatDiveIntervalFieldNum = 17;
    
    public static final int SafetyStopTimeFieldNum = 18;
    
    public static final int HeartRateSourceTypeFieldNum = 19;
    
    public static final int HeartRateSourceFieldNum = 20;
    

    protected static final  Mesg diveSettingsMesg;
    static {
        int field_index = 0;
        int subfield_index = 0;
        // dive_settings
        diveSettingsMesg = new Mesg("dive_settings", MesgNum.DIVE_SETTINGS);
        diveSettingsMesg.addField(new Field("message_index", MessageIndexFieldNum, 132, 1, 0, "", false, Profile.Type.MESSAGE_INDEX));
        field_index++;
        diveSettingsMesg.addField(new Field("name", NameFieldNum, 7, 1, 0, "", false, Profile.Type.STRING));
        field_index++;
        diveSettingsMesg.addField(new Field("model", ModelFieldNum, 0, 1, 0, "", false, Profile.Type.TISSUE_MODEL_TYPE));
        field_index++;
        diveSettingsMesg.addField(new Field("gf_low", GfLowFieldNum, 2, 1, 0, "percent", false, Profile.Type.UINT8));
        field_index++;
        diveSettingsMesg.addField(new Field("gf_high", GfHighFieldNum, 2, 1, 0, "percent", false, Profile.Type.UINT8));
        field_index++;
        diveSettingsMesg.addField(new Field("water_type", WaterTypeFieldNum, 0, 1, 0, "", false, Profile.Type.WATER_TYPE));
        field_index++;
        diveSettingsMesg.addField(new Field("water_density", WaterDensityFieldNum, 136, 1, 0, "kg/m^3", false, Profile.Type.FLOAT32));
        field_index++;
        diveSettingsMesg.addField(new Field("po2_warn", Po2WarnFieldNum, 2, 100, 0, "percent", false, Profile.Type.UINT8));
        field_index++;
        diveSettingsMesg.addField(new Field("po2_critical", Po2CriticalFieldNum, 2, 100, 0, "percent", false, Profile.Type.UINT8));
        field_index++;
        diveSettingsMesg.addField(new Field("po2_deco", Po2DecoFieldNum, 2, 100, 0, "percent", false, Profile.Type.UINT8));
        field_index++;
        diveSettingsMesg.addField(new Field("safety_stop_enabled", SafetyStopEnabledFieldNum, 0, 1, 0, "", false, Profile.Type.BOOL));
        field_index++;
        diveSettingsMesg.addField(new Field("bottom_depth", BottomDepthFieldNum, 136, 1, 0, "", false, Profile.Type.FLOAT32));
        field_index++;
        diveSettingsMesg.addField(new Field("bottom_time", BottomTimeFieldNum, 134, 1, 0, "", false, Profile.Type.UINT32));
        field_index++;
        diveSettingsMesg.addField(new Field("apnea_countdown_enabled", ApneaCountdownEnabledFieldNum, 0, 1, 0, "", false, Profile.Type.BOOL));
        field_index++;
        diveSettingsMesg.addField(new Field("apnea_countdown_time", ApneaCountdownTimeFieldNum, 134, 1, 0, "", false, Profile.Type.UINT32));
        field_index++;
        diveSettingsMesg.addField(new Field("backlight_mode", BacklightModeFieldNum, 0, 1, 0, "", false, Profile.Type.DIVE_BACKLIGHT_MODE));
        field_index++;
        diveSettingsMesg.addField(new Field("backlight_brightness", BacklightBrightnessFieldNum, 2, 1, 0, "", false, Profile.Type.UINT8));
        field_index++;
        diveSettingsMesg.addField(new Field("backlight_timeout", BacklightTimeoutFieldNum, 2, 1, 0, "", false, Profile.Type.BACKLIGHT_TIMEOUT));
        field_index++;
        diveSettingsMesg.addField(new Field("repeat_dive_interval", RepeatDiveIntervalFieldNum, 132, 1, 0, "s", false, Profile.Type.UINT16));
        field_index++;
        diveSettingsMesg.addField(new Field("safety_stop_time", SafetyStopTimeFieldNum, 132, 1, 0, "s", false, Profile.Type.UINT16));
        field_index++;
        diveSettingsMesg.addField(new Field("heart_rate_source_type", HeartRateSourceTypeFieldNum, 0, 1, 0, "", false, Profile.Type.SOURCE_TYPE));
        field_index++;
        diveSettingsMesg.addField(new Field("heart_rate_source", HeartRateSourceFieldNum, 2, 1, 0, "", false, Profile.Type.UINT8));
        subfield_index = 0;
        diveSettingsMesg.fields.get(field_index).subFields.add(new SubField("heart_rate_antplus_device_type", 2, 1, 0, ""));
        diveSettingsMesg.fields.get(field_index).subFields.get(subfield_index).addMap(19, 1);
        subfield_index++;
        diveSettingsMesg.fields.get(field_index).subFields.add(new SubField("heart_rate_local_device_type", 2, 1, 0, ""));
        diveSettingsMesg.fields.get(field_index).subFields.get(subfield_index).addMap(19, 5);
        subfield_index++;
        field_index++;
    }

    public DiveSettingsMesg() {
        super(Factory.createMesg(MesgNum.DIVE_SETTINGS));
    }

    public DiveSettingsMesg(final Mesg mesg) {
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
     * Get name field
     *
     * @return name
     */
    public String getName() {
        return getFieldStringValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set name field
     *
     * @param name
     */
    public void setName(String name) {
        setFieldValue(0, 0, name, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get model field
     *
     * @return model
     */
    public TissueModelType getModel() {
        Short value = getFieldShortValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return TissueModelType.getByValue(value);
    }

    /**
     * Set model field
     *
     * @param model
     */
    public void setModel(TissueModelType model) {
        setFieldValue(1, 0, model.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get gf_low field
     * Units: percent
     *
     * @return gf_low
     */
    public Short getGfLow() {
        return getFieldShortValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set gf_low field
     * Units: percent
     *
     * @param gfLow
     */
    public void setGfLow(Short gfLow) {
        setFieldValue(2, 0, gfLow, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get gf_high field
     * Units: percent
     *
     * @return gf_high
     */
    public Short getGfHigh() {
        return getFieldShortValue(3, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set gf_high field
     * Units: percent
     *
     * @param gfHigh
     */
    public void setGfHigh(Short gfHigh) {
        setFieldValue(3, 0, gfHigh, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get water_type field
     *
     * @return water_type
     */
    public WaterType getWaterType() {
        Short value = getFieldShortValue(4, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return WaterType.getByValue(value);
    }

    /**
     * Set water_type field
     *
     * @param waterType
     */
    public void setWaterType(WaterType waterType) {
        setFieldValue(4, 0, waterType.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get water_density field
     * Units: kg/m^3
     * Comment: Fresh water is usually 1000; salt water is usually 1025
     *
     * @return water_density
     */
    public Float getWaterDensity() {
        return getFieldFloatValue(5, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set water_density field
     * Units: kg/m^3
     * Comment: Fresh water is usually 1000; salt water is usually 1025
     *
     * @param waterDensity
     */
    public void setWaterDensity(Float waterDensity) {
        setFieldValue(5, 0, waterDensity, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get po2_warn field
     * Units: percent
     * Comment: Typically 1.40
     *
     * @return po2_warn
     */
    public Float getPo2Warn() {
        return getFieldFloatValue(6, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set po2_warn field
     * Units: percent
     * Comment: Typically 1.40
     *
     * @param po2Warn
     */
    public void setPo2Warn(Float po2Warn) {
        setFieldValue(6, 0, po2Warn, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get po2_critical field
     * Units: percent
     * Comment: Typically 1.60
     *
     * @return po2_critical
     */
    public Float getPo2Critical() {
        return getFieldFloatValue(7, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set po2_critical field
     * Units: percent
     * Comment: Typically 1.60
     *
     * @param po2Critical
     */
    public void setPo2Critical(Float po2Critical) {
        setFieldValue(7, 0, po2Critical, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get po2_deco field
     * Units: percent
     *
     * @return po2_deco
     */
    public Float getPo2Deco() {
        return getFieldFloatValue(8, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set po2_deco field
     * Units: percent
     *
     * @param po2Deco
     */
    public void setPo2Deco(Float po2Deco) {
        setFieldValue(8, 0, po2Deco, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get safety_stop_enabled field
     *
     * @return safety_stop_enabled
     */
    public Bool getSafetyStopEnabled() {
        Short value = getFieldShortValue(9, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return Bool.getByValue(value);
    }

    /**
     * Set safety_stop_enabled field
     *
     * @param safetyStopEnabled
     */
    public void setSafetyStopEnabled(Bool safetyStopEnabled) {
        setFieldValue(9, 0, safetyStopEnabled.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get bottom_depth field
     *
     * @return bottom_depth
     */
    public Float getBottomDepth() {
        return getFieldFloatValue(10, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set bottom_depth field
     *
     * @param bottomDepth
     */
    public void setBottomDepth(Float bottomDepth) {
        setFieldValue(10, 0, bottomDepth, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get bottom_time field
     *
     * @return bottom_time
     */
    public Long getBottomTime() {
        return getFieldLongValue(11, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set bottom_time field
     *
     * @param bottomTime
     */
    public void setBottomTime(Long bottomTime) {
        setFieldValue(11, 0, bottomTime, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get apnea_countdown_enabled field
     *
     * @return apnea_countdown_enabled
     */
    public Bool getApneaCountdownEnabled() {
        Short value = getFieldShortValue(12, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return Bool.getByValue(value);
    }

    /**
     * Set apnea_countdown_enabled field
     *
     * @param apneaCountdownEnabled
     */
    public void setApneaCountdownEnabled(Bool apneaCountdownEnabled) {
        setFieldValue(12, 0, apneaCountdownEnabled.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get apnea_countdown_time field
     *
     * @return apnea_countdown_time
     */
    public Long getApneaCountdownTime() {
        return getFieldLongValue(13, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set apnea_countdown_time field
     *
     * @param apneaCountdownTime
     */
    public void setApneaCountdownTime(Long apneaCountdownTime) {
        setFieldValue(13, 0, apneaCountdownTime, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get backlight_mode field
     *
     * @return backlight_mode
     */
    public DiveBacklightMode getBacklightMode() {
        Short value = getFieldShortValue(14, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return DiveBacklightMode.getByValue(value);
    }

    /**
     * Set backlight_mode field
     *
     * @param backlightMode
     */
    public void setBacklightMode(DiveBacklightMode backlightMode) {
        setFieldValue(14, 0, backlightMode.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get backlight_brightness field
     *
     * @return backlight_brightness
     */
    public Short getBacklightBrightness() {
        return getFieldShortValue(15, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set backlight_brightness field
     *
     * @param backlightBrightness
     */
    public void setBacklightBrightness(Short backlightBrightness) {
        setFieldValue(15, 0, backlightBrightness, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get backlight_timeout field
     *
     * @return backlight_timeout
     */
    public Short getBacklightTimeout() {
        return getFieldShortValue(16, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set backlight_timeout field
     *
     * @param backlightTimeout
     */
    public void setBacklightTimeout(Short backlightTimeout) {
        setFieldValue(16, 0, backlightTimeout, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get repeat_dive_interval field
     * Units: s
     * Comment: Time between surfacing and ending the activity
     *
     * @return repeat_dive_interval
     */
    public Integer getRepeatDiveInterval() {
        return getFieldIntegerValue(17, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set repeat_dive_interval field
     * Units: s
     * Comment: Time between surfacing and ending the activity
     *
     * @param repeatDiveInterval
     */
    public void setRepeatDiveInterval(Integer repeatDiveInterval) {
        setFieldValue(17, 0, repeatDiveInterval, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get safety_stop_time field
     * Units: s
     * Comment: Time at safety stop (if enabled)
     *
     * @return safety_stop_time
     */
    public Integer getSafetyStopTime() {
        return getFieldIntegerValue(18, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set safety_stop_time field
     * Units: s
     * Comment: Time at safety stop (if enabled)
     *
     * @param safetyStopTime
     */
    public void setSafetyStopTime(Integer safetyStopTime) {
        setFieldValue(18, 0, safetyStopTime, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get heart_rate_source_type field
     *
     * @return heart_rate_source_type
     */
    public SourceType getHeartRateSourceType() {
        Short value = getFieldShortValue(19, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return SourceType.getByValue(value);
    }

    /**
     * Set heart_rate_source_type field
     *
     * @param heartRateSourceType
     */
    public void setHeartRateSourceType(SourceType heartRateSourceType) {
        setFieldValue(19, 0, heartRateSourceType.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get heart_rate_source field
     *
     * @return heart_rate_source
     */
    public Short getHeartRateSource() {
        return getFieldShortValue(20, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set heart_rate_source field
     *
     * @param heartRateSource
     */
    public void setHeartRateSource(Short heartRateSource) {
        setFieldValue(20, 0, heartRateSource, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get heart_rate_antplus_device_type field
     *
     * @return heart_rate_antplus_device_type
     */
    public Short getHeartRateAntplusDeviceType() {
        return getFieldShortValue(20, 0, Profile.SubFields.DIVE_SETTINGS_MESG_HEART_RATE_SOURCE_FIELD_HEART_RATE_ANTPLUS_DEVICE_TYPE);
    }

    /**
     * Set heart_rate_antplus_device_type field
     *
     * @param heartRateAntplusDeviceType
     */
    public void setHeartRateAntplusDeviceType(Short heartRateAntplusDeviceType) {
        setFieldValue(20, 0, heartRateAntplusDeviceType, Profile.SubFields.DIVE_SETTINGS_MESG_HEART_RATE_SOURCE_FIELD_HEART_RATE_ANTPLUS_DEVICE_TYPE);
    }

    /**
     * Get heart_rate_local_device_type field
     *
     * @return heart_rate_local_device_type
     */
    public Short getHeartRateLocalDeviceType() {
        return getFieldShortValue(20, 0, Profile.SubFields.DIVE_SETTINGS_MESG_HEART_RATE_SOURCE_FIELD_HEART_RATE_LOCAL_DEVICE_TYPE);
    }

    /**
     * Set heart_rate_local_device_type field
     *
     * @param heartRateLocalDeviceType
     */
    public void setHeartRateLocalDeviceType(Short heartRateLocalDeviceType) {
        setFieldValue(20, 0, heartRateLocalDeviceType, Profile.SubFields.DIVE_SETTINGS_MESG_HEART_RATE_SOURCE_FIELD_HEART_RATE_LOCAL_DEVICE_TYPE);
    }

}
