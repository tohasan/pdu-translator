package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.datatype.OctetStringProcessor;
import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class h extends MessageByteProcessor {
    private bj a;
    private OctetStringProcessor c;
    private j d;

    public h(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 173;
        var2.c(173);
        this.a = new bj(325, var2);
        this.c = new OctetStringProcessor(262, var2);
        this.d = new j(175, var2);
        var2.d(173);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
    }

    public h(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 173;
        this.a = new bj(325, var2);
        this.c = new OctetStringProcessor(262, var2);
        this.d = new j(175, var2);
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
