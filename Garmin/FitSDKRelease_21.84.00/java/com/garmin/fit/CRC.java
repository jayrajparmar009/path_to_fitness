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

public class CRC {
    private static final int[] crc16_table = { 0x0000, 0xCC01, 0xD801, 0x1400, 0xF001, 0x3C00, 0x2800, 0xE401, 0xA001, 0x6C00, 0x7800, 0xB401, 0x5000, 0x9C01, 0x8801, 0x4400 };

    public static final int get16(int crc, byte data) {
        int tmp;

        // compute checksum of lower four bits of byte
        tmp = crc16_table[crc & 0x0F];
        crc = (crc >> 4) & 0x0FFF;
        crc = crc ^ tmp ^ crc16_table[data & 0x0F];

        // now compute checksum of upper four bits of byte
        tmp = crc16_table[crc & 0x0F];
        crc = (crc >> 4) & 0x0FFF;
        crc = crc ^ tmp ^ crc16_table[(data >> 4) & 0x0F];

        return crc;
    }
}
