package org.tohasan.pduxml.lib.processors.serviceerror;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;

public final class AccessProcessor extends MessageByteProcessor {
    private int a;

    public AccessProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 171;
        var2.b(171);
        String var3;
        if ((var3 = var2.f(454).toString()).equals("Other")) {
            this.a = 0;
        } else if (var3.equals("ScopeOfAccessViolated")) {
            this.a = 1;
        } else if (var3.equals("ObjectAccessInvalid")) {
            this.a = 2;
        } else if (var3.equals("HardwareFault")) {
            this.a = 3;
        } else {
            if (!var3.equals("ObjectUnavailable")) {
                throw new XmlPduException("_Access: illegal element " + var3);
            }

            this.a = 4;
        }

        var2.a();
    }

    public AccessProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 171;
        this.a = var2.readByte();
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write((byte) this.a);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        StringBuffer var2 = new StringBuffer();
        switch (this.a) {
            case 0:
                var2.append("Other");
                break;
            case 1:
                var2.append("ScopeOfAccessViolated");
                break;
            case 2:
                var2.append("ObjectAccessInvalid");
                break;
            case 3:
                var2.append("HardwareFault");
                break;
            case 4:
                var2.append("ObjectUnavailable");
                break;
            default:
                throw new XmlPduException("_Access: case range");
        }

        var1.appendEmptyTag(this.tagKey, 454, var2);
    }
}
