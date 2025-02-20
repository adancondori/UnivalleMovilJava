public class Main {
    public static void main(String[] args) {
        Numeros numeros = new Numeros();
//        int res = numeros.sumeImpares(5);
//        System.out.println(res);

//        int resultado = numeros.divisibleNum(10);
//
//        System.out.println(resultado);
        Serie serie = new Serie();
        String value = serie.generarEjercicio2(3);
        System.out.println("La serie es: " + value);

//
        Sumatoria sumatoria = new Sumatoria();
        int total = sumatoria.generarEjercicio2(3);
        System.out.println("Total es:" + total);

        Cadenas cadenas = new Cadenas();
        int cont = cadenas.ejercicio1("MUrcielAgO");
        System.out.println("Cantidad de vocales: " + cont);
    }
}