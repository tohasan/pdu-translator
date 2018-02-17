package org.tohasan.pduxml.lib.processors.readresponse;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.datatype.BooleanProcessor;
import org.tohasan.pduxml.lib.processors.datatype.LongUnsignedProcessor;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;

public final class TransferBlockProcessor extends MessageByteProcessor {
    private BooleanProcessor isLastBlock;
    private LongUnsignedProcessor blockNumber;
    private OctetStringProcessor dataBlockLength;

    TransferBlockProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 255;
        var2.c(255);
        this.isLastBlock = new BooleanProcessor(314, var2);
        this.blockNumber = new LongUnsignedProcessor(225, var2);
        this.dataBlockLength = new OctetStringProcessor(382, var2);
        var2.d(255);
    }

    TransferBlockProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 255;
        this.isLastBlock = new BooleanProcessor(314, messageInputStream);
        this.blockNumber = new LongUnsignedProcessor(225, messageInputStream);
        this.dataBlockLength = new OctetStringProcessor(382, messageInputStream);
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.isLastBlock.encode(messageOutputStream);
        this.blockNumber.encode(messageOutputStream);
        this.dataBlockLength.encode(messageOutputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendTag(this.tagKey);
        xmlOutputBuilder.addIndent();
        this.isLastBlock.printTo(xmlOutputBuilder);
        this.blockNumber.printTo(xmlOutputBuilder);
        this.dataBlockLength.printTo(xmlOutputBuilder);
        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
