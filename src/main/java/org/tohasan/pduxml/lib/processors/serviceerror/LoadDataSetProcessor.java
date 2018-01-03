package org.tohasan.pduxml.lib.processors.serviceerror;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.infra.XmlOutputBuilder;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;

public final class LoadDataSetProcessor extends MessageByteProcessor {
    private int a;

    public LoadDataSetProcessor(org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 318;
        var2.b(318);
        String var3;
        if ((var3 = var2.f(454).toString()).equals("Other")) {
            this.a = 0;
        } else if (var3.equals("PrimitiveOutOfSequence")) {
            this.a = 1;
        } else if (var3.equals("NotLoadable")) {
            this.a = 2;
        } else if (var3.equals("DatasetSizeTooLarge")) {
            this.a = 3;
        } else if (var3.equals("NotAwaitedSegment")) {
            this.a = 4;
        } else if (var3.equals("InterpretationFailure")) {
            this.a = 5;
        } else if (var3.equals("StorageFailure")) {
            this.a = 6;
        } else {
            if (!var3.equals("DataSetNotReady")) {
                throw new XmlPduException("_LoadDataSet: illegal element " + var3);
            }

            this.a = 7;
        }

        var2.a();
    }

    public LoadDataSetProcessor(MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = 318;
        this.a = messageInputStream.readByte();
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write((byte) this.a);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        StringBuffer var2 = new StringBuffer();
        switch (this.a) {
            case 0:
                var2.append("Other");
                break;
            case 1:
                var2.append("PrimitiveOutOfSequence");
                break;
            case 2:
                var2.append("NotLoadable");
                break;
            case 3:
                var2.append("DatasetSizeTooLarge");
                break;
            case 4:
                var2.append("NotAwaitedSegment");
                break;
            case 5:
                var2.append("InterpretationFailure");
                break;
            case 6:
                var2.append("StorageFailure");
                break;
            case 7:
                var2.append("DataSetNotReady");
                break;
            default:
                throw new XmlPduException("_LoadDataSet: case range");
        }

        var1.appendEmptyTag(this.tagKey, 454, var2);
    }
}
