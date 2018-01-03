package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class FloatingPointProcessor extends org.tohasan.pduxml.lib.infra.g {
    public FloatingPointProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 276;
        this.a = 4;
        var2.b(276);
        this.a(var2);
        var2.a();
    }

    public FloatingPointProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 276;
        this.a = 4;
        this.a(var2);
    }
}
