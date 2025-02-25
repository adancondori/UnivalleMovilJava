import java.util.ArrayList;

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
//        int count = sumatoria.ejercicio1(3);
//        System.out.println("La sumatoria es: " + count);

        Cadena cadena = new Cadena();
//        System.out.println("Numero de Vocales: " + cadena.contarVocales("MUrcielagO"));
//        System.out.println("Invertir Cadena: " + cadena.ejecicio2("MUrcielagO"));

        Vector vector = new Vector();
        int[] vectorx = {1,100,20,0};
//        System.out.println("Mayor es:" + vector.getMayor(vectorx));
//        System.out.println("Suma es:" + vector.getSuma(vectorx));

        int[] resultado = vector.invertir(vectorx);
//        vector.mostrarVector(resultado);

        ArrayList list = new ArrayList<Integer>();
        list.add(1);
        list.add(100);
        list.add(20);
        list.add(0);
//        vector.mostrarVectorArrayList(list);


        // Matriz
        int[][] items = {
                        {10,2,30},
                        {30,40,40}
                        };
        Matriz matriz = new Matriz();
        matriz.mostrarMatriz(items);
    }
}