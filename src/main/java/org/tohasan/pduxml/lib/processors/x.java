package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class x extends MessageByteProcessor {
    private aV_ a;
    private bl c;
    private ParameterProcessor d;

    public x(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 194;
        var2.c(194);
        this.a = new aV_(308, var2);
        this.c = new bl(332, var2);
        if (var2.a(335)) {
            this.d = new ParameterProcessor(335, var2);
        }

        var2.d(194);
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

    public x(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 194;
        this.a = new aV_(308, var2);
        this.c = new bl(332, var2);
        if (var2.readByte() != 0) {
            this.d = new ParameterProcessor(335, var2);
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
