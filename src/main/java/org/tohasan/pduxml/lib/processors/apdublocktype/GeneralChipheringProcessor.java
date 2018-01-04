package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;
import org.tohasan.pduxml.lib.processors.generalchiphering.KeyInfoProcessor;

public final class GeneralChipheringProcessor extends MessageByteProcessor {
    private OctetStringProcessor a;
    private OctetStringProcessor c;
    private OctetStringProcessor d;
    private OctetStringProcessor e;
    private OctetStringProcessor f;
    private KeyInfoProcessor g;
    private OctetStringProcessor h;

    public GeneralChipheringProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 278;
        var2.c(278);
        this.a = new OctetStringProcessor(444, var2);
        this.c = new OctetStringProcessor(360, var2);
        this.d = new OctetStringProcessor(389, var2);
        this.e = new OctetStringProcessor(262, var2);
        this.f = new OctetStringProcessor(363, var2);

        if (var2.a(312)) {
            this.g = new KeyInfoProcessor(var2);
        }

        this.h = new OctetStringProcessor(243, var2);
        var2.d(278);
    }

    public GeneralChipheringProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 278;
        this.a = new OctetStringProcessor(444, messageInputStream);
        this.c = new OctetStringProcessor(360, messageInputStream);
        this.d = new OctetStringProcessor(389, messageInputStream);
        this.e = new OctetStringProcessor(262, messageInputStream);
        this.f = new OctetStringProcessor(363, messageInputStream);

        if (messageInputStream.readByte() != 0) {
            this.g = new KeyInfoProcessor(messageInputStream);
        }

        this.h = new OctetStringProcessor(243, messageInputStream);
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
        this.c.encode(messageOutputStream);
        this.d.encode(messageOutputStream);
        this.e.encode(messageOutputStream);
        this.f.encode(messageOutputStream);
        if (this.g != null) {
            messageOutputStream.write(1);
            this.g.encode(messageOutputStream);
        } else {
            messageOutputStream.write(0);
        }

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
        if (this.g != null) {
            this.g.printTo(xmlOutputBuilder);
        }

        this.h.printTo(xmlOutputBuilder);
        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
