package org.tohasan.pduxml.lib.infra;

import org.tohasan.pduxml.lib.io.MessageOutputStream;

public abstract class MessageByteProcessor {
    public int tagKey;

    public abstract void a(MessageOutputStream var1) throws XmlPduException;

    public abstract void a(n var1) throws XmlPduException;
}
