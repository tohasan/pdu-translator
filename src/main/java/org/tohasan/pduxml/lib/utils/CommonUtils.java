package org.tohasan.pduxml.lib.utils;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.XmlPduException;
import org.tohasan.pduxml.lib.infra.i;

public class CommonUtils {
    public static StringBuffer AXDRBitStringToBinHexStr(byte[] var0, int var1) throws XmlPduException {
        int var2 = 0;
        int var3 = 0;
        byte var4 = 0;
        StringBuffer var5 = new StringBuffer();
        if (var1 > 0 && var0.length == (var1 + 7) / 8) {
            for (int var6 = 1; var6 <= var1; ++var6) {
                if (var2 == 0) {
                    var2 = 128;
                    var4 = var0[var3++];
                }

                if ((var2 & var4) != 0) {
                    var5.append("1");
                } else {
                    var5.append("0");
                }

                var2 >>= 1;
            }

            return var5;
        } else {
            throw new XmlPduException("AXDRBitStringToBinHexStr: Illegal byte qty");
        }
    }

    public static byte[] binHexStrToAXDRBitString(StringBuffer var0) throws XmlPduException {
        byte var1 = 0;
        int var2 = 0;
        if (var0.length() == 0) {
            throw new XmlPduException("Empty BinHexStr");
        } else {
            byte[] var5 = new byte[(var0.length() + 7) / 8];
            int var4 = 128;

            for (int var3 = 0; var3 < var0.length(); ++var3) {
                switch (var0.charAt(var3)) {
                    case '0':
                        break;
                    case '1':
                        var1 = (byte) (var1 | var4);
                        break;
                    default:
                        throw new XmlPduException("Illegal character in BinHexStr");
                }

                if ((var4 >>= 1) == 0) {
                    var5[var2++] = var1;
                    var1 = 0;
                    var4 = 128;
                }
            }

            if (var4 != 128) {
                var5[var2] = var1;
            }

            return var5;
        }
    }

    public static StringBuffer byteArraytoHexStr(byte[] var0) {
        StringBuffer var1 = new StringBuffer();

        for (int var2 = 0; var2 < var0.length; ++var2) {
            var1.append(toHexChar(var0[var2] >>> 4 & 15));
            var1.append(toHexChar(var0[var2] & 15));
        }

        return var1;
    }

    public static String byteToHex(byte var0) {
        StringBuffer var1;
        (var1 = new StringBuffer()).append(toHexChar(var0 >>> 4 & 15));
        var1.append(toHexChar(var0 & 15));
        return var1.toString();
    }

    public static StringBuffer decodeBERBitStringHexStr(MessageInputStream var0) throws XmlPduException {
        StringBuffer var5 = new StringBuffer();
        int var1 = var0.readByte();
        int var2 = var0.readByte();
        --var1;

        while (var1 > 0) {
            int var4 = var0.readByte();
            --var1;
            int var3;
            if (var1 == 0) {
                var3 = 8 - var2;
            } else {
                var3 = 8;
            }

            while (var3 > 0) {
                if ((var4 & 128) != 0) {
                    var5.append('1');
                } else {
                    var5.append('0');
                }

                var4 = (var4 & 127) >> 1;
                --var3;
            }
        }

        return var5;
    }

    public static StringBuffer decodeGraphicByteStringStr(MessageInputStream var0) throws XmlPduException {
        int var2 = var0.readByte();

        StringBuffer var3;
        for (var3 = new StringBuffer(); var2 > 0; --var2) {
            char var1 = (char) var0.readByte();
            var3.append(var1);
        }

        return var3;
    }

