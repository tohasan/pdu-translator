package org.tohasan.pduxml.lib.processors.actionresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;

public final class ActionResponseWithListProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private ListOfSingleActionResponseProcessor c;

    public ActionResponseWithListProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 202;
        var2.c(202);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new ListOfSingleActionResponseProcessor(var2);
        var2.d(202);
    }

    public ActionResponseWithListProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 202;
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new ListOfSingleActionResponseProcessor(var2);
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
