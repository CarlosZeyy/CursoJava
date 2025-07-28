package course;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mask = 0b100000;

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        if ((n & mask) != 0) {
            System.out.println("6th bit is true");
        } else {
            System.out.println("6th bit is false");
        }
    }
}