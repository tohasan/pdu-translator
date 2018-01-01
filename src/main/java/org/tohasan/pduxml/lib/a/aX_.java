package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.CustomInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class aX_ extends MessageByteProcessor {
    private int a;

    public aX_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 311;
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

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        var1.write((byte) this.a);
    }

    public aX_(int var1, CustomInputStream var2) throws XmlPduException {
        this.b = 311;
        this.a = var2.readByte();
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
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

        var1.a(this.b, 454, var2, 1);
    }
}
