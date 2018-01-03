package org.tohasan.pduxml.lib.processors.common;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.MessageItemsProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class ListOfVariableAccessSpecificationProcessor extends MessageItemsProcessor {
    public ListOfVariableAccessSpecificationProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 317;
        var2.b(317);
        int var1 = var2.e(381);
        this.items = new MessageByteProcessor[var1];
        var1 = 0;
        var2.a();

        while (var2.a == 1 && var1 < this.items.length) {
            this.items[var1++] = new VariableAccessSpecProcessor(297, var2);
        }

        var2.d(317);
    }

    public ListOfVariableAccessSpecificationProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 317;
        int numberOfItems = CommonUtils.decodeVarLengthUnsignedInteger(messageInputStream);
        this.items = new MessageByteProcessor[numberOfItems];

        for (int i = 0; i < numberOfItems; i++) {
            this.items[i] = new VariableAccessSpecProcessor(161, messageInputStream);
        }
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        this.a(var1, 1);
    }
}
