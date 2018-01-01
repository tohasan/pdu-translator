package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.D_;
import org.tohasan.pduxml.lib.a.E_;
import org.tohasan.pduxml.lib.a.F_;
import org.tohasan.pduxml.lib.a.G_;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class C_ extends org.tohasan.pduxml.lib.infra.e {
   private int a;
   private org.tohasan.pduxml.lib.infra.e c;

   public C_() {
   }

   public C_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = 199;
      var2.c(199);
      if(var2.a((int)201)) {
         this.a = 1;
         this.c = new E_(201, var2);
      } else if(var2.a((int)203)) {
         this.a = 2;
         this.c = new G_(203, var2);
      } else if(var2.a((int)202)) {
         this.a = 3;
         this.c = new F_(202, var2);
      } else {
         if(!var2.a((int)200)) {
            throw new XmlPduException("_ActionResponse: illegal choice");
         }

         this.a = 4;
         this.c = new D_(200, var2);
      }

      var2.d(199);
   }

   public C_(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = 199;
      this.a = var2.a();
      switch(this.a) {
      case 1:
         this.c = new E_(201, var2);
         return;
      case 2:
         this.c = new G_(203, var2);
         return;
      case 3:
         this.c = new F_(202, var2);
         return;
      case 4:
         this.c = new D_(200, var2);
         return;
      default:
         throw new XmlPduException("_ActionResponse (from pdu) : illegal tag - " + String.valueOf(this.a));
      }
   }

   public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
      var1.write((byte)this.a);
      this.c.a(var1);
   }

   public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
      if(this.b != 297) {
         var1.a(this.b);
         var1.a();
         this.c.a(var1);
         var1.b();
         var1.b(this.b);
      } else {
         this.c.a(var1);
      }
   }
}
