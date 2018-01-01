package org.tohasan.pduxml.lib.a;

import org.tohasan.pduxml.lib.a.X_;
import org.tohasan.pduxml.lib.a.bs;
import org.tohasan.pduxml.lib.a.cc;
import org.tohasan.pduxml.lib.infra.XmlPduException;

public final class ah extends org.tohasan.pduxml.lib.infra.e {
   private X_ a;
   private cc c;
   private bs d;

   public ah(int var1, org.tohasan.pduxml.lib.infra.m var2) throws XmlPduException {
      this.b = var1;
      var2.c(var1);
      this.a = new X_(314, var2);
      this.c = new cc(225, var2);
      this.d = new bs(382, var2);
      var2.d(var1);
   }

   public final void a(org.tohasan.pduxml.lib.infra.i var1) throws XmlPduException {
      this.a.a(var1);
      this.c.a(var1);
      this.d.a(var1);
   }

   public ah(int var1, org.tohasan.pduxml.lib.infra.h var2) throws XmlPduException {
      this.b = var1;
      this.a = new X_(314, var2);
      this.c = new cc(225, var2);
      this.d = new bs(382, var2);
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
