import java.util.Scanner;
import java.util.Locale;

/// * String

//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        String x;
//        x = sc.next();
//
//        System.out.println("Voce digitou: " + x);
//
//        sc.close();
//    }
//}

/// * Int

//public class Main {
//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//
//        Scanner sc = new Scanner(System.in);
//
//        int x;
//        x = sc.nextInt();
//
//        System.out.printf("Voce digitou: %d", x);
////        // Não usar o println para tentar imprimir uma variavel usando o metodo %d, %.2f, %c... o printf é o certo para ser usado para esse tipo de execução.
//
//        sc.close();
//    }
//}

/// * Double

//public class Main {
//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//
//        Scanner sc = new Scanner(System.in);
//
//        double x;
//        x = sc.nextDouble();
//
//        System.out.printf("Voce digitou: %.2f", x);
////        // Não usar o println para tentar imprimir uma variavel usando o metodo %d, %.2f, %c... o printf é o certo para ser usado para esse tipo de execução.
////        // Quando usar double tem que verificar o locale do sistema, se estiver em br e acabar digitando "4.5" vai resultar em erro e se digitar 4,5 em US vai dar erro tbm.
////        // Usar o Locale.setDafault(); antes do scanner.
//
//        sc.close();
//    }
//}

/// * Char / String?

//public class Main {
//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//
//        Scanner sc = new Scanner(System.in);
//
//        char x;
//        char y;
//        x = sc.next().charAt(0); // <= Digitando por ex: "Carlos" retorna "C".
//        System.out.printf("Voce digitou: %c\n", x);
////       // usando o metodo charAt consigo pegar o index do texto desejado - chart(0) => primeira letra da string
//
//        y = sc.next().charAt(1); // <= Digitando por ex: "Carlos" retorna "a".
//        System.out.printf("Voce digitou: %c", y);
////      // usando o metodo charAt consigo pegar o index do texto desejado - chart(1) => segunda letra da string, se colocar (2) retorna a terceira e por ai vai...
//
//        sc.close();
//    }
//}

/// * Varios tipos de dados na mesma linha!
//
//public class Main {
//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//
//        Scanner sc = new Scanner(System.in);
//
//        String x;
//        int y;
//        double z;
//
//        x = sc.next();
//        y = sc.nextInt();
//        z = sc.nextDouble();
//
//        System.out.printf("Dados digitados: %s %d %.2f", x, y, z);
////        System.out.println("Dados digitados: ");
////        System.out.println(x);
////        System.out.println(y);
////        System.out.println(z);
//
////        Os dados podem ser preenchidos na mesma linha só apertando espaço a cada vez que termina de digitar algo ex:
////        Carlos 25 5.5
//
////        Os dados tbm podem ser preenchidos apertando enter depois que termina de digitar algo ex:
////        Detalhe: ele só le a primeira palavra nesse metodo! se tentar digitar por ex: Carlos Moises => Error
//
////        Carlos
////        25
////        5.5
//
//        sc.close();
//    }
//}

/// Continuação do tipos em mesma linha

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

////    Dessa maneira o nextInt "come" o valor do proximo nextLine, uma solução pra isso é colocar um nextLine vazio depois do NextInt;
//        x = sc.nextInt();
//        s1 = sc.nextLine();
//        s2 = sc.nextLine();
//        s3 = sc.nextLine();

////    Dessa maneira funciona normalmente;
        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}


