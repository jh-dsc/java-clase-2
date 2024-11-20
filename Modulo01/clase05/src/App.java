import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {

    var scanner = new Scanner(System.in);

    showMenu(scanner);

    pressEnter(scanner);

    System.out.println("Termino la aplicacion");

    scanner.close();

  }

  private static void showMenu(Scanner scanner) {

    int option;
    do {

      System.out.println("=====================");
      System.out.println("Menu Clase 5");
      System.out.println("---------------------");
      System.out.println("1. Prueba del ciclo while");
      System.out.println("2. Prueba del ciclo do-while");
      System.out.println("3. Prueba del ciclo for");
      System.out.println("0. Salir de la Aplicacion");
      System.out.print("Ingresa una opcion: ");
      option = scanner.nextInt();
      scanner.nextLine(); // Limpiar el buffer - Gastar el Enter
      switch (option) {
        case 1:
          whileTest();
          break;
        case 2:
          doWhileTest();
          break;
        case 3:
          forTest();
          break;
        case 0:
          System.out.println("Hasta luego!");
          break;
        default:
          System.err.println("Ingrese una opcion valida");
          break;
      }
      if (option != 0) {

        pressEnter(scanner);
      }
    } while (option != 0);

  }

  private static void pressEnter(Scanner scanner) {
    System.out.println("Presione ENTER para continuar");
    scanner.nextLine();
  }

  private static void forTest() {
    // FOR
    for (int i = 0; i < 10; i += 3) {
      System.out.println(i--);
    }

    System.out.println("You Win!");
  }

  private static void doWhileTest() {
    // DO WHILE

    // Inicializacion
    var counter = 5;

    do {
      System.out.println(counter);

      // Avance
      counter--;
    } while (counter > 0);
    System.err.println("BOOM");
  }

  // FUNCION:
  public static void whileTest() {

    // WHILE

    // Inicializacion:

    var counter = 0;

    while (counter <= 10) {
      System.out.println(counter);

      // Avance
      counter++;
    }

  }
}
