package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.datatype.LongUnsignedProcessor;
import org.tohasan.pduxml.lib.a.datatype.OctetStringProcessor;
import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class av extends MessageByteProcessor {
    private V_ a;
    private LongUnsignedProcessor c;
    private LongUnsignedProcessor d;
    private OctetStringProcessor e;

    public av(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 277;
        var2.c(277);
        this.a = new V_(223, var2);
        this.c = new LongUnsignedProcessor(225, var2);
        this.d = new LongUnsignedProcessor(227, var2);
        this.e = new OctetStringProcessor(224, var2);
        var2.d(277);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        this.e.a(var1);
    }

    public av(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 277;
        this.a = new V_(223, var2);
        this.c = new LongUnsignedProcessor(225, var2);
        this.d = new LongUnsignedProcessor(227, var2);
        this.e = new OctetStringProcessor(224, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        this.e.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
