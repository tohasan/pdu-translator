package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bN_ extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public bN_() {
    }

    public bN_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 423;
        var2.c(423);
        if (var2.a((int) 427)) {
            this.a = 1;
            this.c = new bR_(427, var2);
        } else if (var2.a((int) 424)) {
            this.a = 2;
            this.c = new bO_(424, var2);
        } else if (var2.a((int) 425)) {
            this.a = 3;
            this.c = new bP_(425, var2);
        } else if (var2.a((int) 426)) {
            this.a = 4;
            this.c = new bQ_(426, var2);
        } else {
            if (!var2.a((int) 428)) {
                throw new XmlPduException("_SetResponse: illegal choice");
            }

            this.a = 5;
            this.c = new bS_(428, var2);
        }

        var2.d(423);
    }

    public bN_(int var1, MessageInputStream var2) throws XmlPduException {
        this.b = 423;
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

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        var1.write((byte) this.a);
        this.c.a(var1);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        if (this.b != 297) {
            var1.a(this.b);
            var1.a();
            this.c.a(var1);
            var1.b();
            var1.b(this.b);
        } else {
            this.c.a(var1);
        }
    }
}
