package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.aV_;
import org.tohasan.pduxml.lib.a.ac;
import org.tohasan.pduxml.lib.a.bl;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class x extends org.tohasan.pduxml.lib.infra.e {
   private aV_ a;
   private bl c;
   private ac d;

   public x(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = 194;
      var2.c(194);
      this.a = new aV_(308, var2);
      this.c = new bl(332, var2);
      if(var2.a((int)335)) {
         this.d = new ac(335, var2);
      }

      var2.d(194);
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

   public x(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = 194;
      this.a = new aV_(308, var2);
      this.c = new bl(332, var2);
      if(var2.a() != 0) {
         this.d = new ac(335, var2);
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
