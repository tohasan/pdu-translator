package org.tohasan.pduxml.lib.processors.variableaccessspec;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.ParameterProcessor;
import org.tohasan.pduxml.lib.processors.datatype.SelectorProcessor;

public final class ParametrizedAccessProcessor extends MessageByteProcessor {
    private VariableNameProcessor variableNameProcessor;
    private SelectorProcessor selectorProcessor;
    private ParameterProcessor parameterProcessor;

    public ParametrizedAccessProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
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

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.variableNameProcessor.a(messageOutputStream);
        this.selectorProcessor.a(messageOutputStream);
        this.parameterProcessor.a(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        this.variableNameProcessor.a(var1);
        this.selectorProcessor.a(var1);
        this.parameterProcessor.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
