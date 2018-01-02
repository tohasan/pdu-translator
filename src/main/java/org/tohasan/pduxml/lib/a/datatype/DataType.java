package org.tohasan.pduxml.lib.a.datatype;

import org.tohasan.pduxml.lib.a.EnumWithCode;

/**
 * author: IgorKaSan
 * date: 02.01.2018.
 */
public enum DataType implements EnumWithCode {
    NULL_DATA(0),
    ARRAY(1),
    STRUCTURE(2),
    BOOLEAN(3),
    BIT_STRING(4),
    DOUBLE_LONG(5),
    DOUBLE_LONG_UNSIGNED(6),
    FLOATING_POINT(7),
    OCTET_STRING(9),
    VISIBLE_STRING(10),
    UTF8_STRING(12),
    BCD(13),
    INTEGER(15),
    LONG(16),
    UNSIGNED(17),
    LONG_UNSIGNED(18),
    COMPACT_ARRAY(19),
    LONG64(20),
    LONG64_UNSIGNED(21),
    ENUM(22),
    FLOAT32(23),
    FLOAT64(24),
    DATETIME(25),
    DATE(26),
    TIME(27);

    private int code;

    DataType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
