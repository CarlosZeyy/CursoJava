package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int nPessoa, nMenores;
        double media, alturaTotal, percentualMenores;

        System.out.print("Quantas pessoas serao digitada? ");
        nPessoa = sc.nextInt();

        Person[] person = new Person[nPessoa];


        for (int i = 0; i < nPessoa; i++) {
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            person[i] = new Person(nome, idade, altura);
        }

        alturaTotal = 0;

        for (int i = 0; i < person.length; i++) {
            alturaTotal += person[i].getHeight();
        }

        media = alturaTotal / nPessoa;

        nMenores = 0;

        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() < 16) {
                nMenores++;
            }
        }

        percentualMenores = ((double) nMenores / nPessoa) * 100.0;

        System.out.printf("Altura média: %.2f\n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() < 16) {
                System.out.println(person[i].getName());
            }
        }

        sc.close();
    }
}