package org.tohasan.pduxml.lib.a.apdublocktype;

import org.tohasan.pduxml.lib.a.aq;
import org.tohasan.pduxml.lib.a.ar;
import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class ExceptionResponseProcessor extends MessageByteProcessor {
    private ar a;
    private aq c;

    public ExceptionResponseProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 273;
        var2.c(273);
        this.a = new ar(430, var2);
        this.c = new aq(411, var2);
        var2.d(273);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
    }

    public ExceptionResponseProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 273;
        this.a = new ar(430, var2);
        this.c = new aq(411, var2);
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
