import java.util.Scanner;

public class ContagemRegressiva {
  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);
    System.out.println("=================================================");
    System.out.println("Este programa executa uma contagem regressiva!");
    System.out.println("Digite um número para executar");
    int numero = leitor.nextInt();

    System.out.println("---------------------------------------------------");
    while (numero >= 1) {
      System.out.println(numero);
      numero--;
    }
    System.out.println("=================================================");
  }
}
