package org.tohasan.pduxml.lib.a.apdublocktype;

import org.tohasan.pduxml.lib.a.bV_;
import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class WriteResponseProcessor extends org.tohasan.pduxml.lib.infra.j {
    public WriteResponseProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 463;
        var2.b(463);
        var1 = var2.e(381);
        this.requestItems = new MessageByteProcessor[var1];
        var1 = 0;
        var2.a();

        while (var2.a == 1 && var1 < this.requestItems.length) {
            this.requestItems[var1++] = new bV_(297, var2);
        }

        var2.d(463);
    }

    public WriteResponseProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 463;
        var1 = CommonUtils.decodeVarLengthUnsignedInteger(var2);
        this.requestItems = new MessageByteProcessor[var1];

        for (int var3 = 0; var3 < var1; ++var3) {
            this.requestItems[var3] = new bV_(151, var2);
        }

    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        this.a(var1, 1);
    }
}