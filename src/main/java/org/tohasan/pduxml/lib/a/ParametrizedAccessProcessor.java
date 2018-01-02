package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.datatype.UnsignedProcessor;
import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class ParametrizedAccessProcessor extends MessageByteProcessor {
    private VariableNameProcessor a;
    private UnsignedProcessor c;
    private ParameterProcessor d;

    ParametrizedAccessProcessor(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 368;
        var2.c(368);
        this.a = new VariableNameProcessor(456, var2);
        this.c = new UnsignedProcessor(408, var2);
        this.d = new ParameterProcessor(367, var2);
        var2.d(368);
    }

    ParametrizedAccessProcessor(int tagKey, MessageInputStream messageByteStream) throws XmlPduException {
        this.tagKey = 368;
        this.a = new VariableNameProcessor(456, messageByteStream);
        this.c = new UnsignedProcessor(408, messageByteStream);
        this.d = new ParameterProcessor(367, messageByteStream);
    }

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
