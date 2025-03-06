package OOB;

public class Main {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        taxi.matricula = "1234";
        taxi.potencia = "1000";
        taxi.modelo = "nissan";
        taxi.numeroLicencia = "1234ASDF";

        System.out.println(taxi.modelo);

        Vehiculo vehiculo = new Vehiculo("10001ASDF","toyota","7000RPM");

        Autobus autobus = new Autobus(9009);
//        autobus.setVehiculo();
    }
}
