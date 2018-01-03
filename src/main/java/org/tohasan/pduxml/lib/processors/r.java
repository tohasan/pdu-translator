package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class r extends MessageByteProcessor {
    private aZ_ a;
    private bc c;
    private ba d;

    public r(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 184;
        var2.c(184);
        if (var2.a(181)) {
            this.a = new aZ_(181, var2);
        }

        this.c = new bc(186, var2);
        this.d = new ba(188, var2);
        var2.d(184);
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        if (this.a != null) {
            var1.write(1);
            this.a.a(var1);
        } else {
            var1.write(0);
        }

        this.c.a(var1);
        this.d.a(var1);
    }

    public r(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 184;
        if (var2.readByte() != 0) {
            this.a = new aZ_(181, var2);
        }

        this.c = new bc(186, var2);
        this.d = new ba(188, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        if (this.a != null) {
            this.a.a(var1);
        }

        this.c.a(var1);
        this.d.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
