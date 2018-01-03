package org.tohasan.pduxml.lib.processors.association;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.io.MessageInputStream;

public final class AeQualifierProcessor extends org.tohasan.pduxml.lib.infra.c {
    public AeQualifierProcessor(int tagKey, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = tagKey;
        var2.b(tagKey);
        this.a(var2);
        var2.a();
    }

    public AeQualifierProcessor(int tagKey, MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = tagKey;
        this.a(messageInputStream);
    }
}
