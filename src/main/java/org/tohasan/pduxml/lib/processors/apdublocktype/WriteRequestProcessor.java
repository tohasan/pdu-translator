package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ListOfDataProcessor;
import org.tohasan.pduxml.lib.processors.common.ListOfVariableAccessSpecificationProcessor;

public final class WriteRequestProcessor extends MessageByteProcessor {
    private ListOfVariableAccessSpecificationProcessor a;
    private ListOfDataProcessor c;

    public WriteRequestProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 462;
        var2.c(462);
        this.a = new ListOfVariableAccessSpecificationProcessor(var2);
        this.c = new ListOfDataProcessor(315, var2);
        var2.d(462);
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
        this.c.encode(messageOutputStream);
    }

    public WriteRequestProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 462;
        this.a = new ListOfVariableAccessSpecificationProcessor(var2);
        this.c = new ListOfDataProcessor(315, var2);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendTag(this.tagKey);
        xmlOutputBuilder.addIndent();
        this.a.printTo(xmlOutputBuilder);
        this.c.printTo(xmlOutputBuilder);
        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
