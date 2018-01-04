package org.tohasan.pduxml.lib.processors.actionrequest;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.MethodDescriptorListProcessor;
import org.tohasan.pduxml.lib.processors.common.ListOfDataProcessor;

public final class ActionRequestWithListProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private MethodDescriptorListProcessor c;
    private ListOfDataProcessor d;

    public ActionRequestWithListProcessor(int var1, XmlParser var2) throws XmlPduException {
        this.tagKey = 196;
        var2.c(196);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new MethodDescriptorListProcessor(var2);
        this.d = new ListOfDataProcessor(335, var2);
        var2.d(196);
    }

    public ActionRequestWithListProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 196;
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new MethodDescriptorListProcessor(var2);
        this.d = new ListOfDataProcessor(335, var2);
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
