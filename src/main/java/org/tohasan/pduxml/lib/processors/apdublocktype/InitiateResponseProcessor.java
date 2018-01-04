package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.datatype.IntegerProcessor;
import org.tohasan.pduxml.lib.processors.datatype.LongUnsignedProcessor;
import org.tohasan.pduxml.lib.processors.datatype.SelectorProcessor;
import org.tohasan.pduxml.lib.processors.initiate.ConformanceProcessor;
import org.tohasan.pduxml.lib.processors.variableaccessspec.VariableNameProcessor;

public final class InitiateResponseProcessor extends MessageByteProcessor {
    private IntegerProcessor a;
    private SelectorProcessor c;
    private ConformanceProcessor d;
    private LongUnsignedProcessor e;
    private VariableNameProcessor f;

    public InitiateResponseProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 304;
        var2.c(304);
        if (var2.a(341)) {
            this.a = new IntegerProcessor(341, var2);
        }

        this.c = new SelectorProcessor(339, var2);
        this.d = new ConformanceProcessor(338, var2);
        this.e = new LongUnsignedProcessor(340, var2);
        this.f = new VariableNameProcessor(453, var2);
        var2.d(304);
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        if (this.a != null) {
            messageOutputStream.write(1);
            this.a.encode(messageOutputStream);
        } else {
            messageOutputStream.write(0);
        }

        this.c.encode(messageOutputStream);
        this.d.encode(messageOutputStream);
        this.e.encode(messageOutputStream);
        this.f.encode(messageOutputStream);
    }

    public InitiateResponseProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 304;

        if (messageInputStream.readByte() != 0) {
            this.a = new IntegerProcessor(341, messageInputStream);
        }

        this.c = new SelectorProcessor(339, messageInputStream);
        this.d = new ConformanceProcessor(338, messageInputStream);
        this.e = new LongUnsignedProcessor(340, messageInputStream);
        this.f = new VariableNameProcessor(453, messageInputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendTag(this.tagKey);
        xmlOutputBuilder.addIndent();
        if (this.a != null) {
            this.a.printTo(xmlOutputBuilder);
        }

        this.c.printTo(xmlOutputBuilder);
        this.d.printTo(xmlOutputBuilder);
        this.e.printTo(xmlOutputBuilder);
        this.f.printTo(xmlOutputBuilder);
        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
