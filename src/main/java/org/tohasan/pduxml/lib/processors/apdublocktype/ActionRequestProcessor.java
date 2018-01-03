package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionrequest.*;

public final class ActionRequestProcessor extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public ActionRequestProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 192;
        var2.c(192);
        if (var2.a(194)) {
            this.a = 1;
            this.c = new ActionRequestNormalProcessor(var2);
        } else if (var2.a(193)) {
            this.a = 2;
            this.c = new ActionRequestForNextPBlockProcessor(var2);
        } else if (var2.a(196)) {
            this.a = 3;
            this.c = new ActionRequestWithListProcessor(196, var2);
        } else if (var2.a(195)) {
            this.a = 4;
            this.c = new ActionRequestWithFirstPBlockProcessor(var2);
        } else if (var2.a(197)) {
            this.a = 5;
            this.c = new ActionRequestWithListAndFirstPBlockProcessor(var2);
        } else {
            if (!var2.a(198)) {
                throw new XmlPduException("_ActionRequest: illegal choice");
            }

            this.a = 6;
            this.c = new ActionRequestWithPBlockProcessor(var2);
        }

        var2.d(192);
    }

    public ActionRequestProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 192;
        this.a = messageInputStream.readByte();
        switch (this.a) {
            case 1:
                this.c = new ActionRequestNormalProcessor(messageInputStream);
                return;
            case 2:
                this.c = new ActionRequestForNextPBlockProcessor(messageInputStream);
                return;
            case 3:
                this.c = new ActionRequestWithListProcessor(messageInputStream);
                return;
            case 4:
                this.c = new ActionRequestWithFirstPBlockProcessor(messageInputStream);
                return;
            case 5:
                this.c = new ActionRequestWithListAndFirstPBlockProcessor(messageInputStream);
                return;
            case 6:
                this.c = new ActionRequestWithPBlockProcessor(messageInputStream);
                return;
            default:
                throw new XmlPduException("_ActionRequest (from pdu) : illegal tag - " + String.valueOf(this.a));
        }
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write((byte) this.a);
        this.c.a(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        if (this.tagKey != 297) {
            var1.appendTag(this.tagKey);
            var1.appendWithNewLine();
            this.c.a(var1);
            var1.b();
            var1.b(this.tagKey);
        } else {
            this.c.a(var1);
        }
    }
}
