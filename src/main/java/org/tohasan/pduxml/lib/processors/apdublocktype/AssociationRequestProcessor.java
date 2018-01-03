package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.*;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class AssociationRequestProcessor extends MessageByteProcessor {
    private bv a;
    private J_ c;
    private org.tohasan.pduxml.lib.processors.f d;
    private org.tohasan.pduxml.lib.processors.e e;
    private aU_ f;
    private aU_ g;
    private f h;
    private e i;
    private aU_ j;
    private aU_ k;
    private b l;
    private bk m;
    private R_ n;
    private aL_ o;
    private S_ p;

    public AssociationRequestProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 211;
        var2.c(211);
        if (var2.a(379)) {
            this.a = new bv(379, var2);
        }

        this.c = new J_(205, var2);
        if (var2.a(237)) {
            this.d = new f(237, var2);
        }

        if (var2.a(235)) {
            this.e = new e(235, var2);
        }

        if (var2.a(236)) {
            this.f = new aU_(236, var2);
        }

        if (var2.a(234)) {
            this.g = new aU_(234, var2);
        }

        if (var2.a(241)) {
            this.h = new f(241, var2);
        }

        if (var2.a(239)) {
            this.i = new e(239, var2);
        }

        if (var2.a(240)) {
            this.j = new aU_(240, var2);
        }

        if (var2.a(238)) {
            this.k = new aU_(238, var2);
        }

        if (var2.a(409)) {
            this.l = new b(409, var2);
        }

        if (var2.a(330)) {
            this.m = new bk(330, var2);
        }

        if (var2.a(242)) {
            this.n = new R_(242, var2);
        }

        if (var2.a(298)) {
            this.o = new aL_(298, var2);
        }

        if (var2.a(303, 486, 280)) {
            this.p = new S_(297, var2);
        }

        var2.d(211);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        MessageOutputStream var3 = new MessageOutputStream();
        if (this.a != null) {
            var3.write(128);
            this.a.a(var3);
        }

        if (this.c == null) {
            throw new XmlPduException("_AssociationRequest: Field ApplicationContextName missing");
        } else {
            var3.write(161);
            var3.write(0);
            int var2 = var3.size() - 1;
            var3.write(6);
            this.c.a(var3);
            var3.a(var2, (byte) (var3.size() - var2 - 1));
            if (this.d != null) {
                var3.write(162);
                var3.write(0);
                var2 = var3.size() - 1;
                var3.write(4);
                this.d.a(var3);
                var3.a(var2, (byte) (var3.size() - var2 - 1));
            }

            if (this.e != null) {
                var3.write(163);
                var3.write(0);
                var2 = var3.size() - 1;
                var3.write(4);
                this.e.a(var3);
                var3.a(var2, (byte) (var3.size() - var2 - 1));
            }

            if (this.f != null) {
                var3.write(164);
                var3.write(0);
                var2 = var3.size() - 1;
                var3.write(2);
                this.f.a(var3);
                var3.a(var2, (byte) (var3.size() - var2 - 1));
            }

            if (this.g != null) {
                var3.write(165);
                var3.write(0);
                var2 = var3.size() - 1;
                var3.write(2);
                this.g.a(var3);
                var3.a(var2, (byte) (var3.size() - var2 - 1));
            }

            if (this.h != null) {
                var3.write(166);
                var3.write(0);
                var2 = var3.size() - 1;
                var3.write(4);
                this.h.a(var3);
                var3.a(var2, (byte) (var3.size() - var2 - 1));
            }

            if (this.i != null) {
                var3.write(167);
                var3.write(0);
                var2 = var3.size() - 1;
                var3.write(4);
                this.i.a(var3);
                var3.a(var2, (byte) (var3.size() - var2 - 1));
            }

            if (this.j != null) {
                var3.write(168);
                var3.write(0);
                var2 = var3.size() - 1;
                var3.write(2);
                this.j.a(var3);
                var3.a(var2, (byte) (var3.size() - var2 - 1));
            }

            if (this.k != null) {
                var3.write(169);
                var3.write(0);
                var2 = var3.size() - 1;
                var3.write(2);
                this.k.a(var3);
                var3.a(var2, (byte) (var3.size() - var2 - 1));
            }

            if (this.l != null) {
                var3.write(138);
                this.l.a(var3);
            }

            if (this.m != null) {
                var3.write(139);
                this.m.a(var3);
            }

            if (this.n != null) {
                var3.write(172);
                var3.write(0);
                var2 = var3.size() - 1;
                var3.write(128);
                this.n.a(var3);
                var3.a(var2, (byte) (var3.size() - var2 - 1));
            }

            if (this.o != null) {
                var3.write(157);
                this.o.a(var3);
            }

            if (this.p != null) {
                var3.write(190);
                var3.write(0);
                var2 = var3.size() - 1;
                var3.write(4);
                this.p.a(var3);
                var3.a(var2, (byte) (var3.size() - var2 - 1));
            }

            CommonUtils.encodeVarLengthUnsignedInteger(messageOutputStream, var3.size());
            messageOutputStream.write(var3.toByteArray(), 0, var3.size());
        }
    }

    public AssociationRequestProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 211;
        CommonUtils.decodeVarLengthUnsignedInteger(messageInputStream);

        int var1;
        while (messageInputStream.c() > 0) {
            switch (var1 = messageInputStream.readByte()) {
                case 128:
                    this.a = new bv(379, messageInputStream);
                    break;
                case 138:
                    this.l = new b(409, messageInputStream);
                    break;
                case 139:
                    this.m = new bk(330, messageInputStream);
                    break;
                case 157:
                    this.o = new aL_(298, messageInputStream);
                    break;
                case 161:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 6) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.c = new J_(205, messageInputStream);
                    break;
                case 162:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 4) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.d = new f(237, messageInputStream);
                    break;
                case 163:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 4) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.e = new e(235, messageInputStream);
                    break;
                case 164:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 2) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.f = new aU_(236, messageInputStream);
                    break;
                case 165:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 2) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.g = new aU_(234, messageInputStream);
                    break;
                case 166:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 4) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.h = new f(241, messageInputStream);
                    break;
                case 167:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 4) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.i = new e(239, messageInputStream);
                    break;
                case 168:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 2) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.j = new aU_(240, messageInputStream);
                    break;
                case 169:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 2) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.k = new aU_(238, messageInputStream);
                    break;
                case 172:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 128) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.n = new R_(242, messageInputStream);
                    break;
                case 190:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 4) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.p = new S_(297, messageInputStream);
                    break;
                default:
                    throw new XmlPduException("_AssociationRequest: Unexpected tag1 ".concat(Integer.toString(var1)));
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
        if (this.d != null) {
            this.d.a(var1);
        }

        if (this.e != null) {
            this.e.a(var1);
        }

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

        if (this.n != null) {
            this.n.a(var1);
        }

        if (this.o != null) {
            this.o.a(var1);
        }

        if (this.p != null) {
            this.p.a(var1);
        }

        var1.b();
        var1.b(this.tagKey);
    }
}
