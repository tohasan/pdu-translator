package org.tohasan.pduxml.lib.processors.setrequest;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;
import org.tohasan.pduxml.lib.processors.common.AttributeDescriptorListProcessor;
import org.tohasan.pduxml.lib.processors.common.DataBlockProcessor;

public final class SetRequestWithListAndWithFirstDatablockProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private AttributeDescriptorListProcessor c;
    private DataBlockProcessor d;

    public SetRequestWithListAndWithFirstDatablockProcessor(XmlParser var2)
            throws XmlPduException {
        this.tagKey = 422;
        var2.c(422);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new AttributeDescriptorListProcessor(var2);
        this.d = new DataBlockProcessor(253, var2);
        var2.d(422);
    }

    public SetRequestWithListAndWithFirstDatablockProcessor(MessageInputStream messageInputStream)
            throws XmlPduException {
        this.tagKey = 422;
        this.a = new InvokeIdAndPriorityProcessor(messageInputStream);
        this.c = new AttributeDescriptorListProcessor(messageInputStream);
        this.d = new DataBlockProcessor(253, messageInputStream);
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
