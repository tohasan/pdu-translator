package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class y extends MessageByteProcessor {
    private aV_ a;
    private bl c;
    private ah d;

    public y(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 195;
        var2.c(195);
        this.a = new aV_(308, var2);
        this.c = new bl(332, var2);
        this.d = new ah(366, var2);
        var2.d(195);
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
    }

    public y(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 195;
        this.a = new aV_(308, var2);
        this.c = new bl(332, var2);
        this.d = new ah(366, var2);
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
