package org.tohasan.pduxml.lib.processors.common;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.TagMap;

public class DoNothingProcessor extends MessageByteProcessor {
    public DoNothingProcessor(int tagKey, XmlParser var2) throws XmlPduException {
        this.tagKey = tagKey;
        var2.c(tagKey);
    }

    public DoNothingProcessor(int tagKey) {
        this.tagKey = tagKey;
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendWithNewLine("<" + TagMap.getKeyByValue(this.tagKey) + " />");
    }
}
