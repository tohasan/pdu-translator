package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.processors.common.DoNothingProcessor;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class DoNotCareProcessor extends DoNothingProcessor {
    public DoNotCareProcessor(XmlParser var2) throws XmlPduException {
        super(267, var2);
    }

    public DoNotCareProcessor() throws XmlPduException {
        super(267);
    }
}
