package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.setresponse.*;

public final class SetResponseProcessor extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public SetResponseProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 423;
        var2.c(423);
        if (var2.a(427)) {
            this.a = 1;
            this.c = new SetResponseNormalProcessor(var2);
        } else if (var2.a(424)) {
            this.a = 2;
            this.c = new SetResponseForDataBlockProcessor(var2);
        } else if (var2.a(425)) {
            this.a = 3;
            this.c = new SetResponseForLastDataBlockProcessor(var2);
        } else if (var2.a(426)) {
            this.a = 4;
            this.c = new SetResponseForLastDataBlockWithListProcessor(var2);
        } else {
            if (!var2.a(428)) {
                throw new XmlPduException("_SetResponse: illegal choice");
            }

            this.a = 5;
            this.c = new SetResponseWithListProcessor(var2);
        }

        var2.d(423);
    }

    public SetResponseProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 423;
        this.a = messageInputStream.readByte();
        switch (this.a) {
            case 1:
                this.c = new SetResponseNormalProcessor(messageInputStream);
                return;
            case 2:
                this.c = new SetResponseForDataBlockProcessor(messageInputStream);
                return;
            case 3:
                this.c = new SetResponseForLastDataBlockProcessor(messageInputStream);
                return;
            case 4:
                this.c = new SetResponseForLastDataBlockWithListProcessor(messageInputStream);
                return;
            case 5:
                this.c = new SetResponseWithListProcessor(messageInputStream);
                return;
            default:
                throw new XmlPduException("_SetResponse (from pdu) : illegal tag - " + String.valueOf(this.a));
        }
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write((byte) this.a);
        this.c.encode(messageOutputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        if (this.tagKey != 297) {
            xmlOutputBuilder.appendTag(this.tagKey);
            xmlOutputBuilder.addIndent();
            this.c.printTo(xmlOutputBuilder);
            xmlOutputBuilder.removeIndent();
            xmlOutputBuilder.appendClosingTag(this.tagKey);
        } else {
            this.c.printTo(xmlOutputBuilder);
        }
    }
}
