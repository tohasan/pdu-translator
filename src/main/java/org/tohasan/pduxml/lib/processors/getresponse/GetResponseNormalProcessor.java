package org.tohasan.pduxml.lib.processors.getresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;
import org.tohasan.pduxml.lib.processors.common.ReturnParametersProcessor;

public final class GetResponseNormalProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private ReturnParametersProcessor c;

    public GetResponseNormalProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 289;
        var2.c(289);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new ReturnParametersProcessor(403, var2);
        var2.d(289);
    }

    public GetResponseNormalProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 289;
        this.a = new InvokeIdAndPriorityProcessor(messageInputStream);
        this.c = new ReturnParametersProcessor(403, messageInputStream);
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
