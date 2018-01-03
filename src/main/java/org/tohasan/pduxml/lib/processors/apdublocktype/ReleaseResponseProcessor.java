package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.S_;
import org.tohasan.pduxml.lib.processors.bC_;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class ReleaseResponseProcessor extends MessageByteProcessor {
    private bC_ a;
    private S_ c;

    public ReleaseResponseProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 392;
        var2.c(392);
        if (var2.a(388)) {
            this.a = new bC_(388, var2);
        }

        if (var2.a(452)) {
            this.c = new S_(452, var2);
        }

        var2.d(392);
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        MessageOutputStream var3 = new MessageOutputStream();
        if (this.a != null) {
            var3.write(128);
            this.a.a(var3);
        }

        if (this.c != null) {
            var3.write(190);
            var3.write(0);
            int var2 = var3.size() - 1;
            var3.write(4);
            this.c.a(var3);
            var3.a(var2, (byte) (var3.size() - var2 - 1));
        }

        CommonUtils.encodeVarLengthUnsignedInteger(var1, var3.size());
        var1.write(var3.toByteArray(), 0, var3.size());
    }

    public ReleaseResponseProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 392;
        CommonUtils.decodeVarLengthUnsignedInteger(messageInputStream);

        int var1;
        while (messageInputStream.c() > 0) {
            switch (var1 = messageInputStream.readByte()) {
                case 128:
                    this.a = new bC_(388, messageInputStream);
                    break;
                case 190:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 4) {
                        throw new XmlPduException("_ReleaseResponse: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.c = new S_(452, messageInputStream);
                    break;
                default:
                    throw new XmlPduException("_ReleaseResponse: Unexpected tag1 ".concat(Integer.toString(var1)));
            }
        }

    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
        var1.a(this.tagKey);
        var1.a();
        if (this.a != null) {
            this.a.a(var1);
        }

        if (this.c != null) {
            this.c.a(var1);
        }

        var1.b();
        var1.b(this.tagKey);
    }
}
