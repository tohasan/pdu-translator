package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bp extends org.tohasan.pduxml.lib.infra.g {
    public bp(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 305;
        this.a = 6;
        var2.b(305);
        this.a(var2);
        var2.a();
    }

    public bp(int var1, MessageInputStream var2) throws XmlPduException {
        this.b = 305;
        this.a = 6;
        this.a(var2);
    }
}
