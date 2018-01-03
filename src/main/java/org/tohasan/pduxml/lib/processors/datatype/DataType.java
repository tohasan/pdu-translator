package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.processors.common.EnumWithCode;

/**
 * author: IgorKaSan
 * date: 02.01.2018.
 */
public enum DataType implements EnumWithCode {
    NULL_DATA(0x00),
    ARRAY(0x01),
    STRUCTURE(0x02),
    BOOLEAN(0x03),
    BIT_STRING(0x04),
    DOUBLE_LONG(0x05),
    DOUBLE_LONG_UNSIGNED(0x06),
    FLOATING_POINT(0x07),
    OCTET_STRING(0x09),
    VISIBLE_STRING(0x0A),
    UTF8_STRING(0x0C),
    BCD(0x0D),
    INTEGER(0x0F),
    LONG(0x10),
    UNSIGNED(0x11),
    LONG_UNSIGNED(0x12),
    COMPACT_ARRAY(0x13),
    LONG64(0x14),
    LONG64_UNSIGNED(0x15),
    ENUM(0x16),
    FLOAT32(0x17),
    FLOAT64(0x18),
    DATETIME(0x19),
    DATE(0x1A),
    TIME(0x1B),
    DO_NOT_CARE(0xFF);

    private int code;

    DataType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
