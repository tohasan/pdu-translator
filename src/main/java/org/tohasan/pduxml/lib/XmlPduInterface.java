package org.tohasan.pduxml.lib;

import org.tohasan.pduxml.lib.a.Y_;
import org.tohasan.pduxml.lib.infra.XmlPduException;
import org.tohasan.pduxml.lib.infra.h;
import org.tohasan.pduxml.lib.infra.i;
import org.tohasan.pduxml.lib.infra.m;
import org.tohasan.pduxml.lib.infra.n;

public final class XmlPduInterface {
   public static byte[] XmlToPdu(StringBuffer var0) throws XmlPduException {
      m var2 = new m(var0);
      Y_ var3 = new Y_(297, var2);
      i var1 = new i();
      var3.a(var1);
      return var1.toByteArray();
   }

   public static StringBuffer PduToXml(byte[] var0) throws XmlPduException {
      h var2 = new h(var0);
      Y_ var3 = new Y_(297, var2);
      n var1 = new n();
      var3.a(var1);
      return var1.a;
   }
}
