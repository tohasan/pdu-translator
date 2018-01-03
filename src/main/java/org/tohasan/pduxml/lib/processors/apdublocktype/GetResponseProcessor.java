package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.aG_;
import org.tohasan.pduxml.lib.processors.aH_;
import org.tohasan.pduxml.lib.processors.aI_;

public final class GetResponseProcessor extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public GetResponseProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 288;
        var2.c(288);
        if (var2.a(289)) {
            this.a = 1;
            this.c = new aG_(289, var2);
        } else if (var2.a(290)) {
            this.a = 2;
            this.c = new aH_(290, var2);
        } else {
            if (!var2.a(291)) {
                throw new XmlPduException("_GetResponse: illegal choice");
            }

            this.a = 3;
            this.c = new aI_(291, var2);
        }

        var2.d(288);
    }

    public GetResponseProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 288;
        this.a = messageInputStream.readByte();
        switch (this.a) {
            case 1:
                this.c = new aG_(289, messageInputStream);
                return;
            case 2:
                this.c = new aH_(290, messageInputStream);
                return;
            case 3:
                this.c = new aI_(291, messageInputStream);
                return;
            default:
                throw new XmlPduException("_GetResponse (from pdu) : illegal tag - " + String.valueOf(this.a));
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
