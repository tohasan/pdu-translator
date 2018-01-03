package org.tohasan.pduxml.lib.infra;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public abstract class j extends MessageByteProcessor {
    public MessageByteProcessor[] requestItems;

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        CommonUtils.encodeVarLengthUnsignedInteger(messageOutputStream, this.requestItems.length);

        for (MessageByteProcessor requestItem : this.requestItems) {
            requestItem.a(messageOutputStream);
        }
    }

    public final void a(n var1, int var2) throws XmlPduException {
        int var4;
        if ((var4 = this.requestItems.length) > k.a) {
            var4 = k.a;
        }

        var1.a(this.tagKey, 381, CommonUtils.intToHex(var4, true), 0);
        var1.a();

        for (int var5 = 0; var5 < var4; ++var5) {
            MessageByteProcessor var3 = this.requestItems[var5];
            if (var2 == 1) {
                var3.tagKey = 297;
            }

            var3.a(var1);
        }

        var1.b();
        var1.b(this.tagKey);
    }
}
