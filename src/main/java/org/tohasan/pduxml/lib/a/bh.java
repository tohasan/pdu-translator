package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.cf;
import org.tohasan.pduxml.lib.infra.Misc;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bh extends org.tohasan.pduxml.lib.infra.j {
   public bh(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = 317;
      var2.b(317);
      var1 = var2.e(381);
      this.a = new org.tohasan.pduxml.lib.infra.e[var1];
      var1 = 0;
      var2.a();

      while(var2.a == 1 && var1 < this.a.length) {
         this.a[var1++] = new cf(297, var2);
      }

      var2.d(317);
   }

   public bh(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = 317;
      var1 = Misc.decodeVarLengthUnsignedInteger(var2);
      this.a = new org.tohasan.pduxml.lib.infra.e[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         this.a[var3] = new cf(161, var2);
      }

   }

   public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
      this.a(var1, 1);
   }
}
