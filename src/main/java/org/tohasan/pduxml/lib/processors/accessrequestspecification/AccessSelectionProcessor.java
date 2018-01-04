package org.tohasan.pduxml.lib.processors.accessrequestspecification;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ParameterProcessor;
import org.tohasan.pduxml.lib.processors.datatype.SelectorProcessor;

public final class AccessSelectionProcessor extends MessageByteProcessor {
    private SelectorProcessor a;
    private ParameterProcessor c;

    public AccessSelectionProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 189;
        var2.c(189);
        this.a = new SelectorProcessor(190, var2);
        this.c = new ParameterProcessor(172, var2);
        var2.d(189);
    }

    public AccessSelectionProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 189;
        this.a = new SelectorProcessor(190, messageInputStream);
        this.c = new ParameterProcessor(172, messageInputStream);
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
