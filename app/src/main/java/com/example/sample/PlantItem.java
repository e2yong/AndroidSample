package com.example.sample;
import android.graphics.drawable.Drawable;

public class PlantItem<Drawble> {
    private Drawble iconDrawble;
    private String textStr;

    public void setIcon(Drawble icon) {
        iconDrawble = icon;
    }
    public void setText(String text) {
        textStr = text;
    }

    public Drawble getIcon() {
        return this.iconDrawble;
    }
    public String getText() {
        return this.textStr;
    }
}
