package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class DateTimeProcessor extends org.tohasan.pduxml.lib.infra.g {
    public DateTimeProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 262;
        this.a = 12;
        var2.b(262);
        this.a(var2);
        var2.a();
    }

    public DateTimeProcessor(int tagKey, MessageInputStream messageStream) throws XmlPduException {
        this.tagKey = 262;
        this.a = 12;
        this.a(messageStream);
    }
}
