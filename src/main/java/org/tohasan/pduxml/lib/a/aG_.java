package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.aA_;
import org.tohasan.pduxml.lib.a.aV_;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class aG_ extends org.tohasan.pduxml.lib.infra.e {
   private aV_ a;
   private aA_ c;

   public aG_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = 289;
      var2.c(289);
      this.a = new aV_(308, var2);
      this.c = new aA_(403, var2);
      var2.d(289);
   }

   public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
      this.a.a(var1);
      this.c.a(var1);
   }

   public aG_(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = 289;
      this.a = new aV_(308, var2);
      this.c = new aA_(403, var2);
   }

   public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
      var1.a(this.b);
      var1.a();
      this.a.a(var1);
      this.c.a(var1);
      var1.b();
      var1.b(this.b);
   }
}
