package org.tohasan.pduxml.lib.infra;

import org.tohasan.pduxml.lib.infra.XmlPduException;
import java.io.ByteArrayInputStream;

public final class h extends ByteArrayInputStream {
   public h(byte[] var1) {
      super(var1);
   }

   public final int a() throws XmlPduException {
      int var1;
      if((var1 = super.read()) == -1) {
         throw new XmlPduException("EOS - End Of Stream reached");
      } else {
         return var1;
      }
   }

   public final void a(int var1) throws XmlPduException {
      if(this.a() != var1) {
         throw new XmlPduException("Illegal value " + String.valueOf(var1) + " in pdu at pos. " + this.pos);
      }
   }

   public final byte b() throws XmlPduException {
      byte var1 = (byte)this.a();
      --this.pos;
      return var1;
   }

   public final int c() {
      return this.count - this.pos;
   }
}
