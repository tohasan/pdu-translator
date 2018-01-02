package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.datatype.OctetStringProcessor;
import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class az extends MessageByteProcessor {
    private OctetStringProcessor a;
    private OctetStringProcessor c;
    private OctetStringProcessor d;
    private OctetStringProcessor e;
    private OctetStringProcessor f;
    private OctetStringProcessor g;
    private OctetStringProcessor h;

    public az(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 282;
        var2.c(282);
        this.a = new OctetStringProcessor(444, var2);
        this.c = new OctetStringProcessor(360, var2);
        this.d = new OctetStringProcessor(389, var2);
        this.e = new OctetStringProcessor(262, var2);
        this.f = new OctetStringProcessor(363, var2);
        this.g = new OctetStringProcessor(248, var2);
        this.h = new OctetStringProcessor(429, var2);
        var2.d(282);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        this.e.a(var1);
        this.f.a(var1);
        this.g.a(var1);
        this.h.a(var1);
    }

    public az(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 282;
        this.a = new OctetStringProcessor(444, var2);
        this.c = new OctetStringProcessor(360, var2);
        this.d = new OctetStringProcessor(389, var2);
        this.e = new OctetStringProcessor(262, var2);
        this.f = new OctetStringProcessor(363, var2);
        this.g = new OctetStringProcessor(248, var2);
        this.h = new OctetStringProcessor(429, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        this.e.a(var1);
        this.f.a(var1);
        this.g.a(var1);
        this.h.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
