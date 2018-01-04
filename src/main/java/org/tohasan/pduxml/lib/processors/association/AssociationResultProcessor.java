package org.tohasan.pduxml.lib.processors.association;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ValueProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class AssociationResultProcessor extends MessageByteProcessor {
    private int a;

    public AssociationResultProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 213;
        var2.b(213);
        byte[] var4;

        if ((var4 = CommonUtils.hexStrToByteArray(var2.f(454))).length != 1) {
            throw new XmlPduException("_AssociationResult: Illegal data size, expected " + "1" + " ,found " + var4.length);
        } else {
            ValueProcessor var3;
            (var3 = new ValueProcessor(1, 2)).process(var4);
            this.a = var3.b();
            var2.a();
        }
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        ValueProcessor valueProcessor = new ValueProcessor(1, 2);
        valueProcessor.process(this.a);
        messageOutputStream.write(1);
        valueProcessor.process(messageOutputStream);
    }

    public AssociationResultProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 213;
        int var1;

        if ((var1 = messageInputStream.readByte()) != 1) {
            throw new XmlPduException("_AssociationResult: Illegal data size, expected " + "1" + " ,found " + var1);
        } else {
            ValueProcessor valueProcessor = new ValueProcessor(1, 2);
            valueProcessor.process(messageInputStream);
            this.a = valueProcessor.b();
        }
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        ValueProcessor valueProcessor = new ValueProcessor(1, 2);
        valueProcessor.process(this.a);
        xmlOutputBuilder.appendEmptyTag(this.tagKey, 454, valueProcessor.f());
    }
}
