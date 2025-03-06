package Cajero;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ControllerCajero controllerCajero;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bienvenido al Simulador de Cajero Automático.");
        controllerCajero = new ControllerCajero(scanner);
        controllerCajero.crearCuentas();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Ver saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    controllerCajero.realizarDeposito();
                    break;
                case 2:
//                    realizarRetiro();
                    break;
                case 3:
                    controllerCajero.verSaldo();
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero automático.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
