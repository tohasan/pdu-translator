package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class J_ extends org.tohasan.pduxml.lib.infra.b {
    public J_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 205;
        var2.b(205);
        this.a(var2);
        var2.a();
    }

    public J_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 205;
        this.a(var2);
    }
}
