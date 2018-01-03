package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.datatype.DoubleLongUnsignedProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class D_ extends MessageByteProcessor {
    private aV_ a;
    private DoubleLongUnsignedProcessor c;

    public D_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 200;
        var2.c(200);
        this.a = new aV_(308, var2);
        this.c = new DoubleLongUnsignedProcessor(225, var2);
        var2.d(200);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
    }

    public D_(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 200;
        this.a = new aV_(308, messageInputStream);
        this.c = new DoubleLongUnsignedProcessor(225, messageInputStream);
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
