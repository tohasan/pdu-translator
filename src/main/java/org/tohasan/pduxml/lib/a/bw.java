package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bw extends MessageByteProcessor {
    private X_ a;
    private cb c;
    private bs d;

    public bw(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 384;
        var2.c(384);
        this.a = new X_(314, var2);
        this.c = new cb(225, var2);
        this.d = new bs(382, var2);
        var2.d(384);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
    }

    public bw(int var1, MessageInputStream var2) throws XmlPduException {
        this.b = 384;
        this.a = new X_(314, var2);
        this.c = new cb(225, var2);
        this.d = new bs(382, var2);
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
