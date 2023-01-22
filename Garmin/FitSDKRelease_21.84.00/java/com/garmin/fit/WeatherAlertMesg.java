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



public class WeatherAlertMesg extends Mesg   {

    
    public static final int TimestampFieldNum = 253;
    
    public static final int ReportIdFieldNum = 0;
    
    public static final int IssueTimeFieldNum = 1;
    
    public static final int ExpireTimeFieldNum = 2;
    
    public static final int SeverityFieldNum = 3;
    
    public static final int TypeFieldNum = 4;
    

    protected static final  Mesg weatherAlertMesg;
    static {
        // weather_alert
        weatherAlertMesg = new Mesg("weather_alert", MesgNum.WEATHER_ALERT);
        weatherAlertMesg.addField(new Field("timestamp", TimestampFieldNum, 134, 1, 0, "", false, Profile.Type.DATE_TIME));
        
        weatherAlertMesg.addField(new Field("report_id", ReportIdFieldNum, 7, 1, 0, "", false, Profile.Type.STRING));
        
        weatherAlertMesg.addField(new Field("issue_time", IssueTimeFieldNum, 134, 1, 0, "", false, Profile.Type.DATE_TIME));
        
        weatherAlertMesg.addField(new Field("expire_time", ExpireTimeFieldNum, 134, 1, 0, "", false, Profile.Type.DATE_TIME));
        
        weatherAlertMesg.addField(new Field("severity", SeverityFieldNum, 0, 1, 0, "", false, Profile.Type.WEATHER_SEVERITY));
        
        weatherAlertMesg.addField(new Field("type", TypeFieldNum, 0, 1, 0, "", false, Profile.Type.WEATHER_SEVERE_TYPE));
        
    }

    public WeatherAlertMesg() {
        super(Factory.createMesg(MesgNum.WEATHER_ALERT));
    }

    public WeatherAlertMesg(final Mesg mesg) {
        super(mesg);
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
     * Get report_id field
     * Comment: Unique identifier from GCS report ID string, length is 12
     *
     * @return report_id
     */
    public String getReportId() {
        return getFieldStringValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set report_id field
     * Comment: Unique identifier from GCS report ID string, length is 12
     *
     * @param reportId
     */
    public void setReportId(String reportId) {
        setFieldValue(0, 0, reportId, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get issue_time field
     * Comment: Time alert was issued
     *
     * @return issue_time
     */
    public DateTime getIssueTime() {
        return timestampToDateTime(getFieldLongValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
    }

    /**
     * Set issue_time field
     * Comment: Time alert was issued
     *
     * @param issueTime
     */
    public void setIssueTime(DateTime issueTime) {
        setFieldValue(1, 0, issueTime.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get expire_time field
     * Comment: Time alert expires
     *
     * @return expire_time
     */
    public DateTime getExpireTime() {
        return timestampToDateTime(getFieldLongValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
    }

    /**
     * Set expire_time field
     * Comment: Time alert expires
     *
     * @param expireTime
     */
    public void setExpireTime(DateTime expireTime) {
        setFieldValue(2, 0, expireTime.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get severity field
     * Comment: Warning, Watch, Advisory, Statement
     *
     * @return severity
     */
    public WeatherSeverity getSeverity() {
        Short value = getFieldShortValue(3, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return WeatherSeverity.getByValue(value);
    }

    /**
     * Set severity field
     * Comment: Warning, Watch, Advisory, Statement
     *
     * @param severity
     */
    public void setSeverity(WeatherSeverity severity) {
        setFieldValue(3, 0, severity.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get type field
     * Comment: Tornado, Severe Thunderstorm, etc.
     *
     * @return type
     */
    public WeatherSevereType getType() {
        Short value = getFieldShortValue(4, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return WeatherSevereType.getByValue(value);
    }

    /**
     * Set type field
     * Comment: Tornado, Severe Thunderstorm, etc.
     *
     * @param type
     */
    public void setType(WeatherSevereType type) {
        setFieldValue(4, 0, type.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

}
