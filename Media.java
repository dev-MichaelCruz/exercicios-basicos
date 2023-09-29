import java.util.Scanner;
import java.util.ArrayList;

public class Media {
  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    float totalSoma = 0;
    float media;

    ArrayList<Number> numeros = new ArrayList<>();

    System.out.println("Este programa calcula a média de elemenntos numéricos");
    System.out.println("--------------------------------------------------------");
    System.out.println("Deseja inserir um elemento? (s / n)");
    String resposta = leitor.nextLine();

    while (resposta == "s") {
      System.out.println("Digite um número");
      float numero = leitor.nextFloat();
      numeros.add(numero);
      totalSoma = totalSoma + numero;
      System.out.println("Deseja inserir um elemento? (s / n)");
      resposta = leitor.nextLine();
    }

    media = totalSoma / numeros.size();

    System.out.println(media);

  }
}
