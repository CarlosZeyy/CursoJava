import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        showResult(higher);
    }

//    public static int max(int x, int y, int z) {
//        if (x > y && x > z) {
//            aux = x;
//        } else if (y > z) {
//            aux = y;
//        } else {
//            aux = z;
//        }
//        return aux;
//    }

    // Outro jeito de fazer usando return:
    public static int max(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
    }

    public static void showResult(int value) {
        System.out.println("Higher: " + value);
    }
}