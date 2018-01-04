package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.setrequest.*;

public final class SetRequestProcessor extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public SetRequestProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 417;
        var2.c(417);
        if (var2.a(418)) {
            this.a = 1;
            this.c = new SetRequestNormalProcessor(var2);
        } else if (var2.a(420)) {
            this.a = 2;
            this.c = new SetRequestWithFirstDataBlockProcessor(var2);
        } else if (var2.a(419)) {
            this.a = 3;
            this.c = new SetRequestWithDataBlockProcessor(var2);
        } else if (var2.a(421)) {
            this.a = 4;
            this.c = new SetRequestWithListProcessor(var2);
        } else {
            if (!var2.a(422)) {
                throw new XmlPduException("_SetRequest: illegal choice");
            }

            this.a = 5;
            this.c = new SetRequestWithListAndWithFirstDatablockProcessor(var2);
        }

        var2.d(417);
    }

    public SetRequestProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 417;
        this.a = messageInputStream.readByte();
        switch (this.a) {
            case 1:
                this.c = new SetRequestNormalProcessor(messageInputStream);
                return;
            case 2:
                this.c = new SetRequestWithFirstDataBlockProcessor(messageInputStream);
                return;
            case 3:
                this.c = new SetRequestWithDataBlockProcessor(messageInputStream);
                return;
            case 4:
                this.c = new SetRequestWithListProcessor(messageInputStream);
                return;
            case 5:
                this.c = new SetRequestWithListAndWithFirstDatablockProcessor(messageInputStream);
                return;
            default:
                throw new XmlPduException("_SetRequest (from pdu) : illegal tag - " + String.valueOf(this.a));
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
