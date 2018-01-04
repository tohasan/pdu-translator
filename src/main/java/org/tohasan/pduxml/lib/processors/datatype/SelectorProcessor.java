package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ValueProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class SelectorProcessor extends MessageByteProcessor {
    private int a;

    public SelectorProcessor(int var1, XmlParser var2) throws XmlPduException {
        this.tagKey = var1;
        var2.b(var1);
        byte[] var4;

        if ((var4 = CommonUtils.hexStrToByteArray(var2.f(454))).length != 1) {
            throw new XmlPduException("_Unsigned8: Illegal data size, expected " + "1" + " ,found " + var4.length);
        } else {
            ValueProcessor valueProcessor = new ValueProcessor(1, 2);
            valueProcessor.process(var4);
            this.a = valueProcessor.b();
            var2.a();
        }
    }

    public SelectorProcessor(int tagKey, MessageInputStream messageStream) throws XmlPduException {
        this.tagKey = tagKey;
        ValueProcessor valueProcessor = new ValueProcessor(1, 2);
        valueProcessor.process(messageStream);
        this.a = valueProcessor.b();
    }

    public final void encode(MessageOutputStream messageOutputStream) {
        ValueProcessor valueProcessor = new ValueProcessor(1, 2);
        valueProcessor.process(this.a);
        valueProcessor.process(messageOutputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        ValueProcessor valueProcessor = new ValueProcessor(1, 2);
        valueProcessor.process(this.a);
        xmlOutputBuilder.appendEmptyTag(this.tagKey, 454, valueProcessor.f());
    }
}
