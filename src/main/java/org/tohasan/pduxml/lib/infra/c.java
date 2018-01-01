package org.tohasan.pduxml.lib.infra;

import org.tohasan.pduxml.lib.infra.Misc;
import org.tohasan.pduxml.lib.infra.XmlPduException;
import org.tohasan.pduxml.lib.infra.e;
import org.tohasan.pduxml.lib.infra.h;
import org.tohasan.pduxml.lib.infra.i;
import org.tohasan.pduxml.lib.infra.m;
import org.tohasan.pduxml.lib.infra.n;

public class c extends e {
   private byte[] a;

   public final void a(m var1) throws XmlPduException {
      this.a = Misc.hexStrToByteArray(var1.f(454));
   }

   public final void a(i var1) throws XmlPduException {
      Misc.encodeVarLengthUnsignedInteger(var1, this.a.length);
      int var2 = this.a.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.write(this.a[var3]);
      }

   }

   public final void a(h var1) throws XmlPduException {
      int var3 = Misc.decodeVarLengthUnsignedInteger(var1);
      this.a = new byte[var3];

      for(int var2 = 0; var2 < var3; ++var2) {
         this.a[var2] = (byte)var1.a();
      }

   }

   public final void a(n var1) throws XmlPduException {
      var1.a(this.b, 454, Misc.byteArraytoHexStr(this.a), 1);
   }
}
