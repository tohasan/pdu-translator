package org.tohasan.pduxml.lib.processors.actionresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.accessresponse.ResultProcessor;
import org.tohasan.pduxml.lib.processors.actionrequestwithlist.InvokeIdAndPriorityProcessor;
import org.tohasan.pduxml.lib.processors.common.ReturnParametersProcessor;

public final class ActionResponseNormalProcessor extends MessageByteProcessor {
    private InvokeIdAndPriorityProcessor a;
    private ResultProcessor c;
    private ReturnParametersProcessor d;

    public ActionResponseNormalProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 201;
        var2.c(201);
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new ResultProcessor(var2);
        if (var2.a(405)) {
            this.d = new ReturnParametersProcessor(405, var2);
        }

        var2.d(201);
    }

    public ActionResponseNormalProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 201;
        this.a = new InvokeIdAndPriorityProcessor(var2);
        this.c = new ResultProcessor(var2);

        if (var2.readByte() != 0) {
            this.d = new ReturnParametersProcessor(405, var2);
        }
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
        this.c.encode(messageOutputStream);
        if (this.d != null) {
            messageOutputStream.write(1);
            this.d.encode(messageOutputStream);
        } else {
            messageOutputStream.write(0);
        }
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendTag(this.tagKey);
        xmlOutputBuilder.addIndent();
        this.a.printTo(xmlOutputBuilder);
        this.c.printTo(xmlOutputBuilder);
        if (this.d != null) {
            this.d.printTo(xmlOutputBuilder);
        }

        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
