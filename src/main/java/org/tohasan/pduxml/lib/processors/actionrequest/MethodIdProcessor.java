package org.tohasan.pduxml.lib.processors.actionrequest;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ValueProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class MethodIdProcessor extends MessageByteProcessor {
    private int a;

    MethodIdProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 334;
        var2.b(334);
        byte[] var4;
        if ((var4 = CommonUtils.hexStrToByteArray(var2.f(454))).length != 1) {
            throw new XmlPduException("_ObjectMethodId: Illegal data size, expected " + "1" + " ,found " + var4.length);
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(1, 1)).process(var4);
            this.a = var3.b();
            var2.a();
        }
    }

    MethodIdProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 334;
        ValueProcessor var3;
        (var3 = new ValueProcessor(1, 1)).process(messageInputStream);
        this.a = var3.b();
    }

    public final void a(MessageOutputStream messageOutputStream) {
        ValueProcessor valueProcessor = new ValueProcessor(1, 1);
        valueProcessor.process(this.a);
        valueProcessor.process(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        ValueProcessor var2;
        (var2 = new ValueProcessor(1, 1)).process(this.a);
        var1.appendEmptyTag(this.tagKey, 454, var2.f());
    }
}
