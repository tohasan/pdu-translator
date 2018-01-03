package org.tohasan.pduxml.lib.processors;

import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.infra.MessageByteProcessor;
import org.tohasan.pduxml.lib.io.MessageOutputStream;
import org.tohasan.pduxml.lib.exceptions.XmlPduException;

public final class H_ extends MessageByteProcessor {
    private int a;

    public H_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
        this.tagKey = 403;
        var2.b(403);
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
        } else if (var3.equals("LongActionAborted")) {
            this.a = 15;
        } else if (var3.equals("NoLongActionInProgress")) {
            this.a = 16;
        } else {
            if (!var3.equals("OtherReason")) {
                throw new XmlPduException("_ActionResult: illegal element " + var3);
            }

            this.a = 250;
        }

        var2.a();
    }

    public final void a(MessageOutputStream var1) throws XmlPduException {
        var1.write((byte) this.a);
    }

    public H_(int var1, MessageInputStream var2) throws XmlPduException {
        this.tagKey = 403;
        this.a = var2.readByte();
    }

    public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
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
                var2.append("LongActionAborted");
                break;
            case 16:
                var2.append("NoLongActionInProgress");
                break;
            case 250:
                var2.append("OtherReason");
                break;
            default:
                throw new XmlPduException("_ActionResult: case range");
        }

        var1.a(this.tagKey, 454, var2, 1);
    }
}
