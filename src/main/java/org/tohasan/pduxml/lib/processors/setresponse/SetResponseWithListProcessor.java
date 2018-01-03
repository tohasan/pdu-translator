package org.tohasan.pduxml.lib.processors.setresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;

public final class SetResponseWithListProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private ResultProcessor c;

    public SetResponseWithListProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 428;
        var2.c(428);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new ResultProcessor(var2);
        var2.d(428);
    }

    public SetResponseWithListProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 428;
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new ResultProcessor(var2);
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
