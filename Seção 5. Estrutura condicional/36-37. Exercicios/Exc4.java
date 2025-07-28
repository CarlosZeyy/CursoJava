import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicio, horaFinal, duracao;

        System.out.println("Digite hora de inicio: ");
        horaInicio = sc.nextInt();

        System.out.println("Digite hora de termino: ");
        horaFinal = sc.nextInt();

       if (horaInicio < horaFinal) {
           duracao = horaFinal - horaInicio;
       } else {
           duracao = 24 - horaInicio + horaFinal;
       }

       System.out.printf("O JOGO DUROU %d HORA(S)", duracao);

       sc.close();
    }
}