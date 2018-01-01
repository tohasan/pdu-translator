package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.aG_;
import org.tohasan.pduxml.lib.a.aH_;
import org.tohasan.pduxml.lib.a.aI_;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class aF_ extends org.tohasan.pduxml.lib.infra.e {
   private int a;
   private org.tohasan.pduxml.lib.infra.e c;

   public aF_() {
   }

   public aF_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = 288;
      var2.c(288);
      if(var2.a((int)289)) {
         this.a = 1;
         this.c = new aG_(289, var2);
      } else if(var2.a((int)290)) {
         this.a = 2;
         this.c = new aH_(290, var2);
      } else {
         if(!var2.a((int)291)) {
            throw new XmlPduException("_GetResponse: illegal choice");
         }

         this.a = 3;
         this.c = new aI_(291, var2);
      }

      var2.d(288);
   }

   public aF_(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = 288;
      this.a = var2.a();
      switch(this.a) {
      case 1:
         this.c = new aG_(289, var2);
         return;
      case 2:
         this.c = new aH_(290, var2);
         return;
      case 3:
         this.c = new aI_(291, var2);
         return;
      default:
         throw new XmlPduException("_GetResponse (from pdu) : illegal tag - " + String.valueOf(this.a));
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
