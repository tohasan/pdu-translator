package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionresponse.ActionResponseForNextPBlockProcessor;
import org.tohasan.pduxml.lib.processors.actionresponse.ActionResponseNormalProcessor;
import org.tohasan.pduxml.lib.processors.actionresponse.ActionResponseWithListProcessor;
import org.tohasan.pduxml.lib.processors.actionresponse.ActionResponseWithPBlockProcessor;

public final class ActionResponseProcessor extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public ActionResponseProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 199;
        var2.c(199);

        if (var2.a(201)) {
            this.a = 1;
            this.c = new ActionResponseNormalProcessor(var2);
        } else if (var2.a(203)) {
            this.a = 2;
            this.c = new ActionResponseWithPBlockProcessor(var2);
        } else if (var2.a(202)) {
            this.a = 3;
            this.c = new ActionResponseWithListProcessor(var2);
        } else {
            if (!var2.a(200)) {
                throw new XmlPduException("_ActionResponse: illegal choice");
            }

            this.a = 4;
            this.c = new ActionResponseForNextPBlockProcessor(200, var2);
        }

        var2.d(199);
    }

    public ActionResponseProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 199;
        this.a = messageInputStream.readByte();
        switch (this.a) {
            case 1:
                this.c = new ActionResponseNormalProcessor(messageInputStream);
                return;
            case 2:
                this.c = new ActionResponseWithPBlockProcessor(messageInputStream);
                return;
            case 3:
                this.c = new ActionResponseWithListProcessor(messageInputStream);
                return;
            case 4:
                this.c = new ActionResponseForNextPBlockProcessor(messageInputStream);
                return;
            default:
                throw new XmlPduException("_ActionResponse (from pdu) : illegal tag - " + String.valueOf(this.a));
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
