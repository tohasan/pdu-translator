package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class ae extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public ae() {
    }

    public ae(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 403;
        var2.c(403);
        if (var2.a(382)) {
            this.a = 0;
            this.c = new OctetStringProcessor(382, var2);
        } else {
            if (!var2.a(252)) {
                throw new XmlPduException("_DataBlockGResult: illegal choice");
            }

            this.a = 1;
            this.c = new ad(252, var2);
        }

        var2.d(403);
    }

    public ae(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 403;
        this.a = var2.readByte();
        switch (this.a) {
            case 0:
                this.c = new OctetStringProcessor(382, var2);
                return;
            case 1:
                this.c = new ad(252, var2);
                return;
            default:
                throw new XmlPduException("_DataBlockGResult (from pdu) : illegal tag - " + String.valueOf(this.a));
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
