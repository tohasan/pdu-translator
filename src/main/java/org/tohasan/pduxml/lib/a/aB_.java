package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.CustomInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class aB_ extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public aB_() {
    }

    public aB_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 284;
        var2.c(284);
        if (var2.a((int) 286)) {
            this.a = 1;
            this.c = new aD_(286, var2);
        } else if (var2.a((int) 285)) {
            this.a = 2;
            this.c = new aC_(285, var2);
        } else {
            if (!var2.a((int) 287)) {
                throw new XmlPduException("_GetRequest: illegal choice");
            }

            this.a = 3;
            this.c = new aE_(287, var2);
        }

        var2.d(284);
    }

    public aB_(int var1, CustomInputStream var2) throws XmlPduException {
        this.b = 284;
        this.a = var2.readByte();
        switch (this.a) {
            case 1:
                this.c = new aD_(286, var2);
                return;
            case 2:
                this.c = new aC_(285, var2);
                return;
            case 3:
                this.c = new aE_(287, var2);
                return;
            default:
                throw new XmlPduException("_GetRequest (from pdu) : illegal tag - " + String.valueOf(this.a));
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
