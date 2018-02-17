package org.tohasan.pduxml.lib.utils;

/**
 * author: IgorKaSan
 * date: 17.02.2018.
 */
public class Preprocessor {
    private String message;

    public Preprocessor(String message) {
        this.message = message;
    }

    public byte[] getBytes() {
        String message = CommonUtils.removeSpaces(this.message);
        return CommonUtils.hexStringToByteArray(message);
    }
}
