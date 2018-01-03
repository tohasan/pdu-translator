package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.bc;
import org.tohasan.pduxml.lib.processors.bh;

public final class UnconfirmedWriteRequestProcessor extends MessageByteProcessor {
    private bh a;
    private bc c;

    public UnconfirmedWriteRequestProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 448;
        var2.c(448);
        this.a = new bh(317, var2);
        this.c = new bc(315, var2);
        var2.d(448);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
    }

    public UnconfirmedWriteRequestProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 448;
        this.a = new bh(317, messageInputStream);
        this.c = new bc(315, messageInputStream);
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
