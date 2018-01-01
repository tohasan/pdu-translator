package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.aV_;
import org.tohasan.pduxml.lib.a.ah;
import org.tohasan.pduxml.lib.a.bb;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bM_ extends org.tohasan.pduxml.lib.infra.e {
   private aV_ a;
   private bb c;
   private ah d;

   public bM_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = 422;
      var2.c(422);
      this.a = new aV_(308, var2);
      this.c = new bb(218, var2);
      this.d = new ah(253, var2);
      var2.d(422);
   }

   public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
      this.a.a(var1);
      this.c.a(var1);
      this.d.a(var1);
   }

   public bM_(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = 422;
      this.a = new aV_(308, var2);
      this.c = new bb(218, var2);
      this.d = new ah(253, var2);
   }

   public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
      var1.a(this.b);
      var1.a();
      this.a.a(var1);
      this.c.a(var1);
      this.d.a(var1);
      var1.b();
      var1.b(this.b);
   }
}
