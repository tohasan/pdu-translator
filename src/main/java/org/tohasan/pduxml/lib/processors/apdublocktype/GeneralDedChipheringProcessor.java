package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;

public final class GeneralDedChipheringProcessor extends MessageByteProcessor {
    private OctetStringProcessor a;
    private OctetStringProcessor c;

    public GeneralDedChipheringProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 279;
        var2.c(279);
        this.a = new OctetStringProcessor(436, var2);
        this.c = new OctetStringProcessor(244, var2);
        var2.d(279);
    }

    public GeneralDedChipheringProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 279;
        this.a = new OctetStringProcessor(436, messageInputStream);
        this.c = new OctetStringProcessor(244, messageInputStream);
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
        this.c.encode(messageOutputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendTag(this.tagKey);
        xmlOutputBuilder.addIndent();
        this.a.printTo(xmlOutputBuilder);
        this.c.printTo(xmlOutputBuilder);
        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
