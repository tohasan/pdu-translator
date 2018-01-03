package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.MessageItemsProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.processors.ParameterProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class ArrayProcessor extends MessageItemsProcessor {
    public ArrayProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 210;
        var2.b(210);
        var1 = var2.e(381);
        this.items = new MessageByteProcessor[var1];
        var1 = 0;
        var2.a();

        while (var2.a == 1 && var1 < this.items.length) {
            this.items[var1++] = new ParameterProcessor(297, var2);
        }

        var2.d(210);
    }

    public ArrayProcessor(int tagKey, MessageInputStream messageStream) throws XmlPduException {
        this.tagKey = 210;
        tagKey = CommonUtils.decodeVarLengthUnsignedInteger(messageStream);
        this.items = new MessageByteProcessor[tagKey];

        for (int var3 = 0; var3 < tagKey; ++var3) {
            this.items[var3] = new ParameterProcessor(54, messageStream);
        }

    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        this.a(var1, 1);
    }
}
