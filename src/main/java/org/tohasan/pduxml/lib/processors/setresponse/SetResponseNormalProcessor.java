package org.tohasan.pduxml.lib.processors.setresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;
import org.tohasan.pduxml.lib.processors.common.ResultProcessor;

public final class SetResponseNormalProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private ResultProcessor c;

    public SetResponseNormalProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 427;
        var2.c(427);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new ResultProcessor(403, var2);
        var2.d(427);
    }

    public SetResponseNormalProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 427;
        this.a = new InvokeIdAndPriorityProcessor(messageInputStream);
        this.c = new ResultProcessor(403, messageInputStream);
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
