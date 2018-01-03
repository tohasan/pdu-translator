package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class i extends MessageByteProcessor {
    private bl a;

    public i(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 174;
        var2.c(174);
        this.a = new bl(332, var2);
        var2.d(174);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
    }

    public i(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 174;
        this.a = new bl(332, var2);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        this.a.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
