package Herencia;

public class Taxi extends Vehiculo{
    public String nroLicencia = "";
    public Taxi() {
    }


    public void mostrarValores(){
        System.out.println("Attributos NroLic: " + nroLicencia + " matri: " + matricula);
    }
}
