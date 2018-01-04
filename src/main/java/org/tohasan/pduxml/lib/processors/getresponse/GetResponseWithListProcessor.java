package org.tohasan.pduxml.lib.processors.getresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;

public final class GetResponseWithListProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private ResultForResponseWithListProcessor c;

    public GetResponseWithListProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 291;
        var2.c(291);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new ResultForResponseWithListProcessor(var2);
        var2.d(291);
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
        this.c.encode(messageOutputStream);
    }

    public GetResponseWithListProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 291;
        this.a = new InvokeIdAndPriorityProcessor(messageInputStream);
        this.c = new ResultForResponseWithListProcessor(messageInputStream);
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
