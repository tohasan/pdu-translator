package org.tohasan.pduxml.lib.processors.common;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.MessageItemsProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class ListOfDataProcessor extends MessageItemsProcessor {
    public ListOfDataProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = var1;
        var2.b(var1);
        int var3 = var2.e(381);
        this.items = new MessageByteProcessor[var3];
        var3 = 0;
        var2.a();

        while (var2.a == 1 && var3 < this.items.length) {
            this.items[var3++] = new ParameterProcessor(297, var2);
        }

        var2.d(var1);
    }

    public ListOfDataProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = var1;
        var1 = CommonUtils.decodeVarLengthUnsignedInteger(var2);
        this.items = new MessageByteProcessor[var1];

        for (int var3 = 0; var3 < var1; ++var3) {
            this.items[var3] = new ParameterProcessor(54, var2);
        }
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        this.a(var1, 1);
    }
}
