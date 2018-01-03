package org.tohasan.pduxml.lib.processors.getresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.datatype.BooleanProcessor;
import org.tohasan.pduxml.lib.processors.datatype.DoubleLongUnsignedProcessor;

public final class ResultForResponseWithDataBlockProcessor extends MessageByteProcessor {
    private BooleanProcessor a;
    private DoubleLongUnsignedProcessor c;
    private ResultItemProcessor d;

    ResultForResponseWithDataBlockProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 403;
        var2.c(403);
        this.a = new BooleanProcessor(314, var2);
        this.c = new DoubleLongUnsignedProcessor(225, var2);
        this.d = new ResultItemProcessor(var2);
        var2.d(403);
    }

    ResultForResponseWithDataBlockProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 403;
        this.a = new BooleanProcessor(314, messageInputStream);
        this.c = new DoubleLongUnsignedProcessor(225, messageInputStream);
        this.d = new ResultItemProcessor(messageInputStream);
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
