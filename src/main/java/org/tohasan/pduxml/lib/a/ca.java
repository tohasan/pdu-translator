package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.bc;
import org.tohasan.pduxml.lib.a.bh;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class ca extends org.tohasan.pduxml.lib.infra.e {
   private bh a;
   private bc c;

   public ca(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = 448;
      var2.c(448);
      this.a = new bh(317, var2);
      this.c = new bc(315, var2);
      var2.d(448);
   }

   public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
      this.a.a(var1);
      this.c.a(var1);
   }

   public ca(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = 448;
      this.a = new bh(317, var2);
      this.c = new bc(315, var2);
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
