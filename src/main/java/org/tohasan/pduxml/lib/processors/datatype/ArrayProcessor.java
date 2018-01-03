package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.processors.ParameterProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class ArrayProcessor extends org.tohasan.pduxml.lib.infra.j {
    public ArrayProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 210;
        var2.b(210);
        var1 = var2.e(381);
        this.requestItems = new MessageByteProcessor[var1];
        var1 = 0;
        var2.a();

        while (var2.a == 1 && var1 < this.requestItems.length) {
            this.requestItems[var1++] = new ParameterProcessor(297, var2);
        }

        var2.d(210);
    }

    public ArrayProcessor(int tagKey, MessageInputStream messageStream) throws XmlPduException {
        this.tagKey = 210;
        tagKey = CommonUtils.decodeVarLengthUnsignedInteger(messageStream);
        this.requestItems = new MessageByteProcessor[tagKey];

        for (int var3 = 0; var3 < tagKey; ++var3) {
            this.requestItems[var3] = new ParameterProcessor(54, messageStream);
        }

    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        this.a(var1, 1);
    }
}
