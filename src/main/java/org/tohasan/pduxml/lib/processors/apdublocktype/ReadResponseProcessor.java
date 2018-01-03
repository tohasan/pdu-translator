package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.MessageItemsProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.processors.bU_;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class ReadResponseProcessor extends MessageItemsProcessor {
    public ReadResponseProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 386;
        var2.b(386);
        int var1 = var2.e(381);
        this.items = new MessageByteProcessor[var1];
        var1 = 0;
        var2.a();

        while (var2.a == 1 && var1 < this.items.length) {
            this.items[var1++] = new bU_(297, var2);
        }

        var2.d(386);
    }

    public ReadResponseProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 386;
        int numberOfItems = CommonUtils.decodeVarLengthUnsignedInteger(messageInputStream);
        this.items = new MessageByteProcessor[numberOfItems];

        for (int i = 0; i < numberOfItems; i++) {
            this.items[i] = new bU_(150, messageInputStream);
        }

    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        this.a(var1, 1);
    }
}
