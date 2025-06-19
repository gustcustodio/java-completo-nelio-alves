package secao16.interfaces2.model.entities;

import secao16.interfaces2.model.enums.Color;

public abstract class AbstractShape implements IShape {
    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
