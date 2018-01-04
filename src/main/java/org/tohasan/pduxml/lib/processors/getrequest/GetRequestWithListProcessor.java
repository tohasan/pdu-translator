package org.tohasan.pduxml.lib.processors.getrequest;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;
import org.tohasan.pduxml.lib.processors.common.AttributeDescriptorListProcessor;

public final class GetRequestWithListProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private AttributeDescriptorListProcessor c;

    public GetRequestWithListProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 287;
        var2.c(287);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new AttributeDescriptorListProcessor(var2);
        var2.d(287);
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
        this.c.encode(messageOutputStream);
    }

    public GetRequestWithListProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 287;
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new AttributeDescriptorListProcessor(var2);
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
