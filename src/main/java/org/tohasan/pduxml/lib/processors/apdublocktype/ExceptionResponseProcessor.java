package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.exceptionresponse.ServiceErrorProcessor;
import org.tohasan.pduxml.lib.processors.exceptionresponse.StateErrorProcessor;

public final class ExceptionResponseProcessor extends MessageByteProcessor {
    private StateErrorProcessor a;
    private ServiceErrorProcessor c;

    public ExceptionResponseProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 273;
        var2.c(273);
        this.a = new StateErrorProcessor(var2);
        this.c = new ServiceErrorProcessor(var2);
        var2.d(273);
    }

    public ExceptionResponseProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 273;
        this.a = new StateErrorProcessor(messageInputStream);
        this.c = new ServiceErrorProcessor(messageInputStream);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
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
