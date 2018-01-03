package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class Q_ extends MessageByteProcessor {
    private P_ a;
    private bE_ c;

    public Q_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 42;
        var2.c(42);
        this.a = new P_(217, var2);
        if (var2.a(189)) {
            this.c = new bE_(189, var2);
        }

        var2.d(42);
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        this.a.a(var1);
        if (this.c != null) {
            var1.write(1);
            this.c.a(var1);
        } else {
            var1.write(0);
        }
    }

    public Q_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 42;
        this.a = new P_(217, var2);
        if (var2.readByte() != 0) {
            this.c = new bE_(189, var2);
        }

    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        this.a.a(var1);
        if (this.c != null) {
            this.c.a(var1);
        }

        var1.b();
        var1.b(this.tagKey);
    }
}
