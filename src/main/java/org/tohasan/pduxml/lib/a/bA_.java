package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.CustomInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bA_ extends MessageByteProcessor {
    private int a;

    public bA_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 388;
        var2.b(388);
        String var3;
        if ((var3 = var2.f(454).toString()).equals("Normal")) {
            this.a = 0;
        } else if (var3.equals("Urgent")) {
            this.a = 1;
        } else {
            if (!var3.equals("UserDefined")) {
                throw new XmlPduException("_ReleaseRequestReason: illegal element " + var3);
            }

            this.a = 30;
        }

        var2.a();
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        var1.write(1);
        var1.write((byte) this.a);
    }

    public bA_(int var1, CustomInputStream var2) throws XmlPduException {
        this.b = 388;
        var2.readByte(1);
        this.a = var2.readByte();
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        StringBuffer var2 = new StringBuffer();
        switch (this.a) {
            case 0:
                var2.append("Normal");
                break;
            case 1:
                var2.append("Urgent");
                break;
            case 30:
                var2.append("UserDefined");
                break;
            default:
                throw new XmlPduException("_ReleaseRequestReason: case range");
        }

        var1.a(this.b, 454, var2, 1);
    }
}
