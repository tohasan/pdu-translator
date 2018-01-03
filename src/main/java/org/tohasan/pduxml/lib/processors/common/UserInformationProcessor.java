package org.tohasan.pduxml.lib.processors.common;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageProcessor;

public final class UserInformationProcessor extends MessageProcessor {
    public UserInformationProcessor(int tagKey, XmlParser var2) throws XmlPduException {
        super(tagKey, var2);
    }

    public UserInformationProcessor(int tagKey, MessageInputStream messageInputStream) throws XmlPduException {
        super(messageInputStream);

        this.tagKey = tagKey;
        messageInputStream.readByte();
        this.a(messageInputStream);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write(0);
        int var2 = messageOutputStream.size() - 1;
        super.a(messageOutputStream);
        messageOutputStream.a(var2, messageOutputStream.size() - var2 - 1);
    }
}
