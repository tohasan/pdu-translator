package org.tohasan.pduxml.lib.utils;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.io.MessageOutputStream;

public class CommonUtils {

    public static StringBuffer byteArraytoHexStr(byte[] var0) {
        StringBuffer var1 = new StringBuffer();

        for (byte aVar0 : var0) {
            var1.append(toHexChar(aVar0 >>> 4 & 15));
            var1.append(toHexChar(aVar0 & 15));
        }

        return var1;
    }

    public static int decodeVarLengthUnsignedInteger(MessageInputStream messageByteStream) throws XmlPduException {
        int messageByte = (byte) messageByteStream.readByte();
        if ((messageByte & 128) != 0) {
            switch (messageByte & 127) {
                case 1:
                    return messageByteStream.readByte();
                case 2:
                    return (messageByteStream.readByte() << 8) + messageByteStream.readByte();
                default:
                    throw new XmlPduException("Length " + String.valueOf(messageByte) + " of variable-length integer is not implemented");
            }
        } else {
            return messageByte;
        }
    }

    public static void encodeVarLengthUnsignedInteger(MessageOutputStream var0, int var1) throws XmlPduException {
        if (var1 <= 127) {
            var0.write(var1);
        } else if (var1 <= 255) {
            var0.write(129);
            var0.write(var1);
        } else if (var1 <= '\uffff') {
            var0.write(130);
            var0.write(var1 / 256);
            var0.write(var1 % 256);
        } else {
            throw new XmlPduException("Coding of variable-lenght integer " + String.valueOf(var1) + " not implemented");
        }
    }

    public static byte[] hexStrToByteArray(StringBuffer var0) throws XmlPduException {
        byte[] var1 = new byte[var0.length() / 2];
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;

        for (int var6 = 0; var3 < var0.length(); ++var3) {
            char var2;
            if ((var2 = var0.charAt(var3)) >= 48 && var2 <= 57) {
                var5 = (var5 << 4) + var2 - 48;
                ++var4;
            } else if (var2 >= 65 && var2 <= 70) {
                var5 = (var5 << 4) + var2 - 65 + 10;
                ++var4;
            } else if (var2 >= 97 && var2 <= 102) {
                var5 = (var5 << 4) + var2 - 97 + 10;
                ++var4;
            } else if (var2 != 32) {
                throw new XmlPduException("HexStrToByteStr: Illegal character");
            }

            if (var4 == 2) {
                var1[var6++] = (byte) var5;
                var5 = 0;
                var4 = 0;
            }
        }

        return var1;
    }

    public static int hexToInt(StringBuffer var0) throws XmlPduException {
        int var3 = 0;

        for (int var1 = 0; var1 < var0.length(); ++var1) {
            var3 <<= 4;
            char var2;
            if ((var2 = var0.charAt(var1)) >= 48 && var2 <= 57) {
                var3 += var2 - 48;
            } else if (var2 >= 65 && var2 <= 70) {
                var3 += var2 - 65 + 10;
            } else {
                if (var2 < 97 || var2 > 102) {
                    throw new XmlPduException("hexToInt: illegal character");
                }

                var3 += var2 - 97 + 10;
            }
        }

        return var3;
    }

    public static StringBuffer intToHex(int value) {
        StringBuffer hexValue = new StringBuffer();

        if (256 <= value) {
            hexValue.append(toHexChar(value >>> 12 & 15));
            hexValue.append(toHexChar(value >>> 8 & 15));
        }

        hexValue.append(toHexChar(value >>> 4 & 15));
        hexValue.append(toHexChar(value & 15));

        return hexValue;
    }

    private static char toHexChar(int var0) {
        return var0 >= 0 && var0 <= 9 ? (char) (var0 + 48) : (char) (65 + (var0 - 10));
    }
}
