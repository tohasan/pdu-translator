package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class bT_ extends MessageByteProcessor {
    private H_ a;
    private aA_ c;

    public bT_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 149;
        var2.c(149);
        this.a = new H_(403, var2);
        if (var2.a(405)) {
            this.c = new aA_(405, var2);
        }

        var2.d(149);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        if (this.c != null) {
            messageOutputStream.write(1);
            this.c.a(messageOutputStream);
        } else {
            messageOutputStream.write(0);
        }
    }

    public bT_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 149;
        this.a = new H_(403, var2);
        if (var2.readByte() != 0) {
            this.c = new aA_(405, var2);
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
