package org.tohasan.pduxml.lib.infra;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.io.MessageOutputStream;

public class f extends MessageByteProcessor {
    public f(int var1, m var2) throws XmlPduException {
        this.tagKey = var1;
        var2.c(var1);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
    }

    public f(int var1) {
        this.tagKey = var1;
    }

    public final void a(n var1) throws XmlPduException {
        var1.a("<" + org.tohasan.pduxml.lib.processors.a.a(this.tagKey) + " />");
    }
}
