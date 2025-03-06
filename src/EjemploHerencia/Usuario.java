package EjemploHerencia;

public class Usuario extends UserAbstract {
    public String nombre;

    public Usuario() {
    }

    @Override
    public void methoDinamico() {
        System.out.println("Hola");
    }
}
