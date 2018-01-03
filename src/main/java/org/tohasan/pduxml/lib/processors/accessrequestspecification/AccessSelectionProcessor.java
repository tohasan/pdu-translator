package org.tohasan.pduxml.lib.processors.accessrequestspecification;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ParameterProcessor;
import org.tohasan.pduxml.lib.processors.datatype.SelectorProcessor;

public final class AccessSelectionProcessor extends MessageByteProcessor {
    private SelectorProcessor a;
    private ParameterProcessor c;

    public AccessSelectionProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 189;
        var2.c(189);
        this.a = new SelectorProcessor(190, var2);
        this.c = new ParameterProcessor(172, var2);
        var2.d(189);
    }

    public AccessSelectionProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 189;
        this.a = new SelectorProcessor(190, messageInputStream);
        this.c = new ParameterProcessor(172, messageInputStream);
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
