package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.AttributeDescriptorProcessor;
import org.tohasan.pduxml.lib.processors.common.ParameterProcessor;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;

public final class EventNotificationRequestProcessor extends MessageByteProcessor {
    private OctetStringProcessor a;
    private AttributeDescriptorProcessor c;
    private ParameterProcessor d;

    public EventNotificationRequestProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 272;
        var2.c(272);
        if (var2.a(442)) {
            this.a = new OctetStringProcessor(442, var2);
        }

        this.c = new AttributeDescriptorProcessor(var2);
        this.d = new ParameterProcessor(220, var2);
        var2.d(272);
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        if (this.a != null) {
            messageOutputStream.write(1);
            this.a.encode(messageOutputStream);
        } else {
            messageOutputStream.write(0);
        }

        this.c.encode(messageOutputStream);
        this.d.encode(messageOutputStream);
    }

    public EventNotificationRequestProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 272;
        if (messageInputStream.readByte() != 0) {
            this.a = new OctetStringProcessor(442, messageInputStream);
        }

        this.c = new AttributeDescriptorProcessor(messageInputStream);
        this.d = new ParameterProcessor(220, messageInputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendTag(this.tagKey);
        xmlOutputBuilder.addIndent();
        if (this.a != null) {
            this.a.printTo(xmlOutputBuilder);
        }

        this.c.printTo(xmlOutputBuilder);
        this.d.printTo(xmlOutputBuilder);
        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
