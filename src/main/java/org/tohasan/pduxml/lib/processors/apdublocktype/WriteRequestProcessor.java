package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ListOfDataProcessor;
import org.tohasan.pduxml.lib.processors.common.ListOfVariableAccessSpecificationProcessor;

public final class WriteRequestProcessor extends MessageByteProcessor {
    private ListOfVariableAccessSpecificationProcessor a;
    private ListOfDataProcessor c;

    public WriteRequestProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 462;
        var2.c(462);
        this.a = new ListOfVariableAccessSpecificationProcessor(var2);
        this.c = new ListOfDataProcessor(315, var2);
        var2.d(462);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
    }

    public WriteRequestProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 462;
        this.a = new ListOfVariableAccessSpecificationProcessor(var2);
        this.c = new ListOfDataProcessor(315, var2);
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
