package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class aw extends MessageByteProcessor {
    private bs a;
    private bs c;
    private bs d;
    private bs e;
    private bs f;
    private aY_ g;
    private bs h;

    public aw(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 278;
        var2.c(278);
        this.a = new bs(444, var2);
        this.c = new bs(360, var2);
        this.d = new bs(389, var2);
        this.e = new bs(262, var2);
        this.f = new bs(363, var2);
        if (var2.a(312)) {
            this.g = new aY_(312, var2);
        }

        this.h = new bs(243, var2);
        var2.d(278);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        this.e.a(var1);
        this.f.a(var1);
        if (this.g != null) {
            var1.write(1);
            this.g.a(var1);
        } else {
            var1.write(0);
        }

        this.h.a(var1);
    }

    public aw(int var1, MessageInputStream var2) throws XmlPduException {
        this.b = 278;
        this.a = new bs(444, var2);
        this.c = new bs(360, var2);
        this.d = new bs(389, var2);
        this.e = new bs(262, var2);
        this.f = new bs(363, var2);
        if (var2.readByte() != 0) {
            this.g = new aY_(312, var2);
        }

        this.h = new bs(243, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.b);
        var1.a();
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        this.e.a(var1);
        this.f.a(var1);
        if (this.g != null) {
            this.g.a(var1);
        }

        this.h.a(var1);
        var1.b();
        var1.b(this.b);
    }
}
