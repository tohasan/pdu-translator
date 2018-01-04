package org.tohasan.pduxml.lib.processors.keyinfo;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;

public final class IdentifiedKeyProcessor extends MessageByteProcessor {
    private KeyIdProcessor a;

    public IdentifiedKeyProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 296;
        var2.c(296);
        this.a = new KeyIdProcessor(var2);
        var2.d(296);
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
    }

    public IdentifiedKeyProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 296;
        this.a = new KeyIdProcessor(messageInputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendTag(this.tagKey);
        xmlOutputBuilder.addIndent();
        this.a.printTo(xmlOutputBuilder);
        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
