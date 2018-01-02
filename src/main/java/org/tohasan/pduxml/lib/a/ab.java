package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.XmlPduException;

import java.util.BitSet;

public final class ab extends org.tohasan.pduxml.lib.infra.a {
    private int c;

    public ab(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = var1;
        this.c = 247;
        BitSet var5 = new BitSet(24);
        int var3 = var2.b();
        var2.a();

        int var4;
        while (var2.a == 1) {
            if ((var4 = var2.b()) == this.c) {
                String var6;
                byte var7;
                if ((var6 = var2.f(337).toString()).equals("Reserved0")) {
                    var7 = 0;
                } else if (var6.equals("GeneralProtection")) {
                    var7 = 1;
                } else if (var6.equals("GeneralBlockTransfer")) {
                    var7 = 2;
                } else if (var6.equals("Read")) {
                    var7 = 3;
                } else if (var6.equals("Write")) {
                    var7 = 4;
                } else if (var6.equals("UnconfirmedWrite")) {
                    var7 = 5;
                } else if (var6.equals("Reserved6")) {
                    var7 = 6;
                } else if (var6.equals("Reserved7")) {
                    var7 = 7;
                } else if (var6.equals("Attribute0SupportedWithSet")) {
                    var7 = 8;
                } else if (var6.equals("PriorityMgmtSupported")) {
                    var7 = 9;
                } else if (var6.equals("Attribute0SupportedWithGet")) {
                    var7 = 10;
                } else if (var6.equals("Attribute0Supported")) {
                    var7 = 10;
                } else if (var6.equals("BlockTransferWithGetOrRead")) {
                    var7 = 11;
                } else if (var6.equals("BlockTransferWithGet")) {
                    var7 = 11;
                } else if (var6.equals("BlockTransferWithSetOrWrite")) {
                    var7 = 12;
                } else if (var6.equals("BlockTransferWithSet")) {
                    var7 = 12;
                } else if (var6.equals("BlockTransferWithAction")) {
                    var7 = 13;
                } else if (var6.equals("MultipleReferences")) {
                    var7 = 14;
                } else if (var6.equals("InformationReport")) {
                    var7 = 15;
                } else if (var6.equals("DataNotification")) {
                    var7 = 16;
                } else if (var6.equals("Access")) {
                    var7 = 17;
                } else if (var6.equals("ParametrizedAccess")) {
                    var7 = 18;
                } else if (var6.equals("Get")) {
                    var7 = 19;
                } else if (var6.equals("Set")) {
                    var7 = 20;
                } else if (var6.equals("SelectiveAccess")) {
                    var7 = 21;
                } else if (var6.equals("EventNotification")) {
                    var7 = 22;
                } else {
                    if (!var6.equals("Action")) {
                        throw new XmlPduException("_Conformance:nameToVal, no such name ".concat(var6));
                    }

                    var7 = 23;
                }

                var5.set(var7);
                var2.a();
            } else {
                org.tohasan.pduxml.lib.infra.m.g(var4);
            }
        }

        var2.d(var3);
        StringBuffer var8 = new StringBuffer();

        for (var4 = 0; var4 < 24; ++var4) {
            if (var5.get(var4)) {
                var8.append("1");
            } else {
                var8.append("0");
            }
        }

        this.a = var8.toString();
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        var1.write(95);
        var1.write(31);
        super.a(var1);
    }

    public ab(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = var1;
        this.c = 247;
        var2.readByte(95);
        if (var2.b() == 31) {
            var2.readByte();
        }

        this.a((MessageInputStream) var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        // $FF: Couldn't be decompiled
    }
}
