package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.CustomInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bU_ extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public bU_() {
    }

    public bU_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 297;
        if (var2.a((int) 250)) {
            this.a = 0;
            this.c = new ac(250, var2);
        } else if (var2.a((int) 251)) {
            this.a = 1;
            this.c = new ad(251, var2);
        } else if (var2.a((int) 255)) {
            this.a = 2;
            this.c = new af(255, var2);
        } else if (var2.a((int) 225)) {
            this.a = 3;
            this.c = new cb(225, var2);
        } else {
            throw new XmlPduException("_SingleReadResponse: illegal choice");
        }
    }

    public bU_(int var1, CustomInputStream var2) throws XmlPduException {
        this.b = 150;
        this.a = var2.readByte();
        switch (this.a) {
            case 0:
                this.c = new ac(250, var2);
                return;
            case 1:
                this.c = new ad(251, var2);
                return;
            case 2:
                this.c = new af(255, var2);
                return;
            case 3:
                this.c = new cb(225, var2);
                return;
            default:
                throw new XmlPduException("_SingleReadResponse (from pdu) : illegal tag - " + String.valueOf(this.a));
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
