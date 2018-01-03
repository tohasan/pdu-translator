package org.tohasan.pduxml.lib.processors.attributedescriptor;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.processors.common.MultiByteValueProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;

public final class InstanceIdProcessor extends MultiByteValueProcessor {
    public InstanceIdProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 305;
        this.a = 6;
        var2.b(305);
        this.a(var2);
        var2.a();
    }

    public InstanceIdProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 305;
        this.a = 6;
        this.a(var2);
    }
}