    public static StringBuffer decodeObjectStr(MessageInputStream var0, boolean var1) throws XmlPduException {
        if (var1) {
            var0.readByte(6);
        }

        var0.readByte(7);
        var0.readByte(96);
        var0.readByte(133);
        var0.readByte(116);
        var0.readByte(5);
        var0.readByte(8);
        switch (var0.readByte()) {
            case 1:
                switch (var0.readByte()) {
                    case 1:
                        return new StringBuffer("LN");
                    case 2:
                        return new StringBuffer("SN");
                    default:
                        throw new XmlPduException("Unknown context name encoding");
                }
            case 2:
                switch (var0.readByte()) {
                    case 1:
                        return new StringBuffer("LOW_SECURITY");
                    case 2:
                        return new StringBuffer("HIGH_SECURITY");
                    default:
                        throw new XmlPduException("Unknown mechanism name encoding");
                }
            default:
                throw new XmlPduException("Unknown object identifier");
        }
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

    public static void encodeBitStringByteStr(StringBuffer var0, i var1, boolean var2) throws XmlPduException {
        if (var2) {
            var1.write(3);
        }

        packBERBitString(var0, var1);
    }

    public static void encodeGraphicByteStr(StringBuffer var0, i var1, boolean var2) {
        if (var2) {
            var1.write(19);
        }

        var1.write((byte) var0.length());

        for (int var3 = 0; var3 < var0.length(); ++var3) {
            var1.write((byte) var0.charAt(var3));
        }

    }

    public static void encodeObjectByteStr(StringBuffer var0, i var1, boolean var2) throws XmlPduException {
        if (var2) {
            var1.write(6);
        }

        var1.write(7);
        var1.write(96);
        var1.write(-123);
        var1.write(116);
        var1.write(5);
        var1.write(8);
        String var3;
        if ((var3 = var0.toString()).equalsIgnoreCase("LN")) {
            var1.write(1);
            var1.write(1);
        } else if (var3.equalsIgnoreCase("SN")) {
            var1.write(1);
            var1.write(2);
        } else if (var3.equalsIgnoreCase("HIGH_SECURITY")) {
            var1.write(2);
            var1.write(2);
        } else if (var3.equalsIgnoreCase("LOW_SECURITY")) {
            var1.write(2);
            var1.write(1);
        } else {
            throw new XmlPduException("Unknown identifier " + var3);
        }
    }

    public static void encodeVarLengthUnsignedInteger(i var0, int var1) throws XmlPduException {
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

    public static StringBuffer hexStrToVisibleStr(StringBuffer var0) throws XmlPduException {
        StringBuffer var1 = new StringBuffer();
        int var2 = 0;
        int var3 = 0;

        for (int var4 = 0; var2 < var0.length(); ++var2) {
            if (var0.charAt(var2) >= 48 && var0.charAt(var2) <= 57) {
                var4 = (var4 << 4) + var0.charAt(var2) - 48;
                ++var3;
            } else if (var0.charAt(var2) >= 65 && var0.charAt(var2) <= 70) {
                var4 = (var4 << 4) + var0.charAt(var2) - 65 + 10;
                ++var3;
            } else if (var0.charAt(var2) != 32) {
                throw new XmlPduException("HexStrToByteStr: Illegal character");
            }

            if (var3 == 2) {
                var1.append((char) var4);
                var4 = 0;
                var3 = 0;
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

    public static StringBuffer intToHex(int var0, boolean var1) {
        StringBuffer var2 = new StringBuffer();
        if (!var1) {
            var2.append(toHexChar(var0 >>> 12 & 15));
            var2.append(toHexChar(var0 >>> 8 & 15));
            var2.append(toHexChar(var0 >>> 4 & 15));
            var2.append(toHexChar(var0 & 15));
        } else {
            if (var0 >= 256) {
                var2.append(toHexChar(var0 >>> 12 & 15));
                var2.append(toHexChar(var0 >>> 8 & 15));
            }

            var2.append(toHexChar(var0 >>> 4 & 15));
            var2.append(toHexChar(var0 & 15));
        }

        return var2;
    }

    public static void packBERBitString(StringBuffer var0, i var1) throws XmlPduException {
        byte[] var2 = new byte[]{(byte) -128, (byte) 64, (byte) 32, (byte) 16, (byte) 8, (byte) 4, (byte) 2, (byte) 1};
        int var4 = 0;
        int var5 = 0;
        int var6 = var1.size();
        var1.write(0);
        var1.write(0);

        for (int var3 = 0; var3 < var0.length(); ++var3) {
            if (var0.charAt(var3) != 48 && var0.charAt(var3) != 49) {
                throw new XmlPduException("packBERBitString: illegal character");
            }

            if (var4 == 8) {
                var1.write((byte) var5);
                var4 = 0;
                var5 = 0;
            }

            if (var0.charAt(var3) == 49) {
                var5 |= var2[var4];
            }

            ++var4;
        }

        if (var4 > 0) {
            var1.write((byte) var5);
        }

        var1.a(var6, var1.size() - var6 - 1);
        var1.a(var6 + 1, 8 - var4);
    }

    public static char toHexChar(int var0) {
        return var0 >= 0 && var0 <= 9 ? (char) (var0 + 48) : (char) (65 + (var0 - 10));
    }

    public static StringBuffer visibleStrtoHexStr(StringBuffer var0) {
        StringBuffer var1 = new StringBuffer();

        for (int var2 = 0; var2 < var0.length(); ++var2) {
            var1.append(toHexChar(var0.charAt(var2) >>> 4 & 15));
            var1.append(toHexChar(var0.charAt(var2) & 15));
        }

        return var1;
    }
}
