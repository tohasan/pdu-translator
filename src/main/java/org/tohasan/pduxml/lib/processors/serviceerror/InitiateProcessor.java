package org.tohasan.pduxml.lib.processors.serviceerror;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;

public final class InitiateProcessor extends MessageByteProcessor {
    private int a;

    public InitiateProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 302;
        var2.b(302);
        String var3;
        if ((var3 = var2.f(454).toString()).equals("Other")) {
            this.a = 0;
        } else if (var3.equals("DlmsVersionTooLow")) {
            this.a = 1;
        } else if (var3.equals("IncompatibleConformance")) {
            this.a = 2;
        } else if (var3.equals("PduSizeTooShort")) {
            this.a = 3;
        } else {
            if (!var3.equals("RefusedByTheVDEHandler")) {
                throw new XmlPduException("_Initiate: illegal element " + var3);
            }

            this.a = 4;
        }

        var2.a();
    }

    public InitiateProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 302;
        this.a = var2.readByte();
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
                var2.append("DlmsVersionTooLow");
                break;
            case 2:
                var2.append("IncompatibleConformance");
                break;
            case 3:
                var2.append("PduSizeTooShort");
                break;
            case 4:
                var2.append("RefusedByTheVDEHandler");
                break;
            default:
                throw new XmlPduException("_Initiate: case range");
        }

        xmlOutputBuilder.appendEmptyTag(this.tagKey, 454, var2);
    }
}
