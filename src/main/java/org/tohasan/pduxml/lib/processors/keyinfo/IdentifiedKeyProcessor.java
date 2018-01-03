package org.tohasan.pduxml.lib.processors.keyinfo;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;

public final class IdentifiedKeyProcessor extends MessageByteProcessor {
    private KeyIdProcessor a;

    public IdentifiedKeyProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 296;
        var2.c(296);
        this.a = new KeyIdProcessor(var2);
        var2.d(296);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
    }

    public IdentifiedKeyProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 296;
        this.a = new KeyIdProcessor(messageInputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        this.a.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
