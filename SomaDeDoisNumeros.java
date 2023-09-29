import java.util.Scanner;

public class SomaDeDoisNumeros {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("============================================");
    System.out.println("Este programa Calcula a soma de dois números!");
    System.out.println("--------------------------------------------");

    System.out.println("Digite o primeiro número");
    double primeroNumero = leitor.nextDouble();
    System.out.println("--------------------------------------------");

    System.out.println("Digite o segundo número:");
    double segundoNumero = leitor.nextDouble();
    System.out.println("--------------------------------------------");

    double soma = primeroNumero + segundoNumero;

    System.out.println("--------------------------------------------");
    System.out.println("A soma dos dois números é: " + soma);

    main(args);

  }
}
