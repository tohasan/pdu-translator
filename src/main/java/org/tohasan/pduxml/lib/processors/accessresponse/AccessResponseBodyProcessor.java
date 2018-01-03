package org.tohasan.pduxml.lib.processors.accessresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.accessrequest.AccessRequestSpecificationProcessor;
import org.tohasan.pduxml.lib.processors.common.ListOfDataProcessor;

public final class AccessResponseBodyProcessor extends MessageByteProcessor {
    private AccessRequestSpecificationProcessor a;
    private ListOfDataProcessor c;
    private AccessResponseSpecificationProcessor d;

    public AccessResponseBodyProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 184;
        var2.c(184);
        if (var2.a(181)) {
            this.a = new AccessRequestSpecificationProcessor(var2);
        }

        this.c = new ListOfDataProcessor(186, var2);
        this.d = new AccessResponseSpecificationProcessor(var2);
        var2.d(184);
    }

    public AccessResponseBodyProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 184;

        if (messageInputStream.readByte() != 0) {
            this.a = new AccessRequestSpecificationProcessor(messageInputStream);
        }

        this.c = new ListOfDataProcessor(186, messageInputStream);
        this.d = new AccessResponseSpecificationProcessor(messageInputStream);
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
