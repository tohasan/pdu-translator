package org.tohasan.pduxml.lib.processors.datanotification;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ParameterProcessor;

public final class NotificationBodyProcessor extends MessageByteProcessor {
    private ParameterProcessor a;

    public NotificationBodyProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 351;
        var2.c(351);
        this.a = new ParameterProcessor(259, var2);
        var2.d(351);
    }

    public NotificationBodyProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 351;
        this.a = new ParameterProcessor(259, var2);
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
