package util;

public class Calculator1 {
    public final double PI = 3.14;

    public double circumference(double radius) {
        return 2 * PI * radius;
    }

    public double volume(double radius) {
        return 4 * PI * radius * radius * radius / 3;
    }
}
