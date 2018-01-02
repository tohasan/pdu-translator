package org.tohasan.pduxml.lib.a.datatype;

import org.tohasan.pduxml.lib.infra.*;

import java.io.ByteArrayOutputStream;

public final class DoubleLongProcessor extends MessageByteProcessor {
    private int a;

    public DoubleLongProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 268;
        var2.b(268);
        byte[] var4;
        if ((var4 = Misc.hexStrToByteArray(var2.f(454))).length != 4) {
            throw new XmlPduException("_Integer32: Illegal data size, expected " + "4" + " ,found " + var4.length);
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(4, 1)).process(var4);
            this.a = var3.b();
            var2.a();
        }
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) {
        ValueProcessor var2;
        (var2 = new ValueProcessor(4, 1)).process(this.a);
        var2.process((ByteArrayOutputStream) var1);
    }

    public DoubleLongProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 268;
        ValueProcessor var3;
        (var3 = new ValueProcessor(4, 1)).process(var2);
        this.a = var3.b();
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        ValueProcessor var2;
        (var2 = new ValueProcessor(4, 1)).process(this.a);
        var1.a(this.tagKey, 454, var2.f(), 1);
    }
}
