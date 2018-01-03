package org.tohasan.pduxml.lib.processors.variableaccessspec;

import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.ParameterProcessor;
import org.tohasan.pduxml.lib.processors.datatype.SelectorProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

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

    public final void a(MessageOutputStream var1) throws XmlPduException {
        this.variableNameProcessor.a(var1);
        this.selectorProcessor.a(var1);
        this.parameterProcessor.a(var1);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        this.variableNameProcessor.a(var1);
        this.selectorProcessor.a(var1);
        this.parameterProcessor.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
