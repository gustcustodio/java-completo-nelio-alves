package secao16.interfaces2;

import secao16.interfaces2.model.entities.AbstractShape;
import secao16.interfaces2.model.entities.Circle;
import secao16.interfaces2.model.entities.Rectangle;
import secao16.interfaces2.model.enums.Color;

public class Aula173 {
    public static void main(String[] args) {
        AbstractShape circle = new Circle(Color.BLACK, 2.0);
        AbstractShape rectangle = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle area: " + String.format("%.2f", circle.area()));
        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Rectangle area: " + String.format("%.2f", rectangle.area()));
    }
}
