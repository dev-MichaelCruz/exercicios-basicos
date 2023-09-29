import java.util.Scanner;

public class Calculadora {

  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);
    float resultado = 0;
    System.out.println("==========================================================");
    System.out.println("Esta é uma calculadora para realizar operações simples!");
    System.out.println("Que tipo de operação deseja realizar?");
    System.out.println("-------------------------------------------------------------");
    System.out.println("1 - Adição");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação");
    System.out.println("4 - divisão");
    System.out.println("---------------------------------------------------------------");
    int operacao = leitor.nextInt();
    System.out.println("---------------------------------------------------------------");
    System.out.println("Ok, você escolheu a opção " + operacao);
    System.out.println("Digite agora o primeiro numero:");
    float primeiroNumero = leitor.nextFloat();

    System.out.println("---------------------------------------------------------------");
    System.out.println("Digite agora o segundo número:");
    float segundoNumero = leitor.nextFloat();
    System.out.println("---------------------------------------------------------------");

    switch (operacao) {
      case 1 -> resultado = primeiroNumero + segundoNumero;
      case 2 -> resultado = primeiroNumero - segundoNumero;
      case 3 -> resultado = primeiroNumero * segundoNumero;
      case 4 -> resultado = primeiroNumero / segundoNumero;
    }

    System.out.println("O resultado da operação é: " + resultado);
    System.out.println("==========================================================");

    main(args);
  }

}
