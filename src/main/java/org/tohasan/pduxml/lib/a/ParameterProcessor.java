package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.datatype.*;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.XmlPduException;
import org.tohasan.pduxml.lib.utils.EnumUtils;

public final class ParameterProcessor extends MessageByteProcessor {
    private int paramTypeCode;
    private MessageByteProcessor c;

    public ParameterProcessor() {
    }

    public ParameterProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = var1;
        if (var1 != 297) {
            var2.c(var1);
        }

        if (var2.a(352)) {
            this.paramTypeCode = 0;
            this.c = new NullDataProcessor(352, var2);
        } else if (var2.a(210)) {
            this.paramTypeCode = 1;
            this.c = new ArrayProcessor(210, var2);
        } else if (var2.a(434)) {
            this.paramTypeCode = 2;
            this.c = new StructureProcessor(434, var2);
        } else if (var2.a(233)) {
            this.paramTypeCode = 3;
            this.c = new BooleanProcessor(233, var2);
        } else if (var2.a(222)) {
            this.paramTypeCode = 4;
            this.c = new BitStringProcessor(222, var2);
        } else if (var2.a(268)) {
            this.paramTypeCode = 5;
            this.c = new DoubleLongProcessor(268, var2);
        } else if (var2.a(269)) {
            this.paramTypeCode = 6;
            this.c = new DoubleLongUnsignedProcessor(269, var2);
        } else if (var2.a(276)) {
            this.paramTypeCode = 7;
            this.c = new FloatingPointProcessor(276, var2);
        } else if (var2.a(358)) {
            this.paramTypeCode = 9;
            this.c = new OctetStringProcessor(358, var2);
        } else if (var2.a(458)) {
            this.paramTypeCode = 10;
            this.c = new VisibleStringProcessor(458, var2);
        } else if (var2.a(446)) {
            this.paramTypeCode = 12;
            this.c = new Utf8StringProcessor(446, var2);
        } else if (var2.a(221)) {
            this.paramTypeCode = 13;
            this.c = new BcdProcessor(221, var2);
        } else if (var2.a(306)) {
            this.paramTypeCode = 15;
            this.c = new IntegerProcessor(306, var2);
        } else if (var2.a(320)) {
            this.paramTypeCode = 16;
            this.c = new LongProcessor(320, var2);
        } else if (var2.a(449)) {
            this.paramTypeCode = 17;
            this.c = new SelectorProcessor(449, var2);
        } else if (var2.a(327)) {
            this.paramTypeCode = 18;
            this.c = new LongUnsignedProcessor(327, var2);
        } else if (var2.a(321)) {
            this.paramTypeCode = 20;
            this.c = new Long64Processor(321, var2);
        } else if (var2.a(322)) {
            this.paramTypeCode = 21;
            this.c = new Long64UnsignedProcessor(322, var2);
        } else if (var2.a(270)) {
            this.paramTypeCode = 22;
            this.c = new EnumProcessor(270, var2);
        } else if (var2.a(274)) {
            this.paramTypeCode = 23;
            this.c = new Float32Processor(274, var2);
        } else if (var2.a(275)) {
            this.paramTypeCode = 24;
            this.c = new Float64Processor(275, var2);
        } else if (var2.a(262)) {
            this.paramTypeCode = 25;
            this.c = new DateTimeProcessor(262, var2);
        } else if (var2.a(261)) {
            this.paramTypeCode = 26;
            this.c = new DateProcessor(261, var2);
        } else if (var2.a(442)) {
            this.paramTypeCode = 27;
            this.c = new TimeProcessor(442, var2);
        } else {
            if (!var2.a(267)) {
                throw new XmlPduException("_Data: illegal choice");
            }

            this.paramTypeCode = 255;
            this.c = new am(267, var2);
        }

        if (var1 != 297) {
            var2.d(var1);
        }

    }

    public ParameterProcessor(int tagKey, MessageInputStream messageStream) throws XmlPduException {
        this.tagKey = tagKey;
        this.paramTypeCode = messageStream.readByte();
        DataType paramType = EnumUtils.fromCode(DataType.class, paramTypeCode);

        switch (this.paramTypeCode) {
            case 255:
                this.c = new am(267, messageStream);
                return;
        }

        if (paramType == null) {
            throw new XmlPduException("_Data (from pdu) : illegal tag - " + String.valueOf(this.paramTypeCode));
        }

        switch (paramType) {
            case NULL_DATA:
                this.c = new NullDataProcessor(352, messageStream);
                return;
            case ARRAY:
                this.c = new ArrayProcessor(210, messageStream);
                return;
            case STRUCTURE:
                this.c = new StructureProcessor(434, messageStream);
                return;
            case BOOLEAN:
                this.c = new BooleanProcessor(233, messageStream);
                return;
            case BIT_STRING:
                this.c = new BitStringProcessor(222, messageStream);
                return;
            case DOUBLE_LONG:
                this.c = new DoubleLongProcessor(268, messageStream);
                return;
            case DOUBLE_LONG_UNSIGNED:
                this.c = new DoubleLongUnsignedProcessor(269, messageStream);
                return;
            case FLOATING_POINT:
                this.c = new FloatingPointProcessor(276, messageStream);
                return;
            case OCTET_STRING:
                this.c = new OctetStringProcessor(358, messageStream);
                return;
            case VISIBLE_STRING:
                this.c = new VisibleStringProcessor(458, messageStream);
                return;
            case UTF8_STRING:
                this.c = new Utf8StringProcessor(446, messageStream);
                return;
            case BCD:
                this.c = new BcdProcessor(221, messageStream);
                return;
            case INTEGER:
                this.c = new IntegerProcessor(306, messageStream);
                return;
            case LONG:
                this.c = new LongProcessor(320, messageStream);
                return;
            case UNSIGNED:
                this.c = new SelectorProcessor(449, messageStream);
                return;
            case LONG_UNSIGNED:
                this.c = new LongUnsignedProcessor(327, messageStream);
                return;
            case LONG64:
                this.c = new Long64Processor(321, messageStream);
                return;
            case LONG64_UNSIGNED:
                this.c = new Long64UnsignedProcessor(322, messageStream);
                return;
            case ENUM:
                this.c = new EnumProcessor(270, messageStream);
                return;
            case FLOAT32:
                this.c = new Float32Processor(274, messageStream);
                return;
            case FLOAT64:
                this.c = new Float64Processor(275, messageStream);
                return;
            case DATETIME:
                this.c = new DateTimeProcessor(262, messageStream);
                return;
            case DATE:
                this.c = new DateProcessor(261, messageStream);
                return;
            case TIME:
                this.c = new TimeProcessor(442, messageStream);
                return;
            default:
                throw new XmlPduException("_Data (from pdu) : tag - " + this.paramTypeCode + " - is not processed yet");
        }
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        var1.write((byte) this.paramTypeCode);
        this.c.a(var1);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        if (this.tagKey != 297) {
            var1.a(this.tagKey);
            var1.a();
            this.c.a(var1);
            var1.b();
            var1.b(this.tagKey);
        } else {
            this.c.a(var1);
        }
    }
}
