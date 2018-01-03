package org.tohasan.pduxml.lib.infra;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.io.MessageInputStream;
import org.tohasan.pduxml.lib.io.MessageOutputStream;

import java.util.Enumeration;
import java.util.Hashtable;

public class b extends MessageByteProcessor {
    private static Hashtable<String, Integer> a = new Hashtable<String, Integer>() {
        {
            this.put("LN", 0);
            this.put("SN", 1);
            this.put("LN_WITH_CIPHERING", 2);
            this.put("SN_WITH_CIPHERING", 3);
            this.put("NO_SECURITY", 10);
            this.put("LOW_SECURITY", 11);
            this.put("HIGH_SECURITY", 12);
            this.put("HIGH_SECURITY_MD5", 13);
            this.put("HIGH_SECURITY_SHA1", 14);
            this.put("HIGH_SECURITY_GMAC", 15);
        }
    };
    private int c;

    private static String a(int var0) throws XmlPduException {
        String var1 = null;
        Enumeration var2 = a.keys();

        while (var2.hasMoreElements()) {
            String var3 = (String) var2.nextElement();
            int var4 = a.get(var3);
            if (var0 == var4) {
                var1 = var3;
                break;
            }
        }

        if (var1 == null) {
            throw new XmlPduException("idToStr: unexpected id");
        } else {
            return var1;
        }
    }

    public final void a(m var1) throws XmlPduException {
        String var4 = var1.f(454).toString();

        try {
            this.c = a.get(var4);
        } catch (NullPointerException var3) {
            throw new XmlPduException("Object identifier illegal value - ".concat(var4));
        }
    }

    public final void a(MessageOutputStream messageOutputStream) throws XmlPduException {
        messageOutputStream.write(7);
        messageOutputStream.write(96);
        messageOutputStream.write(133);
        messageOutputStream.write(116);
        messageOutputStream.write(5);
        messageOutputStream.write(8);
        switch (this.c) {
            case 0:
                messageOutputStream.write(1);
                messageOutputStream.write(1);
                return;
            case 1:
                messageOutputStream.write(1);
                messageOutputStream.write(2);
                return;
            case 2:
                messageOutputStream.write(1);
                messageOutputStream.write(3);
                return;
            case 3:
                messageOutputStream.write(1);
                messageOutputStream.write(4);
                return;
            case 10:
                messageOutputStream.write(2);
                messageOutputStream.write(0);
                return;
            case 11:
                messageOutputStream.write(2);
                messageOutputStream.write(1);
                return;
            case 12:
                messageOutputStream.write(2);
                messageOutputStream.write(2);
                return;
            case 13:
                messageOutputStream.write(2);
                messageOutputStream.write(3);
                return;
            case 14:
                messageOutputStream.write(2);
                messageOutputStream.write(4);
                return;
            case 15:
                messageOutputStream.write(2);
                messageOutputStream.write(5);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
        }
    }

    public final void a(MessageInputStream var1) throws XmlPduException {
        var1.readByte(7);
        var1.readByte(96);
        var1.readByte(133);
        var1.readByte(116);
        var1.readByte(5);
        var1.readByte(8);
        int var2 = var1.readByte();
        int var3 = var1.readByte();
        switch (var2) {
            case 1:
                switch (var3) {
                    case 1:
                        this.c = 0;
                        return;
                    case 2:
                        this.c = 1;
                        return;
                    case 3:
                        this.c = 2;
                        return;
                    case 4:
                        this.c = 3;
                        return;
                    default:
                        throw new XmlPduException("Object identifier illegal value ".concat(Integer.toString(var3)));
                }
            case 2:
                switch (var3) {
                    case 0:
                        this.c = 10;
                        return;
                    case 1:
                        this.c = 11;
                        return;
                    case 2:
                        this.c = 12;
                        return;
                    case 3:
                        this.c = 13;
                        return;
                    case 4:
                        this.c = 14;
                        return;
                    case 5:
                        this.c = 15;
                        return;
                    default:
                        return;
                }
            default:
                throw new XmlPduException("Object identifier illegal value " + Integer.toString(var2));
        }
    }

    public final void a(n var1) throws XmlPduException {
        StringBuffer var2 = new StringBuffer(a(this.c));
        var1.a(this.tagKey, 454, var2, 1);
    }
}
