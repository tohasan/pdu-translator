package org.tohasan.pduxml.lib.infra;

import org.tohasan.pduxml.lib.infra.Misc;
import org.tohasan.pduxml.lib.infra.XmlPduException;
import org.tohasan.pduxml.lib.infra.e;
import org.tohasan.pduxml.lib.infra.h;
import org.tohasan.pduxml.lib.infra.i;
import org.tohasan.pduxml.lib.infra.m;
import org.tohasan.pduxml.lib.infra.n;

public class g extends e {
   private byte[] c;
   public int a;

   public final void a(m var1) throws XmlPduException {
      this.c = Misc.hexStrToByteArray(var1.f(454));
      if(this.a != -1 && this.c.length != this.a) {
         throw new XmlPduException("OctetString: Illegal data size, expected " + String.valueOf(this.a) + " found " + this.c.length);
      }
   }

   public final void a(i var1) throws XmlPduException {
      int var2;
      if(this.a == -1) {
         Misc.encodeVarLengthUnsignedInteger(var1, this.c.length);
         var2 = this.c.length;
      } else {
         var2 = this.a;
      }

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.write(this.c[var3]);
      }

   }

   public final void a(h var1) throws XmlPduException {
      int var3;
      if(this.a == -1) {
         var3 = Misc.decodeVarLengthUnsignedInteger(var1);
      } else {
         var3 = this.a;
      }

      this.c = new byte[var3];

      for(int var2 = 0; var2 < var3; ++var2) {
         this.c[var2] = (byte)var1.a();
      }

   }

   public final void a(n var1) throws XmlPduException {
      var1.a(this.b, 454, Misc.byteArraytoHexStr(this.c), 1);
   }
}
