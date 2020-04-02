package net.md_5.bungee.api.chat.builder;

import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;

public class HoverEventBuilder {

    private HoverEvent hoverEvent;
    private HoverEvent.Action action;

    private String value;
    private BaseComponent[] valueC;


    public void setAction(HoverEvent.Action action) {
        this.action = action;
    }

    public void setValue(BaseComponent[] components) {
        this.valueC = components;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public HoverEvent build() {
        if(value == null) {
            hoverEvent = new HoverEvent(action, valueC);
        }else{
            hoverEvent = new HoverEvent(action, new ComponentBuilder(value).create());
        }
        return hoverEvent;
    }



}
