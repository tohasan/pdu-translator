package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.apdublocktype.*;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.EnumUtils;

public class MessageProcessor extends MessageByteProcessor {
    private int apduBlockTypeCode;
    private MessageByteProcessor processor;

    MessageProcessor() {
    }

    public MessageProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = var1;
        if (var1 != 297) {
            var2.c(var1);
        }

        if (var2.a(303)) {
            this.apduBlockTypeCode = 1;
            this.processor = new InitiateRequestProcessor(303, var2);
        } else if (var2.a(385)) {
            this.apduBlockTypeCode = 5;
            this.processor = new ReadRequestProcessor(385, var2);
        } else if (var2.a(462)) {
            this.apduBlockTypeCode = 6;
            this.processor = new WriteRequestProcessor(462, var2);
        } else if (var2.a(304)) {
            this.apduBlockTypeCode = 8;
            this.processor = new InitiateResponseProcessor(304, var2);
        } else if (var2.a(386)) {
            this.apduBlockTypeCode = 12;
            this.processor = new ReadResponseProcessor(386, var2);
        } else if (var2.a(463)) {
            this.apduBlockTypeCode = 13;
            this.processor = new WriteResponseProcessor(463, var2);
        } else if (var2.a(246)) {
            this.apduBlockTypeCode = 14;
            this.processor = new ConfirmedServiceErrorProcessor(246, var2);
        } else if (var2.a(257)) {
            this.apduBlockTypeCode = 15;
            this.processor = new DataNotificationProcessor(257, var2);
        } else if (var2.a(448)) {
            this.apduBlockTypeCode = 22;
            this.processor = new UnconfirmedWriteRequestProcessor(448, var2);
        } else if (var2.a(301)) {
            this.apduBlockTypeCode = 24;
            this.processor = new InformationReportRequestProcessor(301, var2);
        } else if (var2.a(486)) {
            this.apduBlockTypeCode = 33;
            this.processor = new OctetStringProcessor(486, var2);
        } else if (var2.a(488)) {
            this.apduBlockTypeCode = 37;
            this.processor = new OctetStringProcessor(488, var2);
        } else if (var2.a(493)) {
            this.apduBlockTypeCode = 38;
            this.processor = new OctetStringProcessor(493, var2);
        } else if (var2.a(487)) {
            this.apduBlockTypeCode = 40;
            this.processor = new OctetStringProcessor(487, var2);
        } else if (var2.a(489)) {
            this.apduBlockTypeCode = 44;
            this.processor = new OctetStringProcessor(489, var2);
        } else if (var2.a(494)) {
            this.apduBlockTypeCode = 45;
            this.processor = new OctetStringProcessor(494, var2);
        } else if (var2.a(482)) {
            this.apduBlockTypeCode = 46;
            this.processor = new OctetStringProcessor(482, var2);
        } else if (var2.a(492)) {
            this.apduBlockTypeCode = 54;
            this.processor = new OctetStringProcessor(492, var2);
        } else if (var2.a(485)) {
            this.apduBlockTypeCode = 56;
            this.processor = new OctetStringProcessor(485, var2);
        } else if (var2.a(471)) {
            this.apduBlockTypeCode = 65;
            this.processor = new OctetStringProcessor(471, var2);
        } else if (var2.a(473)) {
            this.apduBlockTypeCode = 69;
            this.processor = new OctetStringProcessor(473, var2);
        } else if (var2.a(478)) {
            this.apduBlockTypeCode = 70;
            this.processor = new OctetStringProcessor(478, var2);
        } else if (var2.a(472)) {
            this.apduBlockTypeCode = 72;
            this.processor = new OctetStringProcessor(472, var2);
        } else if (var2.a(474)) {
            this.apduBlockTypeCode = 76;
            this.processor = new OctetStringProcessor(474, var2);
        } else if (var2.a(479)) {
            this.apduBlockTypeCode = 77;
            this.processor = new OctetStringProcessor(479, var2);
        } else if (var2.a(466)) {
            this.apduBlockTypeCode = 78;
            this.processor = new OctetStringProcessor(466, var2);
        } else if (var2.a(477)) {
            this.apduBlockTypeCode = 86;
            this.processor = new OctetStringProcessor(477, var2);
        } else if (var2.a(470)) {
            this.apduBlockTypeCode = 88;
            this.processor = new OctetStringProcessor(470, var2);
        } else if (var2.a(211)) {
            this.apduBlockTypeCode = 96;
            this.processor = new AssociationRequestProcessor(211, var2);
        } else if (var2.a(212)) {
            this.apduBlockTypeCode = 97;
            this.processor = new AssociationResponseProcessor(212, var2);
        } else if (var2.a(391)) {
            this.apduBlockTypeCode = 98;
            this.processor = new ReleaseRequestProcessor(391, var2);
        } else if (var2.a(392)) {
            this.apduBlockTypeCode = 99;
            this.processor = new ReleaseResponseProcessor(392, var2);
        } else if (var2.a(284)) {
            this.apduBlockTypeCode = 192;
            this.processor = new GetRequestProcessor(284, var2);
        } else if (var2.a(417)) {
            this.apduBlockTypeCode = 193;
            this.processor = new SetRequestProcessor(417, var2);
        } else if (var2.a(272)) {
            this.apduBlockTypeCode = 194;
            this.processor = new EventNotificationRequestProcessor(272, var2);
        } else if (var2.a(192)) {
            this.apduBlockTypeCode = 195;
            this.processor = new ActionRequestProcessor(192, var2);
        } else if (var2.a(288)) {
            this.apduBlockTypeCode = 196;
            this.processor = new GetResponseProcessor(288, var2);
        } else if (var2.a(423)) {
            this.apduBlockTypeCode = 197;
            this.processor = new SetResponseProcessor(423, var2);
        } else if (var2.a(199)) {
            this.apduBlockTypeCode = 199;
            this.processor = new ActionResponseProcessor(199, var2);
        } else if (var2.a(483)) {
            this.apduBlockTypeCode = 200;
            this.processor = new OctetStringProcessor(483, var2);
        } else if (var2.a(490)) {
            this.apduBlockTypeCode = 201;
            this.processor = new OctetStringProcessor(490, var2);
        } else if (var2.a(480)) {
            this.apduBlockTypeCode = 203;
            this.processor = new OctetStringProcessor(480, var2);
        } else if (var2.a(484)) {
            this.apduBlockTypeCode = 204;
            this.processor = new OctetStringProcessor(484, var2);
        } else if (var2.a(491)) {
            this.apduBlockTypeCode = 205;
            this.processor = new OctetStringProcessor(491, var2);
        } else if (var2.a(481)) {
            this.apduBlockTypeCode = 207;
            this.processor = new OctetStringProcessor(481, var2);
        } else if (var2.a(468)) {
            this.apduBlockTypeCode = 208;
            this.processor = new OctetStringProcessor(468, var2);
        } else if (var2.a(475)) {
            this.apduBlockTypeCode = 209;
            this.processor = new OctetStringProcessor(475, var2);
        } else if (var2.a(467)) {
            this.apduBlockTypeCode = 210;
            this.processor = new OctetStringProcessor(467, var2);
        } else if (var2.a(464)) {
            this.apduBlockTypeCode = 211;
            this.processor = new OctetStringProcessor(464, var2);
        } else if (var2.a(469)) {
            this.apduBlockTypeCode = 212;
            this.processor = new OctetStringProcessor(469, var2);
        } else if (var2.a(476)) {
            this.apduBlockTypeCode = 213;
            this.processor = new OctetStringProcessor(476, var2);
        } else if (var2.a(465)) {
            this.apduBlockTypeCode = 215;
            this.processor = new OctetStringProcessor(465, var2);
        } else if (var2.a(273)) {
            this.apduBlockTypeCode = 216;
            this.processor = new ExceptionResponseProcessor(273, var2);
        } else if (var2.a(173)) {
            this.apduBlockTypeCode = 217;
            this.processor = new AccessRequestProcessor(173, var2);
        } else if (var2.a(182)) {
            this.apduBlockTypeCode = 218;
            this.processor = new AccessResponseProcessor(182, var2);
        } else if (var2.a(280)) {
            this.apduBlockTypeCode = 219;
            this.processor = new GeneralGloChipheringProcessor(280, var2);
        } else if (var2.a(279)) {
            this.apduBlockTypeCode = 220;
            this.processor = new GeneralDedChipheringProcessor(279, var2);
        } else if (var2.a(278)) {
            this.apduBlockTypeCode = 221;
            this.processor = new GeneralChilpheringProcessor(278, var2);
        } else if (var2.a(282)) {
            this.apduBlockTypeCode = 223;
            this.processor = new GeneralSigningProcessor(282, var2);
        } else if (var2.a(277)) {
            this.apduBlockTypeCode = 224;
            this.processor = new GeneralBlockTransferProcessor(277, var2);
        } else {
            if (!var2.a(250)) {
                throw new XmlPduException("_COSEMpdu: illegal choice");
            }

            this.apduBlockTypeCode = 255;
            this.processor = new ParameterProcessor(250, var2);
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

        if (blockType == null) {
            throw new XmlPduException(
                    "_COSEMpdu (from pdu) : illegal tag - "
                            + String.valueOf(this.apduBlockTypeCode)
            );
        }

        switch (blockType) {
            case INITIATE_REQUEST:
                this.processor = new InitiateRequestProcessor(303, messageByteStream);
                return;
            case READ_REQUEST:
                this.processor = new ReadRequestProcessor(385, messageByteStream);
                return;
            case WRITE_REQUEST:
                this.processor = new WriteRequestProcessor(462, messageByteStream);
                return;
            case INITIATE_RESPONSE:
                this.processor = new InitiateResponseProcessor(304, messageByteStream);
                return;
            case READ_RESPONSE:
                this.processor = new ReadResponseProcessor(386, messageByteStream);
                return;
            case WRITE_RESPONSE:
                this.processor = new WriteResponseProcessor(463, messageByteStream);
                return;
            case CONFIRMED_SERVICE_ERROR:
                this.processor = new ConfirmedServiceErrorProcessor(246, messageByteStream);
                return;
            case DATA_NOTIFICATION:
                this.processor = new DataNotificationProcessor(257, messageByteStream);
                return;
            case UNCONFIRMED_WRITE_REQUEST:
                this.processor = new UnconfirmedWriteRequestProcessor(448, messageByteStream);
                return;
            case INFORMATION_REPORT_REQUEST:
                this.processor = new InformationReportRequestProcessor(301, messageByteStream);
                return;
            case GLO_INITIATE_REQUEST:
                this.processor = new OctetStringProcessor(486, messageByteStream);
                return;
            case GLO_READ_REQUEST:
                this.processor = new OctetStringProcessor(488, messageByteStream);
                return;
            case GLO_WRITE_REQUEST:
                this.processor = new OctetStringProcessor(493, messageByteStream);
                return;
            case GLO_INITIATE_RESPONSE:
                this.processor = new OctetStringProcessor(487, messageByteStream);
                return;
            case GLO_READ_RESPONSE:
                this.processor = new OctetStringProcessor(489, messageByteStream);
                return;
            case GLO_WRITE_RESPONSE:
                this.processor = new OctetStringProcessor(494, messageByteStream);
                return;
            case GLO_CONFIRMED_SERVICE_ERROR:
                this.processor = new OctetStringProcessor(482, messageByteStream);
                return;
            case GLO_UNCONFIRMED_WRITE_REQUEST:
                this.processor = new OctetStringProcessor(492, messageByteStream);
                return;
            case GLO_INFORMATION_REPORT_REQUEST:
                this.processor = new OctetStringProcessor(485, messageByteStream);
                return;
            case DED_INITIATE_REQUEST:
                this.processor = new OctetStringProcessor(471, messageByteStream);
                return;
            case DED_READ_REQUEST:
                this.processor = new OctetStringProcessor(473, messageByteStream);
                return;
            case DED_WRITE_REQUEST:
                this.processor = new OctetStringProcessor(478, messageByteStream);
                return;
            case DED_INITIATE_RESPONSE:
                this.processor = new OctetStringProcessor(472, messageByteStream);
                return;
            case DED_READ_RESPONSE:
                this.processor = new OctetStringProcessor(474, messageByteStream);
                return;
            case DED_WRITE_RESPONSE:
                this.processor = new OctetStringProcessor(479, messageByteStream);
                return;
            case DED_CONFIRMED_SERVICE_ERROR:
                this.processor = new OctetStringProcessor(466, messageByteStream);
                return;
            case DED_UNCONFIRMED_WRITE_REQUEST:
                this.processor = new OctetStringProcessor(477, messageByteStream);
                return;
            case DED_INFORMATION_REPORT_REQUEST:
                this.processor = new OctetStringProcessor(470, messageByteStream);
                return;
            case ASSOCIATION_REQUEST:
                this.processor = new AssociationRequestProcessor(211, messageByteStream);
                return;
            case ASSOCIATION_RESPONSE:
                this.processor = new AssociationResponseProcessor(212, messageByteStream);
                return;
            case RELEASE_REQUEST:
                this.processor = new ReleaseRequestProcessor(391, messageByteStream);
                return;
            case RELEASE_RESPONSE:
                this.processor = new ReleaseResponseProcessor(392, messageByteStream);
                return;
            case GET_REQUEST:
                this.processor = new GetRequestProcessor(284, messageByteStream);
                return;
            case SET_REQUEST:
                this.processor = new SetRequestProcessor(417, messageByteStream);
                return;
            case EVENT_NOTIFICATION_REQUEST:
                this.processor = new EventNotificationRequestProcessor(272, messageByteStream);
                return;
            case ACTION_REQUEST:
                this.processor = new ActionRequestProcessor(192, messageByteStream);
                return;
            case GET_RESPONSE:
                this.processor = new GetResponseProcessor(288, messageByteStream);
                return;
            case SET_RESPONSE:
                this.processor = new SetResponseProcessor(423, messageByteStream);
                return;
            case ACTION_RESPONSE:
                this.processor = new ActionResponseProcessor(199, messageByteStream);
                return;
            case GLO_GET_REQUEST:
                this.processor = new OctetStringProcessor(483, messageByteStream);
                return;
            case GLO_SET_REQUEST:
                this.processor = new OctetStringProcessor(490, messageByteStream);
                return;
            case GLO_ACTION_REQUEST:
                this.processor = new OctetStringProcessor(480, messageByteStream);
                return;
            case GLO_GET_RESPONSE:
                this.processor = new OctetStringProcessor(484, messageByteStream);
                return;
            case GLO_SET_RESPONSE:
                this.processor = new OctetStringProcessor(491, messageByteStream);
                return;
            case GLO_ACTION_RESPONSE:
                this.processor = new OctetStringProcessor(481, messageByteStream);
                return;
            case DED_GET_REQUEST:
                this.processor = new OctetStringProcessor(468, messageByteStream);
                return;
            case DED_SET_REQUEST:
                this.processor = new OctetStringProcessor(475, messageByteStream);
                return;
            case DED_EVENT_NOTIFICATION_REQUEST:
                this.processor = new OctetStringProcessor(467, messageByteStream);
                return;
            case DED_ACTION_REQUEST:
                this.processor = new OctetStringProcessor(464, messageByteStream);
                return;
            case DED_GET_RESPONSE:
                this.processor = new OctetStringProcessor(469, messageByteStream);
                return;
            case DED_SET_RESPONSE:
                this.processor = new OctetStringProcessor(476, messageByteStream);
                return;
            case DED_ACTION_RESPONSE:
                this.processor = new OctetStringProcessor(465, messageByteStream);
                return;
            case EXCEPTION_RESPONSE:
                this.processor = new ExceptionResponseProcessor(273, messageByteStream);
                return;
            case ACCESS_REQUEST:
                this.processor = new AccessRequestProcessor(173, messageByteStream);
                return;
            case ACCESS_RESPONSE:
                this.processor = new AccessResponseProcessor(182, messageByteStream);
                return;
            case GENERAL_GLO_CHIPHERING:
                this.processor = new GeneralGloChipheringProcessor(280, messageByteStream);
                return;
            case GENERAL_DED_CHIPHERING:
                this.processor = new GeneralDedChipheringProcessor(279, messageByteStream);
                return;
            case GENERAL_CHIPHERING:
                this.processor = new GeneralChilpheringProcessor(278, messageByteStream);
                return;
            case GENERAL_SIGNING:
                this.processor = new GeneralSigningProcessor(282, messageByteStream);
                return;
            case GENERAL_BLOCK_TRANSFER:
                this.processor = new GeneralBlockTransferProcessor(277, messageByteStream);
                return;
            case DATA_BLOCK_RESULT:
                this.processor = new ParameterProcessor(250, messageByteStream);
                return;
            default:
                throw new XmlPduException(
                        "_COSEMpdu (from pdu) : illegal tag - "
                                + String.valueOf(this.apduBlockTypeCode)
                );
        }
    }

    public void a(MessageOutputStream var1) throws XmlPduException {
        var1.write((byte) this.apduBlockTypeCode);
        this.processor.a(var1);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        if (this.tagKey != 297) {
            var1.a(this.tagKey);
            var1.a();
            this.processor.a(var1);
            var1.b();
            var1.b(this.tagKey);
        } else {
            this.processor.a(var1);
        }
    }
}
