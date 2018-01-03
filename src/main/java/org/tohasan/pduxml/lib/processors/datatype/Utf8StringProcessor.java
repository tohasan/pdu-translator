package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.processors.common.MultiByteValueProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class Utf8StringProcessor extends MultiByteValueProcessor {
    public Utf8StringProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 446;
        this.a = -1;
        var2.b(446);
        this.a(var2);
        var2.a();
    }

    public Utf8StringProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 446;
        this.a = -1;
        this.a(messageInputStream);
    }
}
