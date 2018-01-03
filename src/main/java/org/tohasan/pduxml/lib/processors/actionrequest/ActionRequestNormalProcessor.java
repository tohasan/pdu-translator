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

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
        if (this.d != null) {
            messageOutputStream.write(1);
            this.d.a(messageOutputStream);
        } else {
            messageOutputStream.write(0);
        }
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        this.a.a(var1);
        this.c.a(var1);
        if (this.d != null) {
            this.d.a(var1);
        }

        var1.b();
        var1.b(this.tagKey);
    }
}
