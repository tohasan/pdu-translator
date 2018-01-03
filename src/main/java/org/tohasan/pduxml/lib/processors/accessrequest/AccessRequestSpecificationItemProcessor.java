package org.tohasan.pduxml.lib.processors.accessrequest;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;
import org.tohasan.pduxml.lib.processors.accessrequestspecification.*;

public final class AccessRequestSpecificationItemProcessor extends MessageByteProcessor {
    private int a;
    private MessageByteProcessor c;

    AccessRequestSpecificationItemProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 14;
        var2.c(14);

        if (var2.a(176)) {
            this.a = 1;
            this.c = new AccessRequestGetProcessor(var2);
        } else if (var2.a(179)) {
            this.a = 2;
            this.c = new AccessRequestSetProcessor(var2);
        } else if (var2.a(174)) {
            this.a = 3;
            this.c = new AccessRequestActionProcessor(var2);
        } else if (var2.a(177)) {
            this.a = 4;
            this.c = new AccessRequestGetWithSelectionProcessor(var2);
        } else {
            if (!var2.a(180)) {
                throw new XmlPduException("_AccessRequestSpecification: illegal choice");
            }

            this.a = 5;
            this.c = new AccessRequestSetWithSelectionProcessor(var2);
        }

        var2.d(14);
    }

    AccessRequestSpecificationItemProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 14;
        this.a = messageInputStream.readByte();

        switch (this.a) {
            case 1:
                this.c = new AccessRequestGetProcessor(messageInputStream);
                return;
            case 2:
                this.c = new AccessRequestSetProcessor(messageInputStream);
                return;
            case 3:
                this.c = new AccessRequestActionProcessor(messageInputStream);
                return;
            case 4:
                this.c = new AccessRequestGetWithSelectionProcessor(messageInputStream);
                return;
            case 5:
                this.c = new AccessRequestSetWithSelectionProcessor(messageInputStream);
                return;
            default:
                throw new XmlPduException(
                        "_AccessRequestSpecification (from pdu) : illegal tag - "
                                + String.valueOf(this.a)
                );
        }
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write((byte) this.a);
        this.c.a(messageOutputStream);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        if (this.tagKey != 297) {
            var1.appendTag(this.tagKey);
            var1.appendWithNewLine();
            this.c.a(var1);
            var1.b();
            var1.b(this.tagKey);
        } else {
            this.c.a(var1);
        }
    }
}
