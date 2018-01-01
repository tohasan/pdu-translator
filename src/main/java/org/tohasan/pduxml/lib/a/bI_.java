package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.CustomInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bI_ extends MessageByteProcessor {
    private aV_ a;
    private P_ c;
    private bE_ d;
    private ac e;

    public bI_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 418;
        var2.c(418);
        this.a = new aV_(308, var2);
        this.c = new P_(217, var2);
        if (var2.a((int) 189)) {
            this.d = new bE_(189, var2);
        }

        this.e = new ac(454, var2);
        var2.d(418);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
        if (this.d != null) {
            var1.write(1);
            this.d.a(var1);
        } else {
            var1.write(0);
        }

        this.e.a(var1);
    }

    public bI_(int var1, CustomInputStream var2) throws XmlPduException {
        this.b = 418;
        this.a = new aV_(308, var2);
        this.c = new P_(217, var2);
        if (var2.readByte() != 0) {
            this.d = new bE_(189, var2);
        }

        this.e = new ac(454, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.b);
        var1.a();
        this.a.a(var1);
        this.c.a(var1);
        if (this.d != null) {
            this.d.a(var1);
        }

        this.e.a(var1);
        var1.b();
        var1.b(this.b);
    }
}
