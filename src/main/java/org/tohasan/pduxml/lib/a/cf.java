package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.CustomInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class cf extends MessageByteProcessor {
    private int currentByte;
    private MessageByteProcessor c;

    public cf() {
    }

    public cf(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 297;
        if (var2.a((int) 456)) {
            this.currentByte = 2;
            this.c = new br(456, var2);
        } else if (var2.a((int) 368)) {
            this.currentByte = 4;
            this.c = new ParametrizedAccessProcessor(368, var2);
        } else if (var2.a((int) 226)) {
            this.currentByte = 5;
            this.c = new W_(226, var2);
        } else if (var2.a((int) 384)) {
            this.currentByte = 6;
            this.c = new bw(384, var2);
        } else if (var2.a((int) 461)) {
            this.currentByte = 7;
            this.c = new cj(461, var2);
        } else {
            throw new XmlPduException("_VariableAccessSpecification: illegal choice");
        }
    }

    public cf(int var1, CustomInputStream messageByteStream) throws XmlPduException {
        this.b = 161;
        this.currentByte = messageByteStream.readByte();
        switch (this.currentByte) {
            case 2:
                this.c = new br(456, messageByteStream);
                return;
            case 3:
            default:
                throw new XmlPduException("_VariableAccessSpecification (from pdu) : illegal tag - " + String.valueOf(this.currentByte));
            case 4:
                this.c = new ParametrizedAccessProcessor(368, messageByteStream);
                return;
            case 5:
                this.c = new W_(226, messageByteStream);
                return;
            case 6:
                this.c = new bw(384, messageByteStream);
                return;
            case 7:
                this.c = new cj(461, messageByteStream);
        }
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        var1.write((byte) this.currentByte);
        this.c.a(var1);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        if (this.b != 297) {
            var1.a(this.b);
            var1.a();
            this.c.a(var1);
            var1.b();
            var1.b(this.b);
        } else {
            this.c.a(var1);
        }
    }
}
