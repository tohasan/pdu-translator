package org.tohasan.pduxml.lib.processors.exceptionresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;

public final class StateErrorProcessor extends MessageByteProcessor {
    private int a;

    public StateErrorProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 430;
        var2.b(430);
        String var3;
        if ((var3 = var2.f(454).toString()).equals("ServiceNotAllowed")) {
            this.a = 1;
        } else {
            if (!var3.equals("ServiceUnknown")) {
                throw new XmlPduException("_ExceptionStateError: illegal element " + var3);
            }

            this.a = 2;
        }

        var2.a();
    }

    public StateErrorProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 430;
        this.a = messageInputStream.readByte();
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write((byte) this.a);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        StringBuffer var2 = new StringBuffer();
        switch (this.a) {
            case 1:
                var2.append("ServiceNotAllowed");
                break;
            case 2:
                var2.append("ServiceUnknown");
                break;
            default:
                throw new XmlPduException("_ExceptionStateError: case range");
        }

        xmlOutputBuilder.appendEmptyTag(this.tagKey, 454, var2);
    }
}
