package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.CustomInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class al extends MessageByteProcessor {
    private int a;

    public al(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 265;
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

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        var1.write((byte) this.a);
    }

    public al(int var1, CustomInputStream var2) throws XmlPduException {
        this.b = 265;
        this.a = var2.readByte();
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
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

        var1.a(this.b, 454, var2, 1);
    }
}
