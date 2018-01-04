package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.exceptionresponse.ServiceErrorProcessor;
import org.tohasan.pduxml.lib.processors.exceptionresponse.StateErrorProcessor;

public final class ExceptionResponseProcessor extends MessageByteProcessor {
    private StateErrorProcessor a;
    private ServiceErrorProcessor c;

    public ExceptionResponseProcessor(XmlParser var2) throws XmlPduException {
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

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
        this.c.encode(messageOutputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendTag(this.tagKey);
        xmlOutputBuilder.addIndent();
        this.a.printTo(xmlOutputBuilder);
        this.c.printTo(xmlOutputBuilder);
        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
