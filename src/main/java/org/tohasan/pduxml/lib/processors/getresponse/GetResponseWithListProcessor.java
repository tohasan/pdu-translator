package org.tohasan.pduxml.lib.processors.getresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;

public final class GetResponseWithListProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private ResultForResponseWithListProcessor c;

    public GetResponseWithListProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 291;
        var2.c(291);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new ResultForResponseWithListProcessor(var2);
        var2.d(291);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
    }

    public GetResponseWithListProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 291;
        this.a = new InvokeIdAndPriorityProcessor(messageInputStream);
        this.c = new ResultForResponseWithListProcessor(messageInputStream);
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
