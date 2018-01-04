package org.tohasan.pduxml.lib.processors.generalchiphering;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.keyinfo.AgreedKeyProcessor;
import org.tohasan.pduxml.lib.processors.keyinfo.IdentifiedKeyProcessor;
import org.tohasan.pduxml.lib.processors.keyinfo.WrappedKeyProcessor;

public final class KeyInfoProcessor extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public KeyInfoProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 312;
        var2.c(312);

        if (var2.a(296)) {
            this.a = 0;
            this.c = new IdentifiedKeyProcessor(var2);
        } else if (var2.a(459)) {
            this.a = 1;
            this.c = new WrappedKeyProcessor(var2);
        } else {
            if (!var2.a(204)) {
                throw new XmlPduException("_KeyInfo: illegal choice");
            }

            this.a = 2;
            this.c = new AgreedKeyProcessor(var2);
        }

        var2.d(312);
    }

    public KeyInfoProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 312;
        this.a = messageInputStream.readByte();

        switch (this.a) {
            case 0:
                this.c = new IdentifiedKeyProcessor(messageInputStream);
                return;
            case 1:
                this.c = new WrappedKeyProcessor(messageInputStream);
                return;
            case 2:
                this.c = new AgreedKeyProcessor(messageInputStream);
                return;
            default:
                throw new XmlPduException("_KeyInfo (from pdu) : illegal tag - " + String.valueOf(this.a));
        }
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write((byte) this.a);
        this.c.encode(messageOutputStream);
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
