import java.util.Locale;
import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double preco = sc.nextDouble();
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.printf("Valor com desconto: %.2f", desconto);

        sc.close();
    }
}