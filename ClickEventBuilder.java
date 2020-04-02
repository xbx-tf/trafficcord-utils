package net.md_5.bungee.api.chat.builder;

import net.md_5.bungee.api.chat.ClickEvent;

public class ClickEventBuilder {

    private ClickEvent.Action action;

    private String text;


    public void setAction(ClickEvent.Action action) {
        this.action = action;
    }

    public void setText(String value) {
        this.text = value;
    }

    public ClickEvent build() {
        return new ClickEvent(action, text);
    }



}
