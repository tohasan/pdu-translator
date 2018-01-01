package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.bj;
import org.tohasan.pduxml.lib.a.bs;
import org.tohasan.pduxml.lib.a.r;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class p extends org.tohasan.pduxml.lib.infra.e {
   private bj a;
   private bs c;
   private r d;

   public p(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = 182;
      var2.c(182);
      this.a = new bj(325, var2);
      this.c = new bs(262, var2);
      this.d = new r(184, var2);
      var2.d(182);
   }

   public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
      this.a.a(var1);
      this.c.a(var1);
      this.d.a(var1);
   }

   public p(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = 182;
      this.a = new bj(325, var2);
      this.c = new bs(262, var2);
      this.d = new r(184, var2);
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
