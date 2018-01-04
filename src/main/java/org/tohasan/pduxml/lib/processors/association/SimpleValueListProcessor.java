package org.tohasan.pduxml.lib.processors.association;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public class SimpleValueListProcessor extends MessageByteProcessor {
    private byte[] a;

    public final void a(XmlParser var1) throws XmlPduException {
        this.a = CommonUtils.hexStrToByteArray(var1.f(454));
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        CommonUtils.encodeVarLengthUnsignedInteger(messageOutputStream, this.a.length);

        for (byte anA : this.a) {
            messageOutputStream.write(anA);
        }
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendEmptyTag(this.tagKey, 454, CommonUtils.byteArraytoHexStr(this.a));
    }

    public final void a(MessageInputStream messageInputStream) throws XmlPduException {
        int var3 = CommonUtils.decodeVarLengthUnsignedInteger(messageInputStream);
        this.a = new byte[var3];

        for (int var2 = 0; var2 < var3; ++var2) {
            this.a[var2] = (byte) messageInputStream.readByte();
        }
    }
}
