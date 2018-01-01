package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.CustomInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bl extends MessageByteProcessor {
    private Z_ a;
    private bp c;
    private bq d;

    public bl(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = var1;
        var2.c(var1);
        this.a = new Z_(245, var2);
        this.c = new bp(305, var2);
        this.d = new bq(334, var2);
        var2.d(var1);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
    }

    public bl(int var1, CustomInputStream var2) throws XmlPduException {
        this.b = var1;
        this.a = new Z_(245, var2);
        this.c = new bp(305, var2);
        this.d = new bq(334, var2);
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
