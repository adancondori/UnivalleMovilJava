package EjemploHerencia;

public class Perro extends Animal{
    public String accion="";
    public Perro(String accion) {
        this.accion = accion;

    }

    public void reproducirSonido(){
        System.out.println("El " + tipo + " tiene el sonido de " + sonido);
    }
    public void mostrarDatos(){
        System.out.println("El " + tipo + " emite el sonido " + sonido +
                " y realiza la accion de " + accion);
    }

}
