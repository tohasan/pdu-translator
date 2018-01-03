package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class aJ_ extends MessageByteProcessor {
    private int a;

    public aJ_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 295;
        var2.b(295);
        String var3;
        if ((var3 = var2.f(454).toString()).equals("Other")) {
            this.a = 0;
        } else if (var3.equals("MemoryUnavailable")) {
            this.a = 1;
        } else if (var3.equals("ProcessorResourceUnavailable")) {
            this.a = 2;
        } else if (var3.equals("MassStorageUnavailable")) {
            this.a = 3;
        } else {
            if (!var3.equals("OtherResourceUnavailable")) {
                throw new XmlPduException("_HardwareResource: illegal element " + var3);
            }

            this.a = 4;
        }

        var2.a();
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write((byte) this.a);
    }

    public aJ_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 295;
        this.a = var2.readByte();
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        StringBuffer var2 = new StringBuffer();
        switch (this.a) {
            case 0:
                var2.append("Other");
                break;
            case 1:
                var2.append("MemoryUnavailable");
                break;
            case 2:
                var2.append("ProcessorResourceUnavailable");
                break;
            case 3:
                var2.append("MassStorageUnavailable");
                break;
            case 4:
                var2.append("OtherResourceUnavailable");
                break;
            default:
                throw new XmlPduException("_HardwareResource: case range");
        }

        var1.appendEmptyTag(this.tagKey, 454, var2);
    }
}
