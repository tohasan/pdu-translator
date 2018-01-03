package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.processors.VariableAccessSpecProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class ReadRequestProcessor extends org.tohasan.pduxml.lib.infra.j {
    public ReadRequestProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 385;
        var2.b(385);
        int var1 = var2.e(381);
        this.requestItems = new MessageByteProcessor[var1];
        var1 = 0;
        var2.a();

        while (var2.a == 1 && var1 < this.requestItems.length) {
            this.requestItems[var1++] = new VariableAccessSpecProcessor(297, var2);
        }

        var2.d(385);
    }

    public ReadRequestProcessor(MessageInputStream messageByteStream) throws XmlPduException {
        this.tagKey = 385;
        int numberOfRequestedItems = CommonUtils.decodeVarLengthUnsignedInteger(messageByteStream);
        this.requestItems = new MessageByteProcessor[numberOfRequestedItems];

        for (int i = 0; i < numberOfRequestedItems; i++) {
            this.requestItems[i] = new VariableAccessSpecProcessor(161, messageByteStream);
        }
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        this.a(var1, 1);
    }
}
