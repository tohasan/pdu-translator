package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class bg extends org.tohasan.pduxml.lib.infra.j {
    public bg(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 316;
        var2.b(316);
        var1 = var2.e(381);
        this.requestItems = new MessageByteProcessor[var1];
        var1 = 0;
        var2.a();

        while (var2.a == 1 && var1 < this.requestItems.length) {
            this.requestItems[var1++] = new bT_(149, var2);
        }

        var2.d(316);
    }

    public bg(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 316;
        var1 = CommonUtils.decodeVarLengthUnsignedInteger(var2);
        this.requestItems = new MessageByteProcessor[var1];

        for (int var3 = 0; var3 < var1; ++var3) {
            this.requestItems[var3] = new bT_(149, var2);
        }

    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        this.a(var1, 0);
    }
}
