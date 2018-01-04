package org.tohasan.pduxml.lib.processors.getresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ResultProcessor;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;

public final class ResultItemProcessor extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    ResultItemProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 403;
        var2.c(403);
        if (var2.a(382)) {
            this.a = 0;
            this.c = new OctetStringProcessor(382, var2);
        } else {
            if (!var2.a(252)) {
                throw new XmlPduException("_DataBlockGResult: illegal choice");
            }

            this.a = 1;
            this.c = new ResultProcessor(252, var2);
        }

        var2.d(403);
    }

    ResultItemProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 403;
        this.a = messageInputStream.readByte();
        switch (this.a) {
            case 0:
                this.c = new OctetStringProcessor(382, messageInputStream);
                return;
            case 1:
                this.c = new ResultProcessor(252, messageInputStream);
                return;
            default:
                throw new XmlPduException("_DataBlockGResult (from pdu) : illegal tag - " + String.valueOf(this.a));
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
