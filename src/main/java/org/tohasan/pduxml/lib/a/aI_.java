package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class aI_ extends MessageByteProcessor {
    private aV_ a;
    private be c;

    public aI_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 291;
        var2.c(291);
        this.a = new aV_(308, var2);
        this.c = new be(403, var2);
        var2.d(291);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
    }

    public aI_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 291;
        this.a = new aV_(308, var2);
        this.c = new be(403, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        this.a.a(var1);
        this.c.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
