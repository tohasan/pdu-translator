package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.confirmedserviceerror.ServiceErrorProcessor;
import org.tohasan.pduxml.lib.processors.datatype.SelectorProcessor;

public final class ConfirmedServiceErrorProcessor extends MessageByteProcessor {
    private SelectorProcessor a;
    private ServiceErrorProcessor c;

    public ConfirmedServiceErrorProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 246;
        var2.c(246);
        this.a = new SelectorProcessor(410, var2);
        this.c = new ServiceErrorProcessor(var2);
        var2.d(246);
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
        this.c.encode(messageOutputStream);
    }

    public ConfirmedServiceErrorProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 246;
        this.a = new SelectorProcessor(410, messageInputStream);
        this.c = new ServiceErrorProcessor(messageInputStream);
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
