package org.tohasan.pduxml.lib.a.apdublocktype;

import org.tohasan.pduxml.lib.a.bc;
import org.tohasan.pduxml.lib.a.bh;
import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class WriteRequestProcessor extends MessageByteProcessor {
    private bh a;
    private bc c;

    public WriteRequestProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 462;
        var2.c(462);
        this.a = new bh(317, var2);
        this.c = new bc(315, var2);
        var2.d(462);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
    }

    public WriteRequestProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 462;
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
