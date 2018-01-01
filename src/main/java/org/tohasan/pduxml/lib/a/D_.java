package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class D_ extends MessageByteProcessor {
    private aV_ a;
    private cc c;

    public D_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 200;
        var2.c(200);
        this.a = new aV_(308, var2);
        this.c = new cc(225, var2);
        var2.d(200);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
    }

    public D_(int var1, MessageInputStream var2) throws XmlPduException {
        this.b = 200;
        this.a = new aV_(308, var2);
        this.c = new cc(225, var2);
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
