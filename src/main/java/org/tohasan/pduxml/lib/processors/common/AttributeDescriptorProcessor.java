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
