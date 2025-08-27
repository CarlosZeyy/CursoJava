package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Exc9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar: ");
        int nPessoas = sc.nextInt();


        String[] nome = new String[nPessoas];
        int[] idade = new int[nPessoas];

        Pessoa pessoa = new Pessoa(nome, idade);

        for (int i = 0; i < nPessoas; i++) {
            System.out.printf("Dados da %d° pessoa: ", i+1);
            System.out.print("\nNome: ");
            sc.nextLine();
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            pessoa = new Pessoa(nome, idade);
        }

        int maior = 0, maisVelho = 0;

        for (int i = 0; i < nPessoas; i++) {
            if (idade[i] > maior) {
                maior = idade[i];
                maisVelho = i;
            }
        }

        System.out.printf("Pessoa mais velha: %s", nome[maisVelho]);
    }
}
