package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bB_ extends MessageByteProcessor {
    private bC_ a;
    private S_ c;

    public bB_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 392;
        var2.c(392);
        if (var2.a(388)) {
            this.a = new bC_(388, var2);
        }

        if (var2.a(452)) {
            this.c = new S_(452, var2);
        }

        var2.d(392);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        org.tohasan.pduxml.lib.infra.i var3 = new org.tohasan.pduxml.lib.infra.i();
        if (this.a != null) {
            var3.write(128);
            this.a.a(var3);
        }

        if (this.c != null) {
            var3.write(190);
            var3.write(0);
            int var2 = var3.size() - 1;
            var3.write(4);
            this.c.a(var3);
            var3.a(var2, (byte) (var3.size() - var2 - 1));
        }

        CommonUtils.encodeVarLengthUnsignedInteger(var1, var3.size());
        var1.write(var3.toByteArray(), 0, var3.size());
    }

    public bB_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 392;
        CommonUtils.decodeVarLengthUnsignedInteger(var2);

        while (var2.c() > 0) {
            switch (var1 = var2.readByte()) {
                case 128:
                    this.a = new bC_(388, var2);
                    break;
                case 190:
                    var2.readByte();
                    if ((var1 = var2.readByte()) != 4) {
                        throw new XmlPduException("_ReleaseResponse: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.c = new S_(452, var2);
                    break;
                default:
                    throw new XmlPduException("_ReleaseResponse: Unexpected tag1 ".concat(Integer.toString(var1)));
            }
        }

    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        if (this.a != null) {
            this.a.a(var1);
        }

        if (this.c != null) {
            this.c.a(var1);
        }

        var1.b();
        var1.b(this.tagKey);
    }
}
