package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.*;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class c extends MessageByteProcessor {
    private int a;

    public c(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 169;
        var2.b(169);
        byte[] var4;
        if ((var4 = CommonUtils.hexStrToByteArray(var2.f(454))).length != 1) {
            throw new XmlPduException("_ACSEServiceProvider: Illegal data size, expected " + "1" + " ,found " + var4.length);
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(1, 2)).process(var4);
            this.a = var3.b();
            var2.a();
        }
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        ValueProcessor var2;
        (var2 = new ValueProcessor(1, 2)).process(this.a);
        var1.write(1);
        var2.process(var1);
    }

    public c(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 169;
        if ((var1 = var2.readByte()) != 1) {
            throw new XmlPduException("_ACSEServiceProvider: Illegal data size, expected " + "1" + " ,found " + var1);
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(1, 2)).process(var2);
            this.a = var3.b();
        }
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        ValueProcessor var2;
        (var2 = new ValueProcessor(1, 2)).process(this.a);
        var1.a(this.tagKey, 454, var2.f(), 1);
    }
}
