package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.CustomInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bE_ extends MessageByteProcessor {
    private ce a;
    private ac c;

    public bE_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 189;
        var2.c(189);
        this.a = new ce(190, var2);
        this.c = new ac(172, var2);
        var2.d(189);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
    }

    public bE_(int var1, CustomInputStream var2) throws XmlPduException {
        this.b = 189;
        this.a = new ce(190, var2);
        this.c = new ac(172, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.b);
        var1.a();
        this.a.a(var1);
        this.c.a(var1);
        var1.b();
        var1.b(this.b);
    }
}
