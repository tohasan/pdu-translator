package org.tohasan.pduxml.lib.processors.setrequest;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.accessrequestspecification.AccessSelectionProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;
import org.tohasan.pduxml.lib.processors.common.AttributeDescriptorProcessor;
import org.tohasan.pduxml.lib.processors.common.DataBlockProcessor;

public final class SetRequestWithFirstDataBlockProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private AttributeDescriptorProcessor c;
    private AccessSelectionProcessor d;
    private DataBlockProcessor e;

    public SetRequestWithFirstDataBlockProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 420;
        var2.c(420);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new AttributeDescriptorProcessor(var2);
        if (var2.a(189)) {
            this.d = new AccessSelectionProcessor(var2);
        }

        this.e = new DataBlockProcessor(253, var2);
        var2.d(420);
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

        this.e.a(messageOutputStream);
    }

    public SetRequestWithFirstDataBlockProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 420;
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new AttributeDescriptorProcessor(var2);

        if (var2.readByte() != 0) {
            this.d = new AccessSelectionProcessor(var2);
        }

        this.e = new DataBlockProcessor(253, var2);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        this.a.a(var1);
        this.c.a(var1);
        if (this.d != null) {
            this.d.a(var1);
        }

        this.e.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
