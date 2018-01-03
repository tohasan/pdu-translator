package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.bc;
import org.tohasan.pduxml.lib.processors.bh;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class UnconfirmedWriteRequestProcessor extends MessageByteProcessor {
    private bh a;
    private bc c;

    public UnconfirmedWriteRequestProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 448;
        var2.c(448);
        this.a = new bh(317, var2);
        this.c = new bc(315, var2);
        var2.d(448);
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
    }

    public UnconfirmedWriteRequestProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 448;
        this.a = new bh(317, var2);
        this.c = new bc(315, var2);
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