package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.datatype.DoubleLongUnsignedProcessor;
import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bO_ extends MessageByteProcessor {
    private aV_ a;
    private DoubleLongUnsignedProcessor c;

    public bO_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 424;
        var2.c(424);
        this.a = new aV_(308, var2);
        this.c = new DoubleLongUnsignedProcessor(225, var2);
        var2.d(424);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
    }

    public bO_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 424;
        this.a = new aV_(308, var2);
        this.c = new DoubleLongUnsignedProcessor(225, var2);
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
