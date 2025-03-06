package EjemploHerencia;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("correr");
        perro.sonido = "ladrar";
        perro.tipo = "Perro";
        perro.mostrarDatos();
        perro.mostrarNroPatas(8);
    }
}
