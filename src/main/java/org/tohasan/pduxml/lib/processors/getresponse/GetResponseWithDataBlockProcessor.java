package org.tohasan.pduxml.lib.processors.getresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;

public final class GetResponseWithDataBlockProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private ResultForResponseWithDataBlockProcessor c;

    public GetResponseWithDataBlockProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 290;
        var2.c(290);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new ResultForResponseWithDataBlockProcessor(var2);
        var2.d(290);
    }

    public GetResponseWithDataBlockProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 290;
        this.a = new InvokeIdAndPriorityProcessor(messageInputStream);
        this.c = new ResultForResponseWithDataBlockProcessor(messageInputStream);
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
