package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ValueProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class Float64Processor extends MessageByteProcessor {
    private double a;

    public Float64Processor(XmlParser var2) throws XmlPduException {
        this.tagKey = 275;
        var2.b(275);
        byte[] var4;
        if ((var4 = CommonUtils.hexStrToByteArray(var2.f(454))).length != 8) {
            throw new XmlPduException("_Float64: Illegal data size, expected " + "8" + " ,found " + var4.length);
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(8, 3)).process(var4);
            this.a = var3.e();
            var2.a();
        }
    }

    public Float64Processor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 275;
        ValueProcessor valueProcessor = new ValueProcessor(8, 3);
        valueProcessor.process(var2);
        this.a = valueProcessor.e();
    }

    public final void a(MessageOutputStream messageOutputStream) {
        ValueProcessor valueProcessor = new ValueProcessor(8, 3);
        valueProcessor.process(this.a);
        valueProcessor.process(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        ValueProcessor valueProcessor = new ValueProcessor(8, 3);
        valueProcessor.process(this.a);
        var1.appendEmptyTag(this.tagKey, 454, valueProcessor.f());
    }
}
