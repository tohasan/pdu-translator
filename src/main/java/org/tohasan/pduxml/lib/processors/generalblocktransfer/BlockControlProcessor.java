package org.tohasan.pduxml.lib.processors.generalblocktransfer;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ValueProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class BlockControlProcessor extends MessageByteProcessor {
    private int a;

    public BlockControlProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 223;
        var2.b(223);
        byte[] var4;
        if ((var4 = CommonUtils.hexStrToByteArray(var2.f(454))).length != 1) {
            throw new XmlPduException("_BlockControl: Illegal data size, expected " + "1" + " ,found " + var4.length);
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(1, 2)).process(var4);
            this.a = var3.b();
            var2.a();
        }
    }

    public BlockControlProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 223;
        ValueProcessor var3;
        (var3 = new ValueProcessor(1, 2)).process(messageInputStream);
        this.a = var3.b();
    }

    public final void encode(MessageOutputStream messageOutputStream) {
        ValueProcessor var2;
        (var2 = new ValueProcessor(1, 2)).process(this.a);
        var2.process(messageOutputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        ValueProcessor var2;
        (var2 = new ValueProcessor(1, 2)).process(this.a);
        xmlOutputBuilder.appendEmptyTag(this.tagKey, 454, var2.f());
    }
}
