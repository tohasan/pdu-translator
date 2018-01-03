package org.tohasan.pduxml.lib.processors.confirmedserviceerror;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.serviceerror.*;

public final class ServiceErrorProcessor extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public ServiceErrorProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 411;
        var2.c(411);

        if (var2.a(207)) {
            this.a = 0;
            this.c = new ApplicationReferenceProcessor(var2);
        } else if (var2.a(295)) {
            this.a = 1;
            this.c = new HardwareResourceProcessor(var2);
        } else if (var2.a(457)) {
            this.a = 2;
            this.c = new VdeStateErrorProcessor(var2);
        } else if (var2.a(410)) {
            this.a = 3;
            this.c = new ServiceProcessor(var2);
        } else if (var2.a(265)) {
            this.a = 4;
            this.c = new DefinitionProcessor(var2);
        } else if (var2.a(171)) {
            this.a = 5;
            this.c = new AccessProcessor(var2);
        } else if (var2.a(302)) {
            this.a = 6;
            this.c = new InitiateProcessor(var2);
        } else if (var2.a(318)) {
            this.a = 7;
            this.c = new LoadDataSetProcessor(var2);
        } else if (var2.a(437)) {
            this.a = 9;
            this.c = new TaskProcessor(var2);
        } else {
            if (!var2.a(362)) {
                throw new XmlPduException("_ServiceError: illegal choice");
            }

            this.a = 10;
            this.c = new OtherErrorProcessor(var2);
        }

        var2.d(411);
    }

    public ServiceErrorProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 411;
        this.a = messageInputStream.readByte();

        switch (this.a) {
            case 0:
                this.c = new ApplicationReferenceProcessor(messageInputStream);
                return;
            case 1:
                this.c = new HardwareResourceProcessor(messageInputStream);
                return;
            case 2:
                this.c = new VdeStateErrorProcessor(messageInputStream);
                return;
            case 3:
                this.c = new ServiceProcessor(messageInputStream);
                return;
            case 4:
                this.c = new DefinitionProcessor(messageInputStream);
                return;
            case 5:
                this.c = new AccessProcessor(messageInputStream);
                return;
            case 6:
                this.c = new InitiateProcessor(messageInputStream);
                return;
            case 7:
                this.c = new LoadDataSetProcessor(messageInputStream);
                return;
            case 8:
            default:
                throw new XmlPduException("_ServiceError (from pdu) : illegal tag - " + String.valueOf(this.a));
            case 9:
                this.c = new TaskProcessor(messageInputStream);
                return;
            case 10:
                this.c = new OtherErrorProcessor(messageInputStream);
        }
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write((byte) this.a);
        this.c.a(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        if (this.tagKey != 297) {
            var1.appendTag(this.tagKey);
            var1.appendWithNewLine();
            this.c.a(var1);
            var1.b();
            var1.b(this.tagKey);
        } else {
            this.c.a(var1);
        }
    }
}
