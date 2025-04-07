// File: app/main.java
package app;

import asesores.asesor;
import compras.compra;
import java.util.Scanner;
import operaciones.calculadora;

public class main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int opcion;
            do {
                System.out.println("\n--- MENÚ PRINCIPAL ---");
                System.out.println("1. Operaciones Básicas");
                System.out.println("2. Calcular Compras");
                System.out.println("3. Calcular Pago de Asesor");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1 -> calculadora.realizarOperaciones(sc);
                    case 2 -> compra.calcular(sc);
                    case 3 -> asesor.calcularPago(sc);
                    case 0 -> System.out.println("¡Hasta luego!");
                    default -> System.out.println("Opción inválida.");
                }
            } while (opcion != 0);
        }
    }
}
