package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.Misc;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class X_ extends MessageByteProcessor {
    private boolean a;

    public X_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = var1;
        var2.b(var1);
        byte[] var4;
        if ((var4 = Misc.hexStrToByteArray(var2.f(454))).length != 1) {
            throw new XmlPduException("_Boolean: Illegal data size, expected " + "1" + " ,found " + var4.length);
        } else {
            org.tohasan.pduxml.lib.infra.l var3;
            (var3 = new org.tohasan.pduxml.lib.infra.l(1, 0)).a(var4);
            this.a = var3.a();
            var2.a();
        }
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) {
        org.tohasan.pduxml.lib.infra.l var2;
        (var2 = new org.tohasan.pduxml.lib.infra.l(1, 0)).a(this.a);
        var2.a(var1);
    }

    public X_(int var1, MessageInputStream var2) throws XmlPduException {
        this.b = var1;
        org.tohasan.pduxml.lib.infra.l var3;
        (var3 = new org.tohasan.pduxml.lib.infra.l(1, 0)).a(var2);
        this.a = var3.a();
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        org.tohasan.pduxml.lib.infra.l var2;
        (var2 = new org.tohasan.pduxml.lib.infra.l(1, 0)).a(this.a);
        var1.a(this.b, 454, var2.f(), 1);
    }
}
