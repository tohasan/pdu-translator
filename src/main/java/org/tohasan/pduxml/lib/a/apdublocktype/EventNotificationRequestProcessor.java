package org.tohasan.pduxml.lib.a.apdublocktype;

import org.tohasan.pduxml.lib.a.P_;
import org.tohasan.pduxml.lib.a.ParameterProcessor;
import org.tohasan.pduxml.lib.a.datatype.OctetStringProcessor;
import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class EventNotificationRequestProcessor extends MessageByteProcessor {
    private OctetStringProcessor a;
    private P_ c;
    private ParameterProcessor d;

    public EventNotificationRequestProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 272;
        var2.c(272);
        if (var2.a((int) 442)) {
            this.a = new OctetStringProcessor(442, var2);
        }

        this.c = new P_(217, var2);
        this.d = new ParameterProcessor(220, var2);
        var2.d(272);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        if (this.a != null) {
            var1.write(1);
            this.a.a(var1);
        } else {
            var1.write(0);
        }

        this.c.a(var1);
        this.d.a(var1);
    }

    public EventNotificationRequestProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 272;
        if (var2.readByte() != 0) {
            this.a = new OctetStringProcessor(442, var2);
        }

        this.c = new P_(217, var2);
        this.d = new ParameterProcessor(220, var2);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        if (this.a != null) {
            this.a.a(var1);
        }

        this.c.a(var1);
        this.d.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
