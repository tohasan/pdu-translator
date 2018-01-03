package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bG_ extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public bG_() {
    }

    public bG_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 411;
        var2.c(411);
        if (var2.a(207)) {
            this.a = 0;
            this.c = new K_(207, var2);
        } else if (var2.a(295)) {
            this.a = 1;
            this.c = new aJ_(295, var2);
        } else if (var2.a(457)) {
            this.a = 2;
            this.c = new cg(457, var2);
        } else if (var2.a(410)) {
            this.a = 3;
            this.c = new bF_(410, var2);
        } else if (var2.a(265)) {
            this.a = 4;
            this.c = new al(265, var2);
        } else if (var2.a(171)) {
            this.a = 5;
            this.c = new g(171, var2);
        } else if (var2.a(302)) {
            this.a = 6;
            this.c = new aN_(302, var2);
        } else if (var2.a(318)) {
            this.a = 7;
            this.c = new bi(318, var2);
        } else if (var2.a(437)) {
            this.a = 9;
            this.c = new bX_(437, var2);
        } else {
            if (!var2.a(362)) {
                throw new XmlPduException("_ServiceError: illegal choice");
            }

            this.a = 10;
            this.c = new bt(362, var2);
        }

        var2.d(411);
    }

    public bG_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 411;
        this.a = var2.readByte();
        switch (this.a) {
            case 0:
                this.c = new K_(207, var2);
                return;
            case 1:
                this.c = new aJ_(295, var2);
                return;
            case 2:
                this.c = new cg(457, var2);
                return;
            case 3:
                this.c = new bF_(410, var2);
                return;
            case 4:
                this.c = new al(265, var2);
                return;
            case 5:
                this.c = new g(171, var2);
                return;
            case 6:
                this.c = new aN_(302, var2);
                return;
            case 7:
                this.c = new bi(318, var2);
                return;
            case 8:
            default:
                throw new XmlPduException("_ServiceError (from pdu) : illegal tag - " + String.valueOf(this.a));
            case 9:
                this.c = new bX_(437, var2);
                return;
            case 10:
                this.c = new bt(362, var2);
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
