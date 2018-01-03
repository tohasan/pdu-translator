package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.processors.common.MultiByteValueProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class DateProcessor extends MultiByteValueProcessor {
    public DateProcessor(XmlParser var2) throws XmlPduException {
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
