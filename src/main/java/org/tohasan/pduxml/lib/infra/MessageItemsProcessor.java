package org.tohasan.pduxml.lib.infra;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public abstract class MessageItemsProcessor extends MessageByteProcessor {
    public MessageByteProcessor[] items;

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        CommonUtils.encodeVarLengthUnsignedInteger(messageOutputStream, this.items.length);

        for (MessageByteProcessor requestItem : this.items) {
            requestItem.a(messageOutputStream);
        }
    }

    public final void a(n var1, int var2) throws XmlPduException {
        int numberOfItems = this.items.length;
        if (k.a < numberOfItems) {
            numberOfItems = k.a;
        }

        var1.a(this.tagKey, 381, CommonUtils.intToHex(numberOfItems, true), 0);
        var1.a();

        for (int var5 = 0; var5 < numberOfItems; ++var5) {
            MessageByteProcessor var3 = this.items[var5];
            if (var2 == 1) {
                var3.tagKey = 297;
            }

            var3.a(var1);
        }

        var1.b();
        var1.b(this.tagKey);
    }
}
