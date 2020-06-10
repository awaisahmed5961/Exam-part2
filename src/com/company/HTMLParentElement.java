package com.company;

import java.util.ArrayList;

public class HTMLParentElement extends HTMLTag {
//    private ArrayList<HTMLTag> childTags = new ArrayList<HTMLTag>();

    public HTMLParentElement(String tagName) {
        this.tagName = tagName;
    }

    public  void  addChildTag(HTMLTag tag){
        tags.add(tag);
    }
    public void removeChildTag(HTMLTag tag){
        tags.remove(tag);
    }
    public ArrayList<HTMLTag> getChildern(){
        return tags;
    }

    @Override
    public String getTagName() {
        return super.tagName;
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
        for (HTMLTag tags : tags){
            tags.generateHtml();
        }
        System.out.println(endTag);
    }
}
