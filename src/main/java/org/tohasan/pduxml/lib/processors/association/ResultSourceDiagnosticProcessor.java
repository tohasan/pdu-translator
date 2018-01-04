package org.tohasan.pduxml.lib.processors.association;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.resultsourcediagnostic.AcseServiceProviderProcessor;
import org.tohasan.pduxml.lib.processors.resultsourcediagnostic.AcseServiceUserProcessor;

public final class ResultSourceDiagnosticProcessor extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public ResultSourceDiagnosticProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 404;
        var2.c(404);
        if (var2.a(170)) {
            this.a = 161;
            this.c = new AcseServiceUserProcessor(var2);
        } else {
            if (!var2.a(169)) {
                throw new XmlPduException("_ResultSourceDiagnostic : illegal choice");
            }

            this.a = 162;
            this.c = new AcseServiceProviderProcessor(var2);
        }

        var2.d(404);
    }

    public ResultSourceDiagnosticProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 404;
        messageInputStream.readByte();
        this.a = messageInputStream.readByte();

        switch (this.a) {
            case 161:
                messageInputStream.readByte();
                messageInputStream.readByte(2);
                this.c = new AcseServiceUserProcessor(messageInputStream);
                return;
            case 162:
                messageInputStream.readByte();
                messageInputStream.readByte(2);
                this.c = new AcseServiceProviderProcessor(messageInputStream);
                return;
            default:
                throw new XmlPduException("_ResultSourceDiagnostic: Unexpected tag1 -".concat(Integer.toString(this.a)));
        }
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write(0);
        int var2 = messageOutputStream.size() - 1;
        messageOutputStream.write(this.a);
        int var3;

        switch (this.a) {
            case 161:
                messageOutputStream.write(0);
                var3 = messageOutputStream.size() - 1;
                messageOutputStream.write(2);
                this.c.encode(messageOutputStream);
                messageOutputStream.a(var3, (byte) (messageOutputStream.size() - var3 - 1));
                break;
            case 162:
                messageOutputStream.write(0);
                var3 = messageOutputStream.size() - 1;
                messageOutputStream.write(2);
                this.c.encode(messageOutputStream);
                messageOutputStream.a(var3, (byte) (messageOutputStream.size() - var3 - 1));
                break;
            default:
                throw new XmlPduException("_ResultSourceDiagnostic : illegal Tag ".concat(Integer.toString(this.a)));
        }

        messageOutputStream.a(var2, (byte) (messageOutputStream.size() - var2 - 1));
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        if (this.tagKey != 297) {
            xmlOutputBuilder.appendTag(this.tagKey);
            xmlOutputBuilder.addIndent();
            this.c.printTo(xmlOutputBuilder);
            xmlOutputBuilder.removeIndent();
            xmlOutputBuilder.appendClosingTag(this.tagKey);
        } else {
            this.c.printTo(xmlOutputBuilder);
        }
    }
}
