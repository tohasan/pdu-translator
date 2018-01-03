package org.tohasan.pduxml.lib.processors.apdublocktype;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.common.UserInformationProcessor;
import org.tohasan.pduxml.lib.processors.releaseresponse.ReasonProcessor;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class ReleaseResponseProcessor extends MessageByteProcessor {
    private ReasonProcessor a;
    private UserInformationProcessor c;

    public ReleaseResponseProcessor(XmlParser var2) throws XmlPduException {
        this.tagKey = 392;
        var2.c(392);
        if (var2.a(388)) {
            this.a = new ReasonProcessor(var2);
        }

        if (var2.a(452)) {
            this.c = new UserInformationProcessor(452, var2);
        }

        var2.d(392);
    }

    public ReleaseResponseProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 392;
        CommonUtils.decodeVarLengthUnsignedInteger(messageInputStream);

        int var1;
        while (messageInputStream.c() > 0) {
            switch (var1 = messageInputStream.readByte()) {
                case 128:
                    this.a = new ReasonProcessor(messageInputStream);
                    break;
                case 190:
                    messageInputStream.readByte();
                    if ((var1 = messageInputStream.readByte()) != 4) {
                        throw new XmlPduException("_ReleaseResponse: Unexpected tag2 ".concat(Integer.toString(var1)));
                    }

                    this.c = new UserInformationProcessor(452, messageInputStream);
                    break;
                default:
                    throw new XmlPduException("_ReleaseResponse: Unexpected tag1 ".concat(Integer.toString(var1)));
            }
        }
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
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

        CommonUtils.encodeVarLengthUnsignedInteger(messageOutputStream, var3.size());
        messageOutputStream.write(var3.toByteArray(), 0, var3.size());
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        var1.appendTag(this.tagKey);
        var1.appendWithNewLine();
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
