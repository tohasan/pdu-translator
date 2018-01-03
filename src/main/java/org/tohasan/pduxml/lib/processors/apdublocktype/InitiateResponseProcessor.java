package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.ab;
import org.tohasan.pduxml.lib.processors.datatype.IntegerProcessor;
import org.tohasan.pduxml.lib.processors.datatype.LongUnsignedProcessor;
import org.tohasan.pduxml.lib.processors.datatype.SelectorProcessor;
import org.tohasan.pduxml.lib.processors.variableaccessspec.VariableNameProcessor;

public final class InitiateResponseProcessor extends MessageByteProcessor {
    private IntegerProcessor a;
    private SelectorProcessor c;
    private ab d;
    private LongUnsignedProcessor e;
    private VariableNameProcessor f;

    public InitiateResponseProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 304;
        var2.c(304);
        if (var2.a(341)) {
            this.a = new IntegerProcessor(341, var2);
        }

        this.c = new SelectorProcessor(339, var2);
        this.d = new ab(338, var2);
        this.e = new LongUnsignedProcessor(340, var2);
        this.f = new VariableNameProcessor(453, var2);
        var2.d(304);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        if (this.a != null) {
            messageOutputStream.write(1);
            this.a.a(messageOutputStream);
        } else {
            messageOutputStream.write(0);
        }

        this.c.a(messageOutputStream);
        this.d.a(messageOutputStream);
        this.e.a(messageOutputStream);
        this.f.a(messageOutputStream);
    }

    public InitiateResponseProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 304;
        if (messageInputStream.readByte() != 0) {
            this.a = new IntegerProcessor(341, messageInputStream);
        }

        this.c = new SelectorProcessor(339, messageInputStream);
        this.d = new ab(338, messageInputStream);
        this.e = new LongUnsignedProcessor(340, messageInputStream);
        this.f = new VariableNameProcessor(453, messageInputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        if (this.a != null) {
            this.a.a(var1);
        }

        this.c.a(var1);
        this.d.a(var1);
        this.e.a(var1);
        this.f.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
