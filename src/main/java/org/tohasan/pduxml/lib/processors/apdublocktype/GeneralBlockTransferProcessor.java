package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.V_;
import org.tohasan.pduxml.lib.processors.datatype.LongUnsignedProcessor;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;

public final class GeneralBlockTransferProcessor extends MessageByteProcessor {
    private V_ a;
    private LongUnsignedProcessor c;
    private LongUnsignedProcessor d;
    private OctetStringProcessor e;

    public GeneralBlockTransferProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 277;
        var2.c(277);
        this.a = new V_(223, var2);
        this.c = new LongUnsignedProcessor(225, var2);
        this.d = new LongUnsignedProcessor(227, var2);
        this.e = new OctetStringProcessor(224, var2);
        var2.d(277);
    }

    public GeneralBlockTransferProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 277;
        this.a = new V_(223, messageInputStream);
        this.c = new LongUnsignedProcessor(225, messageInputStream);
        this.d = new LongUnsignedProcessor(227, messageInputStream);
        this.e = new OctetStringProcessor(224, messageInputStream);
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        this.e.a(var1);
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
