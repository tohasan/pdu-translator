package org.tohasan.pduxml.lib.processors.common;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.variableaccessspec.*;
import org.tohasan.pduxml.lib.utils.EnumUtils;

public final class VariableAccessSpecProcessor extends MessageByteProcessor {
    private int variableAccessSpecCode;
    private MessageByteProcessor processor;

    public VariableAccessSpecProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
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

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write((byte) this.variableAccessSpecCode);
        this.processor.a(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        if (this.tagKey != 297) {
            var1.appendTag(this.tagKey);
            var1.appendWithNewLine();
            this.processor.a(var1);
            var1.b();
            var1.b(this.tagKey);
        } else {
            this.processor.a(var1);
        }
    }
}
