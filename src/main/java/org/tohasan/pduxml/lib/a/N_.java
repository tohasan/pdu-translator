package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.Misc;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class N_ extends MessageByteProcessor {
    private bv a;
    private J_ c;
    private O_ d;
    private bD_ e;
    private f f;
    private e g;
    private aU_ h;
    private aU_ i;
    private b j;
    private bk k;
    private R_ l;
    private S_ m;

    public N_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 212;
        var2.c(212);
        if (var2.a((int) 379)) {
            this.a = new bv(379, var2);
        }

        this.c = new J_(205, var2);
        this.d = new O_(213, var2);
        this.e = new bD_(404, var2);
        if (var2.a((int) 400)) {
            this.f = new f(400, var2);
        }

        if (var2.a((int) 398)) {
            this.g = new e(398, var2);
        }

        if (var2.a((int) 399)) {
            this.h = new aU_(399, var2);
        }

        if (var2.a((int) 397)) {
            this.i = new aU_(397, var2);
        }

        if (var2.a((int) 396)) {
            this.j = new b(396, var2);
        }

        if (var2.a((int) 330)) {
            this.k = new bk(330, var2);
        }

        if (var2.a((int) 401)) {
            this.l = new R_(401, var2);
        }

        if (var2.a(304, 246, 487, 482, 280)) {
            this.m = new S_(297, var2);
        }

        var2.d(212);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        org.tohasan.pduxml.lib.infra.i var3 = new org.tohasan.pduxml.lib.infra.i();
        if (this.a != null) {
            var3.write(128);
            this.a.a(var3);
        }

        if (this.c == null) {
            throw new XmlPduException("_AssociationResponse: Field ApplicationContextName missing");
        } else {
            var3.write(161);
            var3.write(0);
            int var2 = var3.size() - 1;
            var3.write(6);
            this.c.a(var3);
            var3.a(var2, (byte) (var3.size() - var2 - 1));
            if (this.d == null) {
                throw new XmlPduException("_AssociationResponse: Field AssociationResult missing");
            } else {
                var3.write(162);
                var3.write(0);
                var2 = var3.size() - 1;
                var3.write(2);
                this.d.a(var3);
                var3.a(var2, (byte) (var3.size() - var2 - 1));
                if (this.e == null) {
                    throw new XmlPduException("_AssociationResponse: Field ResultSourceDiagnostic missing");
                } else {
                    var3.write(163);
                    this.e.a(var3);
                    if (this.f != null) {
                        var3.write(164);
                        var3.write(0);
                        var2 = var3.size() - 1;
                        var3.write(4);
                        this.f.a(var3);
                        var3.a(var2, (byte) (var3.size() - var2 - 1));
                    }

                    if (this.g != null) {
                        var3.write(165);
                        var3.write(0);
                        var2 = var3.size() - 1;
                        var3.write(4);
                        this.g.a(var3);
                        var3.a(var2, (byte) (var3.size() - var2 - 1));
                    }

                    if (this.h != null) {
                        var3.write(166);
                        var3.write(0);
                        var2 = var3.size() - 1;
                        var3.write(2);
                        this.h.a(var3);
                        var3.a(var2, (byte) (var3.size() - var2 - 1));
                    }

                    if (this.i != null) {
                        var3.write(167);
                        var3.write(0);
                        var2 = var3.size() - 1;
                        var3.write(2);
                        this.i.a(var3);
                        var3.a(var2, (byte) (var3.size() - var2 - 1));
                    }

                    if (this.j != null) {
                        var3.write(136);
                        this.j.a(var3);
                    }

                    if (this.k != null) {
                        var3.write(137);
                        this.k.a(var3);
                    }

                    if (this.l != null) {
                        var3.write(170);
                        var3.write(0);
                        var2 = var3.size() - 1;
                        var3.write(128);
                        this.l.a(var3);
                        var3.a(var2, (byte) (var3.size() - var2 - 1));
                    }

                    if (this.m != null) {
                        var3.write(190);
                        var3.write(0);
                        var2 = var3.size() - 1;
                        var3.write(4);
                        this.m.a(var3);
                        var3.a(var2, (byte) (var3.size() - var2 - 1));
                    }

                    Misc.encodeVarLengthUnsignedInteger(var1, var3.size());
                    var1.write(var3.toByteArray(), 0, var3.size());
                }
            }
        }
    }

    public N_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 212;
        Misc.decodeVarLengthUnsignedInteger(var2);

        while (var2.c() > 0) {
            switch (var1 = var2.readByte()) {
                case 128:
                    this.a = new bv(379, var2);
                    break;
                case 136:
                    this.j = new b(396, var2);
                    break;
                case 137:
                    this.k = new bk(330, var2);
                    break;
                case 161:
                    var2.readByte();
                    if ((var1 = var2.readByte()) != 6) {
                        throw new XmlPduException("_AssociationResponse: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.c = new J_(205, var2);
                    break;
                case 162:
                    var2.readByte();
                    if ((var1 = var2.readByte()) != 2) {
                        throw new XmlPduException("_AssociationResponse: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.d = new O_(213, var2);
                    break;
                case 163:
                    this.e = new bD_(404, var2);
                    break;
                case 164:
                    var2.readByte();
                    if ((var1 = var2.readByte()) != 4) {
                        throw new XmlPduException("_AssociationResponse: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.f = new f(400, var2);
                    break;
                case 165:
                    var2.readByte();
                    if ((var1 = var2.readByte()) != 4) {
                        throw new XmlPduException("_AssociationResponse: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.g = new e(398, var2);
                    break;
                case 166:
                    var2.readByte();
                    if ((var1 = var2.readByte()) != 2) {
                        throw new XmlPduException("_AssociationResponse: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.h = new aU_(399, var2);
                    break;
                case 167:
                    var2.readByte();
                    if ((var1 = var2.readByte()) != 2) {
                        throw new XmlPduException("_AssociationResponse: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.i = new aU_(397, var2);
                    break;
                case 170:
                    var2.readByte();
                    if ((var1 = var2.readByte()) != 128) {
                        throw new XmlPduException("_AssociationResponse: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.l = new R_(401, var2);
                    break;
                case 190:
                    var2.readByte();
                    if ((var1 = var2.readByte()) != 4) {
                        throw new XmlPduException("_AssociationResponse: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.m = new S_(297, var2);
                    break;
                default:
                    throw new XmlPduException("_AssociationResponse: Unexpected tag1 ".concat(Integer.toString(var1)));
            }
        }

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
        if (this.f != null) {
            this.f.a(var1);
        }

        if (this.g != null) {
            this.g.a(var1);
        }

        if (this.h != null) {
            this.h.a(var1);
        }

        if (this.i != null) {
            this.i.a(var1);
        }

        if (this.j != null) {
            this.j.a(var1);
        }

        if (this.k != null) {
            this.k.a(var1);
        }

        if (this.l != null) {
            this.l.a(var1);
        }

        if (this.m != null) {
            this.m.a(var1);
        }

        var1.b();
        var1.b(this.tagKey);
    }
}
