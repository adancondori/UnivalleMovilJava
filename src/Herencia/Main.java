package Herencia;

public class Main {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        taxi.matricula = "QWER1234";
        taxi.modelo = "nissan";
        taxi.nroLicencia="123456789";
        taxi.potencia = "1234";
        taxi.mostrarValores();
        //    Camioneta    <<<<<<< Vehiculo
        //  Camioneta4x4 <<<<<<  Camioneta    <<<<<<< Vehiculo
        Camioneta4x4 camioneta4x4 = new Camioneta4x4();
        //camioneta4x4.nroRuedas = 9;
    }
}
