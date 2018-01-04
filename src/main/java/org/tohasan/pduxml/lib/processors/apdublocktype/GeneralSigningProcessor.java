package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;

public final class GeneralSigningProcessor extends MessageByteProcessor {
    private OctetStringProcessor a;
    private OctetStringProcessor c;
    private OctetStringProcessor d;
    private OctetStringProcessor e;
    private OctetStringProcessor f;
    private OctetStringProcessor g;
    private OctetStringProcessor h;

    public GeneralSigningProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 282;
        var2.c(282);
        this.a = new OctetStringProcessor(444, var2);
        this.c = new OctetStringProcessor(360, var2);
        this.d = new OctetStringProcessor(389, var2);
        this.e = new OctetStringProcessor(262, var2);
        this.f = new OctetStringProcessor(363, var2);
        this.g = new OctetStringProcessor(248, var2);
        this.h = new OctetStringProcessor(429, var2);
        var2.d(282);
    }

    public GeneralSigningProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 282;
        this.a = new OctetStringProcessor(444, messageInputStream);
        this.c = new OctetStringProcessor(360, messageInputStream);
        this.d = new OctetStringProcessor(389, messageInputStream);
        this.e = new OctetStringProcessor(262, messageInputStream);
        this.f = new OctetStringProcessor(363, messageInputStream);
        this.g = new OctetStringProcessor(248, messageInputStream);
        this.h = new OctetStringProcessor(429, messageInputStream);
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
        this.c.encode(messageOutputStream);
        this.d.encode(messageOutputStream);
        this.e.encode(messageOutputStream);
        this.f.encode(messageOutputStream);
        this.g.encode(messageOutputStream);
        this.h.encode(messageOutputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendTag(this.tagKey);
        xmlOutputBuilder.addIndent();
        this.a.printTo(xmlOutputBuilder);
        this.c.printTo(xmlOutputBuilder);
        this.d.printTo(xmlOutputBuilder);
        this.e.printTo(xmlOutputBuilder);
        this.f.printTo(xmlOutputBuilder);
        this.g.printTo(xmlOutputBuilder);
        this.h.printTo(xmlOutputBuilder);
        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
