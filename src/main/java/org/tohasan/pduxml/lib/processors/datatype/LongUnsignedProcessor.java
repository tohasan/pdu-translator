package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.*;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class LongUnsignedProcessor extends MessageByteProcessor {
    private int a;

    public LongUnsignedProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = var1;
        var2.b(var1);
        byte[] var4;
        if ((var4 = CommonUtils.hexStrToByteArray(var2.f(454))).length != 2) {
            throw new XmlPduException("_Unsigned16: Illegal data size, expected " + "2" + " ,found " + var4.length);
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(2, 2)).process(var4);
            this.a = var3.b();
            var2.a();
        }
    }

    public final void a(MessageOutputStream var1) {
        ValueProcessor var2;
        (var2 = new ValueProcessor(2, 2)).process(this.a);
        var2.process(var1);
    }

    public LongUnsignedProcessor(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = var1;
        ValueProcessor var3;
        (var3 = new ValueProcessor(2, 2)).process(var2);
        this.a = var3.b();
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        ValueProcessor var2;
        (var2 = new ValueProcessor(2, 2)).process(this.a);
        var1.a(this.tagKey, 454, var2.f(), 1);
    }
}
