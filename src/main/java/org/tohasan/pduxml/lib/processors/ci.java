package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class ci extends MessageByteProcessor {
    private aW_ a;
    private OctetStringProcessor c;

    public ci(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 459;
        var2.c(459);
        this.a = new aW_(309, var2);
        this.c = new OctetStringProcessor(310, var2);
        var2.d(459);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
    }

    public ci(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 459;
        this.a = new aW_(309, var2);
        this.c = new OctetStringProcessor(310, var2);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        this.a.a(var1);
        this.c.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
