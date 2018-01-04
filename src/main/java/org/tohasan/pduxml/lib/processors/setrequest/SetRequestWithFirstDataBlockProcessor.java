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

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
        this.c.encode(messageOutputStream);
        if (this.d != null) {
            messageOutputStream.write(1);
            this.d.encode(messageOutputStream);
        } else {
            messageOutputStream.write(0);
        }

        this.e.encode(messageOutputStream);
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

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendTag(this.tagKey);
        xmlOutputBuilder.addIndent();
        this.a.printTo(xmlOutputBuilder);
        this.c.printTo(xmlOutputBuilder);
        if (this.d != null) {
            this.d.printTo(xmlOutputBuilder);
        }

        this.e.printTo(xmlOutputBuilder);
        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
