package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class DateProcessor extends org.tohasan.pduxml.lib.infra.g {
    public DateProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 261;
        this.a = 5;
        var2.b(261);
        this.a(var2);
        var2.a();
    }

    public DateProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 261;
        this.a = 5;
        this.a(messageInputStream);
    }
}
