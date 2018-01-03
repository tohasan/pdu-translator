package org.tohasan.pduxml.lib.processors.association;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;

public final class ApplicationContextNameProcessor extends NameProcessor {
    public ApplicationContextNameProcessor(XmlParser var2) throws XmlPduException {
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
