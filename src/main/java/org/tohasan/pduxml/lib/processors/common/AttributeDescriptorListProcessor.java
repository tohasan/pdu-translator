package org.tohasan.pduxml.lib.processors.common;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.MessageItemsProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class AttributeDescriptorListProcessor extends MessageItemsProcessor {
    public AttributeDescriptorListProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 218;
        var2.b(218);
        int var1 = var2.e(381);
        this.items = new MessageByteProcessor[var1];
        var1 = 0;
        var2.a();

        while (var2.a == 1 && var1 < this.items.length) {
            this.items[var1++] = new AttributeDescriptorWithSelectionProcessor(var2);
        }

        var2.d(218);
    }

    public AttributeDescriptorListProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 218;
        int var1 = CommonUtils.decodeVarLengthUnsignedInteger(messageInputStream);
        this.items = new MessageByteProcessor[var1];

        for (int var3 = 0; var3 < var1; ++var3) {
            this.items[var3] = new AttributeDescriptorWithSelectionProcessor(messageInputStream);
        }
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        this.a(xmlOutputBuilder, 0);
    }
}
