package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.processors.common.MultiByteValueProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class VisibleStringProcessor extends MultiByteValueProcessor {
    public VisibleStringProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 458;
        this.a = -1;
        var2.b(458);
        this.a(var2);
        var2.a();
    }

    public VisibleStringProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 458;
        this.a = -1;
        this.a(messageInputStream);
    }
}
