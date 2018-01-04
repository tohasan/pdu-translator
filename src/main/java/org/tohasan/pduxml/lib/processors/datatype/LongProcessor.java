package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ValueProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class LongProcessor extends MessageByteProcessor {
    private int a;

    public LongProcessor(int var1, XmlParser var2) throws XmlPduException {
        this.tagKey = 320;
        var2.b(320);
        byte[] var4;
        if ((var4 = CommonUtils.hexStrToByteArray(var2.f(454))).length != 2) {
            throw new XmlPduException("_Integer16: Illegal data size, expected " + "2" + " ,found " + var4.length);
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(2, 1)).process(var4);
            this.a = var3.b();
            var2.a();
        }
    }

    public final void encode(MessageOutputStream messageOutputStream) {
        ValueProcessor var2;
        (var2 = new ValueProcessor(2, 1)).process(this.a);
        var2.process(messageOutputStream);
    }

    public LongProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 320;
        ValueProcessor valueProcessor = new ValueProcessor(2, 1);
        valueProcessor.process(messageInputStream);
        this.a = valueProcessor.b();
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        ValueProcessor var2;
        (var2 = new ValueProcessor(2, 1)).process(this.a);
        xmlOutputBuilder.appendEmptyTag(this.tagKey, 454, var2.f());
    }
}
