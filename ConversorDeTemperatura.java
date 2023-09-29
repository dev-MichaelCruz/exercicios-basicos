import java.util.Scanner;

public class ConversorDeTemperatura {
  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    System.out.println("============================================");
    System.out.println("Este é um conversor de tempearturas");
    System.out.println("Escolha qual conversão deseja realizar");
    System.out.println("---------------------------------------------");
    System.out.println("1 - Celsius -> Fahrenheit");
    System.out.println("2 - Fahrenheit -> Celsius");
    System.out.println("-----------------------------------------------");
    int opcao = leitor.nextInt();

    if (opcao == 1) {
      System.out.println("-----------------------------------------------");
      System.out.println("Digite o valor em Celsius");
      float celsius = leitor.nextFloat();
      float convertidoEmFahrenheit = (float) (celsius * 1.8 + 32);
      System.out.println("A temperatura convertida igual a: " + convertidoEmFahrenheit + "°F");
      System.out.println("-----------------------------------------------");
    } else {
      System.out.println("Digite o valor em Fahrenheit");
      float fahrenheit = leitor.nextFloat();
      float convertidoEmCelsius = (float) 5 / 9 * (fahrenheit - 32);
      System.out.println("A temperatura convertida igual a: " + convertidoEmCelsius + "°C");
      System.out.println("-----------------------------------------------");
    }
  }
}
