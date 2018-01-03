package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class k extends MessageByteProcessor {
    private P_ a;

    public k(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 176;
        var2.c(176);
        this.a = new P_(217, var2);
        var2.d(176);
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        this.a.a(var1);
    }

    public k(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 176;
        this.a = new P_(217, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        this.a.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
