package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.bc;
import org.tohasan.pduxml.lib.processors.bh;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;

public final class InformationReportRequestProcessor extends MessageByteProcessor {
    private OctetStringProcessor a;
    private bh c;
    private bc d;

    public InformationReportRequestProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 301;
        var2.c(301);
        if (var2.a(249)) {
            this.a = new OctetStringProcessor(249, var2);
        }

        this.c = new bh(317, var2);
        this.d = new bc(315, var2);
        var2.d(301);
    }

    public InformationReportRequestProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 301;
        if (messageInputStream.readByte() != 0) {
            this.a = new OctetStringProcessor(249, messageInputStream);
        }

        this.c = new bh(317, messageInputStream);
        this.d = new bc(315, messageInputStream);
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        if (this.a != null) {
            var1.write(1);
            this.a.a(var1);
        } else {
            var1.write(0);
        }

        this.c.a(var1);
        this.d.a(var1);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        if (this.a != null) {
            this.a.a(var1);
        }

        this.c.a(var1);
        this.d.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
