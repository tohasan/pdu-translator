package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class aO_ extends MessageByteProcessor {
    private bs a;
    private X_ c;
    private aT_ d;
    private SelectorProcessor e;
    private ab f;
    private cb g;

    public aO_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 303;
        var2.c(303);
        if (var2.a((int) 264)) {
            this.a = new bs(264, var2);
        }

        if (var2.a((int) 402)) {
            this.c = new X_(402, var2);
        }

        if (var2.a((int) 378)) {
            this.d = new aT_(378, var2);
        }

        this.e = new SelectorProcessor(376, var2);
        this.f = new ab(375, var2);
        this.g = new cb(377, var2);
        var2.d(303);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
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

    public aO_(int var1, MessageInputStream var2) throws XmlPduException {
        this.b = 303;
        if (var2.readByte() != 0) {
            this.a = new bs(264, var2);
        }

        if (var2.readByte() != 0) {
            this.c = new X_(402, var2);
        }

        if (var2.readByte() != 0) {
            this.d = new aT_(378, var2);
        }

        this.e = new SelectorProcessor(376, var2);
        this.f = new ab(375, var2);
        this.g = new cb(377, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.b);
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
        var1.b(this.b);
    }
}
