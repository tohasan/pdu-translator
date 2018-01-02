package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.datatype.OctetStringProcessor;
import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;
import org.tohasan.pduxml.lib.utils.EnumUtils;

public class MessageProcessor extends MessageByteProcessor {
    private int apduBlockTypeCode;
    private MessageByteProcessor c;

    MessageProcessor() {
    }

    public MessageProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = var1;
        if (var1 != 297) {
            var2.c(var1);
        }

        if (var2.a(303)) {
            this.apduBlockTypeCode = 1;
            this.c = new aO_(303, var2);
        } else if (var2.a(385)) {
            this.apduBlockTypeCode = 5;
            this.c = new ReadRequestProcessor(385, var2);
        } else if (var2.a(462)) {
            this.apduBlockTypeCode = 6;
            this.c = new ck(462, var2);
        } else if (var2.a(304)) {
            this.apduBlockTypeCode = 8;
            this.c = new aP_(304, var2);
        } else if (var2.a(386)) {
            this.apduBlockTypeCode = 12;
            this.c = new ReadResponseProcessor(386, var2);
        } else if (var2.a(463)) {
            this.apduBlockTypeCode = 13;
            this.c = new cl(463, var2);
        } else if (var2.a(246)) {
            this.apduBlockTypeCode = 14;
            this.c = new aa(246, var2);
        } else if (var2.a(257)) {
            this.apduBlockTypeCode = 15;
            this.c = new ai(257, var2);
        } else if (var2.a(448)) {
            this.apduBlockTypeCode = 22;
            this.c = new ca(448, var2);
        } else if (var2.a(301)) {
            this.apduBlockTypeCode = 24;
            this.c = new aM_(301, var2);
        } else if (var2.a(486)) {
            this.apduBlockTypeCode = 33;
            this.c = new OctetStringProcessor(486, var2);
        } else if (var2.a(488)) {
            this.apduBlockTypeCode = 37;
            this.c = new OctetStringProcessor(488, var2);
        } else if (var2.a(493)) {
            this.apduBlockTypeCode = 38;
            this.c = new OctetStringProcessor(493, var2);
        } else if (var2.a(487)) {
            this.apduBlockTypeCode = 40;
            this.c = new OctetStringProcessor(487, var2);
        } else if (var2.a(489)) {
            this.apduBlockTypeCode = 44;
            this.c = new OctetStringProcessor(489, var2);
        } else if (var2.a(494)) {
            this.apduBlockTypeCode = 45;
            this.c = new OctetStringProcessor(494, var2);
        } else if (var2.a(482)) {
            this.apduBlockTypeCode = 46;
            this.c = new OctetStringProcessor(482, var2);
        } else if (var2.a(492)) {
            this.apduBlockTypeCode = 54;
            this.c = new OctetStringProcessor(492, var2);
        } else if (var2.a(485)) {
            this.apduBlockTypeCode = 56;
            this.c = new OctetStringProcessor(485, var2);
        } else if (var2.a(471)) {
            this.apduBlockTypeCode = 65;
            this.c = new OctetStringProcessor(471, var2);
        } else if (var2.a(473)) {
            this.apduBlockTypeCode = 69;
            this.c = new OctetStringProcessor(473, var2);
        } else if (var2.a(478)) {
            this.apduBlockTypeCode = 70;
            this.c = new OctetStringProcessor(478, var2);
        } else if (var2.a(472)) {
            this.apduBlockTypeCode = 72;
            this.c = new OctetStringProcessor(472, var2);
        } else if (var2.a(474)) {
            this.apduBlockTypeCode = 76;
            this.c = new OctetStringProcessor(474, var2);
        } else if (var2.a(479)) {
            this.apduBlockTypeCode = 77;
            this.c = new OctetStringProcessor(479, var2);
        } else if (var2.a(466)) {
            this.apduBlockTypeCode = 78;
            this.c = new OctetStringProcessor(466, var2);
        } else if (var2.a(477)) {
            this.apduBlockTypeCode = 86;
            this.c = new OctetStringProcessor(477, var2);
        } else if (var2.a(470)) {
            this.apduBlockTypeCode = 88;
            this.c = new OctetStringProcessor(470, var2);
        } else if (var2.a(211)) {
            this.apduBlockTypeCode = 96;
            this.c = new M_(211, var2);
        } else if (var2.a(212)) {
            this.apduBlockTypeCode = 97;
            this.c = new N_(212, var2);
        } else if (var2.a(391)) {
            this.apduBlockTypeCode = 98;
            this.c = new bz(391, var2);
        } else if (var2.a(392)) {
            this.apduBlockTypeCode = 99;
            this.c = new bB_(392, var2);
        } else if (var2.a(284)) {
            this.apduBlockTypeCode = 192;
            this.c = new aB_(284, var2);
        } else if (var2.a(417)) {
            this.apduBlockTypeCode = 193;
            this.c = new bH_(417, var2);
        } else if (var2.a(272)) {
            this.apduBlockTypeCode = 194;
            this.c = new ao(272, var2);
        } else if (var2.a(192)) {
            this.apduBlockTypeCode = 195;
            this.c = new v(192, var2);
        } else if (var2.a(288)) {
            this.apduBlockTypeCode = 196;
            this.c = new aF_(288, var2);
        } else if (var2.a(423)) {
            this.apduBlockTypeCode = 197;
            this.c = new bN_(423, var2);
        } else if (var2.a(199)) {
            this.apduBlockTypeCode = 199;
            this.c = new C_(199, var2);
        } else if (var2.a(483)) {
            this.apduBlockTypeCode = 200;
            this.c = new OctetStringProcessor(483, var2);
        } else if (var2.a(490)) {
            this.apduBlockTypeCode = 201;
            this.c = new OctetStringProcessor(490, var2);
        } else if (var2.a(480)) {
            this.apduBlockTypeCode = 203;
            this.c = new OctetStringProcessor(480, var2);
        } else if (var2.a(484)) {
            this.apduBlockTypeCode = 204;
            this.c = new OctetStringProcessor(484, var2);
        } else if (var2.a(491)) {
            this.apduBlockTypeCode = 205;
            this.c = new OctetStringProcessor(491, var2);
        } else if (var2.a(481)) {
            this.apduBlockTypeCode = 207;
            this.c = new OctetStringProcessor(481, var2);
        } else if (var2.a(468)) {
            this.apduBlockTypeCode = 208;
            this.c = new OctetStringProcessor(468, var2);
        } else if (var2.a(475)) {
            this.apduBlockTypeCode = 209;
            this.c = new OctetStringProcessor(475, var2);
        } else if (var2.a(467)) {
            this.apduBlockTypeCode = 210;
            this.c = new OctetStringProcessor(467, var2);
        } else if (var2.a(464)) {
            this.apduBlockTypeCode = 211;
            this.c = new OctetStringProcessor(464, var2);
        } else if (var2.a(469)) {
            this.apduBlockTypeCode = 212;
            this.c = new OctetStringProcessor(469, var2);
        } else if (var2.a(476)) {
            this.apduBlockTypeCode = 213;
            this.c = new OctetStringProcessor(476, var2);
        } else if (var2.a(465)) {
            this.apduBlockTypeCode = 215;
            this.c = new OctetStringProcessor(465, var2);
        } else if (var2.a(273)) {
            this.apduBlockTypeCode = 216;
            this.c = new ap(273, var2);
        } else if (var2.a(173)) {
            this.apduBlockTypeCode = 217;
            this.c = new h(173, var2);
        } else if (var2.a(182)) {
            this.apduBlockTypeCode = 218;
            this.c = new p(182, var2);
        } else if (var2.a(280)) {
            this.apduBlockTypeCode = 219;
            this.c = new ay(280, var2);
        } else if (var2.a(279)) {
            this.apduBlockTypeCode = 220;
            this.c = new ax(279, var2);
        } else if (var2.a(278)) {
            this.apduBlockTypeCode = 221;
            this.c = new aw(278, var2);
        } else if (var2.a(282)) {
            this.apduBlockTypeCode = 223;
            this.c = new az(282, var2);
        } else if (var2.a(277)) {
            this.apduBlockTypeCode = 224;
            this.c = new av(277, var2);
        } else {
            if (!var2.a(250)) {
                throw new XmlPduException("_COSEMpdu: illegal choice");
            }

            this.apduBlockTypeCode = 255;
            this.c = new ParameterProcessor(250, var2);
        }

