package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageOutputStream;

public abstract class MessageByteProcessor {
    public int tagKey;

    public abstract void a(MessageOutputStream messageOutputStream) throws XmlPduException;

    public abstract void a(XmlOutputBuilder var1) throws XmlPduException;
}
