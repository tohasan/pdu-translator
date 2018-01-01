package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.CustomInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class ap extends MessageByteProcessor {
    private ar a;
    private aq c;

    public ap(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 273;
        var2.c(273);
        this.a = new ar(430, var2);
        this.c = new aq(411, var2);
        var2.d(273);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
    }

    public ap(int var1, CustomInputStream var2) throws XmlPduException {
        this.b = 273;
        this.a = new ar(430, var2);
        this.c = new aq(411, var2);
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
