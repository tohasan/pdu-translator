package org.tohasan.pduxml.lib.processors.variableaccessspec;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ParameterProcessor;
import org.tohasan.pduxml.lib.processors.datatype.SelectorProcessor;

public final class ParametrizedAccessProcessor extends MessageByteProcessor {
    private VariableNameProcessor variableNameProcessor;
    private SelectorProcessor selectorProcessor;
    private ParameterProcessor parameterProcessor;

    public ParametrizedAccessProcessor(int var1, XmlParser var2) throws XmlPduException {
        this.tagKey = 368;
        var2.c(368);
        this.variableNameProcessor = new VariableNameProcessor(456, var2);
        this.selectorProcessor = new SelectorProcessor(408, var2);
        this.parameterProcessor = new ParameterProcessor(367, var2);
        var2.d(368);
    }

    public ParametrizedAccessProcessor(int tagKey, MessageInputStream messageByteStream) throws XmlPduException {
        this.tagKey = 368;
        this.variableNameProcessor = new VariableNameProcessor(456, messageByteStream);
        this.selectorProcessor = new SelectorProcessor(408, messageByteStream);
        this.parameterProcessor = new ParameterProcessor(367, messageByteStream);
    }

    public final void encode(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.variableNameProcessor.encode(messageOutputStream);
        this.selectorProcessor.encode(messageOutputStream);
        this.parameterProcessor.encode(messageOutputStream);
    }

    public final void printTo(XmlOutputBuilder xmlOutputBuilder) throws XmlPduException {
        xmlOutputBuilder.appendTag(this.tagKey);
        xmlOutputBuilder.addIndent();
        this.variableNameProcessor.printTo(xmlOutputBuilder);
        this.selectorProcessor.printTo(xmlOutputBuilder);
        this.parameterProcessor.printTo(xmlOutputBuilder);
        xmlOutputBuilder.removeIndent();
        xmlOutputBuilder.appendClosingTag(this.tagKey);
    }
}
