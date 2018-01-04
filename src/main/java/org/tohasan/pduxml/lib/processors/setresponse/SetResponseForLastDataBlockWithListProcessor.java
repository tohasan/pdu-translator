package org.tohasan.pduxml.lib.processors.setresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;
import org.tohasan.pduxml.lib.processors.datatype.DoubleLongUnsignedProcessor;

public final class SetResponseForLastDataBlockWithListProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private ResultProcessor c;
    private DoubleLongUnsignedProcessor d;

    public SetResponseForLastDataBlockWithListProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 426;
        var2.c(426);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new ResultProcessor(var2);
        this.d = new DoubleLongUnsignedProcessor(225, var2);
        var2.d(426);
    }

    public SetResponseForLastDataBlockWithListProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 426;
        this.a = new InvokeIdAndPriorityProcessor(messageInputStream);
        this.c = new ResultProcessor(messageInputStream);
        this.d = new DoubleLongUnsignedProcessor(225, messageInputStream);
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
        this.c.encode(messageOutputStream);
        this.d.encode(messageOutputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendTag(this.tagKey);
        xmlOutputBuilder.addIndent();
        this.a.printTo(xmlOutputBuilder);
        this.c.printTo(xmlOutputBuilder);
        this.d.printTo(xmlOutputBuilder);
        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
