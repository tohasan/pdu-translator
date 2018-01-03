package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

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

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write(0);
        int var2 = messageOutputStream.size() - 1;
        messageOutputStream.write(this.a);
        int var3;
        switch (this.a) {
            case 161:
                messageOutputStream.write(0);
                var3 = messageOutputStream.size() - 1;
                messageOutputStream.write(2);
                this.c.a(messageOutputStream);
                messageOutputStream.a(var3, (byte) (messageOutputStream.size() - var3 - 1));
                break;
            case 162:
                messageOutputStream.write(0);
                var3 = messageOutputStream.size() - 1;
                messageOutputStream.write(2);
                this.c.a(messageOutputStream);
                messageOutputStream.a(var3, (byte) (messageOutputStream.size() - var3 - 1));
                break;
            default:
                throw new XmlPduException("_ResultSourceDiagnostic : illegal Tag ".concat(Integer.toString(this.a)));
        }

        messageOutputStream.a(var2, (byte) (messageOutputStream.size() - var2 - 1));
    }

    public bD_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 404;
        var2.readByte();
        this.a = var2.readByte();
        switch (this.a) {
            case 161:
                var2.readByte();
                var2.readByte(2);
                this.c = new d(var2);
                return;
            case 162:
                var2.readByte();
                var2.readByte(2);
                this.c = new c(var2);
                return;
            default:
                throw new XmlPduException("_ResultSourceDiagnostic: Unexpected tag1 -".concat(Integer.toString(this.a)));
        }
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        if (this.tagKey != 297) {
            var1.appendTag(this.tagKey);
            var1.appendWithNewLine();
            this.c.a(var1);
            var1.b();
            var1.b(this.tagKey);
        } else {
            this.c.a(var1);
        }
    }
}
