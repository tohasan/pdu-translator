package org.tohasan.pduxml.lib.processors.actionrequest;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;
import org.tohasan.pduxml.lib.processors.common.DataBlockProcessor;

public final class ActionRequestWithFirstPBlockProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private MethodDescriptorProcessor c;
    private DataBlockProcessor d;

    public ActionRequestWithFirstPBlockProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 195;
        var2.c(195);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new MethodDescriptorProcessor(332, var2);
        this.d = new DataBlockProcessor(366, var2);
        var2.d(195);
    }

    public ActionRequestWithFirstPBlockProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 195;
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new MethodDescriptorProcessor(332, var2);
        this.d = new DataBlockProcessor(366, var2);
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
