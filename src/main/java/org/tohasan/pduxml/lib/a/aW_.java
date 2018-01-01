package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.CustomInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class aW_ extends MessageByteProcessor {
    private int a;

    public aW_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 309;
        var2.b(309);
        String var3;
        if ((var3 = var2.f(454).toString()).equals("MasterKey")) {
            this.a = 0;
            var2.a();
        } else {
            throw new XmlPduException("_KekId: illegal element " + var3);
        }
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        var1.write((byte) this.a);
    }

    public aW_(int var1, CustomInputStream var2) throws XmlPduException {
        this.b = 309;
        this.a = var2.readByte();
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        StringBuffer var2 = new StringBuffer();
        switch (this.a) {
            case 0:
                var2.append("MasterKey");
                var1.a(this.b, 454, var2, 1);
                return;
            default:
                throw new XmlPduException("_KekId: case range");
        }
    }
}
