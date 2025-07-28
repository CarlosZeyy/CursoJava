import java.util.Locale;
import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero de 0 a 100: ");
        double value = sc.nextDouble();


        if (value < 0.00 || value > 100.00) {
            System.out.println("Fora de intervalo");
        } else if (value <= 25.00) {
            System.out.println("Intervalo [0,25]");
        } else if (value <= 50.00) {
            System.out.println("Intervalo [25,50]");
        } else if (value <= 75.00) {
            System.out.println("Intervalo [50,75]");
        } else {
            System.out.println("Intervalo [75,100]");
        }

        sc.close();
    }
}