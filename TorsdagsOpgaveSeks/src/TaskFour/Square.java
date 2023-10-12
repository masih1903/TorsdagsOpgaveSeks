package TaskFour;

public class Square implements Shape{


    double height;
    double width;

    Square(double height, double width){
        this.height = height;
        this.width = width;


    }
    @Override
    public double getArea() {

        return height * width;





    }
}
