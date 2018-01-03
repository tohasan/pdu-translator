package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class bM_ extends MessageByteProcessor {
    private aV_ a;
    private bb c;
    private ah d;

    public bM_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 422;
        var2.c(422);
        this.a = new aV_(308, var2);
        this.c = new bb(var2);
        this.d = new ah(253, var2);
        var2.d(422);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
        this.d.a(messageOutputStream);
    }

    public bM_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 422;
        this.a = new aV_(308, var2);
        this.c = new bb(var2);
        this.d = new ah(253, var2);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
