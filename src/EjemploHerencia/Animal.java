package EjemploHerencia;

public class Animal extends AnimalAbstract {
    public String tipo="";
    public String sonido="";
    public String raza="";
    public String color="";
    public int nroPatas=0;

    public Animal() {
    }


    @Override
    public void mostrarNroPatas(int NroPatas) {
        this.nroPatas = NroPatas;
        System.out.println("Nro de patas " + nroPatas);
    }
}
