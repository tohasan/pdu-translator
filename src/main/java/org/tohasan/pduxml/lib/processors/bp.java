package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class bp extends org.tohasan.pduxml.lib.infra.g {
    public bp(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 305;
        this.a = 6;
        var2.b(305);
        this.a(var2);
        var2.a();
    }

    public bp(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 305;
        this.a = 6;
        this.a(var2);
    }
}
