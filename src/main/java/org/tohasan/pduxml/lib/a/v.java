package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class v extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public v() {
    }

    public v(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 192;
        var2.c(192);
        if (var2.a((int) 194)) {
            this.a = 1;
            this.c = new x(194, var2);
        } else if (var2.a((int) 193)) {
            this.a = 2;
            this.c = new w(193, var2);
        } else if (var2.a((int) 196)) {
            this.a = 3;
            this.c = new z(196, var2);
        } else if (var2.a((int) 195)) {
            this.a = 4;
            this.c = new y(195, var2);
        } else if (var2.a((int) 197)) {
            this.a = 5;
            this.c = new A_(197, var2);
        } else {
            if (!var2.a((int) 198)) {
                throw new XmlPduException("_ActionRequest: illegal choice");
            }

            this.a = 6;
            this.c = new B_(198, var2);
        }

        var2.d(192);
    }

    public v(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 192;
        this.a = var2.readByte();
        switch (this.a) {
            case 1:
                this.c = new x(194, var2);
                return;
            case 2:
                this.c = new w(193, var2);
                return;
            case 3:
                this.c = new z(196, var2);
                return;
            case 4:
                this.c = new y(195, var2);
                return;
            case 5:
                this.c = new A_(197, var2);
                return;
            case 6:
                this.c = new B_(198, var2);
                return;
            default:
                throw new XmlPduException("_ActionRequest (from pdu) : illegal tag - " + String.valueOf(this.a));
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
