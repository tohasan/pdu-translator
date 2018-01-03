package org.tohasan.pduxml.lib.processors.association;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;

public final class ApTitleProcessor extends SimpleValueListProcessor {
    public ApTitleProcessor(int tagKey, XmlParser var2) throws XmlPduException {
        this.tagKey = tagKey;
        var2.b(tagKey);
        this.a(var2);
        var2.a();
    }

    public ApTitleProcessor(int tagKey, MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = tagKey;
        this.a(messageInputStream);
    }
}
