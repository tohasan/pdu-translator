package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ValueProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class SelectorProcessor extends MessageByteProcessor {
    private int a;

    public SelectorProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
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

    public final void a(MessageOutputStream messageOutputStream) {
        ValueProcessor valueProcessor = new ValueProcessor(1, 2);
        valueProcessor.process(this.a);
        valueProcessor.process(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        ValueProcessor valueProcessor = new ValueProcessor(1, 2);
        valueProcessor.process(this.a);
        var1.appendEmptyTag(this.tagKey, 454, valueProcessor.f());
    }
}
