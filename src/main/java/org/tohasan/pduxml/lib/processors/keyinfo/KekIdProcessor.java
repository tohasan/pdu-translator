package org.tohasan.pduxml.lib.processors.keyinfo;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;

public final class KekIdProcessor extends MessageByteProcessor {
    private int a;

    KekIdProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 309;
        var2.b(309);
        String var3;
        if ((var3 = var2.f(454).toString()).equals("MasterKey")) {
            this.a = 0;
            var2.a();
        } else {
            throw new XmlPduException("_KekId: illegal element " + var3);
        }
    }

    KekIdProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 309;
        this.a = messageInputStream.readByte();
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write((byte) this.a);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        StringBuffer var2 = new StringBuffer();

        switch (this.a) {
            case 0:
                var2.append("MasterKey");
                xmlOutputBuilder.appendEmptyTag(this.tagKey, 454, var2);
                return;
            default:
                throw new XmlPduException("_KekId: case range");
        }
    }
}
