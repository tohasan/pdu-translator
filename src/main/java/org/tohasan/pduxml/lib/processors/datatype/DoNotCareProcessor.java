package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class DoNotCareProcessor extends org.tohasan.pduxml.lib.infra.f {
    public DoNotCareProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        super(267, var2);
    }

    public DoNotCareProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        super(267);
    }
}
