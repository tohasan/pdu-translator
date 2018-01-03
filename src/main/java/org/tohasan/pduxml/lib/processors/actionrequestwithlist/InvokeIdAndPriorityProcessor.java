package org.tohasan.pduxml.lib.processors.actionrequestwithlist;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ValueProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class InvokeIdAndPriorityProcessor extends MessageByteProcessor {
    private int a;

    public InvokeIdAndPriorityProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 308;
        var2.b(308);
        byte[] var4;
        if ((var4 = CommonUtils.hexStrToByteArray(var2.f(454))).length != 1) {
            throw new XmlPduException(
                    "_InvokeIdAndPriority: Illegal data size, expected " + "1" + " ,found "
                            + var4.length
            );
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(1, 2)).process(var4);
            this.a = var3.b();
            var2.a();
        }
    }

    public InvokeIdAndPriorityProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 308;
        ValueProcessor valueProcessor = new ValueProcessor(1, 2);
        valueProcessor.process(var2);
        this.a = valueProcessor.b();
    }

    public final void a(MessageOutputStream messageOutputStream) {
        ValueProcessor valueProcessor = new ValueProcessor(1, 2);
        valueProcessor.process(this.a);
        valueProcessor.process(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        ValueProcessor valueProcessor = new ValueProcessor(1, 2);
        valueProcessor.process(this.a);
        var1.appendEmptyTag(this.tagKey, 454, valueProcessor.f());
    }
}
