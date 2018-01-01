package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.CustomInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class az extends MessageByteProcessor {
    private bs a;
    private bs c;
    private bs d;
    private bs e;
    private bs f;
    private bs g;
    private bs h;

    public az(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 282;
        var2.c(282);
        this.a = new bs(444, var2);
        this.c = new bs(360, var2);
        this.d = new bs(389, var2);
        this.e = new bs(262, var2);
        this.f = new bs(363, var2);
        this.g = new bs(248, var2);
        this.h = new bs(429, var2);
        var2.d(282);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        this.e.a(var1);
        this.f.a(var1);
        this.g.a(var1);
        this.h.a(var1);
    }

    public az(int var1, CustomInputStream var2) throws XmlPduException {
        this.b = 282;
        this.a = new bs(444, var2);
        this.c = new bs(360, var2);
        this.d = new bs(389, var2);
        this.e = new bs(262, var2);
        this.f = new bs(363, var2);
        this.g = new bs(248, var2);
        this.h = new bs(429, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.b);
        var1.a();
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        this.e.a(var1);
        this.f.a(var1);
        this.g.a(var1);
        this.h.a(var1);
        var1.b();
        var1.b(this.b);
    }
}
