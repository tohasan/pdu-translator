package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.H_;
import org.tohasan.pduxml.lib.a.aA_;
import org.tohasan.pduxml.lib.a.aV_;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class E_ extends org.tohasan.pduxml.lib.infra.e {
   private aV_ a;
   private H_ c;
   private aA_ d;

   public E_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = 201;
      var2.c(201);
      this.a = new aV_(308, var2);
      this.c = new H_(403, var2);
      if(var2.a((int)405)) {
         this.d = new aA_(405, var2);
      }

      var2.d(201);
   }

   public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
      this.a.a(var1);
      this.c.a(var1);
      if(this.d != null) {
         var1.write(1);
         this.d.a(var1);
      } else {
         var1.write(0);
      }
   }

   public E_(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = 201;
      this.a = new aV_(308, var2);
      this.c = new H_(403, var2);
      if(var2.a() != 0) {
         this.d = new aA_(405, var2);
      }

   }

   public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
      var1.a(this.b);
      var1.a();
      this.a.a(var1);
      this.c.a(var1);
      if(this.d != null) {
         this.d.a(var1);
      }

      var1.b();
      var1.b(this.b);
   }
}
