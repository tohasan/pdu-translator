package org.tohasan.pduxml.lib.utils;

import org.tohasan.pduxml.lib.processors.common.EnumWithCode;

/**
 * author: IgorKaSan
 * date: 02.01.2018.
 */
public class EnumUtils {

    public static <E extends Enum<E> & EnumWithCode> E fromCode(Class<E> enumClass, int code) {
        for (E type : enumClass.getEnumConstants()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        return null;
    }
}
