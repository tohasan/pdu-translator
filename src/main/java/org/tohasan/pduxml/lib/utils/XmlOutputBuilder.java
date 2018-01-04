package org.tohasan.pduxml.lib.utils;

import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.processors.TagMap;

public final class XmlOutputBuilder {
    public StringBuffer buffer = new StringBuffer();
    private int indentCount = 0;
    private boolean isNeedIndent = true;

    public final void addIndent() {
        this.indentCount++;
    }

    public final void removeIndent() {
        this.indentCount--;
    }

    public final void appendTag(int var1) throws XmlPduException {
        this.appendWithNewLine("<" + TagMap.getKeyByValue(var1) + ">");
    }

    public final void appendWithNewLine(String var1) {
        this.appendWithIndent(var1 + "\r\n");
        this.isNeedIndent = true;
    }

    private void appendWithIndent(String str) {
        if (this.isNeedIndent) {
            for (int i = 1; i <= this.indentCount; i++) {
                this.buffer.append("  ");
            }
        }

        this.buffer.append(str);
        this.isNeedIndent = false;
    }

    public final void appendClosingTag(int tagKey) throws XmlPduException {
        this.appendWithNewLine("</" + TagMap.getKeyByValue(tagKey) + ">");
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
