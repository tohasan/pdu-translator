package org.tohasan.pduxml.lib.processors.accessrequest;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ListOfDataProcessor;

public final class AccessRequestBodyProcessor extends MessageByteProcessor {
    private AccessRequestSpecificationProcessor a;
    private ListOfDataProcessor c;

    public AccessRequestBodyProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 175;
        var2.c(175);
        this.a = new AccessRequestSpecificationProcessor(var2);
        this.c = new ListOfDataProcessor(178, var2);
        var2.d(175);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
    }

    public AccessRequestBodyProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 175;
        this.a = new AccessRequestSpecificationProcessor(messageInputStream);
        this.c = new ListOfDataProcessor(178, messageInputStream);
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
