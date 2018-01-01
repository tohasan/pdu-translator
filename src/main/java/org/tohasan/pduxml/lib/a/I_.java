package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.bs;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class I_ extends org.tohasan.pduxml.lib.infra.e {
   private bs a;
   private bs c;

   public I_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = 204;
      var2.c(204);
      this.a = new bs(313, var2);
      this.c = new bs(310, var2);
      var2.d(204);
   }

   public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
      this.a.a(var1);
      this.c.a(var1);
   }

   public I_(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = 204;
      this.a = new bs(313, var2);
      this.c = new bs(310, var2);
   }

   public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
      var1.a(this.b);
      var1.a();
      this.a.a(var1);
      this.c.a(var1);
      var1.b();
      var1.b(this.b);
   }
}
