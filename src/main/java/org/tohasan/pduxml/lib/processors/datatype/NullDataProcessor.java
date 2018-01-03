package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.processors.common.DoNothingProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class NullDataProcessor extends DoNothingProcessor {
    public NullDataProcessor(int var1, XmlParser var2) throws XmlPduException {
        super(var1, var2);
    }

    public NullDataProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        super(var1);
    }
}
