package org.tohasan.pduxml.lib.infra;

import org.tohasan.pduxml.lib.utils.CommonUtils;

import java.io.ByteArrayOutputStream;

public final class ValueProcessor {
    private byte[] a;
    private int b;
    private int c;

    public ValueProcessor(int var1, int var2) {
        this.b = var1;
        this.c = var2;
        this.a = new byte[var1];
    }

    public final void process(byte[] var1) throws XmlPduException {
        if (var1.length != this.b) {
            throw new XmlPduException("ValueBox.setValue");
        } else {
            for (int var2 = 0; var2 < this.b; ++var2) {
                this.a[var2] = var1[var2];
            }
        }
    }

    public final boolean process() {
        return this.a[0] != 0;
    }

    public final void process(boolean var1) {
        if (var1) {
            this.a[0] = 1;
        } else {
            this.a[0] = 0;
        }
    }

    public final int b() {
        int var1 = 0;
        if (this.c == 1 && (this.a[0] & 128) != 0) {
            var1 = -1;
        }

        for (int var2 = 0; var2 < this.b; ++var2) {
            var1 = (var1 << 8) + (this.a[var2] & 255);
        }

        return var1;
    }

    public final void process(int var1) {
        for (int var2 = this.b - 1; var2 >= 0; --var2) {
            this.a[var2] = (byte) var1;
            var1 >>= 8;
        }
    }

    public final long c() {
        long var1 = 0L;

        for (int var3 = 0; var3 < this.b; ++var3) {
            var1 = (var1 << 8) + (long) (this.a[var3] & 255);
        }

        return var1;
    }

    public final void process(long var1) {
        for (int var3 = this.b - 1; var3 >= 0; --var3) {
            this.a[var3] = (byte) ((int) (var1 & 255L));
            var1 >>= 8;
        }

    }

    public final float d() {
        return Float.intBitsToFloat(this.b());
    }

    public final void process(float var1) {
        this.process(Float.floatToRawIntBits(var1));
    }

    public final double e() {
        return Double.longBitsToDouble(this.c());
    }

    public final void process(double var1) {
        this.process(Double.doubleToRawLongBits(var1));
    }

    public final void process(ByteArrayOutputStream var1) {
        for (int var2 = 0; var2 < this.b; ++var2) {
            var1.write(this.a[var2]);
        }
    }

    public final void process(MessageInputStream messageStream) throws XmlPduException {
        for (int i = 0; i < this.b; i++) {
            this.a[i] = (byte) messageStream.readByte();
        }
    }

    public final StringBuffer f() {
        return CommonUtils.byteArraytoHexStr(this.a);
    }
}
