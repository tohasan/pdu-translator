package org.tohasan.pduxml.lib.processors.serviceerror;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;

public final class TaskProcessor extends MessageByteProcessor {
    private int a;

    public TaskProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 437;
        var2.b(437);
        String var3;
        if ((var3 = var2.f(454).toString()).equals("Other")) {
            this.a = 0;
        } else if (var3.equals("NoRemoteControl")) {
            this.a = 1;
        } else if (var3.equals("TiStopped")) {
            this.a = 2;
        } else if (var3.equals("TiRunning")) {
            this.a = 3;
        } else {
            if (!var3.equals("TiUnusable")) {
                throw new XmlPduException("_Task: illegal element " + var3);
            }

            this.a = 4;
        }

        var2.a();
    }

    public TaskProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 437;
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
                var2.append("NoRemoteControl");
                break;
            case 2:
                var2.append("TiStopped");
                break;
            case 3:
                var2.append("TiRunning");
                break;
            case 4:
                var2.append("TiUnusable");
                break;
            default:
                throw new XmlPduException("_Task: case range");
        }

        xmlOutputBuilder.appendEmptyTag(this.tagKey, 454, var2);
    }
}
