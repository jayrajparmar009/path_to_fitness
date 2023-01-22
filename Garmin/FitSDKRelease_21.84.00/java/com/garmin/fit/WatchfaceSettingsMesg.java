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



public class WatchfaceSettingsMesg extends Mesg   {

    
    public static final int MessageIndexFieldNum = 254;
    
    public static final int ModeFieldNum = 0;
    
    public static final int LayoutFieldNum = 1;
    

    protected static final  Mesg watchfaceSettingsMesg;
    static {
        int field_index = 0;
        int subfield_index = 0;
        // watchface_settings
        watchfaceSettingsMesg = new Mesg("watchface_settings", MesgNum.WATCHFACE_SETTINGS);
        watchfaceSettingsMesg.addField(new Field("message_index", MessageIndexFieldNum, 132, 1, 0, "", false, Profile.Type.MESSAGE_INDEX));
        field_index++;
        watchfaceSettingsMesg.addField(new Field("mode", ModeFieldNum, 0, 1, 0, "", false, Profile.Type.WATCHFACE_MODE));
        field_index++;
        watchfaceSettingsMesg.addField(new Field("layout", LayoutFieldNum, 13, 1, 0, "", false, Profile.Type.BYTE));
        subfield_index = 0;
        watchfaceSettingsMesg.fields.get(field_index).subFields.add(new SubField("digital_layout", 0, 1, 0, ""));
        watchfaceSettingsMesg.fields.get(field_index).subFields.get(subfield_index).addMap(0, 0);
        subfield_index++;
        watchfaceSettingsMesg.fields.get(field_index).subFields.add(new SubField("analog_layout", 0, 1, 0, ""));
        watchfaceSettingsMesg.fields.get(field_index).subFields.get(subfield_index).addMap(0, 1);
        subfield_index++;
        field_index++;
    }

    public WatchfaceSettingsMesg() {
        super(Factory.createMesg(MesgNum.WATCHFACE_SETTINGS));
    }

    public WatchfaceSettingsMesg(final Mesg mesg) {
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
     * Get mode field
     *
     * @return mode
     */
    public WatchfaceMode getMode() {
        Short value = getFieldShortValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return WatchfaceMode.getByValue(value);
    }

    /**
     * Set mode field
     *
     * @param mode
     */
    public void setMode(WatchfaceMode mode) {
        setFieldValue(0, 0, mode.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get layout field
     *
     * @return layout
     */
    public Byte getLayout() {
        return getFieldByteValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set layout field
     *
     * @param layout
     */
    public void setLayout(Byte layout) {
        setFieldValue(1, 0, layout, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get digital_layout field
     *
     * @return digital_layout
     */
    public DigitalWatchfaceLayout getDigitalLayout() {
        Short value = getFieldShortValue(1, 0, Profile.SubFields.WATCHFACE_SETTINGS_MESG_LAYOUT_FIELD_DIGITAL_LAYOUT);
        if (value == null) {
            return null;
        }
        return DigitalWatchfaceLayout.getByValue(value);
    }

    /**
     * Set digital_layout field
     *
     * @param digitalLayout
     */
    public void setDigitalLayout(DigitalWatchfaceLayout digitalLayout) {
        setFieldValue(1, 0, digitalLayout.value, Profile.SubFields.WATCHFACE_SETTINGS_MESG_LAYOUT_FIELD_DIGITAL_LAYOUT);
    }

    /**
     * Get analog_layout field
     *
     * @return analog_layout
     */
    public AnalogWatchfaceLayout getAnalogLayout() {
        Short value = getFieldShortValue(1, 0, Profile.SubFields.WATCHFACE_SETTINGS_MESG_LAYOUT_FIELD_ANALOG_LAYOUT);
        if (value == null) {
            return null;
        }
        return AnalogWatchfaceLayout.getByValue(value);
    }

    /**
     * Set analog_layout field
     *
     * @param analogLayout
     */
    public void setAnalogLayout(AnalogWatchfaceLayout analogLayout) {
        setFieldValue(1, 0, analogLayout.value, Profile.SubFields.WATCHFACE_SETTINGS_MESG_LAYOUT_FIELD_ANALOG_LAYOUT);
    }

}
