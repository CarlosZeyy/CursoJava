package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        String nome;
        int nPessoa, idade ,nMenores;
        double altura, alturaTotal, percentualMenores;

        System.out.print("Quantas pessoas serao digitada? ");
        nPessoa = sc.nextInt();

        Person[] person = new Person[nPessoa];

        for (int i = 0; i < nPessoa; i++) {
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.print("Nome: ");
            nome = sc.nextLine();
            sc.nextLine();
            System.out.print("Idade: ");
            idade = sc.nextInt();
            System.out.print("Altura: ");
            altura = sc.nextDouble();
        }

    }
}
