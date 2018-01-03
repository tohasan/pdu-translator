package org.tohasan.pduxml.lib.processors.accessrequestspecification;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.AttributeDescriptorProcessor;

public final class AccessRequestGetProcessor extends MessageByteProcessor {
    private AttributeDescriptorProcessor a;

    public AccessRequestGetProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 176;
        var2.c(176);
        this.a = new AttributeDescriptorProcessor(var2);
        var2.d(176);
    }

    public AccessRequestGetProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 176;
        this.a = new AttributeDescriptorProcessor(var2);
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
