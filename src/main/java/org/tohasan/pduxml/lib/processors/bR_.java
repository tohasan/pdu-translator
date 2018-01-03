package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class bR_ extends MessageByteProcessor {
    private aV_ a;
    private ad c;

    public bR_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 427;
        var2.c(427);
        this.a = new aV_(308, var2);
        this.c = new ad(403, var2);
        var2.d(427);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
    }

    public bR_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 427;
        this.a = new aV_(308, var2);
        this.c = new ad(403, var2);
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
