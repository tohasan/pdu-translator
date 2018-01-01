package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.aV_;
import org.tohasan.pduxml.lib.a.ad;
import org.tohasan.pduxml.lib.a.cc;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class bP_ extends org.tohasan.pduxml.lib.infra.e {
   private aV_ a;
   private ad c;
   private cc d;

   public bP_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = 425;
      var2.c(425);
      this.a = new aV_(308, var2);
      this.c = new ad(403, var2);
      this.d = new cc(225, var2);
      var2.d(425);
   }

   public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
      this.a.a(var1);
      this.c.a(var1);
      this.d.a(var1);
   }

   public bP_(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = 425;
      this.a = new aV_(308, var2);
      this.c = new ad(403, var2);
      this.d = new cc(225, var2);
   }

   public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
      var1.a(this.b);
      var1.a();
      this.a.a(var1);
      this.c.a(var1);
      this.d.a(var1);
      var1.b();
      var1.b(this.b);
   }
}
