package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class o extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public o() {
    }

    public o(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 14;
        var2.c(14);
        if (var2.a((int) 176)) {
            this.a = 1;
            this.c = new k(176, var2);
        } else if (var2.a((int) 179)) {
            this.a = 2;
            this.c = new m(179, var2);
        } else if (var2.a((int) 174)) {
            this.a = 3;
            this.c = new i(174, var2);
        } else if (var2.a((int) 177)) {
            this.a = 4;
            this.c = new l(177, var2);
        } else {
            if (!var2.a((int) 180)) {
                throw new XmlPduException("_AccessRequestSpecification: illegal choice");
            }

            this.a = 5;
            this.c = new n(180, var2);
        }

        var2.d(14);
    }

    public o(int var1, MessageInputStream var2) throws XmlPduException {
        this.b = 14;
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
