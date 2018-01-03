package org.tohasan.pduxml.lib.processors.association;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;

public final class ImplementationInformationProcessor extends SimpleValueListProcessor {
    public ImplementationInformationProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 298;
        var2.b(298);
        this.a(var2);
        var2.a();
    }

    public ImplementationInformationProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 298;
        this.a(messageInputStream);
    }
}
