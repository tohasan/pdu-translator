package org.tohasan.pduxml.lib;

import org.tohasan.pduxml.lib.processors.MessageProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.infra.m;
import org.tohasan.pduxml.lib.infra.n;

public final class XmlPduInterface {
    public static byte[] XmlToPdu(StringBuffer var0) throws XmlPduException {
        m var2 = new m(var0);
        MessageProcessor var3 = new MessageProcessor(297, var2);
        MessageOutputStream var1 = new MessageOutputStream();
        var3.a(var1);
        return var1.toByteArray();
    }

    public static StringBuffer PduToXml(byte[] message) throws XmlPduException {
        MessageInputStream inputStream = new MessageInputStream(message);
        MessageProcessor messageProcessor = new MessageProcessor(297, inputStream);
        n var1 = new n();
        messageProcessor.a(var1);
        return var1.a;
    }
}
