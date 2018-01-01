package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bm extends MessageByteProcessor {
    private ParameterProcessor a;

    public bm(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 351;
        var2.c(351);
        this.a = new ParameterProcessor(259, var2);
        var2.d(351);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
    }

    public bm(int var1, MessageInputStream var2) throws XmlPduException {
        this.b = 351;
        this.a = new ParameterProcessor(259, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.b);
        var1.a();
        this.a.a(var1);
        var1.b();
        var1.b(this.b);
    }
}
