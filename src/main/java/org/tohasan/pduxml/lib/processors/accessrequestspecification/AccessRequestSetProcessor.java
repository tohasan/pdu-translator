package org.tohasan.pduxml.lib.processors.accessrequestspecification;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.AttributeDescriptorProcessor;

public final class AccessRequestSetProcessor extends MessageByteProcessor {
    private AttributeDescriptorProcessor a;

    public AccessRequestSetProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 179;
        var2.c(179);
        this.a = new AttributeDescriptorProcessor(var2);
        var2.d(179);
    }

    public AccessRequestSetProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 179;
        this.a = new AttributeDescriptorProcessor(var2);
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendTag(this.tagKey);
        xmlOutputBuilder.addIndent();
        this.a.printTo(xmlOutputBuilder);
        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
