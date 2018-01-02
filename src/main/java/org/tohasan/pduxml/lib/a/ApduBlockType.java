package org.tohasan.pduxml.lib.a;

/**
 * author: IgorKaSan
 * date: 01.01.2018.
 */
public enum ApduBlockType implements EnumWithCode {
    READ_REQUEST(0x05),
    READ_RESPONSE(0x0C);

    private int code;

    ApduBlockType(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}
