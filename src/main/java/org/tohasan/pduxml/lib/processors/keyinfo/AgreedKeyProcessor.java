package org.tohasan.pduxml.lib.processors.keyinfo;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;

public final class AgreedKeyProcessor extends MessageByteProcessor {
    private OctetStringProcessor a;
    private OctetStringProcessor c;

    public AgreedKeyProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 204;
        var2.c(204);
        this.a = new OctetStringProcessor(313, var2);
        this.c = new OctetStringProcessor(310, var2);
        var2.d(204);
    }

    public AgreedKeyProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 204;
        this.a = new OctetStringProcessor(313, messageInputStream);
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
