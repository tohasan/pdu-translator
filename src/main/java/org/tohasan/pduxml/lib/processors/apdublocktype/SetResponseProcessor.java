package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.*;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class SetResponseProcessor extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public SetResponseProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 423;
        var2.c(423);
        if (var2.a(427)) {
            this.a = 1;
            this.c = new bR_(427, var2);
        } else if (var2.a(424)) {
            this.a = 2;
            this.c = new bO_(424, var2);
        } else if (var2.a(425)) {
            this.a = 3;
            this.c = new bP_(425, var2);
        } else if (var2.a(426)) {
            this.a = 4;
            this.c = new bQ_(426, var2);
        } else {
            if (!var2.a(428)) {
                throw new XmlPduException("_SetResponse: illegal choice");
            }

            this.a = 5;
            this.c = new bS_(428, var2);
        }

        var2.d(423);
    }

    public SetResponseProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 423;
        this.a = var2.readByte();
        switch (this.a) {
            case 1:
                this.c = new bR_(427, var2);
                return;
            case 2:
                this.c = new bO_(424, var2);
                return;
            case 3:
                this.c = new bP_(425, var2);
                return;
            case 4:
                this.c = new bQ_(426, var2);
                return;
            case 5:
                this.c = new bS_(428, var2);
                return;
            default:
                throw new XmlPduException("_SetResponse (from pdu) : illegal tag - " + String.valueOf(this.a));
        }
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        var1.write((byte) this.a);
        this.c.a(var1);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        if (this.tagKey != 297) {
            var1.a(this.tagKey);
            var1.a();
            this.c.a(var1);
            var1.b();
            var1.b(this.tagKey);
        } else {
            this.c.a(var1);
        }
    }
}
