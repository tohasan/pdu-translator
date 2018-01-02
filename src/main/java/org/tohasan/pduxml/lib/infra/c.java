package org.tohasan.pduxml.lib.infra;

public class c extends MessageByteProcessor {
    private byte[] a;

    public final void a(m var1) throws XmlPduException {
        this.a = Misc.hexStrToByteArray(var1.f(454));
    }

    public final void a(i var1) throws XmlPduException {
        Misc.encodeVarLengthUnsignedInteger(var1, this.a.length);
        int var2 = this.a.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            var1.write(this.a[var3]);
        }

    }

    public final void a(MessageInputStream var1) throws XmlPduException {
        int var3 = Misc.decodeVarLengthUnsignedInteger(var1);
        this.a = new byte[var3];

        for (int var2 = 0; var2 < var3; ++var2) {
            this.a[var2] = (byte) var1.readByte();
        }

    }

    public final void a(n var1) throws XmlPduException {
        var1.a(this.tagKey, 454, Misc.byteArraytoHexStr(this.a), 1);
    }
}
