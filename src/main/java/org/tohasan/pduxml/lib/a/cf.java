package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.W_;
import org.tohasan.pduxml.lib.a.br;
import org.tohasan.pduxml.lib.a.bu;
import org.tohasan.pduxml.lib.a.bw;
import org.tohasan.pduxml.lib.a.cj;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class cf extends org.tohasan.pduxml.lib.infra.e {
   private int a;
   private org.tohasan.pduxml.lib.infra.e c;

   public cf() {
   }

   public cf(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = 297;
      if(var2.a((int)456)) {
         this.a = 2;
         this.c = new br(456, var2);
      } else if(var2.a((int)368)) {
         this.a = 4;
         this.c = new bu(368, var2);
      } else if(var2.a((int)226)) {
         this.a = 5;
         this.c = new W_(226, var2);
      } else if(var2.a((int)384)) {
         this.a = 6;
         this.c = new bw(384, var2);
      } else if(var2.a((int)461)) {
         this.a = 7;
         this.c = new cj(461, var2);
      } else {
         throw new XmlPduException("_VariableAccessSpecification: illegal choice");
      }
   }

   public cf(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = 161;
      this.a = var2.a();
      switch(this.a) {
      case 2:
         this.c = new br(456, var2);
         return;
      case 3:
      default:
         throw new XmlPduException("_VariableAccessSpecification (from pdu) : illegal tag - " + String.valueOf(this.a));
      case 4:
         this.c = new bu(368, var2);
         return;
      case 5:
         this.c = new W_(226, var2);
         return;
      case 6:
         this.c = new bw(384, var2);
         return;
      case 7:
         this.c = new cj(461, var2);
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
