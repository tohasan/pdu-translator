package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.datatype.BooleanProcessor;
import org.tohasan.pduxml.lib.processors.datatype.LongUnsignedProcessor;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class af extends MessageByteProcessor {
    private BooleanProcessor a;
    private LongUnsignedProcessor c;
    private OctetStringProcessor d;

    public af(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 255;
        var2.c(255);
        this.a = new BooleanProcessor(314, var2);
        this.c = new LongUnsignedProcessor(225, var2);
        this.d = new OctetStringProcessor(382, var2);
        var2.d(255);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
        this.d.a(messageOutputStream);
    }

    public af(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 255;
        this.a = new BooleanProcessor(314, var2);
        this.c = new LongUnsignedProcessor(225, var2);
        this.d = new OctetStringProcessor(382, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
