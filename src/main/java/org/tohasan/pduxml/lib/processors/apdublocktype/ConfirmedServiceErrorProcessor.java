package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.bG_;
import org.tohasan.pduxml.lib.processors.datatype.SelectorProcessor;

public final class ConfirmedServiceErrorProcessor extends MessageByteProcessor {
    private SelectorProcessor a;
    private bG_ c;

    public ConfirmedServiceErrorProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 246;
        var2.c(246);
        this.a = new SelectorProcessor(410, var2);
        this.c = new bG_(411, var2);
        var2.d(246);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
    }

    public ConfirmedServiceErrorProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 246;
        this.a = new SelectorProcessor(410, messageInputStream);
        this.c = new bG_(411, messageInputStream);
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
