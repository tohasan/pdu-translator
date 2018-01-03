package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class aD_ extends MessageByteProcessor {
    private aV_ a;
    private P_ c;
    private bE_ d;

    public aD_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 286;
        var2.c(286);
        this.a = new aV_(308, var2);
        this.c = new P_(217, var2);
        if (var2.a(189)) {
            this.d = new bE_(189, var2);
        }

        var2.d(286);
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
        if (this.d != null) {
            var1.write(1);
            this.d.a(var1);
        } else {
            var1.write(0);
        }
    }

    public aD_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 286;
        this.a = new aV_(308, var2);
        this.c = new P_(217, var2);
        if (var2.readByte() != 0) {
            this.d = new bE_(189, var2);
        }

    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        this.a.a(var1);
        this.c.a(var1);
        if (this.d != null) {
            this.d.a(var1);
        }

        var1.b();
        var1.b(this.tagKey);
    }
}
