package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

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
