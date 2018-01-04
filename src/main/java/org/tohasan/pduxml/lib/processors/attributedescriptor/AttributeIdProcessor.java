package org.tohasan.pduxml.lib.processors.attributedescriptor;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ValueProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class AttributeIdProcessor extends MessageByteProcessor {
    private int a;

    public AttributeIdProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 219;
        var2.b(219);
        byte[] var4;

        if ((var4 = CommonUtils.hexStrToByteArray(var2.f(454))).length != 1) {
            throw new XmlPduException(
                    "_ObjectAttributeId: Illegal data size, expected " + "1" + " ,found "
                            + var4.length
            );
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(1, 1)).process(var4);
            this.a = var3.b();
            var2.a();
        }
    }

    public AttributeIdProcessor(MessageInputStream var2) throws XmlPduException {
        this.tagKey = 219;
        ValueProcessor valueProcessor = new ValueProcessor(1, 1);
        valueProcessor.process(var2);
        this.a = valueProcessor.b();
    }

    public final void encode(MessageOutputStream messageOutputStream) {
        ValueProcessor valueProcessor = new ValueProcessor(1, 1);
        valueProcessor.process(this.a);
        valueProcessor.process(messageOutputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        ValueProcessor valueProcessor = new ValueProcessor(1, 1);
        valueProcessor.process(this.a);
        xmlOutputBuilder.appendEmptyTag(this.tagKey, 454, valueProcessor.f());
    }
}
