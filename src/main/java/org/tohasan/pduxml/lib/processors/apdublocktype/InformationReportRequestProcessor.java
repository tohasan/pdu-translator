package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ListOfDataProcessor;
import org.tohasan.pduxml.lib.processors.common.ListOfVariableAccessSpecificationProcessor;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;

public final class InformationReportRequestProcessor extends MessageByteProcessor {
    private OctetStringProcessor a;
    private ListOfVariableAccessSpecificationProcessor c;
    private ListOfDataProcessor d;

    public InformationReportRequestProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 301;
        var2.c(301);
        if (var2.a(249)) {
            this.a = new OctetStringProcessor(249, var2);
        }

        this.c = new ListOfVariableAccessSpecificationProcessor(var2);
        this.d = new ListOfDataProcessor(315, var2);
        var2.d(301);
    }

    public InformationReportRequestProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 301;

        if (messageInputStream.readByte() != 0) {
            this.a = new OctetStringProcessor(249, messageInputStream);
        }

        this.c = new ListOfVariableAccessSpecificationProcessor(messageInputStream);
        this.d = new ListOfDataProcessor(315, messageInputStream);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        if (this.a != null) {
            messageOutputStream.write(1);
            this.a.a(messageOutputStream);
        } else {
            messageOutputStream.write(0);
        }

        this.c.a(messageOutputStream);
        this.d.a(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        if (this.a != null) {
            this.a.a(var1);
        }

        this.c.a(var1);
        this.d.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
