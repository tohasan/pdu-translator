package org.tohasan.pduxml.lib.infra;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public class d extends MessageByteProcessor {
    private String a;

    public d(int var1, m var2) throws XmlPduException {
        this.tagKey = var1;
        this.a = var2.f(454).toString();
        var2.a();
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        int var3 = this.a.length();
        int var4 = 0;
        int var5 = 0;
        CommonUtils.encodeVarLengthUnsignedInteger(var1, var3);

        for (int var2 = 0; var2 < var3; ++var2) {
            if (this.a.charAt(var2) != 48 && this.a.charAt(var2) != 49) {
                throw new XmlPduException("BERBitStr: illegal character - ".concat(this.a.substring(var2, var2)));
            }

            if (var4 == 8) {
                var1.write((byte) var5);
                var4 = 0;
                var5 = 0;
            }

            if (this.a.charAt(var2) == 49) {
                var5 |= 128 >> var4;
            }

            ++var4;
        }

        if (var4 > 0) {
            var1.write(var5);
        }

    }

    public d(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = var1;
        int var3 = CommonUtils.decodeVarLengthUnsignedInteger(var2);
        StringBuilder var7 = new StringBuilder();
        var1 = (var3 + 7) / 8;
        var3 = (8 - var3 % 8) % 8;

        while (var1 > 0) {
            int var5 = var2.readByte();
            --var1;
            int var4;
            if (var1 == 0) {
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

    public final void a(n var1) throws XmlPduException {
        var1.a(this.tagKey, 454, new StringBuffer(this.a), 1);
    }
}
