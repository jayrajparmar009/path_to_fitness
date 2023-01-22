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



public class DeviceInfoMesg extends Mesg   {

    
    public static final int TimestampFieldNum = 253;
    
    public static final int DeviceIndexFieldNum = 0;
    
    public static final int DeviceTypeFieldNum = 1;
    
    public static final int ManufacturerFieldNum = 2;
    
    public static final int SerialNumberFieldNum = 3;
    
    public static final int ProductFieldNum = 4;
    
    public static final int SoftwareVersionFieldNum = 5;
    
    public static final int HardwareVersionFieldNum = 6;
    
    public static final int CumOperatingTimeFieldNum = 7;
    
    public static final int BatteryVoltageFieldNum = 10;
    
    public static final int BatteryStatusFieldNum = 11;
    
    public static final int SensorPositionFieldNum = 18;
    
    public static final int DescriptorFieldNum = 19;
    
    public static final int AntTransmissionTypeFieldNum = 20;
    
    public static final int AntDeviceNumberFieldNum = 21;
    
    public static final int AntNetworkFieldNum = 22;
    
    public static final int SourceTypeFieldNum = 25;
    
    public static final int ProductNameFieldNum = 27;
    
    public static final int BatteryLevelFieldNum = 32;
    

    protected static final  Mesg deviceInfoMesg;
    static {
        int field_index = 0;
        int subfield_index = 0;
        // device_info
        deviceInfoMesg = new Mesg("device_info", MesgNum.DEVICE_INFO);
        deviceInfoMesg.addField(new Field("timestamp", TimestampFieldNum, 134, 1, 0, "s", false, Profile.Type.DATE_TIME));
        field_index++;
        deviceInfoMesg.addField(new Field("device_index", DeviceIndexFieldNum, 2, 1, 0, "", false, Profile.Type.DEVICE_INDEX));
        field_index++;
        deviceInfoMesg.addField(new Field("device_type", DeviceTypeFieldNum, 2, 1, 0, "", false, Profile.Type.UINT8));
        subfield_index = 0;
        deviceInfoMesg.fields.get(field_index).subFields.add(new SubField("antplus_device_type", 2, 1, 0, ""));
        deviceInfoMesg.fields.get(field_index).subFields.get(subfield_index).addMap(25, 1);
        subfield_index++;
        deviceInfoMesg.fields.get(field_index).subFields.add(new SubField("ant_device_type", 2, 1, 0, ""));
        deviceInfoMesg.fields.get(field_index).subFields.get(subfield_index).addMap(25, 0);
        subfield_index++;
        field_index++;
        deviceInfoMesg.addField(new Field("manufacturer", ManufacturerFieldNum, 132, 1, 0, "", false, Profile.Type.MANUFACTURER));
        field_index++;
        deviceInfoMesg.addField(new Field("serial_number", SerialNumberFieldNum, 140, 1, 0, "", false, Profile.Type.UINT32Z));
        field_index++;
        deviceInfoMesg.addField(new Field("product", ProductFieldNum, 132, 1, 0, "", false, Profile.Type.UINT16));
        subfield_index = 0;
        deviceInfoMesg.fields.get(field_index).subFields.add(new SubField("favero_product", 132, 1, 0, ""));
        deviceInfoMesg.fields.get(field_index).subFields.get(subfield_index).addMap(2, 263);
        subfield_index++;
        deviceInfoMesg.fields.get(field_index).subFields.add(new SubField("garmin_product", 132, 1, 0, ""));
        deviceInfoMesg.fields.get(field_index).subFields.get(subfield_index).addMap(2, 1);
        deviceInfoMesg.fields.get(field_index).subFields.get(subfield_index).addMap(2, 15);
        deviceInfoMesg.fields.get(field_index).subFields.get(subfield_index).addMap(2, 13);
        deviceInfoMesg.fields.get(field_index).subFields.get(subfield_index).addMap(2, 89);
        subfield_index++;
        field_index++;
        deviceInfoMesg.addField(new Field("software_version", SoftwareVersionFieldNum, 132, 100, 0, "", false, Profile.Type.UINT16));
        field_index++;
        deviceInfoMesg.addField(new Field("hardware_version", HardwareVersionFieldNum, 2, 1, 0, "", false, Profile.Type.UINT8));
        field_index++;
        deviceInfoMesg.addField(new Field("cum_operating_time", CumOperatingTimeFieldNum, 134, 1, 0, "s", false, Profile.Type.UINT32));
        field_index++;
        deviceInfoMesg.addField(new Field("battery_voltage", BatteryVoltageFieldNum, 132, 256, 0, "V", false, Profile.Type.UINT16));
        field_index++;
        deviceInfoMesg.addField(new Field("battery_status", BatteryStatusFieldNum, 2, 1, 0, "", false, Profile.Type.BATTERY_STATUS));
        field_index++;
        deviceInfoMesg.addField(new Field("sensor_position", SensorPositionFieldNum, 0, 1, 0, "", false, Profile.Type.BODY_LOCATION));
        field_index++;
        deviceInfoMesg.addField(new Field("descriptor", DescriptorFieldNum, 7, 1, 0, "", false, Profile.Type.STRING));
        field_index++;
        deviceInfoMesg.addField(new Field("ant_transmission_type", AntTransmissionTypeFieldNum, 10, 1, 0, "", false, Profile.Type.UINT8Z));
        field_index++;
        deviceInfoMesg.addField(new Field("ant_device_number", AntDeviceNumberFieldNum, 139, 1, 0, "", false, Profile.Type.UINT16Z));
        field_index++;
        deviceInfoMesg.addField(new Field("ant_network", AntNetworkFieldNum, 0, 1, 0, "", false, Profile.Type.ANT_NETWORK));
        field_index++;
        deviceInfoMesg.addField(new Field("source_type", SourceTypeFieldNum, 0, 1, 0, "", false, Profile.Type.SOURCE_TYPE));
        field_index++;
        deviceInfoMesg.addField(new Field("product_name", ProductNameFieldNum, 7, 1, 0, "", false, Profile.Type.STRING));
        field_index++;
        deviceInfoMesg.addField(new Field("battery_level", BatteryLevelFieldNum, 2, 1, 0, "%", false, Profile.Type.UINT8));
        field_index++;
    }

