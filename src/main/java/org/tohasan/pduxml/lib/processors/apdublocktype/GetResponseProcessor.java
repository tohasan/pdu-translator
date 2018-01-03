package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.getresponse.GetResponseNormalProcessor;
import org.tohasan.pduxml.lib.processors.getresponse.GetResponseWithDataBlockProcessor;
import org.tohasan.pduxml.lib.processors.getresponse.GetResponseWithListProcessor;

public final class GetResponseProcessor extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor processor;

    public GetResponseProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 288;
        var2.c(288);

        if (var2.a(289)) {
            this.a = 1;
            this.processor = new GetResponseNormalProcessor(var2);
        } else if (var2.a(290)) {
            this.a = 2;
            this.processor = new GetResponseWithDataBlockProcessor(var2);
        } else {
            if (!var2.a(291)) {
                throw new XmlPduException("_GetResponse: illegal choice");
            }

            this.a = 3;
            this.processor = new GetResponseWithListProcessor(var2);
        }

        var2.d(288);
    }

    public GetResponseProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 288;
        this.a = messageInputStream.readByte();

        switch (this.a) {
            case 1:
                this.processor = new GetResponseNormalProcessor(messageInputStream);
                return;
            case 2:
                this.processor = new GetResponseWithDataBlockProcessor(messageInputStream);
                return;
            case 3:
                this.processor = new GetResponseWithListProcessor(messageInputStream);
                return;
            default:
                throw new XmlPduException("_GetResponse (from pdu) : illegal tag - " + String.valueOf(this.a));
        }
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write((byte) this.a);
        this.processor.a(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        if (this.tagKey != 297) {
            var1.appendTag(this.tagKey);
            var1.appendWithNewLine();
            this.processor.a(var1);
            var1.b();
            var1.b(this.tagKey);
        } else {
            this.processor.a(var1);
        }
    }
}
