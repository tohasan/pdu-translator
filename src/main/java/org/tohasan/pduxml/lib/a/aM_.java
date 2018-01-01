package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.CustomInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class aM_ extends MessageByteProcessor {
    private bs a;
    private bh c;
    private bc d;

    public aM_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 301;
        var2.c(301);
        if (var2.a((int) 249)) {
            this.a = new bs(249, var2);
        }

        this.c = new bh(317, var2);
        this.d = new bc(315, var2);
        var2.d(301);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        if (this.a != null) {
            var1.write(1);
            this.a.a(var1);
        } else {
            var1.write(0);
        }

        this.c.a(var1);
        this.d.a(var1);
    }

    public aM_(int var1, CustomInputStream var2) throws XmlPduException {
        this.b = 301;
        if (var2.readByte() != 0) {
            this.a = new bs(249, var2);
        }

        this.c = new bh(317, var2);
        this.d = new bc(315, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.b);
        var1.a();
        if (this.a != null) {
            this.a.a(var1);
        }

        this.c.a(var1);
        this.d.a(var1);
        var1.b();
        var1.b(this.b);
    }
}
