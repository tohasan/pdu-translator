package org.tohasan.pduxml.lib.infra;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public class c extends MessageByteProcessor {
    private byte[] a;

    public final void a(m var1) throws XmlPduException {
        this.a = CommonUtils.hexStrToByteArray(var1.f(454));
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        CommonUtils.encodeVarLengthUnsignedInteger(messageOutputStream, this.a.length);
        int var2 = this.a.length;

        for (byte anA : this.a) {
            messageOutputStream.write(anA);
        }
    }

    public final void a(MessageInputStream var1) throws XmlPduException {
        int var3 = CommonUtils.decodeVarLengthUnsignedInteger(var1);
        this.a = new byte[var3];

        for (int var2 = 0; var2 < var3; ++var2) {
            this.a[var2] = (byte) var1.readByte();
        }
    }

    public final void a(n var1) throws XmlPduException {
        var1.a(this.tagKey, 454, CommonUtils.byteArraytoHexStr(this.a), 1);
    }
}
