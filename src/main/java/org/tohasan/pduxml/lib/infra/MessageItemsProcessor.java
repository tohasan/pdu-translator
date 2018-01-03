package org.tohasan.pduxml.lib.infra;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public abstract class MessageItemsProcessor extends MessageByteProcessor {
    private final static int NUMBER_OF_ITEMS_LIMIT = 10;
    public MessageByteProcessor[] items;

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        CommonUtils.encodeVarLengthUnsignedInteger(messageOutputStream, this.items.length);

        for (MessageByteProcessor requestItem : this.items) {
            requestItem.a(messageOutputStream);
        }
    }

    public final void a(n var1, int var2) throws XmlPduException {
        int numberOfItems = this.items.length;

        if (NUMBER_OF_ITEMS_LIMIT < numberOfItems) {
            numberOfItems = NUMBER_OF_ITEMS_LIMIT;
        }

        var1.a(this.tagKey, 381, CommonUtils.intToHex(numberOfItems), 0);
        var1.a();

        for (int i = 0; i < numberOfItems; i++) {
            MessageByteProcessor processor = this.items[i];

            if (var2 == 1) {
                processor.tagKey = 297;
            }

            processor.a(var1);
        }

        var1.b();
        var1.b(this.tagKey);
    }
}
