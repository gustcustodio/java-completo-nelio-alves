package secao13.app;

import secao13.app.model.entities.Circle;
import secao13.app.model.entities.Rectangle;
import secao13.app.model.entities.Shape;
import secao13.app.model.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int numberOfShapes = sc.nextInt();

        for (int i = 1; i <= numberOfShapes; i++) {
            System.out.printf("Shape #%d data: %n", i);
            System.out.print("Rectangle or Circle (r/c)? ");
            char typeOfShape = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color colorOfShape = Color.valueOf(sc.next());

            if (typeOfShape == 'r') {
                System.out.print("Width: ");
                double witdh = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                shapes.add(new Rectangle(colorOfShape, witdh, height));
            } else if (typeOfShape == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shapes.add(new Circle(colorOfShape, radius));
            }
        }

        System.out.println("\nSHAPE AREAS: ");
        for (Shape shape : shapes) {
            System.out.printf("%.2f%n", shape.area());
        }

        sc.close();
    }
}
