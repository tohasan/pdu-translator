package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class t extends MessageByteProcessor {
    private ad a;

    public t(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 187;
        var2.c(187);
        this.a = new ad(403, var2);
        var2.d(187);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
    }

    public t(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 187;
        this.a = new ad(403, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        this.a.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
