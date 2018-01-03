package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.*;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.ValueProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class LongProcessor extends MessageByteProcessor {
    private int a;

    public LongProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
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

    public final void a(MessageOutputStream messageOutputStream) {
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

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        ValueProcessor var2;
        (var2 = new ValueProcessor(2, 1)).process(this.a);
        var1.appendEmptyTag(this.tagKey, 454, var2.f());
    }
}
