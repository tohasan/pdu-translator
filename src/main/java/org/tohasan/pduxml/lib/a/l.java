package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.CustomInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class l extends MessageByteProcessor {
    private P_ a;
    private bE_ c;

    public l(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 177;
        var2.c(177);
        this.a = new P_(217, var2);
        this.c = new bE_(189, var2);
        var2.d(177);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
    }

    public l(int var1, CustomInputStream var2) throws XmlPduException {
        this.b = 177;
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
