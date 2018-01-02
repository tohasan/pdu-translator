package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bi extends MessageByteProcessor {
    private int a;

    public bi(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
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

    public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
        var1.write((byte) this.a);
    }

    public bi(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 318;
        this.a = var2.readByte();
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
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

        var1.a(this.tagKey, 454, var2, 1);
    }
}
