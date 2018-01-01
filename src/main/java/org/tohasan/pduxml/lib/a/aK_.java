package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class aK_ extends MessageByteProcessor {
    private aX_ a;

    public aK_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 296;
        var2.c(296);
        this.a = new aX_(311, var2);
        var2.d(296);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
    }

    public aK_(int var1, MessageInputStream var2) throws XmlPduException {
        this.b = 296;
        this.a = new aX_(311, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.b);
        var1.a();
        this.a.a(var1);
        var1.b();
        var1.b(this.b);
    }
}
