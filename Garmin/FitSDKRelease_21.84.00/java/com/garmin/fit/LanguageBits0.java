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

import java.util.HashMap;
import java.util.Map;

public class LanguageBits0  {
    public static final short ENGLISH = 0x01;
    public static final short FRENCH = 0x02;
    public static final short ITALIAN = 0x04;
    public static final short GERMAN = 0x08;
    public static final short SPANISH = 0x10;
    public static final short CROATIAN = 0x20;
    public static final short CZECH = 0x40;
    public static final short DANISH = 0x80;
    public static final short INVALID = Fit.UINT8Z_INVALID;

    private static final Map<Short, String> stringMap;

    static {
        stringMap = new HashMap<Short, String>();
        stringMap.put(ENGLISH, "ENGLISH");
        stringMap.put(FRENCH, "FRENCH");
        stringMap.put(ITALIAN, "ITALIAN");
        stringMap.put(GERMAN, "GERMAN");
        stringMap.put(SPANISH, "SPANISH");
        stringMap.put(CROATIAN, "CROATIAN");
        stringMap.put(CZECH, "CZECH");
        stringMap.put(DANISH, "DANISH");
    }


    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value, or empty if unknown
     */
    public static String getStringFromValue( Short value ) {
        if( stringMap.containsKey( value ) ) {
            return stringMap.get( value );
        }

        return "";
    }

    /**
     * Retrieves a value given a string representation
     * @return The value or INVALID if unkwown
     */
    public static Short getValueFromString( String value ) {
        for( Map.Entry<Short, String> entry : stringMap.entrySet() ) {
            if( entry.getValue().equals( value ) ) {
                return entry.getKey();
            }
        }

        return INVALID;
    }

}
