package org.tohasan.pduxml.lib.processors.accessresponsespecification;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ResultProcessor;

public final class AccessResponseSetProcessor extends MessageByteProcessor {
    private ResultProcessor a;

    public AccessResponseSetProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 187;
        var2.c(187);
        this.a = new ResultProcessor(403, var2);
        var2.d(187);
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
    }

    public AccessResponseSetProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 187;
        this.a = new ResultProcessor(403, messageInputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendTag(this.tagKey);
        xmlOutputBuilder.addIndent();
        this.a.printTo(xmlOutputBuilder);
        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
