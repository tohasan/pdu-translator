package org.tohasan.pduxml.lib.processors.accessresponsespecification;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.accessresponse.ResultProcessor;

public final class AccessResponseActionProcessor extends MessageByteProcessor {
    private ResultProcessor a;

    public AccessResponseActionProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 183;
        var2.c(183);
        this.a = new ResultProcessor(var2);
        var2.d(183);
    }

    public AccessResponseActionProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 183;
        this.a = new ResultProcessor(messageInputStream);
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendTag(this.tagKey);
        xmlOutputBuilder.addIndent();
        this.a.printTo(xmlOutputBuilder);
        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
