package org.tohasan.pduxml.lib.processors.variableaccessspec;

import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.datatype.BooleanProcessor;
import org.tohasan.pduxml.lib.processors.datatype.LongUnsignedProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class WriteDataBlockAccessProcessor extends MessageByteProcessor {
    private BooleanProcessor a;
    private LongUnsignedProcessor c;

    public WriteDataBlockAccessProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 461;
        var2.c(461);
        this.a = new BooleanProcessor(314, var2);
        this.c = new LongUnsignedProcessor(225, var2);
        var2.d(461);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
    }

    public WriteDataBlockAccessProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 461;
        this.a = new BooleanProcessor(314, var2);
        this.c = new LongUnsignedProcessor(225, var2);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        this.a.a(var1);
        this.c.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
