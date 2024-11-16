import java.util.Scanner;

public class HolaMundo {

  public static void main(String[] args) {
    System.out.println("Hola mundo");
    System.out.println(10.5);

    System.out.printf("Aqui va una cadena: %s", "Javier");
    System.out.printf("Aqui va una cadena: %s%n", "Javier");

    System.out.printf("Mi nombre es %s y tengo %d años %n", "Javier Henao", 40);

    // Ingresando Datos por teclado:

    var entrada = new Scanner(System.in);

    System.out.println("Digita un numero entero: ");
    var entero = entrada.nextInt();

    System.out.printf("El entero digitado es: %s%n", entero);
    // System.out.println(entero);

    entrada.close();
  }

}