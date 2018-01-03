package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.*;

public final class ActionRequestProcessor extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public ActionRequestProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 192;
        var2.c(192);
        if (var2.a(194)) {
            this.a = 1;
            this.c = new x(194, var2);
        } else if (var2.a(193)) {
            this.a = 2;
            this.c = new w(193, var2);
        } else if (var2.a(196)) {
            this.a = 3;
            this.c = new z(196, var2);
        } else if (var2.a(195)) {
            this.a = 4;
            this.c = new y(195, var2);
        } else if (var2.a(197)) {
            this.a = 5;
            this.c = new A_(197, var2);
        } else {
            if (!var2.a(198)) {
                throw new XmlPduException("_ActionRequest: illegal choice");
            }

            this.a = 6;
            this.c = new B_(198, var2);
        }

        var2.d(192);
    }

    public ActionRequestProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 192;
        this.a = messageInputStream.readByte();
        switch (this.a) {
            case 1:
                this.c = new x(194, messageInputStream);
                return;
            case 2:
                this.c = new w(193, messageInputStream);
                return;
            case 3:
                this.c = new z(196, messageInputStream);
                return;
            case 4:
                this.c = new y(195, messageInputStream);
                return;
            case 5:
                this.c = new A_(197, messageInputStream);
                return;
            case 6:
                this.c = new B_(198, messageInputStream);
                return;
            default:
                throw new XmlPduException("_ActionRequest (from pdu) : illegal tag - " + String.valueOf(this.a));
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
