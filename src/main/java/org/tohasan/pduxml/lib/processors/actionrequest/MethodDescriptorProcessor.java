package org.tohasan.pduxml.lib.processors.actionrequest;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.attributedescriptor.ClassIdProcessor;
import org.tohasan.pduxml.lib.processors.attributedescriptor.InstanceIdProcessor;

public final class MethodDescriptorProcessor extends MessageByteProcessor {
    private ClassIdProcessor a;
    private InstanceIdProcessor c;
    private MethodIdProcessor d;

    public MethodDescriptorProcessor(int tagKey, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = tagKey;
        var2.c(tagKey);
        this.a = new ClassIdProcessor(var2);
        this.c = new InstanceIdProcessor(var2);
        this.d = new MethodIdProcessor(var2);
        var2.d(tagKey);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
        this.d.a(messageOutputStream);
    }

    public MethodDescriptorProcessor(int tagKey, MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = tagKey;
        this.a = new ClassIdProcessor(messageInputStream);
        this.c = new InstanceIdProcessor(messageInputStream);
        this.d = new MethodIdProcessor(messageInputStream);
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
