package org.tohasan.pduxml.lib.processors.accessresponsespecification;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ResultProcessor;

public final class AccessResponseGetProcessor extends MessageByteProcessor {
    private ResultProcessor a;

    public AccessResponseGetProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 185;
        var2.c(185);
        this.a = new ResultProcessor(403, var2);
        var2.d(185);
    }

    public AccessResponseGetProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 185;
        this.a = new ResultProcessor(403, messageInputStream);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        this.a.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
