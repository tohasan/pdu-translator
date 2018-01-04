package org.tohasan.pduxml.lib.processors.keyinfo;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;

public final class WrappedKeyProcessor extends MessageByteProcessor {
    private KekIdProcessor a;
    private OctetStringProcessor c;

    public WrappedKeyProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 459;
        var2.c(459);
        this.a = new KekIdProcessor(var2);
        this.c = new OctetStringProcessor(310, var2);
        var2.d(459);
    }

    public WrappedKeyProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 459;
        this.a = new KekIdProcessor(messageInputStream);
        this.c = new OctetStringProcessor(310, messageInputStream);
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
