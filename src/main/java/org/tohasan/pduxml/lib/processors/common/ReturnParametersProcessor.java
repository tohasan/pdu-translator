package org.tohasan.pduxml.lib.processors.common;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;

public final class ReturnParametersProcessor extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    public ReturnParametersProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = var1;
        if (var1 != 297) {
            var2.c(var1);
        }

        if (var2.a(250)) {
            this.a = 0;
            this.c = new ParameterProcessor(250, var2);
        } else {
            if (!var2.a(251)) {
                throw new XmlPduException("_GetDataResult: illegal choice");
            }

            this.a = 1;
            this.c = new ResultProcessor(251, var2);
        }

        if (var1 != 297) {
            var2.d(var1);
        }
    }

    public ReturnParametersProcessor(int tagKey, MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = tagKey;
        this.a = messageInputStream.readByte();

        switch (this.a) {
            case 0:
                this.c = new ParameterProcessor(250, messageInputStream);
                return;
            case 1:
                this.c = new ResultProcessor(251, messageInputStream);
                return;
            default:
                throw new XmlPduException("_GetDataResult (from pdu) : illegal tag - " + String.valueOf(this.a));
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
