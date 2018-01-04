package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.accessrequest.AccessRequestBodyProcessor;
import org.tohasan.pduxml.lib.processors.common.LongInvokeIdAndPriorityProcessor;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;

public final class AccessRequestProcessor extends MessageByteProcessor {
    private LongInvokeIdAndPriorityProcessor a;
    private OctetStringProcessor c;
    private AccessRequestBodyProcessor d;

    public AccessRequestProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 173;
        var2.c(173);
        this.a = new LongInvokeIdAndPriorityProcessor(var2);
        this.c = new OctetStringProcessor(262, var2);
        this.d = new AccessRequestBodyProcessor(var2);
        var2.d(173);
    }

    public AccessRequestProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 173;
        this.a = new LongInvokeIdAndPriorityProcessor(messageInputStream);
        this.c = new OctetStringProcessor(262, messageInputStream);
        this.d = new AccessRequestBodyProcessor(messageInputStream);
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
        this.c.encode(messageOutputStream);
        this.d.encode(messageOutputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendTag(this.tagKey);
        xmlOutputBuilder.addIndent();
        this.a.printTo(xmlOutputBuilder);
        this.c.printTo(xmlOutputBuilder);
        this.d.printTo(xmlOutputBuilder);
        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
