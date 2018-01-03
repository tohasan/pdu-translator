package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.datatype.LongUnsignedProcessor;
import org.tohasan.pduxml.lib.processors.datatype.NullDataProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class bV_ extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public bV_() {
    }

    public bV_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 297;
        if (var2.a(435)) {
            this.a = 0;
            this.c = new NullDataProcessor(435, var2);
        } else if (var2.a(251)) {
            this.a = 1;
            this.c = new ad(251, var2);
        } else if (var2.a(225)) {
            this.a = 2;
            this.c = new LongUnsignedProcessor(225, var2);
        } else {
            throw new XmlPduException("_SingleWriteResponse: illegal choice");
        }
    }

    public bV_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 151;
        this.a = var2.readByte();
        switch (this.a) {
            case 0:
                this.c = new NullDataProcessor(435, var2);
                return;
            case 1:
                this.c = new ad(251, var2);
                return;
            case 2:
                this.c = new LongUnsignedProcessor(225, var2);
                return;
            default:
                throw new XmlPduException("_SingleWriteResponse (from pdu) : illegal tag - " + String.valueOf(this.a));
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
