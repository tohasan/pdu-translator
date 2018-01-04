package org.tohasan.pduxml.lib.processors.common;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public class MultiByteValueProcessor extends MessageByteProcessor {
    public int a;
    private byte[] c;

    public final void a(XmlParser var1) throws XmlPduException {
        this.c = CommonUtils.hexStrToByteArray(var1.f(454));
        if (this.a != -1 && this.c.length != this.a) {
            throw new XmlPduException("OctetString: Illegal data size, expected " + String.valueOf(this.a) + " found " + this.c.length);
        }
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        int var2;
        if (this.a == -1) {
            CommonUtils.encodeVarLengthUnsignedInteger(messageOutputStream, this.c.length);
            var2 = this.c.length;
        } else {
            var2 = this.a;
        }

        for (int var3 = 0; var3 < var2; ++var3) {
            messageOutputStream.write(this.c[var3]);
        }
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendEmptyTag(this.tagKey, 454, CommonUtils.byteArraytoHexStr(this.c));
    }

    public final void a(MessageInputStream messageInputStream) throws XmlPduException {
        int valueSize;

        if (this.a == -1) {
            valueSize = CommonUtils.decodeVarLengthUnsignedInteger(messageInputStream);
        } else {
            valueSize = this.a;
        }

        this.c = new byte[valueSize];

        for (int var2 = 0; var2 < valueSize; ++var2) {
            this.c[var2] = (byte) messageInputStream.readByte();
        }
    }
}
