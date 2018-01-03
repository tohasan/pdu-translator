package org.tohasan.pduxml.lib.processors.association;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.io.MessageInputStream;

public final class ImplementationInformationProcessor extends org.tohasan.pduxml.lib.infra.c {
    public ImplementationInformationProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 298;
        var2.b(298);
        this.a(var2);
        var2.a();
    }

    public ImplementationInformationProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 298;
        this.a(var2);
    }
}
