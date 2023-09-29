import java.util.Scanner;
import java.util.ArrayList;

public class Media {
  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    float totalSoma = 0;
    float media;

    ArrayList<Number> numeros = new ArrayList<>();

    System.out.println("==========================================================");
    System.out.println("Este programa calcula a média de elemenntos numéricos");
    System.out.println("--------------------------------------------------------");
    System.out.println("Deseja inserir um elemento?");
    System.out.println("1- SIM / 2 - NÃO");
    int resposta = leitor.nextInt();

    while (resposta == 1) {
      System.out.println("Digite um número");
      float numero = leitor.nextFloat();
      numeros.add(numero);
      totalSoma = totalSoma + numero;
      System.out.println("Deseja inserir outro elemento?");
      System.out.println("1- SIM / 2 - NÃO");
      System.out.println("--------------------------------------------------------");
      resposta = leitor.nextInt();
    }

    media = totalSoma / numeros.size();

    System.out.println("--------------------------------------------------------");
    System.out.println("Foram adicionados " + numeros.size() + " elementos");
    System.out.println("A média dos elementos é: " + media);
    System.out.println("==========================================================");

  }
}
