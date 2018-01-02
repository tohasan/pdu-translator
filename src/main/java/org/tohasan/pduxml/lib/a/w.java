package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.datatype.DoubleLongUnsignedProcessor;
import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class w extends MessageByteProcessor {
    private aV_ a;
    private DoubleLongUnsignedProcessor c;

    public w(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 193;
        var2.c(193);
        this.a = new aV_(308, var2);
        this.c = new DoubleLongUnsignedProcessor(225, var2);
        var2.d(193);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
    }

    public w(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 193;
        this.a = new aV_(308, var2);
        this.c = new DoubleLongUnsignedProcessor(225, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        this.a.a(var1);
        this.c.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
