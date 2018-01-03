package org.tohasan.pduxml.lib.processors.association;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.io.MessageInputStream;

public final class AcseRequirementProcessor extends org.tohasan.pduxml.lib.infra.a {
    public AcseRequirementProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        super(var1, var2);
    }

    public AcseRequirementProcessor(int tagKey, MessageInputStream messageInputStream) throws XmlPduException {
        super(tagKey, messageInputStream);
    }
}
