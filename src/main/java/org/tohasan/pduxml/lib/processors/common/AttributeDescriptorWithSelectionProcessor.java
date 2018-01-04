package org.tohasan.pduxml.lib.processors.common;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.accessrequestspecification.AccessSelectionProcessor;

public final class AttributeDescriptorWithSelectionProcessor extends MessageByteProcessor {
    private AttributeDescriptorProcessor a;
    private AccessSelectionProcessor c;

    AttributeDescriptorWithSelectionProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 42;
        var2.c(42);
        this.a = new AttributeDescriptorProcessor(var2);
        if (var2.a(189)) {
            this.c = new AccessSelectionProcessor(var2);
        }

        var2.d(42);
    }

    AttributeDescriptorWithSelectionProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 42;
        this.a = new AttributeDescriptorProcessor(var2);

        if (var2.readByte() != 0) {
            this.c = new AccessSelectionProcessor(var2);
        }
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
        if (this.c != null) {
            messageOutputStream.write(1);
            this.c.encode(messageOutputStream);
        } else {
            messageOutputStream.write(0);
        }
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendTag(this.tagKey);
        xmlOutputBuilder.addIndent();
        this.a.printTo(xmlOutputBuilder);
        if (this.c != null) {
            this.c.printTo(xmlOutputBuilder);
        }

        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
