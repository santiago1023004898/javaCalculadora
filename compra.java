package compras;

import java.util.Scanner;

public class compra {

  public static void calcular(Scanner sc) {
    System.out.print("Ingrese el precio 1: ");
    double p1 = sc.nextDouble();
    System.out.print("Ingrese el precio 2: ");
    double p2 = sc.nextDouble();
    System.out.print("Ingrese el precio 3: ");
    double p3 = sc.nextDouble();

    double subtotal = p1 + p2 + p3;
    double iva = subtotal * 0.19;
    double total = subtotal + iva;

    System.out.println("Subtotal: $" + subtotal);
    System.out.println("IVA (19%): $" + iva);
    System.out.println("Total: $" + total);
  }
}
