package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.Misc;
import org.tohasan.pduxml.lib.infra.XmlPduException;

import java.io.ByteArrayOutputStream;

public final class aV_ extends MessageByteProcessor {
    private int a;

    public aV_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 308;
        var2.b(308);
        byte[] var4;
        if ((var4 = Misc.hexStrToByteArray(var2.f(454))).length != 1) {
            throw new XmlPduException("_InvokeIdAndPriority: Illegal data size, expected " + "1" + " ,found " + var4.length);
        } else {
            org.tohasan.pduxml.lib.infra.l var3;
            (var3 = new org.tohasan.pduxml.lib.infra.l(1, 2)).a(var4);
            this.a = var3.b();
            var2.a();
        }
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) {
        org.tohasan.pduxml.lib.infra.l var2;
        (var2 = new org.tohasan.pduxml.lib.infra.l(1, 2)).a(this.a);
        var2.a((ByteArrayOutputStream) var1);
    }

    public aV_(int var1, MessageInputStream var2) throws XmlPduException {
        this.b = 308;
        org.tohasan.pduxml.lib.infra.l var3;
        (var3 = new org.tohasan.pduxml.lib.infra.l(1, 2)).a(var2);
        this.a = var3.b();
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        org.tohasan.pduxml.lib.infra.l var2;
        (var2 = new org.tohasan.pduxml.lib.infra.l(1, 2)).a(this.a);
        var1.a(this.b, 454, var2.f(), 1);
    }
}
