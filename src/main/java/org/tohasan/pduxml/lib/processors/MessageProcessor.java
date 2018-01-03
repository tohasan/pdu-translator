package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.apdublocktype.*;
import org.tohasan.pduxml.lib.processors.common.ParameterProcessor;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;
import org.tohasan.pduxml.lib.utils.EnumUtils;

public class MessageProcessor extends MessageByteProcessor {
    private int apduBlockTypeCode;
    private MessageByteProcessor processor;

    public MessageProcessor(int tagKey, XmlParser var2) throws XmlPduException {
        this.tagKey = tagKey;

        if (tagKey != 297) {
            var2.c(tagKey);
        }

        if (var2.a(303)) {
            this.apduBlockTypeCode = 1;
            this.processor = new InitiateRequestProcessor(var2);
        } else if (var2.a(385)) {
            this.apduBlockTypeCode = 5;
            this.processor = new ReadRequestProcessor(var2);
        } else if (var2.a(462)) {
            this.apduBlockTypeCode = 6;
            this.processor = new WriteRequestProcessor(var2);
        } else if (var2.a(304)) {
            this.apduBlockTypeCode = 8;
            this.processor = new InitiateResponseProcessor(var2);
        } else if (var2.a(386)) {
            this.apduBlockTypeCode = 12;
            this.processor = new ReadResponseProcessor(var2);
        } else if (var2.a(463)) {
            this.apduBlockTypeCode = 13;
            this.processor = new WriteResponseProcessor(var2);
        } else if (var2.a(246)) {
            this.apduBlockTypeCode = 14;
            this.processor = new ConfirmedServiceErrorProcessor(var2);
        } else if (var2.a(257)) {
            this.apduBlockTypeCode = 15;
            this.processor = new DataNotificationProcessor(var2);
        } else if (var2.a(448)) {
            this.apduBlockTypeCode = 22;
            this.processor = new UnconfirmedWriteRequestProcessor(var2);
        } else if (var2.a(301)) {
            this.apduBlockTypeCode = 24;
            this.processor = new InformationReportRequestProcessor(var2);
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
            this.processor = new AssociationRequestProcessor(var2);
        } else if (var2.a(212)) {
            this.apduBlockTypeCode = 97;
            this.processor = new AssociationResponseProcessor(var2);
        } else if (var2.a(391)) {
            this.apduBlockTypeCode = 98;
            this.processor = new ReleaseRequestProcessor(var2);
        } else if (var2.a(392)) {
            this.apduBlockTypeCode = 99;
            this.processor = new ReleaseResponseProcessor(var2);
        } else if (var2.a(284)) {
            this.apduBlockTypeCode = 192;
            this.processor = new GetRequestProcessor(var2);
        } else if (var2.a(417)) {
            this.apduBlockTypeCode = 193;
            this.processor = new SetRequestProcessor(var2);
        } else if (var2.a(272)) {
            this.apduBlockTypeCode = 194;
            this.processor = new EventNotificationRequestProcessor(var2);
        } else if (var2.a(192)) {
            this.apduBlockTypeCode = 195;
            this.processor = new ActionRequestProcessor(var2);
        } else if (var2.a(288)) {
            this.apduBlockTypeCode = 196;
            this.processor = new GetResponseProcessor(var2);
        } else if (var2.a(423)) {
            this.apduBlockTypeCode = 197;
            this.processor = new SetResponseProcessor(var2);
        } else if (var2.a(199)) {
            this.apduBlockTypeCode = 199;
            this.processor = new ActionResponseProcessor(var2);
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
            this.processor = new ExceptionResponseProcessor(var2);
        } else if (var2.a(173)) {
            this.apduBlockTypeCode = 217;
            this.processor = new AccessRequestProcessor(var2);
        } else if (var2.a(182)) {
            this.apduBlockTypeCode = 218;
            this.processor = new AccessResponseProcessor(var2);
        } else if (var2.a(280)) {
            this.apduBlockTypeCode = 219;
            this.processor = new GeneralGloChipheringProcessor(var2);
        } else if (var2.a(279)) {
            this.apduBlockTypeCode = 220;
            this.processor = new GeneralDedChipheringProcessor(var2);
        } else if (var2.a(278)) {
            this.apduBlockTypeCode = 221;
            this.processor = new GeneralChipheringProcessor(var2);
        } else if (var2.a(282)) {
            this.apduBlockTypeCode = 223;
            this.processor = new GeneralSigningProcessor(var2);
        } else if (var2.a(277)) {
            this.apduBlockTypeCode = 224;
            this.processor = new GeneralBlockTransferProcessor(var2);
        } else {
            if (!var2.a(250)) {
                throw new XmlPduException("_COSEMpdu: illegal choice");
            }

            this.apduBlockTypeCode = 255;
            this.processor = new ParameterProcessor(250, var2);
        }

        if (tagKey != 297) {
            var2.d(tagKey);
        }

    }

