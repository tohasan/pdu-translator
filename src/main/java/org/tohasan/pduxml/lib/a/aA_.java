package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.ac;
import org.tohasan.pduxml.lib.a.ad;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class aA_ extends org.tohasan.pduxml.lib.infra.e {
   private int a;
   private org.tohasan.pduxml.lib.infra.e c;

   public aA_() {
   }

   public aA_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = var1;
      if(var1 != 297) {
         var2.c(var1);
      }

      if(var2.a((int)250)) {
         this.a = 0;
         this.c = new ac(250, var2);
      } else {
         if(!var2.a((int)251)) {
            throw new XmlPduException("_GetDataResult: illegal choice");
         }

         this.a = 1;
         this.c = new ad(251, var2);
      }

      if(var1 != 297) {
         var2.d(var1);
      }

   }

   public aA_(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = var1;
      this.a = var2.a();
      switch(this.a) {
      case 0:
         this.c = new ac(250, var2);
         return;
      case 1:
         this.c = new ad(251, var2);
         return;
      default:
         throw new XmlPduException("_GetDataResult (from pdu) : illegal tag - " + String.valueOf(this.a));
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
