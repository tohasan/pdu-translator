package org.tohasan.pduxml.lib.processors.accessrequest;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ListOfDataProcessor;

public final class AccessRequestBodyProcessor extends MessageByteProcessor {
    private AccessRequestSpecificationProcessor a;
    private ListOfDataProcessor c;

    public AccessRequestBodyProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 175;
        var2.c(175);
        this.a = new AccessRequestSpecificationProcessor(var2);
        this.c = new ListOfDataProcessor(178, var2);
        var2.d(175);
    }

    public AccessRequestBodyProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 175;
        this.a = new AccessRequestSpecificationProcessor(messageInputStream);
        this.c = new ListOfDataProcessor(178, messageInputStream);
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
