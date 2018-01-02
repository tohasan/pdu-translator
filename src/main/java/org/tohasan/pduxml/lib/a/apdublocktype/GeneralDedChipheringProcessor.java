package org.tohasan.pduxml.lib.a.apdublocktype;

import org.tohasan.pduxml.lib.a.datatype.OctetStringProcessor;
import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class GeneralDedChipheringProcessor extends MessageByteProcessor {
    private OctetStringProcessor a;
    private OctetStringProcessor c;

    public GeneralDedChipheringProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 279;
        var2.c(279);
        this.a = new OctetStringProcessor(436, var2);
        this.c = new OctetStringProcessor(244, var2);
        var2.d(279);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
    }

    public GeneralDedChipheringProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 279;
        this.a = new OctetStringProcessor(436, var2);
        this.c = new OctetStringProcessor(244, var2);
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
