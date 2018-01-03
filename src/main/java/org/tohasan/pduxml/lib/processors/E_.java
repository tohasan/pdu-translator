package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class E_ extends MessageByteProcessor {
    private aV_ a;
    private H_ c;
    private aA_ d;

    public E_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 201;
        var2.c(201);
        this.a = new aV_(308, var2);
        this.c = new H_(403, var2);
        if (var2.a(405)) {
            this.d = new aA_(405, var2);
        }

        var2.d(201);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
        if (this.d != null) {
            messageOutputStream.write(1);
            this.d.a(messageOutputStream);
        } else {
            messageOutputStream.write(0);
        }
    }

    public E_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 201;
        this.a = new aV_(308, var2);
        this.c = new H_(403, var2);
        if (var2.readByte() != 0) {
            this.d = new aA_(405, var2);
        }

    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        this.a.a(var1);
        this.c.a(var1);
        if (this.d != null) {
            this.d.a(var1);
        }

        var1.b();
        var1.b(this.tagKey);
    }
}
