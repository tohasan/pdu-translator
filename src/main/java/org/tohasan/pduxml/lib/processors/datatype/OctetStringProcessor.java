package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class OctetStringProcessor extends org.tohasan.pduxml.lib.infra.g {
    public OctetStringProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = var1;
        this.a = -1;
        var2.b(var1);
        this.a(var2);
        var2.a();
    }

    public OctetStringProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = var1;
        this.a = -1;
        this.a(var2);
    }
}
