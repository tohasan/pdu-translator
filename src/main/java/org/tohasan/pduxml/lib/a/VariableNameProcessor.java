package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.*;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class VariableNameProcessor extends MessageByteProcessor {
    private int a;

    VariableNameProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = var1;
        var2.b(var1);
        byte[] var4;
        if ((var4 = CommonUtils.hexStrToByteArray(var2.f(454))).length != 2) {
            throw new XmlPduException("_ObjectName: Illegal data size, expected " + "2" + " ,found " + var4.length);
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(2, 1)).process(var4);
            this.a = var3.b();
            var2.a();
        }
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) {
        ValueProcessor var2;
        (var2 = new ValueProcessor(2, 1)).process(this.a);
        var2.process(var1);
    }

    VariableNameProcessor(int tagKey, MessageInputStream messageStream) throws XmlPduException {
        this.tagKey = tagKey;
        ValueProcessor valueProcessor = new ValueProcessor(2, 1);
        valueProcessor.process(messageStream);
        this.a = valueProcessor.b();
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        ValueProcessor var2;
        (var2 = new ValueProcessor(2, 1)).process(this.a);
        var1.a(this.tagKey, 454, var2.f(), 1);
    }
}
