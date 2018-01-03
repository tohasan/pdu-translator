package org.tohasan.pduxml.lib.processors.getrequest;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.accessrequestspecification.AccessSelectionProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;
import org.tohasan.pduxml.lib.processors.common.AttributeDescriptorProcessor;

public final class GetRequestNormalProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private AttributeDescriptorProcessor c;
    private AccessSelectionProcessor d;

    public GetRequestNormalProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 286;
        var2.c(286);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new AttributeDescriptorProcessor(var2);
        if (var2.a(189)) {
            this.d = new AccessSelectionProcessor(var2);
        }

        var2.d(286);
    }

    public GetRequestNormalProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 286;
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new AttributeDescriptorProcessor(var2);
        if (var2.readByte() != 0) {
            this.d = new AccessSelectionProcessor(var2);
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
