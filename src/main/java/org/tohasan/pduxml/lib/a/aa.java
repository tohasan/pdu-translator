package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.bG_;
import org.tohasan.pduxml.lib.a.ce;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class aa extends org.tohasan.pduxml.lib.infra.e {
   private ce a;
   private bG_ c;

   public aa(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = 246;
      var2.c(246);
      this.a = new ce(410, var2);
      this.c = new bG_(411, var2);
      var2.d(246);
   }

   public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
      this.a.a(var1);
      this.c.a(var1);
   }

   public aa(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = 246;
      this.a = new ce(410, var2);
      this.c = new bG_(411, var2);
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
