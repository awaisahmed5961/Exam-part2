package com.company;

import java.util.ArrayList;

public  abstract class  HTMLTag {
    private ArrayList <HTMLTag> tags = new ArrayList<HTMLTag>();
    public HTMLTag() {

    }

    public void addChildTag(HTMLTag tag){
    tags.add(tag);
    }
    public void removeChildTag(HTMLTag tag){
        tags.remove(tag);
    }
    protected String tagName;
    protected String startTag;
    protected String endTag;

    public abstract String getTagName();

    public abstract void setTagName(String tagName);

    public abstract void setStartTag(String startTag);

    public abstract void setEndTag(String endTag);

    public void setTagBody(String tag) {

    }

    public abstract void generateHtml();

}