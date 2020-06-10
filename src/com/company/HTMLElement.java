package com.company;

public class HTMLElement extends HTMLTag {
    public HTMLElement(String tagName) {
    }

    @Override
    public String getTagName() {
        return this.tagName;
    }

    @Override
    public void setTagName(String tagName) {
        super.tagName = tagName;
    }

    @Override
    public void setStartTag(String startTag) {
        super.startTag = startTag;
    }

    @Override
    public void setEndTag(String endTag) {
        super.endTag = endTag;
    }

    @Override
    public void generateHtml() {

    }
}
