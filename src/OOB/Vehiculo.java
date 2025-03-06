package OOB;

public class Vehiculo {
    String matricula="";
    String modelo;
    String potencia;

    public Vehiculo(String matricula, String modelo, String potencia) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public Vehiculo(){
        matricula = "";
        modelo = "";
        potencia = "";
    }

}
