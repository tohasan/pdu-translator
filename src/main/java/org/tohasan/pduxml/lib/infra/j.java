package org.tohasan.pduxml.lib.infra;

import org.tohasan.pduxml.lib.infra.Misc;
import org.tohasan.pduxml.lib.infra.XmlPduException;
import org.tohasan.pduxml.lib.infra.e;
import org.tohasan.pduxml.lib.infra.i;
import org.tohasan.pduxml.lib.infra.k;
import org.tohasan.pduxml.lib.infra.n;

public abstract class j extends e {
   public e[] a;

   public final void a(i var1) throws XmlPduException {
      Misc.encodeVarLengthUnsignedInteger(var1, this.a.length);

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2].a(var1);
      }

   }

   public final void a(n var1, int var2) throws XmlPduException {
      int var4;
      if((var4 = this.a.length) > k.a) {
         var4 = k.a;
      }

      var1.a(this.b, 381, Misc.intToHex(var4, true), 0);
      var1.a();

      for(int var5 = 0; var5 < var4; ++var5) {
         e var3 = this.a[var5];
         if(var2 == 1) {
            var3.b = 297;
         }

         var3.a(var1);
      }

      var1.b();
      var1.b(this.b);
   }
}
