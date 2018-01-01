package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.CustomInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class av extends MessageByteProcessor {
    private V_ a;
    private cb c;
    private cb d;
    private bs e;

    public av(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 277;
        var2.c(277);
        this.a = new V_(223, var2);
        this.c = new cb(225, var2);
        this.d = new cb(227, var2);
        this.e = new bs(224, var2);
        var2.d(277);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        this.e.a(var1);
    }

    public av(int var1, CustomInputStream var2) throws XmlPduException {
        this.b = 277;
        this.a = new V_(223, var2);
        this.c = new cb(225, var2);
        this.d = new cb(227, var2);
        this.e = new bs(224, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.b);
        var1.a();
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        this.e.a(var1);
        var1.b();
        var1.b(this.b);
    }
}
