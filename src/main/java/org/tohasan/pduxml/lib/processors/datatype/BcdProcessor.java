package org.tohasan.pduxml.lib.processors.datatype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ValueProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class BcdProcessor extends MessageByteProcessor {
    private int a;

    public BcdProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 221;
        var2.b(221);
        byte[] var4;
        if ((var4 = CommonUtils.hexStrToByteArray(var2.f(454))).length != 1) {
            throw new XmlPduException("_Bcd: Illegal data size, expected " + "1" + " ,found " + var4.length);
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(1, 1)).process(var4);
            this.a = var3.b();
            var2.a();
        }
    }

    public BcdProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 221;
        ValueProcessor valueProcessor = new ValueProcessor(1, 1);
        valueProcessor.process(messageInputStream);
        this.a = valueProcessor.b();
    }

    public final void a(MessageOutputStream messageOutputStream) {
        ValueProcessor var2;
        (var2 = new ValueProcessor(1, 1)).process(this.a);
        var2.process(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        ValueProcessor var2;
        (var2 = new ValueProcessor(1, 1)).process(this.a);
        var1.appendEmptyTag(this.tagKey, 454, var2.f());
    }
}
