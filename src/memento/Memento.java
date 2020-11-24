package memento;

import java.awt.Color;

public class Memento {

    private Color color;
    private String text;

    public Memento(Color color, String text) {
        this.color = color;
        this.text = text;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
