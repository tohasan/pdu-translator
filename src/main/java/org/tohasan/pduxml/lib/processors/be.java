package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.*;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class be extends MessageItemsProcessor {
    public be(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 403;
        var2.b(403);
        int var1 = var2.e(381);
        this.items = new MessageByteProcessor[var1];
        var1 = 0;
        var2.a();

        while (var2.a == 1 && var1 < this.items.length) {
            this.items[var1++] = new aA_(297, var2);
        }

        var2.d(403);
    }

    public be(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 403;
        int var1 = CommonUtils.decodeVarLengthUnsignedInteger(messageInputStream);
        this.items = new MessageByteProcessor[var1];

        for (int var3 = 0; var3 < var1; ++var3) {
            this.items[var3] = new aA_(78, messageInputStream);
        }

    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        this.a(var1, 1);
    }
}
