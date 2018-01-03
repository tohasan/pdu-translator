package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.bG_;
import org.tohasan.pduxml.lib.processors.datatype.SelectorProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class ConfirmedServiceErrorProcessor extends MessageByteProcessor {
    private SelectorProcessor a;
    private bG_ c;

    public ConfirmedServiceErrorProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 246;
        var2.c(246);
        this.a = new SelectorProcessor(410, var2);
        this.c = new bG_(411, var2);
        var2.d(246);
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
    }

    public ConfirmedServiceErrorProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 246;
        this.a = new SelectorProcessor(410, var2);
        this.c = new bG_(411, var2);
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
