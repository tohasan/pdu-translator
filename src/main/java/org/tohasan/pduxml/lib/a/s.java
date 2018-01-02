package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class s extends MessageByteProcessor {
    private ad a;

    public s(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 185;
        var2.c(185);
        this.a = new ad(403, var2);
        var2.d(185);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
    }

    public s(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 185;
        this.a = new ad(403, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        this.a.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
