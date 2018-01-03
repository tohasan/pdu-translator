package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class NullDataProcessor extends org.tohasan.pduxml.lib.infra.f {
    public NullDataProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        super(var1, var2);
    }

    public NullDataProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        super(var1);
    }
}
