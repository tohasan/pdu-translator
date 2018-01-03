package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.processors.common.MultiByteValueProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class OctetStringProcessor extends MultiByteValueProcessor {
    public OctetStringProcessor(int var1, XmlParser var2) throws XmlPduException {
        this.tagKey = var1;
        this.a = -1;
        var2.b(var1);
        this.a(var2);
        var2.a();
    }

    public OctetStringProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = var1;
        this.a = -1;
        this.a(var2);
    }
}
