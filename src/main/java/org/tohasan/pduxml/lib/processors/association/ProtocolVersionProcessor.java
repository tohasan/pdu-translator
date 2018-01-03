package org.tohasan.pduxml.lib.processors.association;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;

public final class ProtocolVersionProcessor extends AssociationParameterProcessor {
    public ProtocolVersionProcessor(XmlParser var2) throws XmlPduException {
        super(379, var2);
    }

    public ProtocolVersionProcessor(MessageInputStream var2) throws XmlPduException {
        super(379, var2);
    }
}
