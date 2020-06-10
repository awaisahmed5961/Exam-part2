package com.company;

public class HTMLElement extends HTMLTag {
  private String tagBody;

    public HTMLElement(String tagName) {
            tagBody = tagName;
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
    public  void setTagBody(String tag){
        tagBody = tag;
    }

    @Override
    public void generateHtml() {
        System.out.println(startTag + " "+ tagBody + " " +endTag);
    }
}
