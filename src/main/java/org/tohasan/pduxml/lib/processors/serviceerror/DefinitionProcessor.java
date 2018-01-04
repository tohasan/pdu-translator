package org.tohasan.pduxml.lib.processors.serviceerror;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;

public final class DefinitionProcessor extends MessageByteProcessor {
    private int a;

    public DefinitionProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 265;
        var2.b(265);
        String var3;
        if ((var3 = var2.f(454).toString()).equals("Other")) {
            this.a = 0;
        } else if (var3.equals("ObjectUndefined")) {
            this.a = 1;
        } else if (var3.equals("ObjectClassInconsistent")) {
            this.a = 2;
        } else {
            if (!var3.equals("ObjectAttributeInconsistent")) {
                throw new XmlPduException("_Definition: illegal element " + var3);
            }

            this.a = 3;
        }

        var2.a();
    }

    public DefinitionProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 265;
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
                var2.append("ObjectUndefined");
                break;
            case 2:
                var2.append("ObjectClassInconsistent");
                break;
            case 3:
                var2.append("ObjectAttributeInconsistent");
                break;
            default:
                throw new XmlPduException("_Definition: case range");
        }

        xmlOutputBuilder.appendEmptyTag(this.tagKey, 454, var2);
    }
}
