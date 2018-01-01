package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.ac;
import org.tohasan.pduxml.lib.infra.Misc;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bc extends org.tohasan.pduxml.lib.infra.j {
   public bc(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = var1;
      var2.b(var1);
      int var3 = var2.e(381);
      this.a = new org.tohasan.pduxml.lib.infra.e[var3];
      var3 = 0;
      var2.a();

      while(var2.a == 1 && var3 < this.a.length) {
         this.a[var3++] = new ac(297, var2);
      }

      var2.d(var1);
   }

   public bc(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = var1;
      var1 = Misc.decodeVarLengthUnsignedInteger(var2);
      this.a = new org.tohasan.pduxml.lib.infra.e[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         this.a[var3] = new ac(54, var2);
      }

   }

   public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
      this.a(var1, 1);
   }
}
