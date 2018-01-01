package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class aj extends org.tohasan.pduxml.lib.infra.g {
    public aj(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 261;
        this.a = 5;
        var2.b(261);
        this.a(var2);
        var2.a();
    }

    public aj(int var1, MessageInputStream var2) throws XmlPduException {
        this.b = 261;
        this.a = 5;
        this.a(var2);
    }
}
