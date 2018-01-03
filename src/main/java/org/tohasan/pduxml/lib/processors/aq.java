package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class aq extends MessageByteProcessor {
    private int a;

    public aq(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 411;
        var2.b(411);
        String var3;
        if ((var3 = var2.f(454).toString()).equals("OperationNotPossible")) {
            this.a = 1;
        } else if (var3.equals("ServiceNotSupported")) {
            this.a = 2;
        } else {
            if (!var3.equals("OtherReason")) {
                throw new XmlPduException("_ExceptionServiceError: illegal element " + var3);
            }

            this.a = 3;
        }

        var2.a();
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write((byte) this.a);
    }

    public aq(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 411;
        this.a = var2.readByte();
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        StringBuffer var2 = new StringBuffer();
        switch (this.a) {
            case 1:
                var2.append("OperationNotPossible");
                break;
            case 2:
                var2.append("ServiceNotSupported");
                break;
            case 3:
                var2.append("OtherReason");
                break;
            default:
                throw new XmlPduException("_ExceptionServiceError: case range");
        }

        var1.a(this.tagKey, 454, var2, 1);
    }
}
