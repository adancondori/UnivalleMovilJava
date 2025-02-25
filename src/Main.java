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
        int[] elementos = {1,100,20,9,300};
        String[] items = {"a","e","i","o","u"};
        ArrayList list = new ArrayList<Integer>();
        list.add(3);
        list.add(100);
        list.add(188);
        list.add(288);
//        vector.elimarItem(list, 2);
//        System.out.println(vector.toString());
//        vector.mostrarArraylist(list);
//        System.out.println("La suma es: " + vector.getSuma(elementos));
//        System.out.println("La suma Impares es: " + vector.getSumaImpar(elementos));
//
//        vector.mostrarVector(vector.invertir(elementos));

//        System.out.println("Mayor es:" + vector.getMayor(vectorx));
//        System.out.println("Suma es:" + vector.getSuma(vectorx));

//        int[] resultado = vector.mostrarVector(vectorx);
//        vector.mostrarVector(resultado);
//
//        ArrayList list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(100);
//        list.add(20);
//        list.add(0);
//        vector.mostrarVectorArrayList(list);


        // Matriz
        int[][] elementos_matriz = {
                {10,2,30, 5},// i = 0 j = 4
                {30,40,40, 4} ,// i = 1 j = 2
                {3,140,4,9}
        };
        Matriz matriz = new Matriz();
        matriz.mostrarMatriz(elementos_matriz);
        System.out.println("La suma es: " + matriz.sumaItems(elementos_matriz));
        System.out.println("La suma Pares: " + matriz.sumaPares(elementos_matriz));
    }
}