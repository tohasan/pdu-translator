package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;

public final class j extends MessageByteProcessor {
    private aZ_ a;
    private bc c;

    public j(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 175;
        var2.c(175);
        this.a = new aZ_(var2);
        this.c = new bc(178, var2);
        var2.d(175);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
    }

    public j(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 175;
        this.a = new aZ_(messageInputStream);
        this.c = new bc(178, messageInputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        this.a.a(var1);
        this.c.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
