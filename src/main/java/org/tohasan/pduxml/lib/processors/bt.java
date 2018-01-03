package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.*;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.utils.CommonUtils;

import java.io.ByteArrayOutputStream;

public final class bt extends MessageByteProcessor {
    private int a;

    public bt(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 362;
        var2.b(362);
        byte[] var4;
        if ((var4 = CommonUtils.hexStrToByteArray(var2.f(454))).length != 1) {
            throw new XmlPduException("_OtherError: Illegal data size, expected " + "1" + " ,found " + var4.length);
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(1, 2)).process(var4);
            this.a = var3.b();
            var2.a();
        }
    }

    public final void a(MessageOutputStream messageOutputStream) {
        ValueProcessor var2;
        (var2 = new ValueProcessor(1, 2)).process(this.a);
        var2.process(messageOutputStream);
    }

    public bt(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 362;
        ValueProcessor var3;
        (var3 = new ValueProcessor(1, 2)).process(var2);
        this.a = var3.b();
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        ValueProcessor var2;
        (var2 = new ValueProcessor(1, 2)).process(this.a);
        var1.appendEmptyTag(this.tagKey, 454, var2.f());
    }
}
