package org.tohasan.pduxml.lib.a.variableaccessspec;

import org.tohasan.pduxml.lib.a.EnumWithCode;

/**
 * author: IgorKaSan
 * date: 02.01.2018.
 */
public enum VariableAccessSpecType implements EnumWithCode {
    VARIABLE_NAME(0x02),
    PARAMETRIZED_ACCESS(0x04),
    BLOCK_NUMBER_ACCESS(0x05),
    READ_DATA_BLOCK_ACCESS(0x06),
    WRITE_DATA_BLOCK_ACCESS(0x07);

    private int code;

    VariableAccessSpecType(int code) {
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }
}
