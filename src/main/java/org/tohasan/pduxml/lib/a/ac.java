package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.CustomInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class ac extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public ac() {
    }

    public ac(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = var1;
        if (var1 != 297) {
            var2.c(var1);
        }

        if (var2.a((int) 352)) {
            this.a = 0;
            this.c = new bn(352, var2);
        } else if (var2.a((int) 210)) {
            this.a = 1;
            this.c = new L_(210, var2);
        } else if (var2.a((int) 434)) {
            this.a = 2;
            this.c = new bW_(434, var2);
        } else if (var2.a((int) 233)) {
            this.a = 3;
            this.c = new X_(233, var2);
        } else if (var2.a((int) 222)) {
            this.a = 4;
            this.c = new U_(222, var2);
        } else if (var2.a((int) 268)) {
            this.a = 5;
            this.c = new aR_(268, var2);
        } else if (var2.a((int) 269)) {
            this.a = 6;
            this.c = new cc(269, var2);
        } else if (var2.a((int) 276)) {
            this.a = 7;
            this.c = new au(276, var2);
        } else if (var2.a((int) 358)) {
            this.a = 9;
            this.c = new bs(358, var2);
        } else if (var2.a((int) 458)) {
            this.a = 10;
            this.c = new ch(458, var2);
        } else if (var2.a((int) 446)) {
            this.a = 12;
            this.c = new bZ_(446, var2);
        } else if (var2.a((int) 221)) {
            this.a = 13;
            this.c = new T_(221, var2);
        } else if (var2.a((int) 306)) {
            this.a = 15;
            this.c = new aT_(306, var2);
        } else if (var2.a((int) 320)) {
            this.a = 16;
            this.c = new aQ_(320, var2);
        } else if (var2.a((int) 449)) {
            this.a = 17;
            this.c = new ce(449, var2);
        } else if (var2.a((int) 327)) {
            this.a = 18;
            this.c = new cb(327, var2);
        } else if (var2.a((int) 321)) {
            this.a = 20;
            this.c = new aS_(321, var2);
        } else if (var2.a((int) 322)) {
            this.a = 21;
            this.c = new cd(322, var2);
        } else if (var2.a((int) 270)) {
            this.a = 22;
            this.c = new an(270, var2);
        } else if (var2.a((int) 274)) {
            this.a = 23;
            this.c = new as(274, var2);
        } else if (var2.a((int) 275)) {
            this.a = 24;
            this.c = new at(275, var2);
        } else if (var2.a((int) 262)) {
            this.a = 25;
            this.c = new ak(262, var2);
        } else if (var2.a((int) 261)) {
            this.a = 26;
            this.c = new aj(261, var2);
        } else if (var2.a((int) 442)) {
            this.a = 27;
            this.c = new bY_(442, var2);
        } else {
            if (!var2.a((int) 267)) {
                throw new XmlPduException("_Data: illegal choice");
            }

            this.a = 255;
            this.c = new am(267, var2);
        }

        if (var1 != 297) {
            var2.d(var1);
        }

    }

    public ac(int var1, CustomInputStream var2) throws XmlPduException {
        this.b = var1;
        this.a = var2.readByte();
        switch (this.a) {
            case 0:
                this.c = new bn(352, var2);
                return;
            case 1:
                this.c = new L_(210, var2);
                return;
            case 2:
                this.c = new bW_(434, var2);
                return;
            case 3:
                this.c = new X_(233, var2);
                return;
            case 4:
                this.c = new U_(222, var2);
                return;
            case 5:
                this.c = new aR_(268, var2);
                return;
            case 6:
                this.c = new cc(269, var2);
                return;
            case 7:
                this.c = new au(276, var2);
                return;
            case 9:
                this.c = new bs(358, var2);
                return;
            case 10:
                this.c = new ch(458, var2);
                return;
            case 12:
                this.c = new bZ_(446, var2);
                return;
            case 13:
                this.c = new T_(221, var2);
                return;
            case 15:
                this.c = new aT_(306, var2);
                return;
            case 16:
                this.c = new aQ_(320, var2);
                return;
            case 17:
                this.c = new ce(449, var2);
                return;
            case 18:
                this.c = new cb(327, var2);
                return;
            case 20:
                this.c = new aS_(321, var2);
                return;
            case 21:
                this.c = new cd(322, var2);
                return;
            case 22:
                this.c = new an(270, var2);
                return;
            case 23:
                this.c = new as(274, var2);
                return;
            case 24:
                this.c = new at(275, var2);
                return;
            case 25:
                this.c = new ak(262, var2);
                return;
            case 26:
                this.c = new aj(261, var2);
                return;
            case 27:
                this.c = new bY_(442, var2);
                return;
            case 255:
                this.c = new am(267, var2);
                return;
            default:
                throw new XmlPduException("_Data (from pdu) : illegal tag - " + String.valueOf(this.a));
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
