package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class K_ extends org.tohasan.pduxml.lib.infra.e {
   private int a;

   public K_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = 207;
      var2.b(207);
      String var3;
      if((var3 = var2.f(454).toString()).equals("Other")) {
         this.a = 0;
      } else if(var3.equals("TimeElapsed")) {
         this.a = 1;
      } else if(var3.equals("ApplicationUnreachable")) {
         this.a = 2;
      } else if(var3.equals("ApplicationReferenceInvalid")) {
         this.a = 3;
      } else if(var3.equals("ApplicationContextUnsupported")) {
         this.a = 4;
      } else if(var3.equals("ProviderCommunicationError")) {
         this.a = 5;
      } else {
         if(!var3.equals("DecipheringError")) {
            throw new XmlPduException("_ApplicationReference: illegal element " + var3);
         }

         this.a = 6;
      }

      var2.a();
   }

   public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
      var1.write((byte)this.a);
   }

   public K_(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = 207;
      this.a = var2.a();
   }

   public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
      StringBuffer var2 = new StringBuffer();
      switch(this.a) {
      case 0:
         var2.append("Other");
         break;
      case 1:
         var2.append("TimeElapsed");
         break;
      case 2:
         var2.append("ApplicationUnreachable");
         break;
      case 3:
         var2.append("ApplicationReferenceInvalid");
         break;
      case 4:
         var2.append("ApplicationContextUnsupported");
         break;
      case 5:
         var2.append("ProviderCommunicationError");
         break;
      case 6:
         var2.append("DecipheringError");
         break;
      default:
         throw new XmlPduException("_ApplicationReference: case range");
      }

      var1.a(this.b, 454, var2, 1);
   }
}
