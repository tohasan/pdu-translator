package org.tohasan.pduxml.lib.infra;

import org.tohasan.pduxml.lib.infra.XmlPduException;
import org.tohasan.pduxml.lib.infra.e;
import org.tohasan.pduxml.lib.infra.h;
import org.tohasan.pduxml.lib.infra.i;
import org.tohasan.pduxml.lib.infra.m;
import org.tohasan.pduxml.lib.infra.n;
import java.util.Enumeration;
import java.util.Hashtable;

public class b extends e {
   private static Hashtable a = new Hashtable() {
      {
         this.put("LN", new Integer(0));
         this.put("SN", new Integer(1));
         this.put("LN_WITH_CIPHERING", new Integer(2));
         this.put("SN_WITH_CIPHERING", new Integer(3));
         this.put("NO_SECURITY", new Integer(10));
         this.put("LOW_SECURITY", new Integer(11));
         this.put("HIGH_SECURITY", new Integer(12));
         this.put("HIGH_SECURITY_MD5", new Integer(13));
         this.put("HIGH_SECURITY_SHA1", new Integer(14));
         this.put("HIGH_SECURITY_GMAC", new Integer(15));
      }
   };
   private int c;

   private static String a(int var0) throws XmlPduException {
      String var1 = null;
      Enumeration var2 = a.keys();

      while(var2.hasMoreElements()) {
         String var3 = (String)var2.nextElement();
         int var4 = ((Integer)a.get(var3)).intValue();
         if(var0 == var4) {
            var1 = var3;
            break;
         }
      }

      if(var1 == null) {
         throw new XmlPduException("idToStr: unexpected id");
      } else {
         return var1;
      }
   }

   public final void a(m var1) throws XmlPduException {
      String var4 = var1.f(454).toString();

      try {
         Integer var2 = (Integer)a.get(var4);
         this.c = var2.intValue();
      } catch (NullPointerException var3) {
         throw new XmlPduException("Object identifier illegal value - ".concat(var4.toString()));
      }
   }

   public final void a(i var1) throws XmlPduException {
      var1.write(7);
      var1.write(96);
      var1.write(133);
      var1.write(116);
      var1.write(5);
      var1.write(8);
      switch(this.c) {
      case 0:
         var1.write(1);
         var1.write(1);
         return;
      case 1:
         var1.write(1);
         var1.write(2);
         return;
      case 2:
         var1.write(1);
         var1.write(3);
         return;
      case 3:
         var1.write(1);
         var1.write(4);
         return;
      case 10:
         var1.write(2);
         var1.write(0);
         return;
      case 11:
         var1.write(2);
         var1.write(1);
         return;
      case 12:
         var1.write(2);
         var1.write(2);
         return;
      case 13:
         var1.write(2);
         var1.write(3);
         return;
      case 14:
         var1.write(2);
         var1.write(4);
         return;
      case 15:
         var1.write(2);
         var1.write(5);
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      default:
      }
   }

   public final void a(h var1) throws XmlPduException {
      var1.a(7);
      var1.a(96);
      var1.a(133);
      var1.a(116);
      var1.a(5);
      var1.a(8);
      int var2 = var1.a();
      int var3 = var1.a();
      switch(var2) {
      case 1:
         switch(var3) {
         case 1:
            this.c = 0;
            return;
         case 2:
            this.c = 1;
            return;
         case 3:
            this.c = 2;
            return;
         case 4:
            this.c = 3;
            return;
         default:
            throw new XmlPduException("Object identifier illegal value ".concat(Integer.toString(var3)));
         }
      case 2:
         switch(var3) {
         case 0:
            this.c = 10;
            return;
         case 1:
            this.c = 11;
            return;
         case 2:
            this.c = 12;
            return;
         case 3:
            this.c = 13;
            return;
         case 4:
            this.c = 14;
            return;
         case 5:
            this.c = 15;
            return;
         default:
            return;
         }
      default:
         throw new XmlPduException("Object identifier illegal value " + Integer.toString(var2));
      }
   }

   public final void a(n var1) throws XmlPduException {
      StringBuffer var2 = new StringBuffer(a(this.c));
      var1.a(this.b, 454, var2, 1);
   }
}
