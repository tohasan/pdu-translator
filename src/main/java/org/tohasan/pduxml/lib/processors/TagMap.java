package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;

import java.util.Enumeration;
import java.util.Hashtable;

public final class TagMap {
    private static Hashtable<String, Integer> tags = new Hashtable<String, Integer>() {
        {
            this.put("_ACSERequirement", 1);
            this.put("_ACSEServiceProvider", 2);
            this.put("_ACSEServiceUser", 3);
            this.put("_AEQualifier", 4);
            this.put("_APTitle", 5);
            this.put("_Access", 6);
            this.put("_AccessRequest", 7);
            this.put("_AccessRequestAction", 8);
            this.put("_AccessRequestBody", 9);
            this.put("_AccessRequestGet", 10);
            this.put("_AccessRequestGetWithSelection", 11);
            this.put("_AccessRequestSet", 12);
            this.put("_AccessRequestSetWithSelection", 13);
            this.put("_AccessRequestSpecification", 14);
            this.put("_AccessResponse", 15);
            this.put("_AccessResponseAction", 16);
            this.put("_AccessResponseBody", 17);
            this.put("_AccessResponseGet", 18);
            this.put("_AccessResponseSet", 19);
            this.put("_AccessResponseSpecification", 20);
            this.put("_ActionRequest", 21);
            this.put("_ActionRequestForNextPBlock", 22);
            this.put("_ActionRequestNormal", 23);
            this.put("_ActionRequestWithFirstPBlock", 24);
            this.put("_ActionRequestWithList", 25);
            this.put("_ActionRequestWithListAndWithFirstPBlock", 26);
            this.put("_ActionRequestWithPBlock", 27);
            this.put("_ActionResponse", 28);
            this.put("_ActionResponseForNextPBlock", 29);
            this.put("_ActionResponseNormal", 30);
            this.put("_ActionResponseWithList", 31);
            this.put("_ActionResponseWithPBlock", 32);
            this.put("_ActionResult", 33);
            this.put("_AgreedKey", 34);
            this.put("_ApplicationContextName", 35);
            this.put("_ApplicationReference", 36);
            this.put("_Array", 37);
            this.put("_AssociationRequest", 38);
            this.put("_AssociationResponse", 39);
            this.put("_AssociationResult", 40);
            this.put("_AttributeDescriptor", 41);
            this.put("_AttributeDescriptorWithSelection", 42);
            this.put("_AuthenticationValue", 43);
            this.put("_BERCOSEMpdu", 44);
            this.put("_Bcd", 45);
            this.put("_BitString", 46);
            this.put("_BlockControl", 47);
            this.put("_BlockNumberAccess", 48);
            this.put("_Boolean", 49);
            this.put("_COSEMpdu", 50);
            this.put("_ClassId", 51);
            this.put("_ConfirmedServiceError", 52);
            this.put("_Conformance", 53);
            this.put("_Data", 54);
            this.put("_DataAccessResult", 55);
            this.put("_DataBlockGResult", 56);
            this.put("_DataBlockResult", 57);
            this.put("_DataBlock_G", 58);
            this.put("_DataBlock_SA", 59);
            this.put("_DataNotification", 60);
            this.put("_Date", 61);
            this.put("_DateTime", 62);
            this.put("_Definition", 63);
            this.put("_DontCare", 64);
            this.put("_Enum", 65);
            this.put("_EventNotificationRequest", 66);
            this.put("_ExceptionResponse", 67);
            this.put("_ExceptionServiceError", 68);
            this.put("_ExceptionStateError", 69);
            this.put("_Float32", 70);
            this.put("_Float64", 71);
            this.put("_FloatingPoint", 72);
            this.put("_GeneralBlockTransfer", 73);
            this.put("_GeneralCiphering", 74);
            this.put("_GeneralDedCiphering", 75);
            this.put("_GeneralGloCiphering", 76);
            this.put("_GeneralSigning", 77);
            this.put("_GetDataResult", 78);
            this.put("_GetRequest", 79);
            this.put("_GetRequestForNextDatablock", 80);
            this.put("_GetRequestNormal", 81);
            this.put("_GetRequestWithList", 82);
            this.put("_GetResponse", 83);
            this.put("_GetResponseNormal", 84);
            this.put("_GetResponseWithDataBlock", 85);
            this.put("_GetResponseWithList", 86);
            this.put("_HardwareResource", 87);
            this.put("_IdentifiedKey", 88);
            this.put("_ImplementationData", 89);
            this.put("_InformationReportRequest", 90);
            this.put("_Initiate", 91);
            this.put("_InitiateRequest", 92);
            this.put("_InitiateResponse", 93);
            this.put("_Integer16", 94);
            this.put("_Integer32", 95);
            this.put("_Integer64", 96);
            this.put("_Integer8", 97);
            this.put("_InvocationId", 98);
            this.put("_InvokeIdAndPriority", 99);
            this.put("_KekId", 100);
            this.put("_KeyId", 101);
            this.put("_KeyInfo", 102);
            this.put("_ListOfAccessRequestSpecification", 103);
            this.put("_ListOfAccessResponseSpecification", 104);
            this.put("_ListOfAttributeDescriptorWithSelection", 105);
            this.put("_ListOfData", 106);
            this.put("_ListOfDataAccessResult", 107);
            this.put("_ListOfGetDataResult", 108);
            this.put("_ListOfMethodDescriptor", 109);
            this.put("_ListOfSingleActionResponse", 110);
            this.put("_ListOfVariableAccessSpecifications", 111);
            this.put("_LoadDataSet", 112);
            this.put("_LongInvokeIdAndPriority", 113);
            this.put("_MechanismName", 114);
            this.put("_MethodDescriptor", 115);
            this.put("_NotificationBody", 116);
            this.put("_NullData", 117);
            this.put("_ObjectAttributeId", 118);
            this.put("_ObjectInstanceId", 119);
            this.put("_ObjectMethodId", 120);
            this.put("_ObjectName", 121);
            this.put("_OctetString", 122);
            this.put("_OtherError", 123);
            this.put("_ParametrisedAccess", 124);
            this.put("_ProtocolVersion", 125);
            this.put("_ReadDataBlockAccess", 126);
            this.put("_ReadRequest", 127);
            this.put("_ReadResponse", 128);
            this.put("_ReleaseRequest", 129);
            this.put("_ReleaseRequestReason", 130);
            this.put("_ReleaseResponse", 131);
            this.put("_ReleaseResponseReason", 132);
            this.put("_ResultSourceDiagnostic", 133);
            this.put("_SelectiveAccessDescriptor", 134);
            this.put("_Service", 135);
            this.put("_ServiceError", 136);
            this.put("_SetRequest", 137);
            this.put("_SetRequestNormal", 138);
            this.put("_SetRequestWithDataBlock", 139);
            this.put("_SetRequestWithFirstDataBlock", 140);
            this.put("_SetRequestWithList", 141);
            this.put("_SetRequestWithListAndWithFirstDatablock", 142);
            this.put("_SetResponse", 143);
            this.put("_SetResponseForDataBlock", 144);
            this.put("_SetResponseForLastDataBlock", 145);
            this.put("_SetResponseForLastDataBlockWithList", 146);
            this.put("_SetResponseNormal", 147);
            this.put("_SetResponseWithList", 148);
            this.put("_SingleActionResponse", 149);
            this.put("_SingleReadResponse", 150);
            this.put("_SingleWriteResponse", 151);
            this.put("_Structure", 152);
            this.put("_Task", 153);
            this.put("_Time", 154);
            this.put("_UTF8String", 155);
            this.put("_UnconfirmedWriteRequest", 156);
            this.put("_Unsigned16", 157);
            this.put("_Unsigned32", 158);
            this.put("_Unsigned64", 159);
            this.put("_Unsigned8", 160);
            this.put("_VariableAccessSpecification", 161);
            this.put("_VdeStateError", 162);
            this.put("_VisibleString", 163);
            this.put("_WrappedKey", 164);
            this.put("_WriteDataBlockAccess", 165);
            this.put("_WriteRequest", 166);
            this.put("_WriteResponse", 167);
            this.put("_zDummy", 168);
            this.put("ACSEServiceProvider", 169);
            this.put("ACSEServiceUser", 170);
            this.put("Access", 171);
            this.put("AccessParameters", 172);
            this.put("AccessRequest", 173);
            this.put("AccessRequestAction", 174);
            this.put("AccessRequestBody", 175);
            this.put("AccessRequestGet", 176);
            this.put("AccessRequestGetWithSelection", 177);
            this.put("AccessRequestListOfData", 178);
            this.put("AccessRequestSet", 179);
            this.put("AccessRequestSetWithSelection", 180);
            this.put("AccessRequestSpecification", 181);
            this.put("AccessResponse", 182);
            this.put("AccessResponseAction", 183);
            this.put("AccessResponseBody", 184);
            this.put("AccessResponseGet", 185);
            this.put("AccessResponseListOfData", 186);
            this.put("AccessResponseSet", 187);
            this.put("AccessResponseSpecification", 188);
            this.put("AccessSelection", 189);
            this.put("AccessSelector", 190);
            this.put("Action", 191);
            this.put("ActionRequest", 192);
            this.put("ActionRequestForNextPBlock", 193);
            this.put("ActionRequestNormal", 194);
            this.put("ActionRequestWithFirstPBlock", 195);
            this.put("ActionRequestWithList", 196);
            this.put("ActionRequestWithListAndFirstPBlock", 197);
            this.put("ActionRequestWithPBlock", 198);
            this.put("ActionResponse", 199);
            this.put("ActionResponseForNextPBlock", 200);
            this.put("ActionResponseNormal", 201);
            this.put("ActionResponseWithList", 202);
            this.put("ActionResponseWithPBlock", 203);
            this.put("AgreedKey", 204);
            this.put("ApplicationContextName", 205);
            this.put("ApplicationContextUnsupported", 206);
            this.put("ApplicationReference", 207);
            this.put("ApplicationReferenceInvalid", 208);
            this.put("ApplicationUnreachable", 209);
            this.put("Array", 210);
            this.put("AssociationRequest", 211);
            this.put("AssociationResponse", 212);
            this.put("AssociationResult", 213);
            this.put("Attribute0Supported", 214);
            this.put("Attribute0SupportedWithGet", 215);
            this.put("Attribute0SupportedWithSet", 216);
            this.put("AttributeDescriptor", 217);
            this.put("AttributeDescriptorList", 218);
            this.put("AttributeId", 219);
            this.put("AttributeValue", 220);
            this.put("Bcd", 221);
            this.put("BitString", 222);
            this.put("BlockControl", 223);
            this.put("BlockData", 224);
            this.put("BlockNumber", 225);
            this.put("BlockNumberAccess", 226);
            this.put("BlockNumberAck", 227);
            this.put("BlockTransferWithAction", 228);
            this.put("BlockTransferWithGet", 229);
            this.put("BlockTransferWithGetOrRead", 230);
            this.put("BlockTransferWithSet", 231);
            this.put("BlockTransferWithSetOrWrite", 232);
            this.put("Boolean", 233);
            this.put("CalledAEInvocationId", 234);
            this.put("CalledAEQualifier", 235);
            this.put("CalledAPInvocationId", 236);
            this.put("CalledAPTitle", 237);
            this.put("CallingAEInvocationId", 238);
            this.put("CallingAEQualifier", 239);
            this.put("CallingAPInvocationId", 240);
            this.put("CallingAPTitle", 241);
            this.put("CallingAuthenticationValue", 242);
            this.put("CipheredContent", 243);
            this.put("CipheredService", 244);
            this.put("ClassId", 245);
            this.put("ConfirmedServiceError", 246);
            this.put("ConformanceBit", 247);
            this.put("Content", 248);
            this.put("CurrentTime", 249);
            this.put("Data", 250);
            this.put("DataAccessError", 251);
            this.put("DataAccessResult", 252);
            this.put("DataBlock", 253);
            this.put("DataBlockNumberInvalid", 254);
            this.put("DataBlockResult", 255);
            this.put("DataBlockUnavailable", 256);
            this.put("DataNotification", 257);
            this.put("DataSetNotReady", 258);
            this.put("DataValue", 259);
            this.put("DatasetSizeTooLarge", 260);
            this.put("Date", 261);
            this.put("DateTime", 262);
            this.put("DecipheringError", 263);
            this.put("DedicatedKey", 264);
            this.put("Definition", 265);
            this.put("DlmsVersionTooLow", 266);
            this.put("DontCare", 267);
            this.put("DoubleLong", 268);
            this.put("DoubleLongUnsigned", 269);
            this.put("Enum", 270);
            this.put("EventNotification", 271);
            this.put("EventNotificationRequest", 272);
            this.put("ExceptionResponse", 273);
            this.put("Float32", 274);
            this.put("Float64", 275);
            this.put("FloatingPoint", 276);
            this.put("GeneralBlockTransfer", 277);
            this.put("GeneralCiphering", 278);
            this.put("GeneralDedCiphering", 279);
            this.put("GeneralGloCiphering", 280);
            this.put("GeneralProtection", 281);
            this.put("GeneralSigning", 282);
            this.put("Get", 283);
            this.put("GetRequest", 284);
            this.put("GetRequestForNextDataBlock", 285);
            this.put("GetRequestNormal", 286);
            this.put("GetRequestWithList", 287);
            this.put("GetResponse", 288);
            this.put("GetResponseNormal", 289);
            this.put("GetResponseWithDataBlock", 290);
            this.put("GetResponseWithList", 291);
            this.put("GlobalBroadcastEncryptionKey", 292);
            this.put("GlobalUnicastEncryptionKey", 293);
            this.put("HardwareFault", 294);
            this.put("HardwareResource", 295);
            this.put("IdentifiedKey", 296);
            this.put("Ignore", 297);
            this.put("ImplementationInformation", 298);
            this.put("IncompatibleConformance", 299);
            this.put("InformationReport", 300);
            this.put("InformationReportRequest", 301);
            this.put("Initiate", 302);
            this.put("InitiateRequest", 303);
            this.put("InitiateResponse", 304);
            this.put("InstanceId", 305);
            this.put("Integer", 306);
            this.put("InterpretationFailure", 307);
            this.put("InvokeIdAndPriority", 308);
            this.put("KekId", 309);
            this.put("KeyCipheredData", 310);
            this.put("KeyId", 311);
            this.put("KeyInfo", 312);
            this.put("KeyParameters", 313);
            this.put("LastBlock", 314);
            this.put("ListOfData", 315);
            this.put("ListOfSingleActionResponse", 316);
            this.put("ListOfVariableAccessSpecification", 317);
            this.put("LoadDataSet", 318);
            this.put("LoadingDataSet", 319);
            this.put("Long", 320);
            this.put("Long64", 321);
            this.put("Long64Unsigned", 322);
            this.put("LongActionAborted", 323);
            this.put("LongGetOrReadAborted", 324);
            this.put("LongInvokeIdAndPriority", 325);
            this.put("LongSetOrWriteAborted", 326);
            this.put("LongUnsigned", 327);
            this.put("MassStorageUnavailable", 328);
            this.put("MasterKey", 329);
            this.put("MechanismName", 330);
            this.put("MemoryUnavailable", 331);
            this.put("MethodDescriptor", 332);
            this.put("MethodDescriptorList", 333);
            this.put("MethodId", 334);
            this.put("MethodInvocationParameters", 335);
            this.put("MultipleReferences", 336);
            this.put("Name", 337);
            this.put("NegotiatedConformance", 338);
            this.put("NegotiatedDlmsVersionNumber", 339);
            this.put("NegotiatedMaxPduSize", 340);
            this.put("NegotiatedQualityOfService", 341);
            this.put("NoDlmsContext", 342);
            this.put("NoLongActionInProgress", 343);
            this.put("NoLongGetOrReadInProgress", 344);
            this.put("NoLongSetOrWriteInProgress", 345);
            this.put("NoRemoteControl", 346);
            this.put("Normal", 347);
            this.put("NotAwaitedSegment", 348);
            this.put("NotFinished", 349);
            this.put("NotLoadable", 350);
            this.put("NotificationBody", 351);
            this.put("NullData", 352);
            this.put("ObjectAccessInvalid", 353);
            this.put("ObjectAttributeInconsistent", 354);
            this.put("ObjectClassInconsistent", 355);
            this.put("ObjectUnavailable", 356);
            this.put("ObjectUndefined", 357);
            this.put("OctetString", 358);
            this.put("OperationNotPossible", 359);
            this.put("OriginatorSystemTitle", 360);
            this.put("Other", 361);
            this.put("OtherError", 362);
            this.put("OtherInformation", 363);
            this.put("OtherReason", 364);
            this.put("OtherResourceUnavailable", 365);
            this.put("PBlock", 366);
            this.put("Parameter", 367);
            this.put("ParameterisedAccess", 368);
            this.put("ParametrizedAccess", 369);
            this.put("PduSize", 370);
            this.put("PduSizeTooShort", 371);
            this.put("PrimitiveOutOfSequence", 372);
            this.put("PriorityMgmtSupported", 373);
            this.put("ProcessorResourceUnavailable", 374);
            this.put("ProposedConformance", 375);
            this.put("ProposedDlmsVersionNumber", 376);
            this.put("ProposedMaxPduSize", 377);
            this.put("ProposedQualityOfService", 378);
            this.put("ProtocolVersion", 379);
            this.put("ProviderCommunicationError", 380);
            this.put("Qty", 381);
            this.put("RawData", 382);
            this.put("Read", 383);
            this.put("ReadDataBlockAccess", 384);
            this.put("ReadRequest", 385);
            this.put("ReadResponse", 386);
            this.put("ReadWriteDenied", 387);
            this.put("Reason", 388);
            this.put("RecipientSystemTitle", 389);
            this.put("RefusedByTheVDEHandler", 390);
            this.put("ReleaseRequest", 391);
            this.put("ReleaseResponse", 392);
            this.put("Reserved0", 393);
            this.put("Reserved6", 394);
            this.put("Reserved7", 395);
            this.put("ResponderACSERequirement", 396);
            this.put("RespondingAEInvocationId", 397);
            this.put("RespondingAEQualifier", 398);
            this.put("RespondingAPInvocationId", 399);
            this.put("RespondingAPTitle", 400);
            this.put("RespondingAuthenticationValue", 401);
            this.put("ResponseAllowed", 402);
            this.put("Result", 403);
            this.put("ResultSourceDiagnostic", 404);
            this.put("ReturnParameters", 405);
            this.put("ScopeOfAccessViolated", 406);
            this.put("SelectiveAccess", 407);
            this.put("Selector", 408);
            this.put("SenderACSERequirements", 409);
            this.put("Service", 410);
            this.put("ServiceError", 411);
            this.put("ServiceNotAllowed", 412);
            this.put("ServiceNotSupported", 413);
            this.put("ServiceUnknown", 414);
            this.put("ServiceUnsupported", 415);
            this.put("Set", 416);
            this.put("SetRequest", 417);
            this.put("SetRequestNormal", 418);
            this.put("SetRequestWithDataBlock", 419);
            this.put("SetRequestWithFirstDataBlock", 420);
            this.put("SetRequestWithList", 421);
            this.put("SetRequestWithListAndWithFirstDatablock", 422);
            this.put("SetResponse", 423);
            this.put("SetResponseForDataBlock", 424);
            this.put("SetResponseForLastDataBlock", 425);
            this.put("SetResponseForLastDataBlockWithList", 426);
            this.put("SetResponseNormal", 427);
            this.put("SetResponseWithList", 428);
            this.put("Signature", 429);
            this.put("StateError", 430);
            this.put("StatusInoperable", 431);
            this.put("StatusNochange", 432);
            this.put("StorageFailure", 433);
            this.put("Structure", 434);
            this.put("Success", 435);
            this.put("SystemTitle", 436);
            this.put("Task", 437);
            this.put("TemporaryFailure", 438);
            this.put("TiRunning", 439);
            this.put("TiStopped", 440);
            this.put("TiUnusable", 441);
            this.put("Time", 442);
            this.put("TimeElapsed", 443);
            this.put("TransactionId", 444);
            this.put("TypeUnmatched", 445);
            this.put("UTF8String", 446);
            this.put("UnconfirmedWrite", 447);
            this.put("UnconfirmedWriteRequest", 448);
            this.put("Unsigned", 449);
            this.put("Urgent", 450);
            this.put("UserDefined", 451);
            this.put("UserInformation", 452);
            this.put("VaaName", 453);
            this.put("Value", 454);
            this.put("ValueList", 455);
            this.put("VariableName", 456);
            this.put("VdeStateError", 457);
            this.put("VisibleString", 458);
            this.put("WrappedKey", 459);
            this.put("Write", 460);
            this.put("WriteDataBlockAccess", 461);
            this.put("WriteRequest", 462);
            this.put("WriteResponse", 463);
            this.put("ded_ActionRequest", 464);
            this.put("ded_ActionResponse", 465);
            this.put("ded_ConfirmedServiceError", 466);
            this.put("ded_EventNotificationRequest", 467);
            this.put("ded_GetRequest", 468);
            this.put("ded_GetResponse", 469);
            this.put("ded_InformationReportRequest", 470);
            this.put("ded_InitiateRequest", 471);
            this.put("ded_InitiateResponse", 472);
            this.put("ded_ReadRequest", 473);
            this.put("ded_ReadResponse", 474);
            this.put("ded_SetRequest", 475);
            this.put("ded_SetResponse", 476);
            this.put("ded_UnconfirmedWriteRequest", 477);
            this.put("ded_WriteRequest", 478);
            this.put("ded_WriteResponse", 479);
            this.put("glo_ActionRequest", 480);
            this.put("glo_ActionResponse", 481);
            this.put("glo_ConfirmedServiceError", 482);
            this.put("glo_GetRequest", 483);
            this.put("glo_GetResponse", 484);
            this.put("glo_InformationReportRequest", 485);
            this.put("glo_InitiateRequest", 486);
            this.put("glo_InitiateResponse", 487);
            this.put("glo_ReadRequest", 488);
            this.put("glo_ReadResponse", 489);
            this.put("glo_SetRequest", 490);
            this.put("glo_SetResponse", 491);
            this.put("glo_UnconfirmedWriteRequest", 492);
            this.put("glo_WriteRequest", 493);
            this.put("glo_WriteResponse", 494);
        }
    };

    public static String getKeyByValue(int specifiedTagValue) throws XmlPduException {
        String result = null;
        Enumeration keys = tags.keys();

        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            int currentValue = tags.get(key);
            if (specifiedTagValue == currentValue) {
                result = key;
                break;
            }
        }

        if (result == null) {
            throw new XmlPduException("xmlIdToStr: unexpected xmlId .concat(Interger.toString(xmlId))");
        } else {
            return result;
        }
    }

    public static int get(String tagKey) throws XmlPduException {
        try {
            return tags.get(tagKey);
        } catch (NullPointerException var2) {
            throw new XmlPduException("Unknown identifier - ".concat(tagKey));
        }
    }
}
