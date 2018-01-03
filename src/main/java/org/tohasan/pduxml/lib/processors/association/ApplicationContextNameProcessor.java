package org.tohasan.pduxml.lib.processors.association;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.io.MessageInputStream;

public final class ApplicationContextNameProcessor extends org.tohasan.pduxml.lib.infra.b {
    public ApplicationContextNameProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 205;
        var2.b(205);
        this.a(var2);
        var2.a();
    }

    public ApplicationContextNameProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 205;
        this.a(messageInputStream);
    }
}
