package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.Misc;
import org.tohasan.pduxml.lib.infra.XmlPduException;
import java.io.ByteArrayOutputStream;

public final class at extends org.tohasan.pduxml.lib.infra.e {
   private double a;

   public at(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = 275;
      var2.b(275);
      byte[] var4;
      if((var4 = Misc.hexStrToByteArray(var2.f(454))).length != 8) {
         throw new XmlPduException("_Float64: Illegal data size, expected " + "8" + " ,found " + var4.length);
      } else {
         org.tohasan.pduxml.lib.infra.l var3;
         (var3 = new org.tohasan.pduxml.lib.infra.l(8, 3)).a(var4);
         this.a = var3.e();
         var2.a();
      }
   }

   public final void a(org.tohasan.pduxml.lib.infra.i var1) {
      org.tohasan.pduxml.lib.infra.l var2;
      (var2 = new org.tohasan.pduxml.lib.infra.l(8, 3)).a(this.a);
      var2.a((ByteArrayOutputStream)var1);
   }

   public at(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = 275;
      org.tohasan.pduxml.lib.infra.l var3;
      (var3 = new org.tohasan.pduxml.lib.infra.l(8, 3)).a(var2);
      this.a = var3.e();
   }

   public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
      org.tohasan.pduxml.lib.infra.l var2;
      (var2 = new org.tohasan.pduxml.lib.infra.l(8, 3)).a(this.a);
      var1.a(this.b, 454, var2.f(), 1);
   }
}
