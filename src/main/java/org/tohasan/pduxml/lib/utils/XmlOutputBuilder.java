package org.tohasan.pduxml.lib.utils;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.processors.TagMap;
import org.tohasan.pduxml.lib.utils.CommonUtils;

public final class XmlOutputBuilder {
    public StringBuffer buffer = new StringBuffer();
    private int b = 0;
    private boolean c = true;

    public final void appendWithNewLine() {
        this.b++;
    }

    public final void b() {
        this.b--;
    }

    public final void appendTag(int var1) throws XmlPduException {
        this.appendWithNewLine("<" + TagMap.getKeyByValue(var1) + ">");
    }

    public final void appendWithNewLine(String var1) {
        this.b(var1 + "\r\n");
        this.c = true;
    }

    private void b(String var1) {
        if (this.c) {
            for (int var2 = 1; var2 <= this.b; ++var2) {
                this.buffer.append("  ");
            }
        }

        this.buffer.append(var1);
        this.c = false;
    }

    public final void b(int var1) throws XmlPduException {
        this.appendWithNewLine("</" + TagMap.getKeyByValue(var1) + ">");
    }

    private void appendTag(int tagKey, int attrKey, StringBuffer attrValue, boolean emptyTag) throws XmlPduException {
        String tagStr = "<" +
                TagMap.getKeyByValue(tagKey) +
                " " +
                TagMap.getKeyByValue(attrKey) +
                "=\"" +
                attrValue +
                (emptyTag ? "\" />" : "\" >");

        this.appendWithNewLine(tagStr);
    }

    public final void appendEmptyTag(int tagKey, int attrKey, StringBuffer attrValue) throws XmlPduException {
        this.appendTag(tagKey, attrKey, attrValue, true);
    }

    public final void appendTagWithQuantity(int tagKey, int quantity) throws XmlPduException {
        this.appendTag(tagKey, 381, CommonUtils.intToHex(quantity), false);
    }
}
