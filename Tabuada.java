import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("==============================================================");
        System.out.println("Este programa te apresenta uma tabuada de um número qualquer");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Digite um número: ");
        int numero = leitor.nextInt();

        System.out.println("-------------------------------------------------------------");
        System.out.println("Tabuada do " + numero);
        System.out.println("-------------------------------------------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        System.out.println("==============================================================");

        main(args);

    }
}
