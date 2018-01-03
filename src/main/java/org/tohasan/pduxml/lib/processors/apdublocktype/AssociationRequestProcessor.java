package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.association.*;
import org.tohasan.pduxml.lib.processors.common.UserInformationProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class AssociationRequestProcessor extends MessageByteProcessor {
    private ProtocolVersionProcessor a;
    private ApplicationContextNameProcessor c;
    private ApTitleProcessor d;
    private AeQualifierProcessor qualifierProcessor;
    private InvocationIdProcessor f;
    private InvocationIdProcessor g;
    private ApTitleProcessor h;
    private AeQualifierProcessor i;
    private InvocationIdProcessor j;
    private InvocationIdProcessor k;
    private AcseRequirementProcessor l;
    private MechanismNameProcessor m;
    private AuthenticationValueProcessor n;
    private ImplementationInformationProcessor o;
    private UserInformationProcessor p;

    public AssociationRequestProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 211;
        var2.c(211);
        if (var2.a(379)) {
            this.a = new ProtocolVersionProcessor(var2);
        }

        this.c = new ApplicationContextNameProcessor(var2);
        if (var2.a(237)) {
            this.d = new ApTitleProcessor(237, var2);
        }

        if (var2.a(235)) {
            this.qualifierProcessor = new AeQualifierProcessor(235, var2);
        }

        if (var2.a(236)) {
            this.f = new InvocationIdProcessor(236, var2);
        }

        if (var2.a(234)) {
            this.g = new InvocationIdProcessor(234, var2);
        }

        if (var2.a(241)) {
            this.h = new ApTitleProcessor(241, var2);
        }

        if (var2.a(239)) {
            this.i = new AeQualifierProcessor(239, var2);
        }

        if (var2.a(240)) {
            this.j = new InvocationIdProcessor(240, var2);
        }

        if (var2.a(238)) {
            this.k = new InvocationIdProcessor(238, var2);
        }

        if (var2.a(409)) {
            this.l = new AcseRequirementProcessor(409, var2);
        }

        if (var2.a(330)) {
            this.m = new MechanismNameProcessor(var2);
        }

        if (var2.a(242)) {
            this.n = new AuthenticationValueProcessor(242, var2);
        }

        if (var2.a(298)) {
            this.o = new ImplementationInformationProcessor(var2);
        }

        if (var2.a(303, 486, 280)) {
            this.p = new UserInformationProcessor(297, var2);
        }

        var2.d(211);
    }

    public AssociationRequestProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 211;
        CommonUtils.decodeVarLengthUnsignedInteger(messageInputStream);

        int var1;
        while (messageInputStream.c() > 0) {
            switch (var1 = messageInputStream.readByte()) {
                case 128:
                    this.a = new ProtocolVersionProcessor(messageInputStream);
                    break;
                case 138:
                    this.l = new AcseRequirementProcessor(409, messageInputStream);
                    break;
                case 139:
                    this.m = new MechanismNameProcessor(messageInputStream);
                    break;
                case 157:
                    this.o = new ImplementationInformationProcessor(messageInputStream);
                    break;
                case 161:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 6) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.c = new ApplicationContextNameProcessor(messageInputStream);
                    break;
                case 162:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 4) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.d = new ApTitleProcessor(237, messageInputStream);
                    break;
                case 163:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 4) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.qualifierProcessor = new AeQualifierProcessor(235, messageInputStream);
                    break;
                case 164:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 2) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.f = new InvocationIdProcessor(236, messageInputStream);
                    break;
                case 165:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 2) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.g = new InvocationIdProcessor(234, messageInputStream);
                    break;
                case 166:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 4) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.h = new ApTitleProcessor(241, messageInputStream);
                    break;
                case 167:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 4) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.i = new AeQualifierProcessor(239, messageInputStream);
                    break;
                case 168:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 2) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.j = new InvocationIdProcessor(240, messageInputStream);
                    break;
                case 169:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 2) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.k = new InvocationIdProcessor(238, messageInputStream);
                    break;
                case 172:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 128) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.n = new AuthenticationValueProcessor(242, messageInputStream);
                    break;
                case 190:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 4) {
                        throw new XmlPduException("_AssociationRequest: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.p = new UserInformationProcessor(297, messageInputStream);
                    break;
                default:
                    throw new XmlPduException("_AssociationRequest: Unexpected tag1 ".concat(Integer.toString(var1)));
            }
        }
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

            if (this.qualifierProcessor != null) {
                var3.write(163);
                var3.write(0);
                var2 = var3.size() - 1;
                var3.write(4);
                this.qualifierProcessor.a(var3);
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

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        if (this.a != null) {
            this.a.a(var1);
        }

        this.c.a(var1);
        if (this.d != null) {
            this.d.a(var1);
        }

        if (this.qualifierProcessor != null) {
            this.qualifierProcessor.a(var1);
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
