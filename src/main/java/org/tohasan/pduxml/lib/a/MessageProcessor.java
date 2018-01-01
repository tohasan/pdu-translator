package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.CustomInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public class MessageProcessor extends MessageByteProcessor {
    private int currentByte;
    private MessageByteProcessor c;

    public MessageProcessor() {
    }

    public MessageProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = var1;
        if (var1 != 297) {
            var2.c(var1);
        }

        if (var2.a(303)) {
            this.currentByte = 1;
            this.c = new aO_(303, var2);
        } else if (var2.a(385)) {
            this.currentByte = 5;
            this.c = new ReadRequestProcessor(385, var2);
        } else if (var2.a(462)) {
            this.currentByte = 6;
            this.c = new ck(462, var2);
        } else if (var2.a(304)) {
            this.currentByte = 8;
            this.c = new aP_(304, var2);
        } else if (var2.a(386)) {
            this.currentByte = 12;
            this.c = new ReadResponseProcessor(386, var2);
        } else if (var2.a(463)) {
            this.currentByte = 13;
            this.c = new cl(463, var2);
        } else if (var2.a(246)) {
            this.currentByte = 14;
            this.c = new aa(246, var2);
        } else if (var2.a(257)) {
            this.currentByte = 15;
            this.c = new ai(257, var2);
        } else if (var2.a(448)) {
            this.currentByte = 22;
            this.c = new ca(448, var2);
        } else if (var2.a(301)) {
            this.currentByte = 24;
            this.c = new aM_(301, var2);
        } else if (var2.a(486)) {
            this.currentByte = 33;
            this.c = new bs(486, var2);
        } else if (var2.a(488)) {
            this.currentByte = 37;
            this.c = new bs(488, var2);
        } else if (var2.a(493)) {
            this.currentByte = 38;
            this.c = new bs(493, var2);
        } else if (var2.a(487)) {
            this.currentByte = 40;
            this.c = new bs(487, var2);
        } else if (var2.a(489)) {
            this.currentByte = 44;
            this.c = new bs(489, var2);
        } else if (var2.a(494)) {
            this.currentByte = 45;
            this.c = new bs(494, var2);
        } else if (var2.a(482)) {
            this.currentByte = 46;
            this.c = new bs(482, var2);
        } else if (var2.a(492)) {
            this.currentByte = 54;
            this.c = new bs(492, var2);
        } else if (var2.a(485)) {
            this.currentByte = 56;
            this.c = new bs(485, var2);
        } else if (var2.a(471)) {
            this.currentByte = 65;
            this.c = new bs(471, var2);
        } else if (var2.a(473)) {
            this.currentByte = 69;
            this.c = new bs(473, var2);
        } else if (var2.a(478)) {
            this.currentByte = 70;
            this.c = new bs(478, var2);
        } else if (var2.a(472)) {
            this.currentByte = 72;
            this.c = new bs(472, var2);
        } else if (var2.a(474)) {
            this.currentByte = 76;
            this.c = new bs(474, var2);
        } else if (var2.a(479)) {
            this.currentByte = 77;
            this.c = new bs(479, var2);
        } else if (var2.a(466)) {
            this.currentByte = 78;
            this.c = new bs(466, var2);
        } else if (var2.a(477)) {
            this.currentByte = 86;
            this.c = new bs(477, var2);
        } else if (var2.a(470)) {
            this.currentByte = 88;
            this.c = new bs(470, var2);
        } else if (var2.a(211)) {
            this.currentByte = 96;
            this.c = new M_(211, var2);
        } else if (var2.a(212)) {
            this.currentByte = 97;
            this.c = new N_(212, var2);
        } else if (var2.a(391)) {
            this.currentByte = 98;
            this.c = new bz(391, var2);
        } else if (var2.a(392)) {
            this.currentByte = 99;
            this.c = new bB_(392, var2);
        } else if (var2.a(284)) {
            this.currentByte = 192;
            this.c = new aB_(284, var2);
        } else if (var2.a(417)) {
            this.currentByte = 193;
            this.c = new bH_(417, var2);
        } else if (var2.a(272)) {
            this.currentByte = 194;
            this.c = new ao(272, var2);
        } else if (var2.a(192)) {
            this.currentByte = 195;
            this.c = new v(192, var2);
        } else if (var2.a(288)) {
            this.currentByte = 196;
            this.c = new aF_(288, var2);
        } else if (var2.a(423)) {
            this.currentByte = 197;
            this.c = new bN_(423, var2);
        } else if (var2.a(199)) {
            this.currentByte = 199;
            this.c = new C_(199, var2);
        } else if (var2.a(483)) {
            this.currentByte = 200;
            this.c = new bs(483, var2);
        } else if (var2.a(490)) {
            this.currentByte = 201;
            this.c = new bs(490, var2);
        } else if (var2.a(480)) {
            this.currentByte = 203;
            this.c = new bs(480, var2);
        } else if (var2.a(484)) {
            this.currentByte = 204;
            this.c = new bs(484, var2);
        } else if (var2.a(491)) {
            this.currentByte = 205;
            this.c = new bs(491, var2);
        } else if (var2.a(481)) {
            this.currentByte = 207;
            this.c = new bs(481, var2);
        } else if (var2.a(468)) {
            this.currentByte = 208;
            this.c = new bs(468, var2);
        } else if (var2.a(475)) {
            this.currentByte = 209;
            this.c = new bs(475, var2);
        } else if (var2.a(467)) {
            this.currentByte = 210;
            this.c = new bs(467, var2);
        } else if (var2.a(464)) {
            this.currentByte = 211;
            this.c = new bs(464, var2);
        } else if (var2.a(469)) {
            this.currentByte = 212;
            this.c = new bs(469, var2);
        } else if (var2.a(476)) {
            this.currentByte = 213;
            this.c = new bs(476, var2);
        } else if (var2.a(465)) {
            this.currentByte = 215;
            this.c = new bs(465, var2);
        } else if (var2.a(273)) {
            this.currentByte = 216;
            this.c = new ap(273, var2);
        } else if (var2.a(173)) {
            this.currentByte = 217;
            this.c = new h(173, var2);
        } else if (var2.a(182)) {
            this.currentByte = 218;
            this.c = new p(182, var2);
        } else if (var2.a(280)) {
            this.currentByte = 219;
            this.c = new ay(280, var2);
        } else if (var2.a(279)) {
            this.currentByte = 220;
            this.c = new ax(279, var2);
        } else if (var2.a(278)) {
            this.currentByte = 221;
            this.c = new aw(278, var2);
        } else if (var2.a(282)) {
            this.currentByte = 223;
            this.c = new az(282, var2);
        } else if (var2.a(277)) {
            this.currentByte = 224;
            this.c = new av(277, var2);
        } else {
            if (!var2.a(250)) {
                throw new XmlPduException("_COSEMpdu: illegal choice");
            }

            this.currentByte = 255;
            this.c = new ac(250, var2);
        }

        if (var1 != 297) {
            var2.d(var1);
        }

    }

    public MessageProcessor(int var1, CustomInputStream messageByteStream) throws XmlPduException {
        this.b = 297;
        this.a(messageByteStream);
    }

    public final void a(CustomInputStream messageByteStream) throws XmlPduException {
        this.currentByte = messageByteStream.readByte();
        switch (this.currentByte) {
            case 1:
                this.c = new aO_(303, messageByteStream);
                return;
            case ApduBlockType.READ_REQUEST:
                this.c = new ReadRequestProcessor(385, messageByteStream);
                return;
            case 6:
                this.c = new ck(462, messageByteStream);
                return;
            case 8:
                this.c = new aP_(304, messageByteStream);
                return;
            case ApduBlockType.READ_RESPONSE:
                this.c = new ReadResponseProcessor(386, messageByteStream);
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
                this.c = new bs(486, messageByteStream);
                return;
            case 37:
                this.c = new bs(488, messageByteStream);
                return;
            case 38:
                this.c = new bs(493, messageByteStream);
                return;
            case 40:
                this.c = new bs(487, messageByteStream);
                return;
            case 44:
                this.c = new bs(489, messageByteStream);
                return;
            case 45:
                this.c = new bs(494, messageByteStream);
                return;
            case 46:
                this.c = new bs(482, messageByteStream);
                return;
            case 54:
                this.c = new bs(492, messageByteStream);
                return;
            case 56:
                this.c = new bs(485, messageByteStream);
                return;
            case 65:
                this.c = new bs(471, messageByteStream);
                return;
            case 69:
                this.c = new bs(473, messageByteStream);
                return;
            case 70:
                this.c = new bs(478, messageByteStream);
                return;
            case 72:
                this.c = new bs(472, messageByteStream);
                return;
            case 76:
                this.c = new bs(474, messageByteStream);
                return;
            case 77:
                this.c = new bs(479, messageByteStream);
                return;
            case 78:
                this.c = new bs(466, messageByteStream);
                return;
            case 86:
                this.c = new bs(477, messageByteStream);
                return;
            case 88:
                this.c = new bs(470, messageByteStream);
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
                this.c = new bs(483, messageByteStream);
                return;
            case 201:
                this.c = new bs(490, messageByteStream);
                return;
            case 203:
                this.c = new bs(480, messageByteStream);
                return;
            case 204:
                this.c = new bs(484, messageByteStream);
                return;
            case 205:
                this.c = new bs(491, messageByteStream);
                return;
            case 207:
                this.c = new bs(481, messageByteStream);
                return;
            case 208:
                this.c = new bs(468, messageByteStream);
                return;
            case 209:
                this.c = new bs(475, messageByteStream);
                return;
            case 210:
                this.c = new bs(467, messageByteStream);
                return;
            case 211:
                this.c = new bs(464, messageByteStream);
                return;
            case 212:
                this.c = new bs(469, messageByteStream);
                return;
            case 213:
                this.c = new bs(476, messageByteStream);
                return;
            case 215:
                this.c = new bs(465, messageByteStream);
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
                this.c = new ac(250, messageByteStream);
                return;
            default:
                throw new XmlPduException("_COSEMpdu (from pdu) : illegal tag - " + String.valueOf(this.currentByte));
        }
    }

    public void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        var1.write((byte) this.currentByte);
        this.c.a(var1);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        if (this.b != 297) {
            var1.a(this.b);
            var1.a();
            this.c.a(var1);
            var1.b();
            var1.b(this.b);
        } else {
            this.c.a(var1);
        }
    }
}
