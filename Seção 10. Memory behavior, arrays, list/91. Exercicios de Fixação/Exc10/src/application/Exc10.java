package application;

import java.util.Locale;
import java.util.Scanner;

public class Exc10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int nAlunos;
        double media;

        System.out.print("Quantos alunos serão digitados: ");
        nAlunos = sc.nextInt();

        String[] nomeAluno = new String[nAlunos];
        double[] primeiroSem = new double[nAlunos];
        double[] segundoSem = new double[nAlunos];

        for (int i = 0; i < nAlunos; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %d° aluno: ", i + 1);
            sc.nextLine();
            nomeAluno[i] = sc.nextLine();
            primeiroSem[i] = sc.nextDouble();
            segundoSem[i] = sc.nextDouble();
        }

        System.out.println("Alunos Aprovados: ");

        for (int i = 0; i < nAlunos; i++) {
            media = (primeiroSem[i] + segundoSem[i]) / 2;
            if (media >= 6.0) {
                System.out.printf("%s \n", nomeAluno[i]);
            }
        }
        sc.close();
    }
}
