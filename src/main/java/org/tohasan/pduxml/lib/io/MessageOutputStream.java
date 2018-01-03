package org.tohasan.pduxml.lib.io;

import java.io.ByteArrayOutputStream;

public final class MessageOutputStream extends ByteArrayOutputStream {
    public final void a(int var1, int var2) {
        this.buf[var1] = (byte) var2;
    }
}
