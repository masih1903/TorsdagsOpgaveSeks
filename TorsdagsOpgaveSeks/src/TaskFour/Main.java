package TaskFour;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



        Square s1 = new Square(10, 10);
        Circle c1 = new Circle(10);


        System.out.println("Square area is: " + s1.getArea());

        System.out.println("Circle area is: " + c1.getArea());

        ShapeBuilder sb = new ShapeBuilder();

        sb.addShape(s1);
        sb.addShape(c1);

        System.out.println("Square area + circle area = " + sb.getTotalArea());



    }
}
