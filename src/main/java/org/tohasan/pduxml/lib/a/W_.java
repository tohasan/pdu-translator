package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.datatype.LongUnsignedProcessor;
import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class W_ extends MessageByteProcessor {
    private LongUnsignedProcessor a;

    public W_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 226;
        var2.c(226);
        this.a = new LongUnsignedProcessor(225, var2);
        var2.d(226);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
    }

    public W_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 226;
        this.a = new LongUnsignedProcessor(225, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        this.a.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
