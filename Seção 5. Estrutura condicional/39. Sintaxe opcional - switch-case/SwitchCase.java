import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        String semana;
        System.out.println("Digite um numero de 1 a 7: ");
        x = sc.nextInt();

        switch (x) {
            case 1:
                semana = "Domingo";
                break;
            case 2:
                semana = "Segunda";
                break;
            case 3:
                semana = "Terça";
                break;
            case 4:
                semana = "Quarta";
                break;
            case 5:
                semana = "Quinta";
                break;
            case 6:
                semana = "Sexta";
                break;
            case 7:
                semana = "Sabado";
                break;
            default:
                semana = "Valor invalido";
                break;
        }

        System.out.printf("Dia da semana: %s", semana);
        sc.close();
    }
}