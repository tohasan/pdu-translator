package org.tohasan.pduxml.lib.processors.variableaccessspec;

import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.datatype.LongUnsignedProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class BlockNumberAccessProcessor extends MessageByteProcessor {
    private LongUnsignedProcessor a;

    public BlockNumberAccessProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 226;
        var2.c(226);
        this.a = new LongUnsignedProcessor(225, var2);
        var2.d(226);
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        this.a.a(var1);
    }

    public BlockNumberAccessProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 226;
        this.a = new LongUnsignedProcessor(225, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        this.a.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
