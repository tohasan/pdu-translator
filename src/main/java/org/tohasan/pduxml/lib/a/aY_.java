package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class aY_ extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public aY_() {
    }

    public aY_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 312;
        var2.c(312);
        if (var2.a((int) 296)) {
            this.a = 0;
            this.c = new aK_(296, var2);
        } else if (var2.a((int) 459)) {
            this.a = 1;
            this.c = new ci(459, var2);
        } else {
            if (!var2.a((int) 204)) {
                throw new XmlPduException("_KeyInfo: illegal choice");
            }

            this.a = 2;
            this.c = new I_(204, var2);
        }

        var2.d(312);
    }

    public aY_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 312;
        this.a = var2.readByte();
        switch (this.a) {
            case 0:
                this.c = new aK_(296, var2);
                return;
            case 1:
                this.c = new ci(459, var2);
                return;
            case 2:
                this.c = new I_(204, var2);
                return;
            default:
                throw new XmlPduException("_KeyInfo (from pdu) : illegal tag - " + String.valueOf(this.a));
        }
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
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
