package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class P_ extends MessageByteProcessor {
    private Z_ a;
    private bp c;
    private bo d;

    public P_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 217;
        var2.c(217);
        this.a = new Z_(245, var2);
        this.c = new bp(305, var2);
        this.d = new bo(219, var2);
        var2.d(217);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
        this.d.a(messageOutputStream);
    }

    public P_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 217;
        this.a = new Z_(245, var2);
        this.c = new bp(305, var2);
        this.d = new bo(219, var2);
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
