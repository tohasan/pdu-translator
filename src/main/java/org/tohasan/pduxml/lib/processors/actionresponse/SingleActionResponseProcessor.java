package org.tohasan.pduxml.lib.processors.actionresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.accessresponse.ResultProcessor;
import org.tohasan.pduxml.lib.processors.common.ReturnParametersProcessor;

public final class SingleActionResponseProcessor extends MessageByteProcessor {
    private ResultProcessor a;
    private ReturnParametersProcessor c;

    SingleActionResponseProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 149;
        var2.c(149);
        this.a = new ResultProcessor(var2);

        if (var2.a(405)) {
            this.c = new ReturnParametersProcessor(405, var2);
        }

        var2.d(149);
    }

    SingleActionResponseProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 149;
        this.a = new ResultProcessor(var2);

        if (var2.readByte() != 0) {
            this.c = new ReturnParametersProcessor(405, var2);
        }
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.encode(messageOutputStream);
        if (this.c != null) {
            messageOutputStream.write(1);
            this.c.encode(messageOutputStream);
        } else {
            messageOutputStream.write(0);
        }
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendTag(this.tagKey);
        xmlOutputBuilder.addIndent();
        this.a.printTo(xmlOutputBuilder);
        if (this.c != null) {
            this.c.printTo(xmlOutputBuilder);
        }

        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
