package org.tohasan.pduxml.lib.processors.serviceerror;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;

public final class VdeStateErrorProcessor extends MessageByteProcessor {
    private int a;

    public VdeStateErrorProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 457;
        var2.b(457);
        String var3;
        if ((var3 = var2.f(454).toString()).equals("Other")) {
            this.a = 0;
        } else if (var3.equals("NoDlmsContext")) {
            this.a = 1;
        } else if (var3.equals("LoadingDataSet")) {
            this.a = 2;
        } else if (var3.equals("StatusNochange")) {
            this.a = 3;
        } else {
            if (!var3.equals("StatusInoperable")) {
                throw new XmlPduException("_VdeStateError: illegal element " + var3);
            }

            this.a = 4;
        }

        var2.a();
    }

    public VdeStateErrorProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 457;
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
                var2.append("NoDlmsContext");
                break;
            case 2:
                var2.append("LoadingDataSet");
                break;
            case 3:
                var2.append("StatusNochange");
                break;
            case 4:
                var2.append("StatusInoperable");
                break;
            default:
                throw new XmlPduException("_VdeStateError: case range");
        }

        xmlOutputBuilder.appendEmptyTag(this.tagKey, 454, var2);
    }
}
