package org.tohasan.pduxml.lib.processors.actionresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;
import org.tohasan.pduxml.lib.processors.datatype.DoubleLongUnsignedProcessor;

public final class ActionResponseForNextPBlockProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private DoubleLongUnsignedProcessor c;

    public ActionResponseForNextPBlockProcessor(int var1, XmlParser var2) throws XmlPduException {
        this.tagKey = 200;
        var2.c(200);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new DoubleLongUnsignedProcessor(225, var2);
        var2.d(200);
    }

    public ActionResponseForNextPBlockProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 200;
        this.a = new InvokeIdAndPriorityProcessor(messageInputStream);
        this.c = new DoubleLongUnsignedProcessor(225, messageInputStream);
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
        this.c.encode(messageOutputStream);
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
