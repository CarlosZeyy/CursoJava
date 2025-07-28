import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quatidade de minutos:");
        int minutos = sc.nextInt();

        double conta = 50;
        if (minutos > 100) {
            conta += (minutos - 100) * 2;
        }

        System.out.printf("Valor da conta: R$: %.2f", conta);

        sc.close();
    }
}

/// Operadores de atribuição comulativa
// operador de atribuição comulativa pega o valor da variavel e faz a operação conforme definido nela mesmo ex: A = 10 e B = 5 => A += B > A = A + B = 15; ou seja o valor da variavel A vai ser alterado para 15
/// a += b; ==> a = a + b;
/// a -= b; ==> a = a - b;
/// a *= b; ==> a = a * b;
/// a /= b; ==> a = a / b;
/// a %= b; ==> a = a % b;
