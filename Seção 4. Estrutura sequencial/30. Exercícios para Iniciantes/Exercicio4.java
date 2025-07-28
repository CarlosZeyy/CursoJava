import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numHora, valorHora;
        double salario, salarioFunc;

        numHora = sc.nextInt();
        valorHora = sc.nextInt();
        salario = sc.nextDouble();

        salarioFunc = valorHora * salario;

        System.out.printf("NUMBER = %d\n", numHora);
        System.out.printf("SALARY = U$ %.2f", salarioFunc);
        sc.close();
    }
}