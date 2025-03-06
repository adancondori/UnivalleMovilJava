package Cajero;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerCajero {
    public Scanner scanner;
    public static ArrayList<CuentaBancaria> bancarias = new ArrayList<>();

    public ControllerCajero(Scanner scanner) {
        this.scanner = scanner;
    }

    public void crearCuentas(){
        bancarias.add(new CuentaBancaria("Adan Condori", 100.0, "1201"));
        bancarias.add(new CuentaBancaria("Karen Infantes", 500.0, "1202"));
        bancarias.add(new CuentaBancaria("Pedro Perez", 1000.0, "1203"));
    }

    public void realizarDeposito(){
        CuentaBancaria cuenta = buscarCuenta();
        if (cuenta != null) {
            System.out.print("Ingrese el monto a depositar: ");
            double monto = scanner.nextDouble();
            scanner.nextLine();
            cuenta.depositar(monto);
        }
    }

    public CuentaBancaria buscarCuenta() {
        System.out.print("Ingrese el nro de cuenta: ");
        String nroCuenta = scanner.nextLine();

        for (CuentaBancaria cuenta : bancarias) {
            if (cuenta.getNroCuenta().equalsIgnoreCase(nroCuenta)) {
                return cuenta;
            }
        }
        System.out.println("Cuenta no encontrada.");
        return null;
    }

    public void verSaldo(){
        CuentaBancaria bancaria = buscarCuenta();
        if (bancaria != null) {
            System.out.println("Tu saldo es: " + bancaria.getSaldo());
        }
    }

}
