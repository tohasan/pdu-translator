package org.tohasan.pduxml.lib.processors.common;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.XmlOutputBuilder;
import org.tohasan.pduxml.lib.utils.XmlParser;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.processors.MessageByteProcessor;

public final class ResultProcessor extends MessageByteProcessor {
    private int a;

    public ResultProcessor(int var1, XmlParser var2) throws XmlPduException {
        this.tagKey = var1;
        var2.b(var1);
        String var3;
        if ((var3 = var2.f(454).toString()).equals("Success")) {
            this.a = 0;
        } else if (var3.equals("HardwareFault")) {
            this.a = 1;
        } else if (var3.equals("TemporaryFailure")) {
            this.a = 2;
        } else if (var3.equals("ReadWriteDenied")) {
            this.a = 3;
        } else if (var3.equals("ObjectUndefined")) {
            this.a = 4;
        } else if (var3.equals("ObjectClassInconsistent")) {
            this.a = 9;
        } else if (var3.equals("ObjectUnavailable")) {
            this.a = 11;
        } else if (var3.equals("TypeUnmatched")) {
            this.a = 12;
        } else if (var3.equals("ScopeOfAccessViolated")) {
            this.a = 13;
        } else if (var3.equals("DataBlockUnavailable")) {
            this.a = 14;
        } else if (var3.equals("LongGetOrReadAborted")) {
            this.a = 15;
        } else if (var3.equals("NoLongGetOrReadInProgress")) {
            this.a = 16;
        } else if (var3.equals("LongSetOrWriteAborted")) {
            this.a = 17;
        } else if (var3.equals("NoLongSetOrWriteInProgress")) {
            this.a = 18;
        } else if (var3.equals("DataBlockNumberInvalid")) {
            this.a = 19;
        } else {
            if (!var3.equals("OtherReason")) {
                throw new XmlPduException("_DataAccessResult: illegal element " + var3);
            }

            this.a = 250;
        }

        var2.a();
    }

    public ResultProcessor(int tagKey, MessageInputStream messageInputStream) throws XmlPduException {
        this.tagKey = tagKey;
        this.a = messageInputStream.readByte();
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write((byte) this.a);
    }

    public final void a(XmlOutputBuilder var1) throws XmlPduException {
        StringBuffer var2 = new StringBuffer();
        switch (this.a) {
            case 0:
                var2.append("Success");
                break;
            case 1:
                var2.append("HardwareFault");
                break;
            case 2:
                var2.append("TemporaryFailure");
                break;
            case 3:
                var2.append("ReadWriteDenied");
                break;
            case 4:
                var2.append("ObjectUndefined");
                break;
            case 9:
                var2.append("ObjectClassInconsistent");
                break;
            case 11:
                var2.append("ObjectUnavailable");
                break;
            case 12:
                var2.append("TypeUnmatched");
                break;
            case 13:
                var2.append("ScopeOfAccessViolated");
                break;
            case 14:
                var2.append("DataBlockUnavailable");
                break;
            case 15:
                var2.append("LongGetOrReadAborted");
                break;
            case 16:
                var2.append("NoLongGetOrReadInProgress");
                break;
            case 17:
                var2.append("LongSetOrWriteAborted");
                break;
            case 18:
                var2.append("NoLongSetOrWriteInProgress");
                break;
            case 19:
                var2.append("DataBlockNumberInvalid");
                break;
            case 250:
                var2.append("OtherReason");
                break;
            default:
                throw new XmlPduException("_DataAccessResult: case range");
        }

        var1.appendEmptyTag(this.tagKey, 454, var2);
    }
}
