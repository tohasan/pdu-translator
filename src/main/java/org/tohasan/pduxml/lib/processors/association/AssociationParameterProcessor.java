package org.tohasan.pduxml.lib.processors.association;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;

public class AssociationParameterProcessor extends MessageByteProcessor {
    public String a;

    protected AssociationParameterProcessor() {
    }

    AssociationParameterProcessor(int var1, XmlParser var2) throws XmlPduException {
        this.tagKey = var1;
        this.a = var2.f(454).toString();
        var2.a();
    }

    AssociationParameterProcessor(int tagKey, MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = tagKey;
        this.a(messageInputStream);
    }

    protected final void a(MessageInputStream messageInputStream) throws XmlPduException {
        int var2 = messageInputStream.readByte();
        int var3 = messageInputStream.readByte();
        --var2;

        StringBuilder result = new StringBuilder();

        while (var2 > 0) {
            int var5 = messageInputStream.readByte();
            --var2;
            int var4;
            if (var2 == 0) {
                var4 = 8 - var3;
            } else {
                var4 = 8;
            }

            for (int var6 = 128; 0 < var4; --var4) {
                if ((var5 & var6) != 0) {
                    result.append('1');
                } else {
                    result.append('0');
                }

                var6 >>= 1;
            }
        }

        this.a = result.toString();
    }

    public void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        int var4 = 0;
        int var5 = 0;
        messageOutputStream.write(0);
        int var3 = messageOutputStream.size() - 1;
        messageOutputStream.write(0);

        for (int var2 = 0; var2 < this.a.length(); ++var2) {
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

        messageOutputStream.a(var3, messageOutputStream.size() - var3 - 1);
        messageOutputStream.a(var3 + 1, 8 - var4);
    }

    public void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendEmptyTag(this.tagKey, 454, new StringBuffer(this.a));
    }
}
