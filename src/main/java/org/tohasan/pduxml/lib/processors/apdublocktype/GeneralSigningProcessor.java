package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;

public final class GeneralSigningProcessor extends MessageByteProcessor {
    private OctetStringProcessor a;
    private OctetStringProcessor c;
    private OctetStringProcessor d;
    private OctetStringProcessor e;
    private OctetStringProcessor f;
    private OctetStringProcessor g;
    private OctetStringProcessor h;

    public GeneralSigningProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
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

    public GeneralSigningProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 282;
        this.a = new OctetStringProcessor(444, messageInputStream);
        this.c = new OctetStringProcessor(360, messageInputStream);
        this.d = new OctetStringProcessor(389, messageInputStream);
        this.e = new OctetStringProcessor(262, messageInputStream);
        this.f = new OctetStringProcessor(363, messageInputStream);
        this.g = new OctetStringProcessor(248, messageInputStream);
        this.h = new OctetStringProcessor(429, messageInputStream);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
        this.d.a(messageOutputStream);
        this.e.a(messageOutputStream);
        this.f.a(messageOutputStream);
        this.g.a(messageOutputStream);
        this.h.a(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
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
