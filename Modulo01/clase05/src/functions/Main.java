package functions;

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    ejemplosClaseMath();
    exampleRandom();
    exampleString();
  }

  private static void exampleString() {
    var name = "Javier Henao Hernandez";

    System.out.println(name.length());
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    System.out.println(name.charAt(5));
  }

  private static void exampleRandom() {

    var random = new Random();
    for (int i = 0; i < 10; i++) {
      System.out.println(random.nextInt(10));

    }
  }

  private static void ejemplosClaseMath() {
    System.out.println(Math.min(5, 7));
    System.out.println(Math.sqrt(125));
    System.out.println(Math.pow(2, 3));
  }
}
