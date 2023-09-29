import java.util.Scanner;

public class CalcularFatorial {

  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);
    System.out.println("=================================================");
    System.out.println("Programa para calcular o fatorial de um número!");
    System.out.println("Insira um número para calcular o Fatorial");
    System.out.println("--------------------------------------------------");
    int numero = leitor.nextInt();

    long fatorial = 1;

    for (int i = 1; i <= numero; i++) {
      fatorial = fatorial * i;
    }

    System.out.println("--------------------------------------------------");
    System.out.println("O fatorial de " + numero + " é igual a " + fatorial);
    System.out.println("==================================================");
  }

}
