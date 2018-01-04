package org.tohasan.pduxml.lib.processors.accessrequestspecification;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.AttributeDescriptorProcessor;

public final class AccessRequestSetWithSelectionProcessor extends MessageByteProcessor {
    private AttributeDescriptorProcessor a;
    private AccessSelectionProcessor c;

    public AccessRequestSetWithSelectionProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 180;
        var2.c(180);
        this.a = new AttributeDescriptorProcessor(var2);
        this.c = new AccessSelectionProcessor(var2);
        var2.d(180);
    }

    public AccessRequestSetWithSelectionProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 180;
        this.a = new AttributeDescriptorProcessor(messageInputStream);
        this.c = new AccessSelectionProcessor(messageInputStream);
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
        this.c.encode(messageOutputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendTag(this.tagKey);
        xmlOutputBuilder.addIndent();
        this.a.printTo(xmlOutputBuilder);
        this.c.printTo(xmlOutputBuilder);
        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