        if (var1 != 297) {
            var2.d(var1);
        }

    }

    public MessageProcessor(int var1, MessageInputStream messageByteStream) throws XmlPduException {
        this.tagKey = 297;
        this.a(messageByteStream);
    }

    public final void a(MessageInputStream messageByteStream) throws XmlPduException {
        this.apduBlockTypeCode = messageByteStream.readByte();
        ApduBlockType blockType = EnumUtils.fromCode(ApduBlockType.class, this.apduBlockTypeCode);

        if (blockType != null) {
            switch (blockType) {
                case READ_REQUEST:
                    this.c = new ReadRequestProcessor(385, messageByteStream);
                    return;
                case READ_RESPONSE:
                    this.c = new ReadResponseProcessor(386, messageByteStream);
                    return;
            }
        }

        switch (this.apduBlockTypeCode) {
            case 1:
                this.c = new aO_(303, messageByteStream);
                return;
            case 6:
                this.c = new ck(462, messageByteStream);
                return;
            case 8:
                this.c = new aP_(304, messageByteStream);
                return;
            case 13:
                this.c = new cl(463, messageByteStream);
                return;
            case 14:
                this.c = new aa(246, messageByteStream);
                return;
            case 15:
                this.c = new ai(257, messageByteStream);
                return;
            case 22:
                this.c = new ca(448, messageByteStream);
                return;
            case 24:
                this.c = new aM_(301, messageByteStream);
                return;
            case 33:
                this.c = new OctetStringProcessor(486, messageByteStream);
                return;
            case 37:
                this.c = new OctetStringProcessor(488, messageByteStream);
                return;
            case 38:
                this.c = new OctetStringProcessor(493, messageByteStream);
                return;
            case 40:
                this.c = new OctetStringProcessor(487, messageByteStream);
                return;
            case 44:
                this.c = new OctetStringProcessor(489, messageByteStream);
                return;
            case 45:
                this.c = new OctetStringProcessor(494, messageByteStream);
                return;
            case 46:
                this.c = new OctetStringProcessor(482, messageByteStream);
                return;
            case 54:
                this.c = new OctetStringProcessor(492, messageByteStream);
                return;
            case 56:
                this.c = new OctetStringProcessor(485, messageByteStream);
                return;
            case 65:
                this.c = new OctetStringProcessor(471, messageByteStream);
                return;
            case 69:
                this.c = new OctetStringProcessor(473, messageByteStream);
                return;
            case 70:
                this.c = new OctetStringProcessor(478, messageByteStream);
                return;
            case 72:
                this.c = new OctetStringProcessor(472, messageByteStream);
                return;
            case 76:
                this.c = new OctetStringProcessor(474, messageByteStream);
                return;
            case 77:
                this.c = new OctetStringProcessor(479, messageByteStream);
                return;
            case 78:
                this.c = new OctetStringProcessor(466, messageByteStream);
                return;
            case 86:
                this.c = new OctetStringProcessor(477, messageByteStream);
                return;
            case 88:
                this.c = new OctetStringProcessor(470, messageByteStream);
                return;
            case 96:
                this.c = new M_(211, messageByteStream);
                return;
            case 97:
                this.c = new N_(212, messageByteStream);
                return;
            case 98:
                this.c = new bz(391, messageByteStream);
                return;
            case 99:
                this.c = new bB_(392, messageByteStream);
                return;
            case 192:
                this.c = new aB_(284, messageByteStream);
                return;
            case 193:
                this.c = new bH_(417, messageByteStream);
                return;
            case 194:
                this.c = new ao(272, messageByteStream);
                return;
            case 195:
                this.c = new v(192, messageByteStream);
                return;
            case 196:
                this.c = new aF_(288, messageByteStream);
                return;
            case 197:
                this.c = new bN_(423, messageByteStream);
                return;
            case 199:
                this.c = new C_(199, messageByteStream);
                return;
            case 200:
                this.c = new OctetStringProcessor(483, messageByteStream);
                return;
            case 201:
                this.c = new OctetStringProcessor(490, messageByteStream);
                return;
            case 203:
                this.c = new OctetStringProcessor(480, messageByteStream);
                return;
            case 204:
                this.c = new OctetStringProcessor(484, messageByteStream);
                return;
            case 205:
                this.c = new OctetStringProcessor(491, messageByteStream);
                return;
            case 207:
                this.c = new OctetStringProcessor(481, messageByteStream);
                return;
            case 208:
                this.c = new OctetStringProcessor(468, messageByteStream);
                return;
            case 209:
                this.c = new OctetStringProcessor(475, messageByteStream);
                return;
            case 210:
                this.c = new OctetStringProcessor(467, messageByteStream);
                return;
            case 211:
                this.c = new OctetStringProcessor(464, messageByteStream);
                return;
            case 212:
                this.c = new OctetStringProcessor(469, messageByteStream);
                return;
            case 213:
                this.c = new OctetStringProcessor(476, messageByteStream);
                return;
            case 215:
                this.c = new OctetStringProcessor(465, messageByteStream);
                return;
            case 216:
                this.c = new ap(273, messageByteStream);
                return;
            case 217:
                this.c = new h(173, messageByteStream);
                return;
            case 218:
                this.c = new p(182, messageByteStream);
                return;
            case 219:
                this.c = new ay(280, messageByteStream);
                return;
            case 220:
                this.c = new ax(279, messageByteStream);
                return;
            case 221:
                this.c = new aw(278, messageByteStream);
                return;
            case 223:
                this.c = new az(282, messageByteStream);
                return;
            case 224:
                this.c = new av(277, messageByteStream);
                return;
            case 255:
                this.c = new ParameterProcessor(250, messageByteStream);
                return;
            default:
                throw new XmlPduException("_COSEMpdu (from pdu) : illegal tag - " + String.valueOf(this.apduBlockTypeCode));
        }
    }

    public void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        var1.write((byte) this.apduBlockTypeCode);
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
