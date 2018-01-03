package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.datatype.BooleanProcessor;
import org.tohasan.pduxml.lib.processors.datatype.DoubleLongUnsignedProcessor;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class ah extends MessageByteProcessor {
    private BooleanProcessor a;
    private DoubleLongUnsignedProcessor c;
    private OctetStringProcessor d;

    public ah(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = var1;
        var2.c(var1);
        this.a = new BooleanProcessor(314, var2);
        this.c = new DoubleLongUnsignedProcessor(225, var2);
        this.d = new OctetStringProcessor(382, var2);
        var2.d(var1);
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
    }

    public ah(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = var1;
        this.a = new BooleanProcessor(314, var2);
        this.c = new DoubleLongUnsignedProcessor(225, var2);
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
