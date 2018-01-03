package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.bj;
import org.tohasan.pduxml.lib.processors.bm;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;

public final class DataNotificationProcessor extends MessageByteProcessor {
    private bj a;
    private OctetStringProcessor c;
    private bm d;

    public DataNotificationProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 257;
        var2.c(257);
        this.a = new bj(325, var2);
        this.c = new OctetStringProcessor(262, var2);
        this.d = new bm(351, var2);
        var2.d(257);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
        this.d.a(messageOutputStream);
    }

    public DataNotificationProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 257;
        this.a = new bj(325, messageInputStream);
        this.c = new OctetStringProcessor(262, messageInputStream);
        this.d = new bm(351, messageInputStream);
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
