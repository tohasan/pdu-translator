package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bk extends org.tohasan.pduxml.lib.infra.b {
    public bk(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 330;
        var2.b(330);
        this.a(var2);
        var2.a();
    }

    public bk(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 330;
        this.a(var2);
    }
}
