package org.tohasan.pduxml.lib.processors.accessresponsespecification;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.accessresponse.ResultProcessor;

public final class AccessResponseActionProcessor extends MessageByteProcessor {
    private ResultProcessor a;

    public AccessResponseActionProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 183;
        var2.c(183);
        this.a = new ResultProcessor(var2);
        var2.d(183);
    }

    public AccessResponseActionProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 183;
        this.a = new ResultProcessor(messageInputStream);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        this.a.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
