import java.util.Scanner;
import java.util.Random;

public class AdvinharNumero {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    Random random = new Random(1);

    int numeroAleatorio = random.nextInt(100);

    System.out.println("Digite um número");
    int numeroInserido = leitor.nextInt();

    while (numeroInserido != numeroAleatorio) {
      if (numeroInserido < numeroAleatorio) {
        System.out.println("O número inserido é menor. Aumente");
        numeroInserido = leitor.nextInt();
      } else if (numeroInserido > numeroAleatorio) {
        System.out.println("O numero inserido é maior. Abaixe");
        numeroInserido = leitor.nextInt();
      }
    }

    System.out.println("PARABÉNS, VOCÊ ACERTOU!");

    main(args);
  }
}
