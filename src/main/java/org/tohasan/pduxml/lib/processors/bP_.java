package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.datatype.DoubleLongUnsignedProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class bP_ extends MessageByteProcessor {
    private aV_ a;
    private ad c;
    private DoubleLongUnsignedProcessor d;

    public bP_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 425;
        var2.c(425);
        this.a = new aV_(308, var2);
        this.c = new ad(403, var2);
        this.d = new DoubleLongUnsignedProcessor(225, var2);
        var2.d(425);
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
    }

    public bP_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 425;
        this.a = new aV_(308, var2);
        this.c = new ad(403, var2);
        this.d = new DoubleLongUnsignedProcessor(225, var2);
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
