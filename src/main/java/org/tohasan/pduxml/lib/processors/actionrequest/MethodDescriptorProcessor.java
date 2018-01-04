package org.tohasan.pduxml.lib.processors.actionrequest;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.attributedescriptor.ClassIdProcessor;
import org.tohasan.pduxml.lib.processors.attributedescriptor.InstanceIdProcessor;

public final class MethodDescriptorProcessor extends MessageByteProcessor {
    private ClassIdProcessor a;
    private InstanceIdProcessor c;
    private MethodIdProcessor d;

    public MethodDescriptorProcessor(int tagKey, XmlParser var2) throws XmlPduException {
        this.tagKey = tagKey;
        var2.c(tagKey);
        this.a = new ClassIdProcessor(var2);
        this.c = new InstanceIdProcessor(var2);
        this.d = new MethodIdProcessor(var2);
        var2.d(tagKey);
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
        this.c.encode(messageOutputStream);
        this.d.encode(messageOutputStream);
    }

    public MethodDescriptorProcessor(int tagKey, MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = tagKey;
        this.a = new ClassIdProcessor(messageInputStream);
        this.c = new InstanceIdProcessor(messageInputStream);
        this.d = new MethodIdProcessor(messageInputStream);
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
