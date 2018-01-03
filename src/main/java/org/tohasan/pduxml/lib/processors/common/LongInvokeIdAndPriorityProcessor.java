package org.tohasan.pduxml.lib.processors.common;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class LongInvokeIdAndPriorityProcessor extends MessageByteProcessor {
    private int a;

    public LongInvokeIdAndPriorityProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 325;
        var2.b(325);
        byte[] var4;

        if ((var4 = CommonUtils.hexStrToByteArray(var2.f(454))).length != 4) {
            throw new XmlPduException("_LongInvokeIdAndPriority: Illegal data size, expected " + "4" + " ,found " + var4.length);
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(4, 2)).process(var4);
            this.a = var3.b();
            var2.a();
        }
    }

    public LongInvokeIdAndPriorityProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 325;
        ValueProcessor var3;
        (var3 = new ValueProcessor(4, 2)).process(messageInputStream);
        this.a = var3.b();
    }

    public final void a(MessageOutputStream messageOutputStream) {
        ValueProcessor var2;
        (var2 = new ValueProcessor(4, 2)).process(this.a);
        var2.process(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        ValueProcessor var2;
        (var2 = new ValueProcessor(4, 2)).process(this.a);
        var1.appendEmptyTag(this.tagKey, 454, var2.f());
    }
}
