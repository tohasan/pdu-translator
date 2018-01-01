package org.tohasan.pduxml.lib.infra;

import org.tohasan.pduxml.lib.infra.XmlPduException;
import org.tohasan.pduxml.lib.infra.e;
import org.tohasan.pduxml.lib.infra.h;
import org.tohasan.pduxml.lib.infra.i;
import org.tohasan.pduxml.lib.infra.m;
import org.tohasan.pduxml.lib.infra.n;

public class a extends e {
   public String a;

   public a() {
   }

   public a(int var1, m var2) throws XmlPduException {
      this.b = var1;
      this.a = var2.f(454).toString();
      var2.a();
   }

   public void a(i var1) throws XmlPduException {
      int var4 = 0;
      int var5 = 0;
      var1.write(0);
      int var3 = var1.size() - 1;
      var1.write(0);

      for(int var2 = 0; var2 < this.a.length(); ++var2) {
         if(this.a.charAt(var2) != 48 && this.a.charAt(var2) != 49) {
            throw new XmlPduException("BERBitStr: illegal character - ".concat(this.a.substring(var2, var2)));
         }

         if(var4 == 8) {
            var1.write((byte)var5);
            var4 = 0;
            var5 = 0;
         }

         if(this.a.charAt(var2) == 49) {
            var5 |= 128 >> var4;
         }

         ++var4;
      }

      if(var4 > 0) {
         var1.write(var5);
      }

      var1.a(var3, var1.size() - var3 - 1);
      var1.a(var3 + 1, 8 - var4);
   }

   public a(int var1, h var2) throws XmlPduException {
      this.b = var1;
      this.a(var2);
   }

   protected final void a(h var1) throws XmlPduException {
      int var2 = var1.a();
      int var3 = var1.a();
      --var2;
      StringBuffer var7 = new StringBuffer();

      while(var2 > 0) {
         int var5 = var1.a();
         --var2;
         int var4;
         if(var2 == 0) {
            var4 = 8 - var3;
         } else {
            var4 = 8;
         }

         for(int var6 = 128; var4 > 0; --var4) {
            if((var5 & var6) != 0) {
               var7.append('1');
            } else {
               var7.append('0');
            }

            var6 >>= 1;
         }
      }

      this.a = var7.toString();
   }

   public void a(n var1) throws XmlPduException {
      var1.a(this.b, 454, new StringBuffer(this.a), 1);
   }
}
