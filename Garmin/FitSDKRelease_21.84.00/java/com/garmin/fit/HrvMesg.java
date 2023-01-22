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



public class HrvMesg extends Mesg   {

    
    public static final int TimeFieldNum = 0;
    

    protected static final  Mesg hrvMesg;
    static {
        // hrv
        hrvMesg = new Mesg("hrv", MesgNum.HRV);
        hrvMesg.addField(new Field("time", TimeFieldNum, 132, 1000, 0, "s", false, Profile.Type.UINT16));
        
    }

    public HrvMesg() {
        super(Factory.createMesg(MesgNum.HRV));
    }

    public HrvMesg(final Mesg mesg) {
        super(mesg);
    }


    public Float[] getTime() {
        
        return getFieldFloatValues(0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        
    }

    /**
     * @return number of time
     */
    public int getNumTime() {
        return getNumFieldValues(0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get time field
     * Units: s
     * Comment: Time between beats
     *
     * @param index of time
     * @return time
     */
    public Float getTime(int index) {
        return getFieldFloatValue(0, index, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set time field
     * Units: s
     * Comment: Time between beats
     *
     * @param index of time
     * @param time
     */
    public void setTime(int index, Float time) {
        setFieldValue(0, index, time, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

}
