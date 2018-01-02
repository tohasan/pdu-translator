package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.Misc;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class ReadRequestProcessor extends org.tohasan.pduxml.lib.infra.j {
    ReadRequestProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 385;
        var2.b(385);
        var1 = var2.e(381);
        this.requestItems = new MessageByteProcessor[var1];
        var1 = 0;
        var2.a();

        while (var2.a == 1 && var1 < this.requestItems.length) {
            this.requestItems[var1++] = new cf(297, var2);
        }

        var2.d(385);
    }

    ReadRequestProcessor(int var1, MessageInputStream messageByteStream) throws XmlPduException {
        this.tagKey = 385;
        int numberOfRequestedItems = Misc.decodeVarLengthUnsignedInteger(messageByteStream);
        this.requestItems = new MessageByteProcessor[numberOfRequestedItems];

        for (int i = 0; i < numberOfRequestedItems; i++) {
            this.requestItems[i] = new cf(161, messageByteStream);
        }
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        this.a(var1, 1);
    }
}
