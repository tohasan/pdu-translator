package org.tohasan.pduxml.lib.processors.common;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.variableaccessspec.*;
import org.tohasan.pduxml.lib.utils.EnumUtils;

public final class VariableAccessSpecProcessor extends MessageByteProcessor {
    private int variableAccessSpecCode;
    private MessageByteProcessor processor;

    public VariableAccessSpecProcessor(int var1, XmlParser var2) throws XmlPduException {
        this.tagKey = 297;
        if (var2.a(456)) {
            this.variableAccessSpecCode = 2;
            this.processor = new VariableNameProcessor(456, var2);
        } else if (var2.a(368)) {
            this.variableAccessSpecCode = 4;
            this.processor = new ParametrizedAccessProcessor(368, var2);
        } else if (var2.a(226)) {
            this.variableAccessSpecCode = 5;
            this.processor = new BlockNumberAccessProcessor(226, var2);
        } else if (var2.a(384)) {
            this.variableAccessSpecCode = 6;
            this.processor = new ReadDataBlockAccessProcessor(384, var2);
        } else if (var2.a(461)) {
            this.variableAccessSpecCode = 7;
            this.processor = new WriteDataBlockAccessProcessor(461, var2);
        } else {
            throw new XmlPduException("_VariableAccessSpecification: illegal choice");
        }
    }

    public VariableAccessSpecProcessor(int var1, MessageInputStream messageByteStream) throws XmlPduException {
        this.tagKey = 161;
        this.variableAccessSpecCode = messageByteStream.readByte();
        VariableAccessSpecType specType = EnumUtils.fromCode(VariableAccessSpecType.class, variableAccessSpecCode);

        if (specType == null) {
            throw new XmlPduException(
                    "_VariableAccessSpecification (from pdu) : illegal tag - "
                            + String.valueOf(this.variableAccessSpecCode)
            );
        }

        switch (specType) {
            case VARIABLE_NAME:
                this.processor = new VariableNameProcessor(456, messageByteStream);
                return;
            case PARAMETRIZED_ACCESS:
                this.processor = new ParametrizedAccessProcessor(368, messageByteStream);
                return;
            case BLOCK_NUMBER_ACCESS:
                this.processor = new BlockNumberAccessProcessor(226, messageByteStream);
                return;
            case READ_DATA_BLOCK_ACCESS:
                this.processor = new ReadDataBlockAccessProcessor(384, messageByteStream);
                return;
            case WRITE_DATA_BLOCK_ACCESS:
                this.processor = new WriteDataBlockAccessProcessor(461, messageByteStream);
        }
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write((byte) this.variableAccessSpecCode);
        this.processor.encode(messageOutputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        if (this.tagKey != 297) {
            xmlOutputBuilder.appendTag(this.tagKey);
            xmlOutputBuilder.addIndent();
            this.processor.printTo(xmlOutputBuilder);
            xmlOutputBuilder.removeIndent();
            xmlOutputBuilder.appendClosingTag(this.tagKey);
        } else {
            this.processor.printTo(xmlOutputBuilder);
        }
    }
}
