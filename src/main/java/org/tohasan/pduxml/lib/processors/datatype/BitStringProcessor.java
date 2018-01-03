package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class BitStringProcessor extends org.tohasan.pduxml.lib.infra.d {
    public BitStringProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        super(222, var2);
    }

    public BitStringProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        super(222, var2);
    }
}
