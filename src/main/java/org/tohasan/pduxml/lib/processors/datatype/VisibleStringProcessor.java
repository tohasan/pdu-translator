package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class VisibleStringProcessor extends org.tohasan.pduxml.lib.infra.g {
    public VisibleStringProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 458;
        this.a = -1;
        var2.b(458);
        this.a(var2);
        var2.a();
    }

    public VisibleStringProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 458;
        this.a = -1;
        this.a(var2);
    }
}
