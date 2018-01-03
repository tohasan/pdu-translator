package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class bC_ extends MessageByteProcessor {
    private int a;

    public bC_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 388;
        var2.b(388);
        String var3;
        if ((var3 = var2.f(454).toString()).equals("Normal")) {
            this.a = 0;
        } else if (var3.equals("NotFinished")) {
            this.a = 1;
        } else {
            if (!var3.equals("UserDefined")) {
                throw new XmlPduException("_ReleaseResponseReason: illegal element " + var3);
            }

            this.a = 30;
        }

        var2.a();
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        var1.write(1);
        var1.write((byte) this.a);
    }

    public bC_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 388;
        var2.readByte(1);
        this.a = var2.readByte();
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        StringBuffer var2 = new StringBuffer();
        switch (this.a) {
            case 0:
                var2.append("Normal");
                break;
            case 1:
                var2.append("NotFinished");
                break;
            case 30:
                var2.append("UserDefined");
                break;
            default:
                throw new XmlPduException("_ReleaseResponseReason: case range");
        }

        var1.a(this.tagKey, 454, var2, 1);
    }
}
