package org.tohasan.pduxml.lib.processors.actionrequest;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;
import org.tohasan.pduxml.lib.processors.datatype.DoubleLongUnsignedProcessor;

public final class ActionRequestForNextPBlockProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private DoubleLongUnsignedProcessor c;

    public ActionRequestForNextPBlockProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 193;
        var2.c(193);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new DoubleLongUnsignedProcessor(225, var2);
        var2.d(193);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
    }

    public ActionRequestForNextPBlockProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 193;
        this.a = new InvokeIdAndPriorityProcessor(messageInputStream);
        this.c = new DoubleLongUnsignedProcessor(225, messageInputStream);
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
