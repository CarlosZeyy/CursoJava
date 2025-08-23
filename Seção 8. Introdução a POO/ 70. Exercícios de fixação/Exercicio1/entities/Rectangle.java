package entities;

public class Rectangle {
    public double width;
    public double height;

    public double area(double x, double y) {
        return x * y;
    }

    public double perimeter(double x, double y) {
        return 2 * (x + y);
    }

    public double diagonal(double x, double y) {
        return Math.sqrt((x * x) + (y * y));
//        return Math.sqrt((Math.pow(x, 2) + Math.pow(y,2)));
    }
}
