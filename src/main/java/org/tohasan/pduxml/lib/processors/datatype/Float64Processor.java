package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.*;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class Float64Processor extends MessageByteProcessor {
    private double a;

    public Float64Processor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
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

    public final void a(MessageOutputStream messageOutputStream) {
        ValueProcessor var2;
        (var2 = new ValueProcessor(8, 3)).process(this.a);
        var2.process(messageOutputStream);
    }

    public Float64Processor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 275;
        ValueProcessor valueProcessor = new ValueProcessor(8, 3);
        valueProcessor.process(var2);
        this.a = valueProcessor.e();
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        ValueProcessor var2;
        (var2 = new ValueProcessor(8, 3)).process(this.a);
        var1.a(this.tagKey, 454, var2.f(), 1);
    }
}