    public DeviceInfoMesg() {
        super(Factory.createMesg(MesgNum.DEVICE_INFO));
    }

    public DeviceInfoMesg(final Mesg mesg) {
        super(mesg);
    }


    /**
     * Get timestamp field
     * Units: s
     *
     * @return timestamp
     */
    public DateTime getTimestamp() {
        return timestampToDateTime(getFieldLongValue(253, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
    }

    /**
     * Set timestamp field
     * Units: s
     *
     * @param timestamp
     */
    public void setTimestamp(DateTime timestamp) {
        setFieldValue(253, 0, timestamp.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get device_index field
     *
     * @return device_index
     */
    public Short getDeviceIndex() {
        return getFieldShortValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set device_index field
     *
     * @param deviceIndex
     */
    public void setDeviceIndex(Short deviceIndex) {
        setFieldValue(0, 0, deviceIndex, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get device_type field
     *
     * @return device_type
     */
    public Short getDeviceType() {
        return getFieldShortValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set device_type field
     *
     * @param deviceType
     */
    public void setDeviceType(Short deviceType) {
        setFieldValue(1, 0, deviceType, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get antplus_device_type field
     *
     * @return antplus_device_type
     */
    public Short getAntplusDeviceType() {
        return getFieldShortValue(1, 0, Profile.SubFields.DEVICE_INFO_MESG_DEVICE_TYPE_FIELD_ANTPLUS_DEVICE_TYPE);
    }

    /**
     * Set antplus_device_type field
     *
     * @param antplusDeviceType
     */
    public void setAntplusDeviceType(Short antplusDeviceType) {
        setFieldValue(1, 0, antplusDeviceType, Profile.SubFields.DEVICE_INFO_MESG_DEVICE_TYPE_FIELD_ANTPLUS_DEVICE_TYPE);
    }

    /**
     * Get ant_device_type field
     *
     * @return ant_device_type
     */
    public Short getAntDeviceType() {
        return getFieldShortValue(1, 0, Profile.SubFields.DEVICE_INFO_MESG_DEVICE_TYPE_FIELD_ANT_DEVICE_TYPE);
    }

    /**
     * Set ant_device_type field
     *
     * @param antDeviceType
     */
    public void setAntDeviceType(Short antDeviceType) {
        setFieldValue(1, 0, antDeviceType, Profile.SubFields.DEVICE_INFO_MESG_DEVICE_TYPE_FIELD_ANT_DEVICE_TYPE);
    }

    /**
     * Get manufacturer field
     *
     * @return manufacturer
     */
    public Integer getManufacturer() {
        return getFieldIntegerValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set manufacturer field
     *
     * @param manufacturer
     */
    public void setManufacturer(Integer manufacturer) {
        setFieldValue(2, 0, manufacturer, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get serial_number field
     *
     * @return serial_number
     */
    public Long getSerialNumber() {
        return getFieldLongValue(3, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set serial_number field
     *
     * @param serialNumber
     */
    public void setSerialNumber(Long serialNumber) {
        setFieldValue(3, 0, serialNumber, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get product field
     *
     * @return product
     */
    public Integer getProduct() {
        return getFieldIntegerValue(4, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set product field
     *
     * @param product
     */
    public void setProduct(Integer product) {
        setFieldValue(4, 0, product, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get favero_product field
     *
     * @return favero_product
     */
    public Integer getFaveroProduct() {
        return getFieldIntegerValue(4, 0, Profile.SubFields.DEVICE_INFO_MESG_PRODUCT_FIELD_FAVERO_PRODUCT);
    }

    /**
     * Set favero_product field
     *
     * @param faveroProduct
     */
    public void setFaveroProduct(Integer faveroProduct) {
        setFieldValue(4, 0, faveroProduct, Profile.SubFields.DEVICE_INFO_MESG_PRODUCT_FIELD_FAVERO_PRODUCT);
    }

    /**
     * Get garmin_product field
     *
     * @return garmin_product
     */
    public Integer getGarminProduct() {
        return getFieldIntegerValue(4, 0, Profile.SubFields.DEVICE_INFO_MESG_PRODUCT_FIELD_GARMIN_PRODUCT);
    }

    /**
     * Set garmin_product field
     *
     * @param garminProduct
     */
    public void setGarminProduct(Integer garminProduct) {
        setFieldValue(4, 0, garminProduct, Profile.SubFields.DEVICE_INFO_MESG_PRODUCT_FIELD_GARMIN_PRODUCT);
    }

    /**
     * Get software_version field
     *
     * @return software_version
     */
    public Float getSoftwareVersion() {
        return getFieldFloatValue(5, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set software_version field
     *
     * @param softwareVersion
     */
    public void setSoftwareVersion(Float softwareVersion) {
        setFieldValue(5, 0, softwareVersion, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get hardware_version field
     *
     * @return hardware_version
     */
    public Short getHardwareVersion() {
        return getFieldShortValue(6, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set hardware_version field
     *
     * @param hardwareVersion
     */
    public void setHardwareVersion(Short hardwareVersion) {
        setFieldValue(6, 0, hardwareVersion, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get cum_operating_time field
     * Units: s
     * Comment: Reset by new battery or charge.
     *
     * @return cum_operating_time
     */
    public Long getCumOperatingTime() {
        return getFieldLongValue(7, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set cum_operating_time field
     * Units: s
     * Comment: Reset by new battery or charge.
     *
     * @param cumOperatingTime
     */
    public void setCumOperatingTime(Long cumOperatingTime) {
        setFieldValue(7, 0, cumOperatingTime, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get battery_voltage field
     * Units: V
     *
     * @return battery_voltage
     */
    public Float getBatteryVoltage() {
        return getFieldFloatValue(10, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set battery_voltage field
     * Units: V
     *
     * @param batteryVoltage
     */
    public void setBatteryVoltage(Float batteryVoltage) {
        setFieldValue(10, 0, batteryVoltage, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get battery_status field
     *
     * @return battery_status
     */
    public Short getBatteryStatus() {
        return getFieldShortValue(11, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set battery_status field
     *
     * @param batteryStatus
     */
    public void setBatteryStatus(Short batteryStatus) {
        setFieldValue(11, 0, batteryStatus, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get sensor_position field
     * Comment: Indicates the location of the sensor
     *
     * @return sensor_position
     */
    public BodyLocation getSensorPosition() {
        Short value = getFieldShortValue(18, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return BodyLocation.getByValue(value);
    }

    /**
     * Set sensor_position field
     * Comment: Indicates the location of the sensor
     *
     * @param sensorPosition
     */
    public void setSensorPosition(BodyLocation sensorPosition) {
        setFieldValue(18, 0, sensorPosition.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get descriptor field
     * Comment: Used to describe the sensor or location
     *
     * @return descriptor
     */
    public String getDescriptor() {
        return getFieldStringValue(19, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set descriptor field
     * Comment: Used to describe the sensor or location
     *
     * @param descriptor
     */
    public void setDescriptor(String descriptor) {
        setFieldValue(19, 0, descriptor, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get ant_transmission_type field
     *
     * @return ant_transmission_type
     */
    public Short getAntTransmissionType() {
        return getFieldShortValue(20, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set ant_transmission_type field
     *
     * @param antTransmissionType
     */
    public void setAntTransmissionType(Short antTransmissionType) {
        setFieldValue(20, 0, antTransmissionType, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get ant_device_number field
     *
     * @return ant_device_number
     */
    public Integer getAntDeviceNumber() {
        return getFieldIntegerValue(21, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set ant_device_number field
     *
     * @param antDeviceNumber
     */
    public void setAntDeviceNumber(Integer antDeviceNumber) {
        setFieldValue(21, 0, antDeviceNumber, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get ant_network field
     *
     * @return ant_network
     */
    public AntNetwork getAntNetwork() {
        Short value = getFieldShortValue(22, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return AntNetwork.getByValue(value);
    }

    /**
     * Set ant_network field
     *
     * @param antNetwork
     */
    public void setAntNetwork(AntNetwork antNetwork) {
        setFieldValue(22, 0, antNetwork.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get source_type field
     *
     * @return source_type
     */
    public SourceType getSourceType() {
        Short value = getFieldShortValue(25, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return SourceType.getByValue(value);
    }

    /**
     * Set source_type field
     *
     * @param sourceType
     */
    public void setSourceType(SourceType sourceType) {
        setFieldValue(25, 0, sourceType.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get product_name field
     * Comment: Optional free form string to indicate the devices name or model
     *
     * @return product_name
     */
    public String getProductName() {
        return getFieldStringValue(27, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set product_name field
     * Comment: Optional free form string to indicate the devices name or model
     *
     * @param productName
     */
    public void setProductName(String productName) {
        setFieldValue(27, 0, productName, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get battery_level field
     * Units: %
     *
     * @return battery_level
     */
    public Short getBatteryLevel() {
        return getFieldShortValue(32, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set battery_level field
     * Units: %
     *
     * @param batteryLevel
     */
    public void setBatteryLevel(Short batteryLevel) {
        setFieldValue(32, 0, batteryLevel, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

}
