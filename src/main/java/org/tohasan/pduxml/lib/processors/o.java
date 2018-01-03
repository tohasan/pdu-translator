package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class o extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public o() {
    }

    public o(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 14;
        var2.c(14);
        if (var2.a(176)) {
            this.a = 1;
            this.c = new k(176, var2);
        } else if (var2.a(179)) {
            this.a = 2;
            this.c = new m(179, var2);
        } else if (var2.a(174)) {
            this.a = 3;
            this.c = new i(174, var2);
        } else if (var2.a(177)) {
            this.a = 4;
            this.c = new l(177, var2);
        } else {
            if (!var2.a(180)) {
                throw new XmlPduException("_AccessRequestSpecification: illegal choice");
            }

            this.a = 5;
            this.c = new n(180, var2);
        }

        var2.d(14);
    }

    public o(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 14;
        this.a = var2.readByte();
        switch (this.a) {
            case 1:
                this.c = new k(176, var2);
                return;
            case 2:
                this.c = new m(179, var2);
                return;
            case 3:
                this.c = new i(174, var2);
                return;
            case 4:
                this.c = new l(177, var2);
                return;
            case 5:
                this.c = new n(180, var2);
                return;
            default:
                throw new XmlPduException("_AccessRequestSpecification (from pdu) : illegal tag - " + String.valueOf(this.a));
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
