package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.processors.common.MultiByteValueProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class TimeProcessor extends MultiByteValueProcessor {
    public TimeProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 442;
        this.a = 4;
        var2.b(442);
        this.a(var2);
        var2.a();
    }

    public TimeProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 442;
        this.a = 4;
        this.a(messageInputStream);
    }
}
