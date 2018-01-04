package org.tohasan.pduxml.lib.processors.common;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.attributedescriptor.AttributeIdProcessor;
import org.tohasan.pduxml.lib.processors.attributedescriptor.ClassIdProcessor;
import org.tohasan.pduxml.lib.processors.attributedescriptor.InstanceIdProcessor;

public final class AttributeDescriptorProcessor extends MessageByteProcessor {
    private ClassIdProcessor a;
    private InstanceIdProcessor c;
    private AttributeIdProcessor d;

    public AttributeDescriptorProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 217;
        var2.c(217);
        this.a = new ClassIdProcessor(var2);
        this.c = new InstanceIdProcessor(var2);
        this.d = new AttributeIdProcessor(var2);
        var2.d(217);
    }

    public AttributeDescriptorProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 217;
        this.a = new ClassIdProcessor(messageInputStream);
        this.c = new InstanceIdProcessor(messageInputStream);
        this.d = new AttributeIdProcessor(messageInputStream);
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
        this.c.encode(messageOutputStream);
        this.d.encode(messageOutputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendTag(this.tagKey);
        xmlOutputBuilder.addIndent();
        this.a.printTo(xmlOutputBuilder);
        this.c.printTo(xmlOutputBuilder);
        this.d.printTo(xmlOutputBuilder);
        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
