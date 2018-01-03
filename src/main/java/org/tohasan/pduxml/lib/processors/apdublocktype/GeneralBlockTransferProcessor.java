package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.datatype.LongUnsignedProcessor;
import org.tohasan.pduxml.lib.processors.datatype.OctetStringProcessor;
import org.tohasan.pduxml.lib.processors.generalblocktransfer.BlockControlProcessor;

public final class GeneralBlockTransferProcessor extends MessageByteProcessor {
    private BlockControlProcessor a;
    private LongUnsignedProcessor c;
    private LongUnsignedProcessor d;
    private OctetStringProcessor e;

    public GeneralBlockTransferProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 277;
        var2.c(277);
        this.a = new BlockControlProcessor(var2);
        this.c = new LongUnsignedProcessor(225, var2);
        this.d = new LongUnsignedProcessor(227, var2);
        this.e = new OctetStringProcessor(224, var2);
        var2.d(277);
    }

    public GeneralBlockTransferProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 277;
        this.a = new BlockControlProcessor(messageInputStream);
        this.c = new LongUnsignedProcessor(225, messageInputStream);
        this.d = new LongUnsignedProcessor(227, messageInputStream);
        this.e = new OctetStringProcessor(224, messageInputStream);
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        this.a.a(messageOutputStream);
        this.c.a(messageOutputStream);
        this.d.a(messageOutputStream);
        this.e.a(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
        this.a.a(var1);
        this.c.a(var1);
        this.d.a(var1);
        this.e.a(var1);
        var1.b();
        var1.b(this.tagKey);
    }
}
