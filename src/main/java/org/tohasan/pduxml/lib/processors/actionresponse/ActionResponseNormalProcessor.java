package org.tohasan.pduxml.lib.processors.actionresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
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

    public ActionResponseNormalProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
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

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
        if (this.d != null) {
            messageOutputStream.write(1);
            this.d.a(messageOutputStream);
        } else {
            messageOutputStream.write(0);
        }
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        this.a.a(var1);
        this.c.a(var1);
        if (this.d != null) {
            this.d.a(var1);
        }

        var1.b();
        var1.b(this.tagKey);
    }
}
