package org.tohasan.pduxml.lib.processors.actionrequest;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;
import org.tohasan.pduxml.lib.processors.common.ParameterProcessor;

public final class ActionRequestNormalProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private MethodDescriptorProcessor c;
    private ParameterProcessor d;

    public ActionRequestNormalProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 194;
        var2.c(194);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new MethodDescriptorProcessor(332, var2);
        if (var2.a(335)) {
            this.d = new ParameterProcessor(335, var2);
        }

        var2.d(194);
    }

    public ActionRequestNormalProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 194;
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new MethodDescriptorProcessor(332, var2);

        if (var2.readByte() != 0) {
            this.d = new ParameterProcessor(335, var2);
        }
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
        this.c.encode(messageOutputStream);
        if (this.d != null) {
            messageOutputStream.write(1);
            this.d.encode(messageOutputStream);
        } else {
            messageOutputStream.write(0);
        }
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendTag(this.tagKey);
        xmlOutputBuilder.addIndent();
        this.a.printTo(xmlOutputBuilder);
        this.c.printTo(xmlOutputBuilder);
        if (this.d != null) {
            this.d.printTo(xmlOutputBuilder);
        }

        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
