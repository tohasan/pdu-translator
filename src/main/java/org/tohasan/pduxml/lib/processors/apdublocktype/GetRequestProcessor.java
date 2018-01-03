package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.aC_;
import org.tohasan.pduxml.lib.processors.aD_;
import org.tohasan.pduxml.lib.processors.aE_;

public final class GetRequestProcessor extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public GetRequestProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 284;
        var2.c(284);
        if (var2.a(286)) {
            this.a = 1;
            this.c = new aD_(286, var2);
        } else if (var2.a(285)) {
            this.a = 2;
            this.c = new aC_(285, var2);
        } else {
            if (!var2.a(287)) {
                throw new XmlPduException("_GetRequest: illegal choice");
            }

            this.a = 3;
            this.c = new aE_(287, var2);
        }

        var2.d(284);
    }

    public GetRequestProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 284;
        this.a = messageInputStream.readByte();
        switch (this.a) {
            case 1:
                this.c = new aD_(286, messageInputStream);
                return;
            case 2:
                this.c = new aC_(285, messageInputStream);
                return;
            case 3:
                this.c = new aE_(287, messageInputStream);
                return;
            default:
                throw new XmlPduException("_GetRequest (from pdu) : illegal tag - " + String.valueOf(this.a));
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
