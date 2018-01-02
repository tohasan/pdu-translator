package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.datatype.IntegerProcessor;
import org.tohasan.pduxml.lib.a.datatype.LongUnsignedProcessor;
import org.tohasan.pduxml.lib.a.datatype.UnsignedProcessor;
import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class aP_ extends MessageByteProcessor {
    private IntegerProcessor a;
    private UnsignedProcessor c;
    private ab d;
    private LongUnsignedProcessor e;
    private VariableNameProcessor f;

    public aP_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 304;
        var2.c(304);
        if (var2.a((int) 341)) {
            this.a = new IntegerProcessor(341, var2);
        }

        this.c = new UnsignedProcessor(339, var2);
        this.d = new ab(338, var2);
        this.e = new LongUnsignedProcessor(340, var2);
        this.f = new VariableNameProcessor(453, var2);
        var2.d(304);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        if (this.a != null) {
            var1.write(1);
            this.a.a(var1);
        } else {
            var1.write(0);
        }

        this.c.a(var1);
        this.d.a(var1);
        this.e.a(var1);
        this.f.a(var1);
    }

    public aP_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 304;
        if (var2.readByte() != 0) {
            this.a = new IntegerProcessor(341, var2);
        }

        this.c = new UnsignedProcessor(339, var2);
        this.d = new ab(338, var2);
        this.e = new LongUnsignedProcessor(340, var2);
        this.f = new VariableNameProcessor(453, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
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
