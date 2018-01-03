package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class S_ extends MessageProcessor {
    public S_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        super(var1, var2);
    }

    public S_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = var1;
        var2.readByte();
        this.a(var2);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write(0);
        int var2 = messageOutputStream.size() - 1;
        super.a(messageOutputStream);
        messageOutputStream.a(var2, messageOutputStream.size() - var2 - 1);
    }
}
