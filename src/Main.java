public class Main {
    public static void main(String[] args) {
        Numeros numeros = new Numeros();
//        int res = numeros.sumeImpares(5);
//        System.out.println(res);

//        int resultado = numeros.divisibleNum(10);
//
        Serie serie = new Serie();
//        String impares = serie.ejercicio2(1);
//        System.out.println(impares);

        Sumatoria sumatoria = new Sumatoria();
        int count = sumatoria.ejercicio1(3);
        System.out.println("La sumatoria es: " + count);

        Cadena cadena = new Cadena();
        System.out.println("Numero de Vocales: " + cadena.contarVocales("MUrcielagO"));
        System.out.println("Invertir Cadena: " + cadena.ejecicio2("MUrcielagO"));

//        Serie
//        1, 0, 1, 0, 1, 0, 1, 0, 1 …
//        Sumatoria
//        F = 3 x 1 + 5 x 2 + 7 x 6 + 9 x 24 + ...........
    }
}