package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.*;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.ValueProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class BooleanProcessor extends MessageByteProcessor {
    private boolean a;

    public BooleanProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = var1;
        var2.b(var1);
        byte[] var4;
        if ((var4 = CommonUtils.hexStrToByteArray(var2.f(454))).length != 1) {
            throw new XmlPduException("_Boolean: Illegal data size, expected " + "1" + " ,found " + var4.length);
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(1, 0)).process(var4);
            this.a = var3.process();
            var2.a();
        }
    }

    public final void a(MessageOutputStream messageOutputStream) {
        ValueProcessor var2;
        (var2 = new ValueProcessor(1, 0)).process(this.a);
        var2.process(messageOutputStream);
    }

    public BooleanProcessor(int tagKey, MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = tagKey;
        ValueProcessor valueProcessor= new ValueProcessor(1, 0);
        valueProcessor.process(messageInputStream);
        this.a = valueProcessor.process();
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        ValueProcessor var2;
        (var2 = new ValueProcessor(1, 0)).process(this.a);
        var1.appendEmptyTag(this.tagKey, 454, var2.f());
    }
}
