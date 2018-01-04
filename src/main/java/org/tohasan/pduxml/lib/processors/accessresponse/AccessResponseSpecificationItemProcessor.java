package org.tohasan.pduxml.lib.processors.accessresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.accessresponsespecification.AccessResponseActionProcessor;
import org.tohasan.pduxml.lib.processors.accessresponsespecification.AccessResponseGetProcessor;
import org.tohasan.pduxml.lib.processors.accessresponsespecification.AccessResponseSetProcessor;

public final class AccessResponseSpecificationItemProcessor extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    AccessResponseSpecificationItemProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 20;
        var2.c(20);
        if (var2.a(185)) {
            this.a = 1;
            this.c = new AccessResponseGetProcessor(var2);
        } else if (var2.a(187)) {
            this.a = 2;
            this.c = new AccessResponseSetProcessor(var2);
        } else {
            if (!var2.a(183)) {
                throw new XmlPduException("_AccessResponseSpecification: illegal choice");
            }

            this.a = 3;
            this.c = new AccessResponseActionProcessor(var2);
        }

        var2.d(20);
    }

    AccessResponseSpecificationItemProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 20;
        this.a = messageInputStream.readByte();

        switch (this.a) {
            case 1:
                this.c = new AccessResponseGetProcessor(messageInputStream);
                return;
            case 2:
                this.c = new AccessResponseSetProcessor(messageInputStream);
                return;
            case 3:
                this.c = new AccessResponseActionProcessor(messageInputStream);
                return;
            default:
                throw new XmlPduException("_AccessResponseSpecification (from pdu) : illegal tag - " + String.valueOf(this.a));
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
