package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.MessageItemsProcessor;
import org.tohasan.pduxml.lib.processors.common.VariableAccessSpecProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class ReadRequestProcessor extends MessageItemsProcessor {
    public ReadRequestProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 385;
        var2.b(385);
        int var1 = var2.e(381);
        this.items = new MessageByteProcessor[var1];
        var1 = 0;
        var2.a();

        while (var2.a == 1 && var1 < this.items.length) {
            this.items[var1++] = new VariableAccessSpecProcessor(297, var2);
        }

        var2.d(385);
    }

    public ReadRequestProcessor(MessageInputStream messageByteStream) throws XmlPduException {
        this.tagKey = 385;
        int numberOfRequestedItems = CommonUtils.decodeVarLengthUnsignedInteger(messageByteStream);
        this.items = new MessageByteProcessor[numberOfRequestedItems];

        for (int i = 0; i < numberOfRequestedItems; i++) {
            this.items[i] = new VariableAccessSpecProcessor(161, messageByteStream);
        }
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        this.a(xmlOutputBuilder, 1);
    }
}
