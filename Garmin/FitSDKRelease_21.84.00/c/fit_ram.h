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
// Product = EXAMPLE
// Alignment = 4 bytes, padding disabled.
///////////////////////////////////////////////////////////////////////////////////


#if !defined(FIT_RAM_H)
#define FIT_RAM_H

#include "fit_product.h"
#include "fit_convert.h"

#if defined(FIT_RAM_INCLUDE)

///////////////////////////////////////////////////////////////////////////////
// Public Function Prototypes
///////////////////////////////////////////////////////////////////////////////

FIT_RAM_FILE FitRAM_LookupFile(FIT_FILE file);
FIT_UINT32 FitRAM_GetFileSize(FIT_RAM_FILE file);
void FitRAM_FileReadBytes(FIT_RAM_FILE file, FIT_UINT16 file_index, FIT_UINT32 file_offset, void *data, FIT_UINT32 data_size);
void FitRAM_FileWriteBytes(FIT_RAM_FILE file, FIT_UINT16 file_index, FIT_UINT32 file_offset, const void *data, FIT_UINT32 data_size);

#if defined(FIT_CONVERT_MULTI_THREAD)
void FitRAM_FileWriteMesg(FIT_CONVERT_STATE *state, FIT_RAM_FILE file, FIT_UINT16 file_index, FIT_UINT16 mesg_num, const void *mesg_data, FIT_BOOL restore_fields);
#else
void FitRAM_FileWriteMesg(FIT_RAM_FILE file, FIT_UINT16 file_index, FIT_UINT16 mesg_num, const void *mesg_data, FIT_BOOL restore_fields);
#endif // defined(FIT_CONVERT_MULTI_THREAD)

#endif // defined(FIT_RAM_INCLUDE)

#endif // !defined(FIT_RAM_H)
