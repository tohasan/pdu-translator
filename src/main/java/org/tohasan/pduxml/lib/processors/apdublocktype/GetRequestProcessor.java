package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.getrequest.GetRequestForNextDataBlockProcessor;
import org.tohasan.pduxml.lib.processors.getrequest.GetRequestNormalProcessor;
import org.tohasan.pduxml.lib.processors.getrequest.GetRequestWithListProcessor;

public final class GetRequestProcessor extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor processor;

    public GetRequestProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 284;
        var2.c(284);

        if (var2.a(286)) {
            this.a = 1;
            this.processor = new GetRequestNormalProcessor(var2);
        } else if (var2.a(285)) {
            this.a = 2;
            this.processor = new GetRequestForNextDataBlockProcessor(285, var2);
        } else {
            if (!var2.a(287)) {
                throw new XmlPduException("_GetRequest: illegal choice");
            }

            this.a = 3;
            this.processor = new GetRequestWithListProcessor(var2);
        }

        var2.d(284);
    }

    public GetRequestProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 284;
        this.a = messageInputStream.readByte();

        switch (this.a) {
            case 1:
                this.processor = new GetRequestNormalProcessor(messageInputStream);
                return;
            case 2:
                this.processor = new GetRequestForNextDataBlockProcessor(messageInputStream);
                return;
            case 3:
                this.processor = new GetRequestWithListProcessor(messageInputStream);
                return;
            default:
                throw new XmlPduException("_GetRequest (from pdu) : illegal tag - " + String.valueOf(this.a));
        }
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write((byte) this.a);
        this.processor.encode(messageOutputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        if (this.tagKey != 297) {
            xmlOutputBuilder.appendTag(this.tagKey);
            xmlOutputBuilder.addIndent();
            this.processor.printTo(xmlOutputBuilder);
            xmlOutputBuilder.removeIndent();
            xmlOutputBuilder.appendClosingTag(this.tagKey);
        } else {
            this.processor.printTo(xmlOutputBuilder);
        }
    }
}
