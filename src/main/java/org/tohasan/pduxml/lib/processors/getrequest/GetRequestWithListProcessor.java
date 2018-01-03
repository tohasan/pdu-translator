package org.tohasan.pduxml.lib.processors.getrequest;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;
import org.tohasan.pduxml.lib.processors.common.AttributeDescriptorListProcessor;

public final class GetRequestWithListProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private AttributeDescriptorListProcessor c;

    public GetRequestWithListProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 287;
        var2.c(287);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new AttributeDescriptorListProcessor(var2);
        var2.d(287);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
    }

    public GetRequestWithListProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 287;
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new AttributeDescriptorListProcessor(var2);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        this.a.a(var1);
        this.c.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
