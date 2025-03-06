package Cajero;

public class CuentaBancaria {
    private String titular = "";
    private Double saldo = 0.0;
    private String nroCuenta = "";

    public CuentaBancaria(String titular, Double saldo, String nroCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.nroCuenta = nroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public void depositar(double monto){
        this.saldo = this.saldo + monto;
    }

    public void retirar(double monto) { // monto 1000 y saldo = 100
        if (saldo > monto) {
            saldo = saldo - monto;
        } else {
            System.out.println("Monto insuficiente");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Tu saldo disponible es: " + this.saldo);
    }
}
