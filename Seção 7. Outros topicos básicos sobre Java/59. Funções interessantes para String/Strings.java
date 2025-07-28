public class Strings {
    public static void main(String[] args) {
        // lowecase, uppercase, trim, substring(x), substring(x, y), replace(x,y), replace('abc','xyz'), indexof('xyz'), lastIndexOf('xyz').

        String original = "abcde FGHIJ ABC abc DEFG  ";

        String s1 = original.toLowerCase(); // Letras em minusculo
        String s2 = original.toUpperCase(); // Letras em maiusculo
        String s3 = original.trim(); // remove os espaços no começo e final da string
        String s4 = original.substring(2); // começa a ler a string a partir do indice definido: (2) -> 0 = a, 1 = b, 2 => c.
        String s5 = original.substring(2, 9); // começa a ler a string a partir do indice definido e vai até o outro indice definido (2,9): (2) = c e (9) = I, espaços também contam como caracter.
        String s6 = original.replace('a', 'x'); // vai trocar todos os chars 'a' por 'x' na string.
        String s7 = original.replace("abc", "xyz"); // vai trocar todas as substrings 'abc' por 'xyz' na string. (quando for usar replace para trocar substrings é obrigatorio usar aspas duplas "".
        int i = original.indexOf("bc"); // vai procurar a primeira ocorrencia da na string.
        int j = original.lastIndexOf("bc"); // vai procurar a ultima ocorrencia na string.

        System.out.println("Original: -" + original + "-");
        System.out.println("LowerCase: -" + s1 + "-");
        System.out.println("UpperCase: -" + s2 + "-");
        System.out.println("Trim: -" + s3 + "-");
        System.out.println("Substring (2): -" + s4 + "-");
        System.out.println("Substring (2,9): -" + s5 + "-");
        System.out.println("Raplace ('a','x'): -" + s6 + "-");
        System.out.println("Raplace ('abc','xyz'): -" + s7 + "-");
        System.out.println("IndexOf ('bc'): " + i );
        System.out.println("LastIndexOf ('bc'): " + j );
    }
}