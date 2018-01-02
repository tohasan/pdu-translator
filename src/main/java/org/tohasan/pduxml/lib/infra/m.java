package org.tohasan.pduxml.lib.infra;

import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class m {
    private static char b = 32;
    private static char c = 9;
    private static char d = 13;
    private static char e = 10;
    private static char f = 47;
    private StringBuffer g;
    private int h;
    private int i;
    private StringBuffer j;
    private StringBuffer k;
    private StringBuffer l;
    private int m;
    public int a;

    public m(StringBuffer var1) throws XmlPduException {
        this.g = var1;
        var1.append("\u0000");
        this.h = 0;
        this.i = 0;
        this.j = new StringBuffer();
        this.k = new StringBuffer();
        this.l = new StringBuffer();
        this.a();
    }

    private void a(StringBuffer var1) {
        var1.setLength(0);

        while (a(this.g.charAt(this.h))) {
            var1.append(this.g.charAt(this.h++));
        }

    }

    private static boolean a(char var0) {
        return (var0 = Character.toUpperCase(var0)) >= 65 && var0 <= 90 || var0 >= 48 && var0 <= 57 || var0 == 95;
    }

    public final boolean a(int var1) throws XmlPduException {
        if (this.a == 1) {
            StringBuffer var2 = this.j;
            if (org.tohasan.pduxml.lib.a.a.a(this.j.toString()) == var1) {
                return true;
            }
        }

        return false;
    }

    public final boolean a(int var1, int var2, int var3, int var4, int var5) throws XmlPduException {
        if (this.a == 1) {
            StringBuffer var6 = this.j;
            if (org.tohasan.pduxml.lib.a.a.a(this.j.toString()) == 304) {
                return true;
            }

            var6 = this.j;
            if (org.tohasan.pduxml.lib.a.a.a(this.j.toString()) == 246) {
                return true;
            }

            var6 = this.j;
            if (org.tohasan.pduxml.lib.a.a.a(this.j.toString()) == 487) {
                return true;
            }

            var6 = this.j;
            if (org.tohasan.pduxml.lib.a.a.a(this.j.toString()) == 482) {
                return true;
            }

            var6 = this.j;
            if (org.tohasan.pduxml.lib.a.a.a(this.j.toString()) == 280) {
                return true;
            }
        }

        return false;
    }

    public final boolean a(int var1, int var2, int var3) throws XmlPduException {
        if (this.a == 1) {
            StringBuffer var4 = this.j;
            if (org.tohasan.pduxml.lib.a.a.a(this.j.toString()) == 303) {
                return true;
            }

            var4 = this.j;
            if (org.tohasan.pduxml.lib.a.a.a(this.j.toString()) == 486) {
                return true;
            }

            var4 = this.j;
            if (org.tohasan.pduxml.lib.a.a.a(this.j.toString()) == 280) {
                return true;
            }
        }

        return false;
    }

    public final void a() throws XmlPduException {
        while (true) {
            char var1 = this.g.charAt(this.h);

            while (true) {
                if (var1 != b && var1 != c && var1 != d) {
                    if (var1 != e) {
                        if (var1 == 60) {
                            ++this.h;
                            m var6 = this;
                            this.a = 0;

                            while (true) {
                                boolean var2;
                                if (var6.g.charAt(var6.h) == f) {
                                    var2 = false;
                                    ++var6.h;
                                } else {
                                    var2 = true;
                                }

                                if (!a(var6.g.charAt(var6.h))) {
                                    break;
                                }

                                var6.a(var6.j);
                                var6.c();
                                if (var6.g.charAt(var6.h) == 62) {
                                    if (var2) {
                                        var6.a = 1;
                                    } else {
                                        var6.a = 2;
                                    }

                                    ++var6.h;
                                    break;
                                }

                                if (a(var6.g.charAt(var6.h))) {
                                    var6.a(var6.k);
                                    StringBuffer var3 = var6.k;
                                    var6.m = org.tohasan.pduxml.lib.a.a.a(var6.k.toString());
                                    var6.c();
                                    if (var6.g.charAt(var6.h) != 61) {
                                        break;
                                    }

                                    ++var6.h;
                                    var6.c();
                                    char var7;
                                    if ((var7 = var6.g.charAt(var6.h)) != 39 && var7 != 34) {
                                        break;
                                    }

                                    char var4 = var7;
                                    m var8 = var6;
                                    var6.l.setLength(0);
                                    ++var6.h;

                                    for (char var5 = var6.g.charAt(var6.h); var5 != var4 && var5 != 0; var5 = var8.g.charAt(var8.h)) {
                                        var8.l.append(var5);
                                        ++var8.h;
                                    }

                                    ++var8.h;
                                    var6.c();
                                }

                                if (var6.g.charAt(var6.h) == 47) {
                                    ++var6.h;
                                }

                                if (var6.g.charAt(var6.h) != 62) {
                                    break;
                                }

                                ++var6.h;
                                if (var2) {
                                    var6.a = 1;
                                } else {
                                    var6.a = 2;
                                }
                            }
                        } else if (var1 == 0) {
                            this.a = 3;
                        } else {
                            this.a = 0;
                        }

                        if (this.a == 4) {
                            break;
                        }

                        return;
                    }

                    ++this.h;
                    ++this.i;
                } else {
                    ++this.h;
                }

                var1 = this.g.charAt(this.h);
            }
        }
    }

    public final int b() throws XmlPduException {
        StringBuffer var1 = this.j;
        return org.tohasan.pduxml.lib.a.a.a(this.j.toString());
    }

    private void c() {
        char var1 = this.g.charAt(this.h);

        while (true) {
            if (var1 != b && var1 != c && var1 != d) {
                if (var1 != e) {
                    return;
                }

                ++this.i;
            }

            ++this.h;
            var1 = this.g.charAt(this.h);
        }
    }

    public final void b(int var1) throws XmlPduException {
        if (this.a == 1) {
            StringBuffer var2 = this.j;
            if (org.tohasan.pduxml.lib.a.a.a(this.j.toString()) == var1) {
                return;
            }
        }

        throw new XmlPduException("Start tag: " + org.tohasan.pduxml.lib.a.a.a(var1) + " expected");
    }

    public final void c(int var1) throws XmlPduException {
        this.b(var1);
        this.a();
    }

    public final void d(int var1) throws XmlPduException {
        if (this.a == 2) {
            StringBuffer var2 = this.j;
            if (org.tohasan.pduxml.lib.a.a.a(this.j.toString()) == var1) {
                this.a();
                return;
            }
        }

        throw new XmlPduException("Stop tag: " + org.tohasan.pduxml.lib.a.a.a(var1) + " expected");
    }

    public final int e(int var1) throws XmlPduException {
        return CommonUtils.hexToInt(this.f(381));
    }

    public final StringBuffer f(int var1) throws XmlPduException {
        if (this.a == 1 && this.m == var1) {
            return this.l;
        } else {
            throw new XmlPduException("\"" + org.tohasan.pduxml.lib.a.a.a(var1) + "\" expected");
        }
    }

    public static void g(int var0) throws XmlPduException {
        throw new XmlPduException("Unexpected keyword " + org.tohasan.pduxml.lib.a.a.a(var0));
    }
}
