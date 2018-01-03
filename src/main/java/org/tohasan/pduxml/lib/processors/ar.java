package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class ar extends MessageByteProcessor {
    private int a;

    public ar(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 430;
        var2.b(430);
        String var3;
        if ((var3 = var2.f(454).toString()).equals("ServiceNotAllowed")) {
            this.a = 1;
        } else {
            if (!var3.equals("ServiceUnknown")) {
                throw new XmlPduException("_ExceptionStateError: illegal element " + var3);
            }

            this.a = 2;
        }

        var2.a();
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        var1.write((byte) this.a);
    }

    public ar(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 430;
        this.a = var2.readByte();
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        StringBuffer var2 = new StringBuffer();
        switch (this.a) {
            case 1:
                var2.append("ServiceNotAllowed");
                break;
            case 2:
                var2.append("ServiceUnknown");
                break;
            default:
                throw new XmlPduException("_ExceptionStateError: case range");
        }

        var1.a(this.tagKey, 454, var2, 1);
    }
}
