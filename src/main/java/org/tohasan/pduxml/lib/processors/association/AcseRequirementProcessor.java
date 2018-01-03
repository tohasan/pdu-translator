package org.tohasan.pduxml.lib.processors.association;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;

public final class AcseRequirementProcessor extends AssociationParameterProcessor {
    public AcseRequirementProcessor(int var1, XmlParser var2) throws XmlPduException {
        super(var1, var2);
    }

    public AcseRequirementProcessor(int tagKey, MessageInputStream messageInputStream) throws XmlPduException {
        super(tagKey, messageInputStream);
    }
}
