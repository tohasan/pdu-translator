package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.MessageItemsProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.processors.bV_;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class WriteResponseProcessor extends MessageItemsProcessor {
    public WriteResponseProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 463;
        var2.b(463);
        int var1 = var2.e(381);
        this.items = new MessageByteProcessor[var1];
        var1 = 0;
        var2.a();

        while (var2.a == 1 && var1 < this.items.length) {
            this.items[var1++] = new bV_(297, var2);
        }

        var2.d(463);
    }

    public WriteResponseProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 463;
        int numberOfItems = CommonUtils.decodeVarLengthUnsignedInteger(messageInputStream);
        this.items = new MessageByteProcessor[numberOfItems];

        for (int i = 0; i < numberOfItems; i++) {
            this.items[i] = new bV_(151, messageInputStream);
        }
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        this.a(var1, 1);
    }
}
