package org.tohasan.pduxml.lib.a.datatype;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class TimeProcessor extends org.tohasan.pduxml.lib.infra.g {
    public TimeProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 442;
        this.a = 4;
        var2.b(442);
        this.a(var2);
        var2.a();
    }

    public TimeProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 442;
        this.a = 4;
        this.a(var2);
    }
}
