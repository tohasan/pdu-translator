package org.tohasan.pduxml.lib.processors.association;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.io.MessageInputStream;

public final class MechanismNameProcessor extends org.tohasan.pduxml.lib.infra.b {
    public MechanismNameProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 330;
        var2.b(330);
        this.a(var2);
        var2.a();
    }

    public MechanismNameProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 330;
        this.a(var2);
    }
}
