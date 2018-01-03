package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.datatype.BooleanProcessor;
import org.tohasan.pduxml.lib.processors.datatype.DoubleLongUnsignedProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class ag extends MessageByteProcessor {
    private BooleanProcessor a;
    private DoubleLongUnsignedProcessor c;
    private ae d;

    public ag(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 403;
        var2.c(403);
        this.a = new BooleanProcessor(314, var2);
        this.c = new DoubleLongUnsignedProcessor(225, var2);
        this.d = new ae(403, var2);
        var2.d(403);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
        this.d.a(messageOutputStream);
    }

    public ag(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 403;
        this.a = new BooleanProcessor(314, messageInputStream);
        this.c = new DoubleLongUnsignedProcessor(225, messageInputStream);
        this.d = new ae(403, messageInputStream);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
