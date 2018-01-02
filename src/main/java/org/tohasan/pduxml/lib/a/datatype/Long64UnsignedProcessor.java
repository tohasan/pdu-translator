package org.tohasan.pduxml.lib.a.datatype;

import org.tohasan.pduxml.lib.infra.*;
import org.tohasan.pduxml.lib.utils.CommonUtils;

import java.io.ByteArrayOutputStream;

public final class Long64UnsignedProcessor extends MessageByteProcessor {
    private long a;

    public Long64UnsignedProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 322;
        var2.b(322);
        byte[] var4;
        if ((var4 = CommonUtils.hexStrToByteArray(var2.f(454))).length != 8) {
            throw new XmlPduException("_Unsigned64: Illegal data size, expected " + "8" + " ,found " + var4.length);
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(8, 2)).process(var4);
            this.a = var3.c();
            var2.a();
        }
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) {
        ValueProcessor var2;
        (var2 = new ValueProcessor(8, 2)).process(this.a);
        var2.process((ByteArrayOutputStream) var1);
    }

    public Long64UnsignedProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 322;
        ValueProcessor var3;
        (var3 = new ValueProcessor(8, 2)).process(var2);
        this.a = var3.c();
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        ValueProcessor var2;
        (var2 = new ValueProcessor(8, 2)).process(this.a);
        var1.a(this.tagKey, 454, var2.f(), 1);
    }
}