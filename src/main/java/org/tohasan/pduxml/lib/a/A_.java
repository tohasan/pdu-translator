package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.CustomInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class A_ extends MessageByteProcessor {
    private aV_ a;
    private bf c;
    private ah d;

    public A_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 197;
        var2.c(197);
        this.a = new aV_(308, var2);
        this.c = new bf(333, var2);
        this.d = new ah(366, var2);
        var2.d(197);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
    }

    public A_(int var1, CustomInputStream var2) throws XmlPduException {
        this.b = 197;
        this.a = new aV_(308, var2);
        this.c = new bf(333, var2);
        this.d = new ah(366, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.b);
        var1.a();
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        var1.b();
        var1.b(this.b);
    }
}