    public MessageProcessor(MessageInputStream messageByteStream) throws XmlPduException {
        this.tagKey = 297;
        this.a(messageByteStream);
    }

    public final void a(MessageInputStream messageInputStream) throws XmlPduException {
        this.apduBlockTypeCode = messageInputStream.readByte();
        ApduBlockType blockType = EnumUtils.fromCode(ApduBlockType.class, this.apduBlockTypeCode);

        if (blockType == null) {
            throw new XmlPduException(
                    "_COSEMpdu (from pdu) : illegal tag - "
                            + String.valueOf(this.apduBlockTypeCode)
            );
        }

        switch (blockType) {
            case INITIATE_REQUEST:
                this.processor = new InitiateRequestProcessor(messageInputStream);
                return;
            case READ_REQUEST:
                this.processor = new ReadRequestProcessor(messageInputStream);
                return;
            case WRITE_REQUEST:
                this.processor = new WriteRequestProcessor(messageInputStream);
                return;
            case INITIATE_RESPONSE:
                this.processor = new InitiateResponseProcessor(messageInputStream);
                return;
            case READ_RESPONSE:
                this.processor = new ReadResponseProcessor(messageInputStream);
                return;
            case WRITE_RESPONSE:
                this.processor = new WriteResponseProcessor(messageInputStream);
                return;
            case CONFIRMED_SERVICE_ERROR:
                this.processor = new ConfirmedServiceErrorProcessor(messageInputStream);
                return;
            case DATA_NOTIFICATION:
                this.processor = new DataNotificationProcessor(messageInputStream);
                return;
            case UNCONFIRMED_WRITE_REQUEST:
                this.processor = new UnconfirmedWriteRequestProcessor(messageInputStream);
                return;
            case INFORMATION_REPORT_REQUEST:
                this.processor = new InformationReportRequestProcessor(messageInputStream);
                return;
            case GLO_INITIATE_REQUEST:
                this.processor = new OctetStringProcessor(486, messageInputStream);
                return;
            case GLO_READ_REQUEST:
                this.processor = new OctetStringProcessor(488, messageInputStream);
                return;
            case GLO_WRITE_REQUEST:
                this.processor = new OctetStringProcessor(493, messageInputStream);
                return;
            case GLO_INITIATE_RESPONSE:
                this.processor = new OctetStringProcessor(487, messageInputStream);
                return;
            case GLO_READ_RESPONSE:
                this.processor = new OctetStringProcessor(489, messageInputStream);
                return;
            case GLO_WRITE_RESPONSE:
                this.processor = new OctetStringProcessor(494, messageInputStream);
                return;
            case GLO_CONFIRMED_SERVICE_ERROR:
                this.processor = new OctetStringProcessor(482, messageInputStream);
                return;
            case GLO_UNCONFIRMED_WRITE_REQUEST:
                this.processor = new OctetStringProcessor(492, messageInputStream);
                return;
            case GLO_INFORMATION_REPORT_REQUEST:
                this.processor = new OctetStringProcessor(485, messageInputStream);
                return;
            case DED_INITIATE_REQUEST:
                this.processor = new OctetStringProcessor(471, messageInputStream);
                return;
            case DED_READ_REQUEST:
                this.processor = new OctetStringProcessor(473, messageInputStream);
                return;
            case DED_WRITE_REQUEST:
                this.processor = new OctetStringProcessor(478, messageInputStream);
                return;
            case DED_INITIATE_RESPONSE:
                this.processor = new OctetStringProcessor(472, messageInputStream);
                return;
            case DED_READ_RESPONSE:
                this.processor = new OctetStringProcessor(474, messageInputStream);
                return;
            case DED_WRITE_RESPONSE:
                this.processor = new OctetStringProcessor(479, messageInputStream);
                return;
            case DED_CONFIRMED_SERVICE_ERROR:
                this.processor = new OctetStringProcessor(466, messageInputStream);
                return;
            case DED_UNCONFIRMED_WRITE_REQUEST:
                this.processor = new OctetStringProcessor(477, messageInputStream);
                return;
            case DED_INFORMATION_REPORT_REQUEST:
                this.processor = new OctetStringProcessor(470, messageInputStream);
                return;
            case ASSOCIATION_REQUEST:
                this.processor = new AssociationRequestProcessor(messageInputStream);
                return;
            case ASSOCIATION_RESPONSE:
                this.processor = new AssociationResponseProcessor(messageInputStream);
                return;
            case RELEASE_REQUEST:
                this.processor = new ReleaseRequestProcessor(messageInputStream);
                return;
            case RELEASE_RESPONSE:
                this.processor = new ReleaseResponseProcessor(messageInputStream);
                return;
            case GET_REQUEST:
                this.processor = new GetRequestProcessor(messageInputStream);
                return;
            case SET_REQUEST:
                this.processor = new SetRequestProcessor(messageInputStream);
                return;
            case EVENT_NOTIFICATION_REQUEST:
                this.processor = new EventNotificationRequestProcessor(messageInputStream);
                return;
            case ACTION_REQUEST:
                this.processor = new ActionRequestProcessor(messageInputStream);
                return;
            case GET_RESPONSE:
                this.processor = new GetResponseProcessor(messageInputStream);
                return;
            case SET_RESPONSE:
                this.processor = new SetResponseProcessor(messageInputStream);
                return;
            case ACTION_RESPONSE:
                this.processor = new ActionResponseProcessor(messageInputStream);
                return;
            case GLO_GET_REQUEST:
                this.processor = new OctetStringProcessor(483, messageInputStream);
                return;
            case GLO_SET_REQUEST:
                this.processor = new OctetStringProcessor(490, messageInputStream);
                return;
            case GLO_ACTION_REQUEST:
                this.processor = new OctetStringProcessor(480, messageInputStream);
                return;
            case GLO_GET_RESPONSE:
                this.processor = new OctetStringProcessor(484, messageInputStream);
                return;
            case GLO_SET_RESPONSE:
                this.processor = new OctetStringProcessor(491, messageInputStream);
                return;
            case GLO_ACTION_RESPONSE:
                this.processor = new OctetStringProcessor(481, messageInputStream);
                return;
            case DED_GET_REQUEST:
                this.processor = new OctetStringProcessor(468, messageInputStream);
                return;
            case DED_SET_REQUEST:
                this.processor = new OctetStringProcessor(475, messageInputStream);
                return;
            case DED_EVENT_NOTIFICATION_REQUEST:
                this.processor = new OctetStringProcessor(467, messageInputStream);
                return;
            case DED_ACTION_REQUEST:
                this.processor = new OctetStringProcessor(464, messageInputStream);
                return;
            case DED_GET_RESPONSE:
                this.processor = new OctetStringProcessor(469, messageInputStream);
                return;
            case DED_SET_RESPONSE:
                this.processor = new OctetStringProcessor(476, messageInputStream);
                return;
            case DED_ACTION_RESPONSE:
                this.processor = new OctetStringProcessor(465, messageInputStream);
                return;
            case EXCEPTION_RESPONSE:
                this.processor = new ExceptionResponseProcessor(messageInputStream);
                return;
            case ACCESS_REQUEST:
                this.processor = new AccessRequestProcessor(messageInputStream);
                return;
            case ACCESS_RESPONSE:
                this.processor = new AccessResponseProcessor(messageInputStream);
                return;
            case GENERAL_GLO_CHIPHERING:
                this.processor = new GeneralGloChipheringProcessor(messageInputStream);
                return;
            case GENERAL_DED_CHIPHERING:
                this.processor = new GeneralDedChipheringProcessor(messageInputStream);
                return;
            case GENERAL_CHIPHERING:
                this.processor = new GeneralChipheringProcessor(messageInputStream);
                return;
            case GENERAL_SIGNING:
                this.processor = new GeneralSigningProcessor(messageInputStream);
                return;
            case GENERAL_BLOCK_TRANSFER:
                this.processor = new GeneralBlockTransferProcessor(messageInputStream);
                return;
            case DATA_BLOCK_RESULT:
                this.processor = new ParameterProcessor(250, messageInputStream);
                return;
            default:
                throw new XmlPduException(
                        "_COSEMpdu (from pdu) : illegal tag - "
                                + String.valueOf(this.apduBlockTypeCode)
                );
        }
    }

    public void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write((byte) this.apduBlockTypeCode);
        this.processor.a(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        if (this.tagKey != 297) {
            var1.appendTag(this.tagKey);
            var1.appendWithNewLine();
            this.processor.a(var1);
            var1.b();
            var1.b(this.tagKey);
        } else {
            this.processor.a(var1);
        }
    }
}
