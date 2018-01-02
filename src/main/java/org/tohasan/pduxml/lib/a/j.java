package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class j extends MessageByteProcessor {
    private aZ_ a;
    private bc c;

    public j(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 175;
        var2.c(175);
        this.a = new aZ_(181, var2);
        this.c = new bc(178, var2);
        var2.d(175);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
    }

    public j(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 175;
        this.a = new aZ_(181, var2);
        this.c = new bc(178, var2);
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
