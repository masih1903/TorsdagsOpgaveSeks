package TaskFour;

public class Circle implements Shape {

    double radius;
    double pi = 3.14;

    Circle(double radius){
        this.radius = radius;

    }


    @Override
    public double getArea() {

        return pi * radius * radius;
    }
}
