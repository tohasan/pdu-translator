package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.P_;
import org.tohasan.pduxml.lib.processors.ParameterProcessor;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;

public final class EventNotificationRequestProcessor extends MessageByteProcessor {
    private OctetStringProcessor a;
    private P_ c;
    private ParameterProcessor d;

    public EventNotificationRequestProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 272;
        var2.c(272);
        if (var2.a(442)) {
            this.a = new OctetStringProcessor(442, var2);
        }

        this.c = new P_(217, var2);
        this.d = new ParameterProcessor(220, var2);
        var2.d(272);
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        if (this.a != null) {
            var1.write(1);
            this.a.a(var1);
        } else {
            var1.write(0);
        }

        this.c.a(var1);
        this.d.a(var1);
    }

    public EventNotificationRequestProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 272;
        if (messageInputStream.readByte() != 0) {
            this.a = new OctetStringProcessor(442, messageInputStream);
        }

        this.c = new P_(217, messageInputStream);
        this.d = new ParameterProcessor(220, messageInputStream);
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
