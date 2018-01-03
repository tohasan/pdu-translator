package org.tohasan.pduxml.lib.processors.setrequest;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;
import org.tohasan.pduxml.lib.processors.common.DataBlockProcessor;

public final class SetRequestWithDataBlockProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private DataBlockProcessor c;

    public SetRequestWithDataBlockProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 419;
        var2.c(419);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new DataBlockProcessor(253, var2);
        var2.d(419);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
    }

    public SetRequestWithDataBlockProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 419;
        this.a = new InvokeIdAndPriorityProcessor(messageInputStream);
        this.c = new DataBlockProcessor(253, messageInputStream);
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
