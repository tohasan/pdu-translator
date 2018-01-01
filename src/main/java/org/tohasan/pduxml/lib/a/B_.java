package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.aV_;
import org.tohasan.pduxml.lib.a.ah;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class B_ extends org.tohasan.pduxml.lib.infra.e {
   private aV_ a;
   private ah c;

   public B_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = 198;
      var2.c(198);
      this.a = new aV_(308, var2);
      this.c = new ah(366, var2);
      var2.d(198);
   }

   public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
      this.a.a(var1);
      this.c.a(var1);
   }

   public B_(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = 198;
      this.a = new aV_(308, var2);
      this.c = new ah(366, var2);
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
