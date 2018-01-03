package org.tohasan.pduxml.lib.processors.setrequest;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;
import org.tohasan.pduxml.lib.processors.common.AttributeDescriptorListProcessor;
import org.tohasan.pduxml.lib.processors.common.ListOfDataProcessor;

public final class SetRequestWithListProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private AttributeDescriptorListProcessor c;
    private ListOfDataProcessor d;

    public SetRequestWithListProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 421;
        var2.c(421);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new AttributeDescriptorListProcessor(var2);
        this.d = new ListOfDataProcessor(455, var2);
        var2.d(421);
    }

    public SetRequestWithListProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 421;
        this.a = new InvokeIdAndPriorityProcessor(messageInputStream);
        this.c = new AttributeDescriptorListProcessor(messageInputStream);
        this.d = new ListOfDataProcessor(455, messageInputStream);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
        this.d.a(messageOutputStream);
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