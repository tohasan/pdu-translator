package org.tohasan.pduxml.lib.infra;

import org.tohasan.pduxml.lib.infra.XmlPduException;
import org.tohasan.pduxml.lib.infra.e;
import org.tohasan.pduxml.lib.infra.i;
import org.tohasan.pduxml.lib.infra.m;
import org.tohasan.pduxml.lib.infra.n;

public class f extends e {
   public f(int var1, m var2) throws XmlPduException {
      this.b = var1;
      var2.c(var1);
   }

   public final void a(i var1) throws XmlPduException {
   }

   public f(int var1) {
      this.b = var1;
   }

   public final void a(n var1) throws XmlPduException {
      var1.a("<" + org.tohasan.pduxml.lib.a.a.a(this.b) + " />");
   }
}
