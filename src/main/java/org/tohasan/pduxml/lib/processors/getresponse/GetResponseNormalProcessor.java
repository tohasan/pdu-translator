package org.tohasan.pduxml.lib.processors.getresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;
import org.tohasan.pduxml.lib.processors.common.ReturnParametersProcessor;

public final class GetResponseNormalProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private ReturnParametersProcessor c;

    public GetResponseNormalProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 289;
        var2.c(289);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new ReturnParametersProcessor(403, var2);
        var2.d(289);
    }

    public GetResponseNormalProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 289;
        this.a = new InvokeIdAndPriorityProcessor(messageInputStream);
        this.c = new ReturnParametersProcessor(403, messageInputStream);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
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
