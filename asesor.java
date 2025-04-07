package asesores;

import java.util.Scanner;

public class asesor {

  public static void calcularPago(Scanner sc) {
    final double SALARIO_BASICO = 1600000;
    System.out.print("Ingrese el monto de la venta: ");
    double venta = sc.nextDouble();
    double comision = 0;

    if (venta >= 500000 && venta < 1000000) {
      comision = venta * 0.05;
    } else if (venta >= 1000000 && venta < 1500000) {
      comision = venta * 0.10;
    } else if (venta >= 1500000 && venta < 2000000) {
      comision = venta * 0.15;
    } else if (venta >= 2000000 && venta < 2500000) {
      comision = venta * 0.20;
    }

    double pagoTotal = SALARIO_BASICO + comision;

    System.out.println("Salario Básico: $" + SALARIO_BASICO);
    System.out.println("Comisión: $" + comision);
    System.out.println("Pago Total: $" + pagoTotal);
  }
}
