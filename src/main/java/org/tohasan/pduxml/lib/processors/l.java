package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class l extends MessageByteProcessor {
    private P_ a;
    private bE_ c;

    public l(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 177;
        var2.c(177);
        this.a = new P_(217, var2);
        this.c = new bE_(189, var2);
        var2.d(177);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
    }

    public l(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 177;
        this.a = new P_(217, var2);
        this.c = new bE_(189, var2);
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
