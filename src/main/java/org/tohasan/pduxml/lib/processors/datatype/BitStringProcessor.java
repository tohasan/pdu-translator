package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class BitStringProcessor extends MessageByteProcessor {
    private String a;

    public BitStringProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 222;
        this.a = var2.f(454).toString();
        var2.a();
    }

    public BitStringProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 222;
        int var3 = CommonUtils.decodeVarLengthUnsignedInteger(messageInputStream);
        StringBuilder var7 = new StringBuilder();
        tagKey = (var3 + 7) / 8;
        var3 = (8 - var3 % 8) % 8;

        while (tagKey > 0) {
            int var5 = messageInputStream.readByte();
            --tagKey;
            int var4;
            if (tagKey == 0) {
                var4 = 8 - var3;
            } else {
                var4 = 8;
            }

            for (int var6 = 128; var4 > 0; --var4) {
                if ((var5 & var6) != 0) {
                    var7.append('1');
                } else {
                    var7.append('0');
                }

                var6 >>= 1;
            }
        }

        this.a = var7.toString();
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        int var3 = this.a.length();
        int var4 = 0;
        int var5 = 0;
        CommonUtils.encodeVarLengthUnsignedInteger(messageOutputStream, var3);

        for (int var2 = 0; var2 < var3; ++var2) {
            if (this.a.charAt(var2) != 48 && this.a.charAt(var2) != 49) {
                throw new XmlPduException("BERBitStr: illegal character - ".concat(this.a.substring(var2, var2)));
            }

            if (var4 == 8) {
                messageOutputStream.write((byte) var5);
                var4 = 0;
                var5 = 0;
            }

            if (this.a.charAt(var2) == 49) {
                var5 |= 128 >> var4;
            }

            ++var4;
        }

        if (var4 > 0) {
            messageOutputStream.write(var5);
        }

    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendEmptyTag(this.tagKey, 454, new StringBuffer(this.a));
    }
}
