package org.tohasan.pduxml.lib.a.datatype;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class Utf8StringProcessor extends org.tohasan.pduxml.lib.infra.g {
    public Utf8StringProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 446;
        this.a = -1;
        var2.b(446);
        this.a(var2);
        var2.a();
    }

    public Utf8StringProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 446;
        this.a = -1;
        this.a(var2);
    }
}
