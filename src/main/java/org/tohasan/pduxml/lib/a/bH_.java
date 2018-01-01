package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bH_ extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public bH_() {
    }

    public bH_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 417;
        var2.c(417);
        if (var2.a((int) 418)) {
            this.a = 1;
            this.c = new bI_(418, var2);
        } else if (var2.a((int) 420)) {
            this.a = 2;
            this.c = new bK_(420, var2);
        } else if (var2.a((int) 419)) {
            this.a = 3;
            this.c = new bJ_(419, var2);
        } else if (var2.a((int) 421)) {
            this.a = 4;
            this.c = new bL_(421, var2);
        } else {
            if (!var2.a((int) 422)) {
                throw new XmlPduException("_SetRequest: illegal choice");
            }

            this.a = 5;
            this.c = new bM_(422, var2);
        }

        var2.d(417);
    }

    public bH_(int var1, MessageInputStream var2) throws XmlPduException {
        this.b = 417;
        this.a = var2.readByte();
        switch (this.a) {
            case 1:
                this.c = new bI_(418, var2);
                return;
            case 2:
                this.c = new bK_(420, var2);
                return;
            case 3:
                this.c = new bJ_(419, var2);
                return;
            case 4:
                this.c = new bL_(421, var2);
                return;
            case 5:
                this.c = new bM_(422, var2);
                return;
            default:
                throw new XmlPduException("_SetRequest (from pdu) : illegal tag - " + String.valueOf(this.a));
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
