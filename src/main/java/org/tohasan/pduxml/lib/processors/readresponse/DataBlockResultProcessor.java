package org.tohasan.pduxml.lib.processors.readresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.datatype.BooleanProcessor;
import org.tohasan.pduxml.lib.processors.datatype.LongUnsignedProcessor;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;

public final class DataBlockResultProcessor extends MessageByteProcessor {
    private BooleanProcessor a;
    private LongUnsignedProcessor c;
    private OctetStringProcessor d;

    DataBlockResultProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 255;
        var2.c(255);
        this.a = new BooleanProcessor(314, var2);
        this.c = new LongUnsignedProcessor(225, var2);
        this.d = new OctetStringProcessor(382, var2);
        var2.d(255);
    }

    DataBlockResultProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 255;
        this.a = new BooleanProcessor(314, messageInputStream);
        this.c = new LongUnsignedProcessor(225, messageInputStream);
        this.d = new OctetStringProcessor(382, messageInputStream);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
        this.d.a(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
