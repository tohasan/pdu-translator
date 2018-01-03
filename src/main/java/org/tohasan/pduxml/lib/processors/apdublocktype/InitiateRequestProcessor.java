package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.ab;
import org.tohasan.pduxml.lib.processors.datatype.*;

public final class InitiateRequestProcessor extends MessageByteProcessor {
    private OctetStringProcessor a;
    private BooleanProcessor c;
    private IntegerProcessor d;
    private SelectorProcessor e;
    private ab f;
    private LongUnsignedProcessor g;

    public InitiateRequestProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 303;
        var2.c(303);
        if (var2.a(264)) {
            this.a = new OctetStringProcessor(264, var2);
        }

        if (var2.a(402)) {
            this.c = new BooleanProcessor(402, var2);
        }

        if (var2.a(378)) {
            this.d = new IntegerProcessor(378, var2);
        }

        this.e = new SelectorProcessor(376, var2);
        this.f = new ab(375, var2);
        this.g = new LongUnsignedProcessor(377, var2);
        var2.d(303);
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        if (this.a != null) {
            var1.write(1);
            this.a.a(var1);
        } else {
            var1.write(0);
        }

        if (this.c != null) {
            var1.write(1);
            this.c.a(var1);
        } else {
            var1.write(0);
        }

        if (this.d != null) {
            var1.write(1);
            this.d.a(var1);
        } else {
            var1.write(0);
        }

        this.e.a(var1);
        this.f.a(var1);
        this.g.a(var1);
    }

    public InitiateRequestProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 303;
        if (messageInputStream.readByte() != 0) {
            this.a = new OctetStringProcessor(264, messageInputStream);
        }

        if (messageInputStream.readByte() != 0) {
            this.c = new BooleanProcessor(402, messageInputStream);
        }

        if (messageInputStream.readByte() != 0) {
            this.d = new IntegerProcessor(378, messageInputStream);
        }

        this.e = new SelectorProcessor(376, messageInputStream);
        this.f = new ab(375, messageInputStream);
        this.g = new LongUnsignedProcessor(377, messageInputStream);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        if (this.a != null) {
            this.a.a(var1);
        }

        if (this.c != null) {
            this.c.a(var1);
        }

        if (this.d != null) {
            this.d.a(var1);
        }

        this.e.a(var1);
        this.f.a(var1);
        this.g.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
