package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.CustomInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.Misc;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class ReadResponseProcessor extends org.tohasan.pduxml.lib.infra.j {
    public ReadResponseProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.b = 386;
        var2.b(386);
        var1 = var2.e(381);
        this.requestItems = new MessageByteProcessor[var1];
        var1 = 0;
        var2.a();

        while (var2.a == 1 && var1 < this.requestItems.length) {
            this.requestItems[var1++] = new bU_(297, var2);
        }

        var2.d(386);
    }

    public ReadResponseProcessor(int var1, CustomInputStream var2) throws XmlPduException {
        this.b = 386;
        var1 = Misc.decodeVarLengthUnsignedInteger(var2);
        this.requestItems = new MessageByteProcessor[var1];

        for (int var3 = 0; var3 < var1; ++var3) {
            this.requestItems[var3] = new bU_(150, var2);
        }

    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        this.a(var1, 1);
    }
}