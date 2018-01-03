package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;

public final class GeneralDedChipheringProcessor extends MessageByteProcessor {
    private OctetStringProcessor a;
    private OctetStringProcessor c;

    public GeneralDedChipheringProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 279;
        var2.c(279);
        this.a = new OctetStringProcessor(436, var2);
        this.c = new OctetStringProcessor(244, var2);
        var2.d(279);
    }

    public GeneralDedChipheringProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 279;
        this.a = new OctetStringProcessor(436, messageInputStream);
        this.c = new OctetStringProcessor(244, messageInputStream);
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        this.a.a(var1);
        this.c.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
