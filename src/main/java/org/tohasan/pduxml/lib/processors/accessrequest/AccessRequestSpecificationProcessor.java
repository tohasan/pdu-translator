package org.tohasan.pduxml.lib.processors.accessrequest;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.MessageItemsProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class AccessRequestSpecificationProcessor extends MessageItemsProcessor {
    public AccessRequestSpecificationProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 181;
        var2.b(181);
        int var1 = var2.e(381);
        this.items = new MessageByteProcessor[var1];
        var1 = 0;
        var2.a();

        while (var2.a == 1 && var1 < this.items.length) {
            this.items[var1++] = new AccessRequestSpecificationItemProcessor(var2);
        }

        var2.d(181);
    }

    public AccessRequestSpecificationProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 181;
        int numberOfItems = CommonUtils.decodeVarLengthUnsignedInteger(messageInputStream);
        this.items = new MessageByteProcessor[numberOfItems];

        for (int i = 0; i < numberOfItems; i++) {
            this.items[i] = new AccessRequestSpecificationItemProcessor(messageInputStream);
        }
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        this.a(xmlOutputBuilder, 0);
    }
}
