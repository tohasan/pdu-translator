package org.tohasan.pduxml.lib.a.datatype;

import org.tohasan.pduxml.lib.a.ParameterProcessor;
import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.Misc;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class StructureProcessor extends org.tohasan.pduxml.lib.infra.j {
    public StructureProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 434;
        var2.b(434);
        var1 = var2.e(381);
        this.requestItems = new MessageByteProcessor[var1];
        var1 = 0;
        var2.a();

        while (var2.a == 1 && var1 < this.requestItems.length) {
            this.requestItems[var1++] = new ParameterProcessor(297, var2);
        }

        var2.d(434);
    }

    public StructureProcessor(int tagKey, MessageInputStream messageStream) throws XmlPduException {
        this.tagKey = 434;
        int numberOfItems = Misc.decodeVarLengthUnsignedInteger(messageStream);
        this.requestItems = new MessageByteProcessor[numberOfItems];

        for (int i = 0; i < numberOfItems; i++) {
            this.requestItems[i] = new ParameterProcessor(54, messageStream);
        }
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        this.a(var1, 1);
    }
}
