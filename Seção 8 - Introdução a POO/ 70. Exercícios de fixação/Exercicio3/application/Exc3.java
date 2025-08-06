package application;

import entities.Students;

import java.util.Locale;
import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Students students = new Students();

        System.out.print("Name: ");
        students.name = sc.nextLine();
        System.out.println("Grades: ");
        students.grade1 = sc.nextDouble();
        students.grade2 = sc.nextDouble();
        students.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f\n", students.finalGrade());

        if (students.finalGrade() > 60) {
        System.out.println("PASS");
        } else {
        System.out.println("FAILED");
        System.out.printf("MISSING %.2f POINTS",students.missingPoints());
        }
    }
}
