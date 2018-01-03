package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class R_ extends org.tohasan.pduxml.lib.infra.c {
    public R_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = var1;
        var2.b(var1);
        this.a(var2);
        var2.a();
    }

    public R_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = var1;
        this.a(var2);
    }
}
