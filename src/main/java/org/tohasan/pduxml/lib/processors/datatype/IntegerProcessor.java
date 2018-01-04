package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ValueProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class IntegerProcessor extends MessageByteProcessor {
    private int a;

    public IntegerProcessor(int var1, XmlParser var2) throws XmlPduException {
        this.tagKey = var1;
        var2.b(var1);
        byte[] var4;
        if ((var4 = CommonUtils.hexStrToByteArray(var2.f(454))).length != 1) {
            throw new XmlPduException("_Integer8: Illegal data size, expected " + "1" + " ,found " + var4.length);
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(1, 1)).process(var4);
            this.a = var3.b();
            var2.a();
        }
    }

    public IntegerProcessor(int tagKey, MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = tagKey;
        ValueProcessor valueProcessor = new ValueProcessor(1, 1);
        valueProcessor.process(messageInputStream);
        this.a = valueProcessor.b();
    }

    public final void encode(MessageOutputStream messageOutputStream) {
        ValueProcessor valueProcessor= new ValueProcessor(1, 1);
        valueProcessor.process(this.a);
        valueProcessor.process(messageOutputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        ValueProcessor valueProcessor = new ValueProcessor(1, 1);
        valueProcessor.process(this.a);
        xmlOutputBuilder.appendEmptyTag(this.tagKey, 454, valueProcessor.f());
    }
}
