package org.tohasan.pduxml.lib.processors.writeresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ResultProcessor;
import org.tohasan.pduxml.lib.processors.datatype.LongUnsignedProcessor;
import org.tohasan.pduxml.lib.processors.datatype.NullDataProcessor;

public final class SingleWriteResponseProcessor extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public SingleWriteResponseProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 297;
        if (var2.a(435)) {
            this.a = 0;
            this.c = new NullDataProcessor(435, var2);
        } else if (var2.a(251)) {
            this.a = 1;
            this.c = new ResultProcessor(251, var2);
        } else if (var2.a(225)) {
            this.a = 2;
            this.c = new LongUnsignedProcessor(225, var2);
        } else {
            throw new XmlPduException("_SingleWriteResponse: illegal choice");
        }
    }

    public SingleWriteResponseProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 151;
        this.a = var2.readByte();

        switch (this.a) {
            case 0:
                this.c = new NullDataProcessor(435, var2);
                return;
            case 1:
                this.c = new ResultProcessor(251, var2);
                return;
            case 2:
                this.c = new LongUnsignedProcessor(225, var2);
                return;
            default:
                throw new XmlPduException("_SingleWriteResponse (from pdu) : illegal tag - " + String.valueOf(this.a));
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
