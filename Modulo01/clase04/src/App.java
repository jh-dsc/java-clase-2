public class App {
  public static void main(String[] args) throws Exception {
    var edad = 60;

    // if (edad >= 18) {
    // if (edad >= 60) {
    // System.out.println("Usted es adulto mayor");
    // } else {
    // System.out.println("Usted es mayor de edad");
    // }
    // } else {
    // System.out.println("Usted es menor de edad");
    // }

    if (edad < 0) {
      System.out.println("Edad no valida");
    } else if (edad < 18) {
      System.out.println("Menor de edad");
    } else if (edad < 29) {
      System.out.println("Adulto joven");
    } else if (edad < 45) {
      System.out.println("Adulto");
    } else if (edad < 60) {
      System.out.println("Grandecito");
    } else {
      System.out.println("Adulto Mayor");
    }

    System.out.println("Termino el programa");
  }
}
