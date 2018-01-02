package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class f extends org.tohasan.pduxml.lib.infra.c {
    public f(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = var1;
        var2.b(var1);
        this.a(var2);
        var2.a();
    }

    public f(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = var1;
        this.a(var2);
    }
}
