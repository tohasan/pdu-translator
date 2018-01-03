package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

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
