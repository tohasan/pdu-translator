package org.tohasan.pduxml.lib.processors.attributedescriptor;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.io.MessageInputStream;

public final class InstanceIdProcessor extends org.tohasan.pduxml.lib.infra.g {
    public InstanceIdProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
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
