package util;

public class CurrencyConverter {
    public static final double IOF = 6;

    public static double converter(double dollar, double amount) {
        amount += amount * IOF / 100;

        return amount * dollar;
    }
}
