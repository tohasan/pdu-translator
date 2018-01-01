package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.bl;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class i extends org.tohasan.pduxml.lib.infra.e {
   private bl a;

   public i(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = 174;
      var2.c(174);
      this.a = new bl(332, var2);
      var2.d(174);
   }

   public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
      this.a.a(var1);
   }

   public i(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = 174;
      this.a = new bl(332, var2);
   }

   public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
      var1.a(this.b);
      var1.a();
      this.a.a(var1);
      var1.b();
      var1.b(this.b);
   }
}
