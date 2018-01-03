package org.tohasan.pduxml.lib.processors.actionrequest;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
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

    public ActionRequestWithListProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 196;
        var2.c(196);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new MethodDescriptorListProcessor(var2);
        this.d = new ListOfDataProcessor(335, var2);
        var2.d(196);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
        this.d.a(messageOutputStream);
    }

    public ActionRequestWithListProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 196;
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new MethodDescriptorListProcessor(var2);
        this.d = new ListOfDataProcessor(335, var2);
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
