package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class n extends MessageByteProcessor {
    private P_ a;
    private bE_ c;

    public n(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 180;
        var2.c(180);
        this.a = new P_(217, var2);
        this.c = new bE_(189, var2);
        var2.d(180);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
    }

    public n(int var1, MessageInputStream var2) throws XmlPduException {
        this.b = 180;
        this.a = new P_(217, var2);
        this.c = new bE_(189, var2);
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
