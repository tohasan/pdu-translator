package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.*;

public final class SetRequestProcessor extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public SetRequestProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 417;
        var2.c(417);
        if (var2.a(418)) {
            this.a = 1;
            this.c = new bI_(418, var2);
        } else if (var2.a(420)) {
            this.a = 2;
            this.c = new bK_(420, var2);
        } else if (var2.a(419)) {
            this.a = 3;
            this.c = new bJ_(419, var2);
        } else if (var2.a(421)) {
            this.a = 4;
            this.c = new bL_(421, var2);
        } else {
            if (!var2.a(422)) {
                throw new XmlPduException("_SetRequest: illegal choice");
            }

            this.a = 5;
            this.c = new bM_(422, var2);
        }

        var2.d(417);
    }

    public SetRequestProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 417;
        this.a = messageInputStream.readByte();
        switch (this.a) {
            case 1:
                this.c = new bI_(418, messageInputStream);
                return;
            case 2:
                this.c = new bK_(420, messageInputStream);
                return;
            case 3:
                this.c = new bJ_(419, messageInputStream);
                return;
            case 4:
                this.c = new bL_(421, messageInputStream);
                return;
            case 5:
                this.c = new bM_(422, messageInputStream);
                return;
            default:
                throw new XmlPduException("_SetRequest (from pdu) : illegal tag - " + String.valueOf(this.a));
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
