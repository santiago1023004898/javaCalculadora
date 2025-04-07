package operaciones;

import java.util.Scanner;

public class calculadora {

  public static void realizarOperaciones(Scanner sc) {
    System.out.print("Ingrese el primer número: ");
    double num1 = sc.nextDouble();
    System.out.print("Ingrese el segundo número: ");
    double num2 = sc.nextDouble();

    System.out.println("Suma: " + (num1 + num2));
    System.out.println("Resta: " + (num1 - num2));
    System.out.println("Multiplicación: " + (num1 * num2));

    if (num2 != 0) {
      System.out.println("División: " + (num1 / num2));
    } else {
      System.out.println("No se puede dividir entre cero.");
    }
  }
}
