package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bD_ extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public bD_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 404;
        var2.c(404);
        if (var2.a(170)) {
            this.a = 161;
            this.c = new d(170, var2);
        } else {
            if (!var2.a(169)) {
                throw new XmlPduException("_ResultSourceDiagnostic : illegal choice");
            }

            this.a = 162;
            this.c = new c(169, var2);
        }

        var2.d(404);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        var1.write(0);
        int var2 = var1.size() - 1;
        var1.write(this.a);
        int var3;
        switch (this.a) {
            case 161:
                var1.write(0);
                var3 = var1.size() - 1;
                var1.write(2);
                this.c.a(var1);
                var1.a(var3, (byte) (var1.size() - var3 - 1));
                break;
            case 162:
                var1.write(0);
                var3 = var1.size() - 1;
                var1.write(2);
                this.c.a(var1);
                var1.a(var3, (byte) (var1.size() - var3 - 1));
                break;
            default:
                throw new XmlPduException("_ResultSourceDiagnostic : illegal Tag ".concat(Integer.toString(this.a)));
        }

        var1.a(var2, (byte) (var1.size() - var2 - 1));
    }

    public bD_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 404;
        var2.readByte();
        this.a = var2.readByte();
        switch (this.a) {
            case 161:
                var2.readByte();
                var2.readByte(2);
                this.c = new d(170, var2);
                return;
            case 162:
                var2.readByte();
                var2.readByte(2);
                this.c = new c(169, var2);
                return;
            default:
                throw new XmlPduException("_ResultSourceDiagnostic: Unexpected tag1 -".concat(Integer.toString(this.a)));
        }
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
