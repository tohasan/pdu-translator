package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.aY_;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;

public final class GeneralChilpheringProcessor extends MessageByteProcessor {
    private OctetStringProcessor a;
    private OctetStringProcessor c;
    private OctetStringProcessor d;
    private OctetStringProcessor e;
    private OctetStringProcessor f;
    private aY_ g;
    private OctetStringProcessor h;

    public GeneralChilpheringProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 278;
        var2.c(278);
        this.a = new OctetStringProcessor(444, var2);
        this.c = new OctetStringProcessor(360, var2);
        this.d = new OctetStringProcessor(389, var2);
        this.e = new OctetStringProcessor(262, var2);
        this.f = new OctetStringProcessor(363, var2);
        if (var2.a(312)) {
            this.g = new aY_(312, var2);
        }

        this.h = new OctetStringProcessor(243, var2);
        var2.d(278);
    }

    public GeneralChilpheringProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 278;
        this.a = new OctetStringProcessor(444, messageInputStream);
        this.c = new OctetStringProcessor(360, messageInputStream);
        this.d = new OctetStringProcessor(389, messageInputStream);
        this.e = new OctetStringProcessor(262, messageInputStream);
        this.f = new OctetStringProcessor(363, messageInputStream);
        if (messageInputStream.readByte() != 0) {
            this.g = new aY_(312, messageInputStream);
        }

        this.h = new OctetStringProcessor(243, messageInputStream);
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        this.e.a(var1);
        this.f.a(var1);
        if (this.g != null) {
            var1.write(1);
            this.g.a(var1);
        } else {
            var1.write(0);
        }

        this.h.a(var1);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        this.e.a(var1);
        this.f.a(var1);
        if (this.g != null) {
            this.g.a(var1);
        }

        this.h.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
