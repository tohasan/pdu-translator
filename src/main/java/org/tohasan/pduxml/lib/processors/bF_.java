package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class bF_ extends MessageByteProcessor {
    private int a;

    public bF_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 410;
        var2.b(410);
        String var3;
        if ((var3 = var2.f(454).toString()).equals("Other")) {
            this.a = 0;
        } else if (var3.equals("PduSize")) {
            this.a = 1;
        } else {
            if (!var3.equals("ServiceUnsupported")) {
                throw new XmlPduException("_Service: illegal element " + var3);
            }

            this.a = 2;
        }

        var2.a();
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write((byte) this.a);
    }

    public bF_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 410;
        this.a = var2.readByte();
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        StringBuffer var2 = new StringBuffer();
        switch (this.a) {
            case 0:
                var2.append("Other");
                break;
            case 1:
                var2.append("PduSize");
                break;
            case 2:
                var2.append("ServiceUnsupported");
                break;
            default:
                throw new XmlPduException("_Service: case range");
        }

        var1.appendEmptyTag(this.tagKey, 454, var2);
    }
}
