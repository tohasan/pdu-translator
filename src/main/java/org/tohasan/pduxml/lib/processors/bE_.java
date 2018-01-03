package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.datatype.SelectorProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bE_ extends MessageByteProcessor {
    private SelectorProcessor a;
    private ParameterProcessor c;

    bE_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 189;
        var2.c(189);
        this.a = new SelectorProcessor(190, var2);
        this.c = new ParameterProcessor(172, var2);
        var2.d(189);
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
    }

    bE_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 189;
        this.a = new SelectorProcessor(190, var2);
        this.c = new ParameterProcessor(172, var2);
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
