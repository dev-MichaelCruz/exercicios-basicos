import java.util.Scanner;

public class ParOuImpar {

  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    System.out.println("==========================================================");
    System.out.println("Este programa define se o número inseriso é par ou ímpar");
    System.out.println("Insira um número:");
    int numero = leitor.nextInt();
    System.out.println("----------------------------------------------------------");

    if ((numero % 2) == 0) {
      System.out.println("O número inserido é PAR");
    } else {
      System.out.println("O número inserido é IMPAR");
    }
    System.out.println("==========================================================");
    main(args);

  }

}
