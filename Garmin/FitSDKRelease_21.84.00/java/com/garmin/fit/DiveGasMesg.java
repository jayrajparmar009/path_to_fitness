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



public class DiveGasMesg extends Mesg   {

    
    public static final int MessageIndexFieldNum = 254;
    
    public static final int HeliumContentFieldNum = 0;
    
    public static final int OxygenContentFieldNum = 1;
    
    public static final int StatusFieldNum = 2;
    

    protected static final  Mesg diveGasMesg;
    static {
        // dive_gas
        diveGasMesg = new Mesg("dive_gas", MesgNum.DIVE_GAS);
        diveGasMesg.addField(new Field("message_index", MessageIndexFieldNum, 132, 1, 0, "", false, Profile.Type.MESSAGE_INDEX));
        
        diveGasMesg.addField(new Field("helium_content", HeliumContentFieldNum, 2, 1, 0, "percent", false, Profile.Type.UINT8));
        
        diveGasMesg.addField(new Field("oxygen_content", OxygenContentFieldNum, 2, 1, 0, "percent", false, Profile.Type.UINT8));
        
        diveGasMesg.addField(new Field("status", StatusFieldNum, 0, 1, 0, "", false, Profile.Type.DIVE_GAS_STATUS));
        
    }

    public DiveGasMesg() {
        super(Factory.createMesg(MesgNum.DIVE_GAS));
    }

    public DiveGasMesg(final Mesg mesg) {
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
     * Get helium_content field
     * Units: percent
     *
     * @return helium_content
     */
    public Short getHeliumContent() {
        return getFieldShortValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set helium_content field
     * Units: percent
     *
     * @param heliumContent
     */
    public void setHeliumContent(Short heliumContent) {
        setFieldValue(0, 0, heliumContent, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get oxygen_content field
     * Units: percent
     *
     * @return oxygen_content
     */
    public Short getOxygenContent() {
        return getFieldShortValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set oxygen_content field
     * Units: percent
     *
     * @param oxygenContent
     */
    public void setOxygenContent(Short oxygenContent) {
        setFieldValue(1, 0, oxygenContent, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get status field
     *
     * @return status
     */
    public DiveGasStatus getStatus() {
        Short value = getFieldShortValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return DiveGasStatus.getByValue(value);
    }

    /**
     * Set status field
     *
     * @param status
     */
    public void setStatus(DiveGasStatus status) {
        setFieldValue(2, 0, status.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

}
