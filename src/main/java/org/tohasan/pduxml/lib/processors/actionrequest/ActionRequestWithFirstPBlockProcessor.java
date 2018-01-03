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

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
        this.d.a(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
