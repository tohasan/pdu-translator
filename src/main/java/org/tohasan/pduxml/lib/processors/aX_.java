package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class aX_ extends MessageByteProcessor {
    private int a;

    public aX_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 311;
        var2.b(311);
        String var3;
        if ((var3 = var2.f(454).toString()).equals("GlobalUnicastEncryptionKey")) {
            this.a = 0;
        } else {
            if (!var3.equals("GlobalBroadcastEncryptionKey")) {
                throw new XmlPduException("_KeyId: illegal element " + var3);
            }

            this.a = 1;
        }

        var2.a();
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write((byte) this.a);
    }

    public aX_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 311;
        this.a = var2.readByte();
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        StringBuffer var2 = new StringBuffer();
        switch (this.a) {
            case 0:
                var2.append("GlobalUnicastEncryptionKey");
                break;
            case 1:
                var2.append("GlobalBroadcastEncryptionKey");
                break;
            default:
                throw new XmlPduException("_KeyId: case range");
        }

        var1.appendEmptyTag(this.tagKey, 454, var2);
    }
}
