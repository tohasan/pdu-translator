package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.CustomInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class ae extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public ae() {
    }

    public ae(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 403;
        var2.c(403);
        if (var2.a(382)) {
            this.a = 0;
            this.c = new bs(382, var2);
        } else {
            if (!var2.a(252)) {
                throw new XmlPduException("_DataBlockGResult: illegal choice");
            }

            this.a = 1;
            this.c = new ad(252, var2);
        }

        var2.d(403);
    }

    public ae(int var1, CustomInputStream var2) throws XmlPduException {
        this.b = 403;
        this.a = var2.readByte();
        switch (this.a) {
            case 0:
                this.c = new bs(382, var2);
                return;
            case 1:
                this.c = new ad(252, var2);
                return;
            default:
                throw new XmlPduException("_DataBlockGResult (from pdu) : illegal tag - " + String.valueOf(this.a));
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
