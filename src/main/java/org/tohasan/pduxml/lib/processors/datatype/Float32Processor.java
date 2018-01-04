package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ValueProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class Float32Processor extends MessageByteProcessor {
    private float a;

    public Float32Processor(XmlParser var2) throws XmlPduException {
        this.tagKey = 274;
        var2.b(274);
        byte[] var4;
        if ((var4 = CommonUtils.hexStrToByteArray(var2.f(454))).length != 4) {
            throw new XmlPduException("_Float32: Illegal data size, expected " + "4" + " ,found " + var4.length);
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(4, 3)).process(var4);
            this.a = var3.d();
            var2.a();
        }
    }

    public final void encode(MessageOutputStream messageOutputStream) {
        ValueProcessor var2;
        (var2 = new ValueProcessor(4, 3)).process(this.a);
        var2.process(messageOutputStream);
    }

    public Float32Processor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 274;
        ValueProcessor valueProcessor = new ValueProcessor(4, 3);
        valueProcessor.process(var2);
        this.a = valueProcessor.d();
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        ValueProcessor var2;
        (var2 = new ValueProcessor(4, 3)).process(this.a);
        xmlOutputBuilder.appendEmptyTag(this.tagKey, 454, var2.f());
    }
}
