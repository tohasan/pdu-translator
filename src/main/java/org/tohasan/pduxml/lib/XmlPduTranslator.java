package org.tohasan.pduxml.lib;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageProcessor;

public final class XmlPduTranslator {
    public static byte[] xmlToPdu(StringBuffer message) throws XmlPduException {
        XmlParser var2 = new XmlParser(message);
        MessageProcessor var3 = new MessageProcessor(297, var2);
        MessageOutputStream var1 = new MessageOutputStream();
        var3.a(var1);
        return var1.toByteArray();
    }

    public static StringBuffer pduToXml(byte[] message) throws XmlPduException {
        MessageInputStream inputStream = new MessageInputStream(message);
        MessageProcessor messageProcessor = new MessageProcessor(inputStream);
        XmlOutputBuilder var1 = new XmlOutputBuilder();
        messageProcessor.a(var1);
        return var1.buffer;
    }
}
