package net.md_5.bungee.api.chat;

public class TextComponentBuilder {


    private TextComponent c;

    public TextComponentBuilder(String text) {
        this.c = new TextComponent(text);
    }
    public TextComponentBuilder(BaseComponent... components) {
        this.c = new TextComponent(components);
    }

    public TextComponentBuilder setHoverEvent(HoverEvent e) {
        c.setHoverEvent(e);
        return this;
    }
    public TextComponentBuilder setClickEvent(ClickEvent e) {
        c.setClickEvent(e);
        return this;
    }

    public TextComponentBuilder addExtra(String extra) {
        c.addExtra(extra);
        return this;
    }

       public TextComponentBuilder addExtra(BaseComponent extra) {
        c.addExtra(extra);
        return this;
    }

    public TextComponentBuilder addFormat(StringBuilder format) {
        c.addFormat(format);
        return this;
    }

    public TextComponent build() {
        return c;
    }




}
