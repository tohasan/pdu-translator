package org.tohasan.pduxml.lib.processors.releaseresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;

public final class ReasonProcessor extends MessageByteProcessor {
    private int a;

    public ReasonProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 388;
        var2.b(388);
        String var3;

        if ((var3 = var2.f(454).toString()).equals("Normal")) {
            this.a = 0;
        } else if (var3.equals("NotFinished")) {
            this.a = 1;
        } else {
            if (!var3.equals("UserDefined")) {
                throw new XmlPduException("_ReleaseResponseReason: illegal element " + var3);
            }

            this.a = 30;
        }

        var2.a();
    }

    public ReasonProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 388;
        messageInputStream.readByte(1);
        this.a = messageInputStream.readByte();
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write(1);
        messageOutputStream.write((byte) this.a);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        StringBuffer var2 = new StringBuffer();
        switch (this.a) {
            case 0:
                var2.append("Normal");
                break;
            case 1:
                var2.append("NotFinished");
                break;
            case 30:
                var2.append("UserDefined");
                break;
            default:
                throw new XmlPduException("_ReleaseResponseReason: case range");
        }

        xmlOutputBuilder.appendEmptyTag(this.tagKey, 454, var2);
    }
}
