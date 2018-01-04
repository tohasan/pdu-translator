package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.MessageItemsProcessor;
import org.tohasan.pduxml.lib.processors.writeresponse.SingleWriteResponseProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class WriteResponseProcessor extends MessageItemsProcessor {
    public WriteResponseProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 463;
        var2.b(463);
        int var1 = var2.e(381);
        this.items = new MessageByteProcessor[var1];
        var1 = 0;
        var2.a();

        while (var2.a == 1 && var1 < this.items.length) {
            this.items[var1++] = new SingleWriteResponseProcessor(var2);
        }

        var2.d(463);
    }

    public WriteResponseProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 463;
        int numberOfItems = CommonUtils.decodeVarLengthUnsignedInteger(messageInputStream);
        this.items = new MessageByteProcessor[numberOfItems];

        for (int i = 0; i < numberOfItems; i++) {
            this.items[i] = new SingleWriteResponseProcessor(messageInputStream);
        }
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        this.a(xmlOutputBuilder, 1);
    }
}
