package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.MessageItemsProcessor;
import org.tohasan.pduxml.lib.processors.common.ParameterProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class StructureProcessor extends MessageItemsProcessor {
    public StructureProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 434;
        var2.b(434);
        int var1 = var2.e(381);
        this.items = new MessageByteProcessor[var1];
        var1 = 0;
        var2.a();

        while (var2.a == 1 && var1 < this.items.length) {
            this.items[var1++] = new ParameterProcessor(297, var2);
        }

        var2.d(434);
    }

    public StructureProcessor(MessageInputStream messageStream) throws XmlPduException {
        this.tagKey = 434;
        int numberOfItems = CommonUtils.decodeVarLengthUnsignedInteger(messageStream);
        this.items = new MessageByteProcessor[numberOfItems];

        for (int i = 0; i < numberOfItems; i++) {
            this.items[i] = new ParameterProcessor(54, messageStream);
        }
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        this.a(var1, 1);
    }
}
