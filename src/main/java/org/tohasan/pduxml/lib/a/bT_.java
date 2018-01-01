package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.H_;
import org.tohasan.pduxml.lib.a.aA_;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bT_ extends org.tohasan.pduxml.lib.infra.e {
   private H_ a;
   private aA_ c;

   public bT_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = 149;
      var2.c(149);
      this.a = new H_(403, var2);
      if(var2.a((int)405)) {
         this.c = new aA_(405, var2);
      }

      var2.d(149);
   }

   public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
      this.a.a(var1);
      if(this.c != null) {
         var1.write(1);
         this.c.a(var1);
      } else {
         var1.write(0);
      }
   }

   public bT_(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = 149;
      this.a = new H_(403, var2);
      if(var2.a() != 0) {
         this.c = new aA_(405, var2);
      }

   }

   public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
      var1.a(this.b);
      var1.a();
      this.a.a(var1);
      if(this.c != null) {
         this.c.a(var1);
      }

      var1.b();
      var1.b(this.b);
   }
}
