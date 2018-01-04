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

    public MessageProcessor(int tagKey, XmlParser xmlParser) throws XmlPduException {
        this.tagKey = tagKey;

        if (tagKey != 297) {
            xmlParser.c(tagKey);
        }

        if (xmlParser.a(303)) {
            this.apduBlockTypeCode = 1;
            this.processor = new InitiateRequestProcessor(xmlParser);
        } else if (xmlParser.a(385)) {
            this.apduBlockTypeCode = 5;
            this.processor = new ReadRequestProcessor(xmlParser);
        } else if (xmlParser.a(462)) {
            this.apduBlockTypeCode = 6;
            this.processor = new WriteRequestProcessor(xmlParser);
        } else if (xmlParser.a(304)) {
            this.apduBlockTypeCode = 8;
            this.processor = new InitiateResponseProcessor(xmlParser);
        } else if (xmlParser.a(386)) {
            this.apduBlockTypeCode = 12;
            this.processor = new ReadResponseProcessor(xmlParser);
        } else if (xmlParser.a(463)) {
            this.apduBlockTypeCode = 13;
            this.processor = new WriteResponseProcessor(xmlParser);
        } else if (xmlParser.a(246)) {
            this.apduBlockTypeCode = 14;
            this.processor = new ConfirmedServiceErrorProcessor(xmlParser);
        } else if (xmlParser.a(257)) {
            this.apduBlockTypeCode = 15;
            this.processor = new DataNotificationProcessor(xmlParser);
        } else if (xmlParser.a(448)) {
            this.apduBlockTypeCode = 22;
            this.processor = new UnconfirmedWriteRequestProcessor(xmlParser);
        } else if (xmlParser.a(301)) {
            this.apduBlockTypeCode = 24;
            this.processor = new InformationReportRequestProcessor(xmlParser);
        } else if (xmlParser.a(486)) {
            this.apduBlockTypeCode = 33;
            this.processor = new OctetStringProcessor(486, xmlParser);
        } else if (xmlParser.a(488)) {
            this.apduBlockTypeCode = 37;
            this.processor = new OctetStringProcessor(488, xmlParser);
        } else if (xmlParser.a(493)) {
            this.apduBlockTypeCode = 38;
            this.processor = new OctetStringProcessor(493, xmlParser);
        } else if (xmlParser.a(487)) {
            this.apduBlockTypeCode = 40;
            this.processor = new OctetStringProcessor(487, xmlParser);
        } else if (xmlParser.a(489)) {
            this.apduBlockTypeCode = 44;
            this.processor = new OctetStringProcessor(489, xmlParser);
        } else if (xmlParser.a(494)) {
            this.apduBlockTypeCode = 45;
            this.processor = new OctetStringProcessor(494, xmlParser);
        } else if (xmlParser.a(482)) {
            this.apduBlockTypeCode = 46;
            this.processor = new OctetStringProcessor(482, xmlParser);
        } else if (xmlParser.a(492)) {
            this.apduBlockTypeCode = 54;
            this.processor = new OctetStringProcessor(492, xmlParser);
        } else if (xmlParser.a(485)) {
            this.apduBlockTypeCode = 56;
            this.processor = new OctetStringProcessor(485, xmlParser);
        } else if (xmlParser.a(471)) {
            this.apduBlockTypeCode = 65;
            this.processor = new OctetStringProcessor(471, xmlParser);
        } else if (xmlParser.a(473)) {
            this.apduBlockTypeCode = 69;
            this.processor = new OctetStringProcessor(473, xmlParser);
        } else if (xmlParser.a(478)) {
            this.apduBlockTypeCode = 70;
            this.processor = new OctetStringProcessor(478, xmlParser);
        } else if (xmlParser.a(472)) {
            this.apduBlockTypeCode = 72;
            this.processor = new OctetStringProcessor(472, xmlParser);
        } else if (xmlParser.a(474)) {
            this.apduBlockTypeCode = 76;
            this.processor = new OctetStringProcessor(474, xmlParser);
        } else if (xmlParser.a(479)) {
            this.apduBlockTypeCode = 77;
            this.processor = new OctetStringProcessor(479, xmlParser);
        } else if (xmlParser.a(466)) {
            this.apduBlockTypeCode = 78;
            this.processor = new OctetStringProcessor(466, xmlParser);
        } else if (xmlParser.a(477)) {
            this.apduBlockTypeCode = 86;
            this.processor = new OctetStringProcessor(477, xmlParser);
        } else if (xmlParser.a(470)) {
            this.apduBlockTypeCode = 88;
            this.processor = new OctetStringProcessor(470, xmlParser);
        } else if (xmlParser.a(211)) {
            this.apduBlockTypeCode = 96;
            this.processor = new AssociationRequestProcessor(xmlParser);
        } else if (xmlParser.a(212)) {
            this.apduBlockTypeCode = 97;
            this.processor = new AssociationResponseProcessor(xmlParser);
        } else if (xmlParser.a(391)) {
            this.apduBlockTypeCode = 98;
            this.processor = new ReleaseRequestProcessor(xmlParser);
        } else if (xmlParser.a(392)) {
            this.apduBlockTypeCode = 99;
            this.processor = new ReleaseResponseProcessor(xmlParser);
        } else if (xmlParser.a(284)) {
            this.apduBlockTypeCode = 192;
            this.processor = new GetRequestProcessor(xmlParser);
        } else if (xmlParser.a(417)) {
            this.apduBlockTypeCode = 193;
            this.processor = new SetRequestProcessor(xmlParser);
        } else if (xmlParser.a(272)) {
            this.apduBlockTypeCode = 194;
            this.processor = new EventNotificationRequestProcessor(xmlParser);
        } else if (xmlParser.a(192)) {
            this.apduBlockTypeCode = 195;
            this.processor = new ActionRequestProcessor(xmlParser);
        } else if (xmlParser.a(288)) {
            this.apduBlockTypeCode = 196;
            this.processor = new GetResponseProcessor(xmlParser);
        } else if (xmlParser.a(423)) {
            this.apduBlockTypeCode = 197;
            this.processor = new SetResponseProcessor(xmlParser);
        } else if (xmlParser.a(199)) {
            this.apduBlockTypeCode = 199;
            this.processor = new ActionResponseProcessor(xmlParser);
        } else if (xmlParser.a(483)) {
            this.apduBlockTypeCode = 200;
            this.processor = new OctetStringProcessor(483, xmlParser);
        } else if (xmlParser.a(490)) {
            this.apduBlockTypeCode = 201;
            this.processor = new OctetStringProcessor(490, xmlParser);
        } else if (xmlParser.a(480)) {
            this.apduBlockTypeCode = 203;
            this.processor = new OctetStringProcessor(480, xmlParser);
        } else if (xmlParser.a(484)) {
            this.apduBlockTypeCode = 204;
            this.processor = new OctetStringProcessor(484, xmlParser);
        } else if (xmlParser.a(491)) {
            this.apduBlockTypeCode = 205;
            this.processor = new OctetStringProcessor(491, xmlParser);
        } else if (xmlParser.a(481)) {
            this.apduBlockTypeCode = 207;
            this.processor = new OctetStringProcessor(481, xmlParser);
        } else if (xmlParser.a(468)) {
            this.apduBlockTypeCode = 208;
            this.processor = new OctetStringProcessor(468, xmlParser);
        } else if (xmlParser.a(475)) {
            this.apduBlockTypeCode = 209;
            this.processor = new OctetStringProcessor(475, xmlParser);
        } else if (xmlParser.a(467)) {
            this.apduBlockTypeCode = 210;
            this.processor = new OctetStringProcessor(467, xmlParser);
        } else if (xmlParser.a(464)) {
            this.apduBlockTypeCode = 211;
            this.processor = new OctetStringProcessor(464, xmlParser);
        } else if (xmlParser.a(469)) {
            this.apduBlockTypeCode = 212;
            this.processor = new OctetStringProcessor(469, xmlParser);
        } else if (xmlParser.a(476)) {
            this.apduBlockTypeCode = 213;
            this.processor = new OctetStringProcessor(476, xmlParser);
        } else if (xmlParser.a(465)) {
            this.apduBlockTypeCode = 215;
            this.processor = new OctetStringProcessor(465, xmlParser);
        } else if (xmlParser.a(273)) {
            this.apduBlockTypeCode = 216;
            this.processor = new ExceptionResponseProcessor(xmlParser);
        } else if (xmlParser.a(173)) {
            this.apduBlockTypeCode = 217;
            this.processor = new AccessRequestProcessor(xmlParser);
        } else if (xmlParser.a(182)) {
            this.apduBlockTypeCode = 218;
            this.processor = new AccessResponseProcessor(xmlParser);
        } else if (xmlParser.a(280)) {
            this.apduBlockTypeCode = 219;
            this.processor = new GeneralGloChipheringProcessor(xmlParser);
        } else if (xmlParser.a(279)) {
            this.apduBlockTypeCode = 220;
            this.processor = new GeneralDedChipheringProcessor(xmlParser);
        } else if (xmlParser.a(278)) {
            this.apduBlockTypeCode = 221;
            this.processor = new GeneralChipheringProcessor(xmlParser);
        } else if (xmlParser.a(282)) {
            this.apduBlockTypeCode = 223;
            this.processor = new GeneralSigningProcessor(xmlParser);
        } else if (xmlParser.a(277)) {
            this.apduBlockTypeCode = 224;
            this.processor = new GeneralBlockTransferProcessor(xmlParser);
        } else {
            if (!xmlParser.a(250)) {
                throw new XmlPduException("_COSEMpdu: illegal choice");
            }

            this.apduBlockTypeCode = 255;
            this.processor = new ParameterProcessor(250, xmlParser);
        }

        if (tagKey != 297) {
            xmlParser.d(tagKey);
        }
    }

    public MessageProcessor(MessageInputStream messageByteStream) throws XmlPduException {
        this.tagKey = 297;
        this.decode(messageByteStream);
    }

    protected final void decode(MessageInputStream messageInputStream) throws XmlPduException {
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

    public void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write((byte) this.apduBlockTypeCode);
        this.processor.encode(messageOutputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        if (this.tagKey != 297) {
            xmlOutputBuilder.appendTag(this.tagKey);
            xmlOutputBuilder.addIndent();
            this.processor.printTo(xmlOutputBuilder);
            xmlOutputBuilder.removeIndent();
            xmlOutputBuilder.appendClosingTag(this.tagKey);
        } else {
            this.processor.printTo(xmlOutputBuilder);
        }
    }
}
