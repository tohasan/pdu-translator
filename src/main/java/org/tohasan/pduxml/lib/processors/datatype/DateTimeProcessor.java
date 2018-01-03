package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.processors.common.MultiByteValueProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class DateTimeProcessor extends MultiByteValueProcessor {
    public DateTimeProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 262;
        this.a = 12;
        var2.b(262);
        this.a(var2);
        var2.a();
    }

    public DateTimeProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 262;
        this.a = 12;
        this.a(messageInputStream);
    }
}
