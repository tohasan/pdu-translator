package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.q;
import org.tohasan.pduxml.lib.a.s;
import org.tohasan.pduxml.lib.a.t;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class u extends org.tohasan.pduxml.lib.infra.e {
   private int a;
   private org.tohasan.pduxml.lib.infra.e c;

   public u() {
   }

   public u(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = 20;
      var2.c(20);
      if(var2.a((int)185)) {
         this.a = 1;
         this.c = new s(185, var2);
      } else if(var2.a((int)187)) {
         this.a = 2;
         this.c = new t(187, var2);
      } else {
         if(!var2.a((int)183)) {
            throw new XmlPduException("_AccessResponseSpecification: illegal choice");
         }

         this.a = 3;
         this.c = new q(183, var2);
      }

      var2.d(20);
   }

   public u(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = 20;
      this.a = var2.a();
      switch(this.a) {
      case 1:
         this.c = new s(185, var2);
         return;
      case 2:
         this.c = new t(187, var2);
         return;
      case 3:
         this.c = new q(183, var2);
         return;
      default:
         throw new XmlPduException("_AccessResponseSpecification (from pdu) : illegal tag - " + String.valueOf(this.a));
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
