import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma palavra ou sentença para verificar se é palíndromo:");
        String palavra = leitor.nextLine();

        String palindromo = "";
        String palavraSemEspacos = palavra.replace(" ", "").toLowerCase();

        for (int i = palavraSemEspacos.length() - 1; i >= 0; i--) {
            palindromo += palavraSemEspacos.charAt(i);
        }

        System.out.println("A palavra ou sentença é um palíndromo?");
        System.out.println(palavraSemEspacos);
        System.out.println(palindromo.equals(palavraSemEspacos));

    }

}