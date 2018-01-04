package org.tohasan.pduxml.lib.processors.serviceerror;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;

public final class ApplicationReferenceProcessor extends MessageByteProcessor {
    private int a;

    public ApplicationReferenceProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 207;
        var2.b(207);
        String var3;

        if ((var3 = var2.f(454).toString()).equals("Other")) {
            this.a = 0;
        } else if (var3.equals("TimeElapsed")) {
            this.a = 1;
        } else if (var3.equals("ApplicationUnreachable")) {
            this.a = 2;
        } else if (var3.equals("ApplicationReferenceInvalid")) {
            this.a = 3;
        } else if (var3.equals("ApplicationContextUnsupported")) {
            this.a = 4;
        } else if (var3.equals("ProviderCommunicationError")) {
            this.a = 5;
        } else {
            if (!var3.equals("DecipheringError")) {
                throw new XmlPduException("_ApplicationReference: illegal element " + var3);
            }

            this.a = 6;
        }

        var2.a();
    }

    public ApplicationReferenceProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 207;
        this.a = messageInputStream.readByte();
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write((byte) this.a);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        StringBuffer var2 = new StringBuffer();
        switch (this.a) {
            case 0:
                var2.append("Other");
                break;
            case 1:
                var2.append("TimeElapsed");
                break;
            case 2:
                var2.append("ApplicationUnreachable");
                break;
            case 3:
                var2.append("ApplicationReferenceInvalid");
                break;
            case 4:
                var2.append("ApplicationContextUnsupported");
                break;
            case 5:
                var2.append("ProviderCommunicationError");
                break;
            case 6:
                var2.append("DecipheringError");
                break;
            default:
                throw new XmlPduException("_ApplicationReference: case range");
        }

        xmlOutputBuilder.appendEmptyTag(this.tagKey, 454, var2);
    }
}
