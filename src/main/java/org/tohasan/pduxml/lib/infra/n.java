package org.tohasan.pduxml.lib.infra;

public final class n {
    public StringBuffer a = new StringBuffer();
    private int b = 0;
    private boolean c = true;

    public final void a() {
        ++this.b;
    }

    public final void b() {
        --this.b;
    }

    private void b(String var1) {
        if (this.c) {
            for (int var2 = 1; var2 <= this.b; ++var2) {
                this.a.append("  ");
            }
        }

        this.a.append(var1);
        this.c = false;
    }

    public final void a(int var1) throws XmlPduException {
        this.a("<" + org.tohasan.pduxml.lib.processors.a.a(var1) + ">");
    }

    public final void b(int var1) throws XmlPduException {
        this.a("</" + org.tohasan.pduxml.lib.processors.a.a(var1) + ">");
    }

    public final void a(int var1, int var2, StringBuffer var3, int var4) throws XmlPduException {
        StringBuffer var5;
        (var5 = new StringBuffer()).append("<")
                .append(org.tohasan.pduxml.lib.processors.a.a(var1))
                .append(" ")
                .append(org.tohasan.pduxml.lib.processors.a.a(var2));
        if (var4 == 1) {
            var5.append("=\"")
                    .append(var3)
                    .append("\" />");
        } else {
            var5.append("=\"")
                    .append(var3)
                    .append("\" >");
        }

        this.a(var5.toString());
    }

    public final void a(String var1) {
        this.b(var1 + "\r\n");
        this.c = true;
    }
}
