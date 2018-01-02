package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.*;
import org.tohasan.pduxml.lib.utils.CommonUtils;

import java.io.ByteArrayOutputStream;

public final class O_ extends MessageByteProcessor {
    private int a;

    public O_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 213;
        var2.b(213);
        byte[] var4;
        if ((var4 = CommonUtils.hexStrToByteArray(var2.f(454))).length != 1) {
            throw new XmlPduException("_AssociationResult: Illegal data size, expected " + "1" + " ,found " + var4.length);
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(1, 2)).process(var4);
            this.a = var3.b();
            var2.a();
        }
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        ValueProcessor var2;
        (var2 = new ValueProcessor(1, 2)).process(this.a);
        var1.write(1);
        var2.process((ByteArrayOutputStream) var1);
    }

    public O_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 213;
        if ((var1 = var2.readByte()) != 1) {
            throw new XmlPduException("_AssociationResult: Illegal data size, expected " + "1" + " ,found " + var1);
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(1, 2)).process(var2);
            this.a = var3.b();
        }
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        ValueProcessor var2;
        (var2 = new ValueProcessor(1, 2)).process(this.a);
        var1.a(this.tagKey, 454, var2.f(), 1);
    }
}
