package org.tohasan.pduxml.lib.processors.accessrequestspecification;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionrequest.MethodDescriptorProcessor;

public final class AccessRequestActionProcessor extends MessageByteProcessor {
    private MethodDescriptorProcessor a;

    public AccessRequestActionProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 174;
        var2.c(174);
        this.a = new MethodDescriptorProcessor(332, var2);
        var2.d(174);
    }

    public AccessRequestActionProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 174;
        this.a = new MethodDescriptorProcessor(332, var2);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        this.a.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
