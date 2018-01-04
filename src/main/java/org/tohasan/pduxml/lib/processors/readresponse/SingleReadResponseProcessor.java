package org.tohasan.pduxml.lib.processors.readresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ParameterProcessor;
import org.tohasan.pduxml.lib.processors.common.ResultProcessor;
import org.tohasan.pduxml.lib.processors.datatype.LongUnsignedProcessor;

public final class SingleReadResponseProcessor extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public SingleReadResponseProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 297;
        if (var2.a(250)) {
            this.a = 0;
            this.c = new ParameterProcessor(250, var2);
        } else if (var2.a(251)) {
            this.a = 1;
            this.c = new ResultProcessor(251, var2);
        } else if (var2.a(255)) {
            this.a = 2;
            this.c = new DataBlockResultProcessor(var2);
        } else if (var2.a(225)) {
            this.a = 3;
            this.c = new LongUnsignedProcessor(225, var2);
        } else {
            throw new XmlPduException("_SingleReadResponse: illegal choice");
        }
    }

    public SingleReadResponseProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 150;
        this.a = messageInputStream.readByte();
        switch (this.a) {
            case 0:
                this.c = new ParameterProcessor(250, messageInputStream);
                return;
            case 1:
                this.c = new ResultProcessor(251, messageInputStream);
                return;
            case 2:
                this.c = new DataBlockResultProcessor(messageInputStream);
                return;
            case 3:
                this.c = new LongUnsignedProcessor(225, messageInputStream);
                return;
            default:
                throw new XmlPduException("_SingleReadResponse (from pdu) : illegal tag - " + String.valueOf(this.a));
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
