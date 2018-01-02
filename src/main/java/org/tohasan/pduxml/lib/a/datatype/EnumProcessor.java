package org.tohasan.pduxml.lib.a.datatype;

import org.tohasan.pduxml.lib.infra.*;

public final class EnumProcessor extends MessageByteProcessor {
    private int a;

    public EnumProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 270;
        var2.b(270);
        byte[] var4;
        if ((var4 = Misc.hexStrToByteArray(var2.f(454))).length != 1) {
            throw new XmlPduException("_Enum: Illegal data size, expected " + "1" + " ,found " + var4.length);
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(1, 2)).process(var4);
            this.a = var3.b();
            var2.a();
        }
    }

    public EnumProcessor(int tagKey, MessageInputStream messageStream) throws XmlPduException {
        this.tagKey = 270;
        ValueProcessor valueProcessor = new ValueProcessor(1, 2);
        valueProcessor.process(messageStream);
        this.a = valueProcessor.b();
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) {
        ValueProcessor valueProcessor = new ValueProcessor(1, 2);
        valueProcessor.process(this.a);
        valueProcessor.process(var1);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        ValueProcessor valueProcessor = new ValueProcessor(1, 2);
        valueProcessor.process(this.a);
        var1.a(this.tagKey, 454, valueProcessor.f(), 1);
    }
}
