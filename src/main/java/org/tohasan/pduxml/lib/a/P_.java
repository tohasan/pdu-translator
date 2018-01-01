package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.Z_;
import org.tohasan.pduxml.lib.a.bo;
import org.tohasan.pduxml.lib.a.bp;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class P_ extends org.tohasan.pduxml.lib.infra.e {
   private Z_ a;
   private bp c;
   private bo d;

   public P_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = 217;
      var2.c(217);
      this.a = new Z_(245, var2);
      this.c = new bp(305, var2);
      this.d = new bo(219, var2);
      var2.d(217);
   }

   public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
      this.a.a(var1);
      this.c.a(var1);
      this.d.a(var1);
   }

   public P_(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = 217;
      this.a = new Z_(245, var2);
      this.c = new bp(305, var2);
      this.d = new bo(219, var2);
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
