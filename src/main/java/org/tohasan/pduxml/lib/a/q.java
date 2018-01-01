package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.H_;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class q extends org.tohasan.pduxml.lib.infra.e {
   private H_ a;

   public q(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = 183;
      var2.c(183);
      this.a = new H_(403, var2);
      var2.d(183);
   }

   public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
      this.a.a(var1);
   }

   public q(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = 183;
      this.a = new H_(403, var2);
   }

   public final void a(org.tohasan.pduxml.lib.infra.n var1) throws XmlPduException {
      var1.a(this.b);
      var1.a();
      this.a.a(var1);
      var1.b();
      var1.b(this.b);
   }
}
