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

public final class AssociationResponseProcessor extends MessageByteProcessor {
    private ProtocolVersionProcessor a;
    private ApplicationContextNameProcessor c;
    private AssociationResultProcessor d;
    private ResultSourceDiagnosticProcessor e;
    private ApTitleProcessor apTitleProcessor;
    private AeQualifierProcessor g;
    private InvocationIdProcessor h;
    private InvocationIdProcessor i;
    private AcseRequirementProcessor j;
    private MechanismNameProcessor k;
    private AuthenticationValueProcessor l;
    private UserInformationProcessor m;

    public AssociationResponseProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 212;
        var2.c(212);
        if (var2.a(379)) {
            this.a = new ProtocolVersionProcessor(var2);
        }

        this.c = new ApplicationContextNameProcessor(var2);
        this.d = new AssociationResultProcessor(var2);
        this.e = new ResultSourceDiagnosticProcessor(var2);
        if (var2.a(400)) {
            this.apTitleProcessor = new ApTitleProcessor(400, var2);
        }

        if (var2.a(398)) {
            this.g = new AeQualifierProcessor(398, var2);
        }

        if (var2.a(399)) {
            this.h = new InvocationIdProcessor(399, var2);
        }

        if (var2.a(397)) {
            this.i = new InvocationIdProcessor(397, var2);
        }

        if (var2.a(396)) {
            this.j = new AcseRequirementProcessor(396, var2);
        }

        if (var2.a(330)) {
            this.k = new MechanismNameProcessor(var2);
        }

        if (var2.a(401)) {
            this.l = new AuthenticationValueProcessor(401, var2);
        }

        if (var2.a(304, 246, 487, 482, 280)) {
            this.m = new UserInformationProcessor(297, var2);
        }

        var2.d(212);
    }

    public AssociationResponseProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 212;
        CommonUtils.decodeVarLengthUnsignedInteger(messageInputStream);

        int var1;
        while (messageInputStream.c() > 0) {
            switch (var1 = messageInputStream.readByte()) {
                case 128:
                    this.a = new ProtocolVersionProcessor(messageInputStream);
                    break;
                case 136:
                    this.j = new AcseRequirementProcessor(396, messageInputStream);
                    break;
                case 137:
                    this.k = new MechanismNameProcessor(messageInputStream);
                    break;
                case 161:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 6) {
                        throw new XmlPduException("_AssociationResponse: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.c = new ApplicationContextNameProcessor(messageInputStream);
                    break;
                case 162:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 2) {
                        throw new XmlPduException("_AssociationResponse: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.d = new AssociationResultProcessor(messageInputStream);
                    break;
                case 163:
                    this.e = new ResultSourceDiagnosticProcessor(messageInputStream);
                    break;
                case 164:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 4) {
                        throw new XmlPduException("_AssociationResponse: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.apTitleProcessor = new ApTitleProcessor(400, messageInputStream);
                    break;
                case 165:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 4) {
                        throw new XmlPduException("_AssociationResponse: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.g = new AeQualifierProcessor(398, messageInputStream);
                    break;
                case 166:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 2) {
                        throw new XmlPduException("_AssociationResponse: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.h = new InvocationIdProcessor(399, messageInputStream);
                    break;
                case 167:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 2) {
                        throw new XmlPduException("_AssociationResponse: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.i = new InvocationIdProcessor(397, messageInputStream);
                    break;
                case 170:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 128) {
                        throw new XmlPduException("_AssociationResponse: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.l = new AuthenticationValueProcessor(401, messageInputStream);
                    break;
                case 190:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 4) {
                        throw new XmlPduException("_AssociationResponse: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.m = new UserInformationProcessor(297, messageInputStream);
                    break;
                default:
                    throw new XmlPduException("_AssociationResponse: Unexpected tag1 ".concat(Integer.toString(var1)));
            }
        }

    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        MessageOutputStream var3 = new MessageOutputStream();
        if (this.a != null) {
            var3.write(128);
            this.a.encode(var3);
        }

        if (this.c == null) {
            throw new XmlPduException("_AssociationResponse: Field ApplicationContextName missing");
        } else {
            var3.write(161);
            var3.write(0);
            int var2 = var3.size() - 1;
            var3.write(6);
            this.c.encode(var3);
            var3.a(var2, (byte) (var3.size() - var2 - 1));
            if (this.d == null) {
                throw new XmlPduException("_AssociationResponse: Field AssociationResult missing");
            } else {
                var3.write(162);
                var3.write(0);
                var2 = var3.size() - 1;
                var3.write(2);
                this.d.encode(var3);
                var3.a(var2, (byte) (var3.size() - var2 - 1));
                if (this.e == null) {
                    throw new XmlPduException("_AssociationResponse: Field ResultSourceDiagnostic missing");
                } else {
                    var3.write(163);
                    this.e.encode(var3);
                    if (this.apTitleProcessor != null) {
                        var3.write(164);
                        var3.write(0);
                        var2 = var3.size() - 1;
                        var3.write(4);
                        this.apTitleProcessor.encode(var3);
                        var3.a(var2, (byte) (var3.size() - var2 - 1));
                    }

                    if (this.g != null) {
                        var3.write(165);
                        var3.write(0);
                        var2 = var3.size() - 1;
                        var3.write(4);
                        this.g.encode(var3);
                        var3.a(var2, (byte) (var3.size() - var2 - 1));
                    }

                    if (this.h != null) {
                        var3.write(166);
                        var3.write(0);
                        var2 = var3.size() - 1;
                        var3.write(2);
                        this.h.encode(var3);
                        var3.a(var2, (byte) (var3.size() - var2 - 1));
                    }

                    if (this.i != null) {
                        var3.write(167);
                        var3.write(0);
                        var2 = var3.size() - 1;
                        var3.write(2);
                        this.i.encode(var3);
                        var3.a(var2, (byte) (var3.size() - var2 - 1));
                    }

                    if (this.j != null) {
                        var3.write(136);
                        this.j.encode(var3);
                    }

                    if (this.k != null) {
                        var3.write(137);
                        this.k.encode(var3);
                    }

                    if (this.l != null) {
                        var3.write(170);
                        var3.write(0);
                        var2 = var3.size() - 1;
                        var3.write(128);
                        this.l.encode(var3);
                        var3.a(var2, (byte) (var3.size() - var2 - 1));
                    }

                    if (this.m != null) {
                        var3.write(190);
                        var3.write(0);
                        var2 = var3.size() - 1;
                        var3.write(4);
                        this.m.encode(var3);
                        var3.a(var2, (byte) (var3.size() - var2 - 1));
                    }

                    CommonUtils.encodeVarLengthUnsignedInteger(messageOutputStream, var3.size());
                    messageOutputStream.write(var3.toByteArray(), 0, var3.size());
                }
            }
        }
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
        if (this.apTitleProcessor != null) {
            this.apTitleProcessor.printTo(xmlOutputBuilder);
        }

        if (this.g != null) {
            this.g.printTo(xmlOutputBuilder);
        }

        if (this.h != null) {
            this.h.printTo(xmlOutputBuilder);
        }

        if (this.i != null) {
            this.i.printTo(xmlOutputBuilder);
        }

        if (this.j != null) {
            this.j.printTo(xmlOutputBuilder);
        }

        if (this.k != null) {
            this.k.printTo(xmlOutputBuilder);
        }

        if (this.l != null) {
            this.l.printTo(xmlOutputBuilder);
        }

        if (this.m != null) {
            this.m.printTo(xmlOutputBuilder);
        }

        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
