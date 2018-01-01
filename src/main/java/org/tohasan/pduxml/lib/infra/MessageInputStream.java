package org.tohasan.pduxml.lib.infra;

import java.io.ByteArrayInputStream;

public final class MessageInputStream extends ByteArrayInputStream {
    public MessageInputStream(byte[] var1) {
        super(var1);
    }

    public final int readByte() throws XmlPduException {
        int var1;
        if ((var1 = super.read()) == -1) {
            throw new XmlPduException("EOS - End Of Stream reached");
        } else {
            return var1;
        }
    }

    public final void readByte(int var1) throws XmlPduException {
        if (this.readByte() != var1) {
            throw new XmlPduException("Illegal value " + String.valueOf(var1) + " in pdu at pos. " + this.pos);
        }
    }

    public final byte b() throws XmlPduException {
        byte var1 = (byte) this.readByte();
        --this.pos;
        return var1;
    }

    public final int c() {
        return this.count - this.pos;
    }
}
