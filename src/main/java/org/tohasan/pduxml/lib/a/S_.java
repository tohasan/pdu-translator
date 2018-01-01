package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.Y_;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class S_ extends Y_ {
   public S_(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      super(var1, var2);
   }

   public S_(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = var1;
      var2.a();
      this.a(var2);
   }

   public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
      var1.write(0);
      int var2 = var1.size() - 1;
      super.a(var1);
      var1.a(var2, var1.size() - var2 - 1);
   }
}
