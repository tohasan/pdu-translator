package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public abstract class MessageItemsProcessor extends MessageByteProcessor {
    private final static int NUMBER_OF_ITEMS_LIMIT = 10;
    public MessageByteProcessor[] items;

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        CommonUtils.encodeVarLengthUnsignedInteger(messageOutputStream, this.items.length);

        for (MessageByteProcessor requestItem : this.items) {
            requestItem.encode(messageOutputStream);
        }
    }

    public final void a(XmlOutputBuilder var1, int var2) throws XmlPduException {
        int numberOfItems = this.items.length;

        if (NUMBER_OF_ITEMS_LIMIT < numberOfItems) {
            numberOfItems = NUMBER_OF_ITEMS_LIMIT;
        }

        var1.appendTagWithQuantity(this.tagKey, numberOfItems);
        var1.addIndent();

        for (int i = 0; i < numberOfItems; i++) {
            MessageByteProcessor processor = this.items[i];

            if (var2 == 1) {
                processor.tagKey = 297;
            }

            processor.printTo(var1);
        }

        var1.removeIndent();
        var1.appendClosingTag(this.tagKey);
    }
}
