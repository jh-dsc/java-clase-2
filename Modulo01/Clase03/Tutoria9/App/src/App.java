import java.util.Scanner;

public class App {

  // Elementos necesarios para todas las acciones.
  static Scanner scanner = new Scanner(System.in);
  static String[] planetas = { "marte", "jupiter", "saturno" };
  static double[] distancias = { 78.0, 628.0, 1256.0 };

  static String[] naves = { "Exploradora", "Carga Pesada", "Velocidad Maxima" };
  static double[] velocidades = { 20000.0, 15000.0, 30000.0 };

  public static void main(String[] args) throws Exception {

    int opcion;

    do {

      mostrarMenu();
      opcion = scanner.nextInt();

      switch (opcion) {
        case 1:
          seleccionarPlaneta();
          break;
        case 2:
          seleccionarNave();
          break;
        case 3:
          seleccionarRecursos();
          break;
        case 4:
          seleccionarPlaneta();
          break;

        default:
          break;
      }

    } while (opcion != 4);

  }

  public static void mostrarMenu() {
    System.out.println("\n---Menu Principal---");
    System.out.println("1. Seleccionar un planeta de destino");
    System.out.println("2. Seleccionar una nave espacial");
    System.out.println("3. Iniciar simulacion del vuelo");
    System.out.println("4. Salir");
    System.out.println("Por favor, elige una opcion: ");
  }

  public static void seleccionarNave() {
  }

  public static void seleccionarPlaneta() {
  }

  public static void seleccionarRecursos() {
  }

  // Metodos auxiliares

  public static void imprimirPlanetas() {
  }

  public static void lanzarEventos() {
  }
}
