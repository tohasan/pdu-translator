package org.tohasan.pduxml.lib.a.variableaccessspec;

import org.tohasan.pduxml.lib.a.EnumWithCode;

/**
 * author: IgorKaSan
 * date: 02.01.2018.
 */
public enum VariableAccessSpecType implements EnumWithCode {
    VARIABLE_NAME(2),
    PARAMETRIZED_ACCESS(4),
    BLOCK_NUMBER_ACCESS(5),
    READ_DATA_BLOCK_ACCESS(6),
    WRITE_DATA_BLOCK_ACCESS(7);

    private int code;

    VariableAccessSpecType(int code) {
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }
}
