package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class R_ extends org.tohasan.pduxml.lib.infra.c {
    public R_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = var1;
        var2.b(var1);
        this.a(var2);
        var2.a();
    }

    public R_(int var1, MessageInputStream var2) throws XmlPduException {
        this.b = var1;
        this.a(var2);
    }
}
