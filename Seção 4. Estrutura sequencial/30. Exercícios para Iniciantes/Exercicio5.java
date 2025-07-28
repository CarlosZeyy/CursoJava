import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codPeca, numPeca, codPeca2, numPeca2;
        double valorUni, valorUni2, valoresPecas1, valoresPecas2 ,valorTotal;

        codPeca = sc.nextInt();
        numPeca = sc.nextInt();
        valorUni = sc.nextDouble();

        codPeca2 = sc.nextInt();
        numPeca2 = sc.nextInt();
        valorUni2 = sc.nextDouble();

        valoresPecas1 = numPeca * valorUni;
        valoresPecas2 = numPeca2 * valorUni2;

        valorTotal = valoresPecas1 + valoresPecas2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);

        sc.close();
    }
}