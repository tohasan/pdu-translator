package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class z extends MessageByteProcessor {
    private aV_ a;
    private bf c;
    private bc d;

    public z(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 196;
        var2.c(196);
        this.a = new aV_(308, var2);
        this.c = new bf(333, var2);
        this.d = new bc(335, var2);
        var2.d(196);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
        this.d.a(messageOutputStream);
    }

    public z(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 196;
        this.a = new aV_(308, var2);
        this.c = new bf(333, var2);
        this.d = new bc(335, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
