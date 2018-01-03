package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.accessresponse.AccessResponseBodyProcessor;
import org.tohasan.pduxml.lib.processors.common.LongInvokeIdAndPriorityProcessor;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;

public final class AccessResponseProcessor extends MessageByteProcessor {
    private LongInvokeIdAndPriorityProcessor a;
    private OctetStringProcessor c;
    private AccessResponseBodyProcessor d;

    public AccessResponseProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 182;
        var2.c(182);
        this.a = new LongInvokeIdAndPriorityProcessor(var2);
        this.c = new OctetStringProcessor(262, var2);
        this.d = new AccessResponseBodyProcessor(var2);
        var2.d(182);
    }

    public AccessResponseProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 182;
        this.a = new LongInvokeIdAndPriorityProcessor(messageInputStream);
        this.c = new OctetStringProcessor(262, messageInputStream);
        this.d = new AccessResponseBodyProcessor(messageInputStream);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
        this.d.a(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
