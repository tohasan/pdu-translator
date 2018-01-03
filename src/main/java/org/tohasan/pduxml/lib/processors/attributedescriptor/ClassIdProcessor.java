package org.tohasan.pduxml.lib.processors.attributedescriptor;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ValueProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class ClassIdProcessor extends MessageByteProcessor {
    private int a;

    public ClassIdProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 245;
        var2.b(245);
        byte[] var4;
        if ((var4 = CommonUtils.hexStrToByteArray(var2.f(454))).length != 2) {
            throw new XmlPduException("_ClassId: Illegal data size, expected " + "2" + " ,found " + var4.length);
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(2, 2)).process(var4);
            this.a = var3.b();
            var2.a();
        }
    }

    public ClassIdProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 245;
        ValueProcessor valueProcessor = new ValueProcessor(2, 2);
        valueProcessor.process(var2);
        this.a = valueProcessor.b();
    }

    public final void a(MessageOutputStream messageOutputStream) {
        ValueProcessor valueProcessor = new ValueProcessor(2, 2);
        valueProcessor.process(this.a);
        valueProcessor.process(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        ValueProcessor valueProcessor = new ValueProcessor(2, 2);
        valueProcessor.process(this.a);
        var1.appendEmptyTag(this.tagKey, 454, valueProcessor.f());
    }
}
