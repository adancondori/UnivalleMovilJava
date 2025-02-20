public class Serie {
    // Generar los primero numero impares
    // N = 3
    //== 1, 3, 5,
    public String generarImpares(int numero) {
        String resultado = "";
        int impar = 1;
        for (int i = 0; i < numero; i++) {
            resultado = resultado + String.valueOf(impar) + ", "; 
            impar = impar + 2;
        }
        return resultado;
    }
    
    public String ejercicio1(int numero){
        //4, 5, 9, 14, 23, 37
        int anterior = 4;
        int siguiente = 5;
        int mostrar = 0;
        String resultado = "";
        for (int i = 0; i < numero; i++) {
            resultado = resultado + String.valueOf(mostrar) + ", "; // 4,
            mostrar = mostrar + anterior;// 4
            anterior = siguiente;
            siguiente = anterior + siguiente;// 9
        }
        return resultado;
    }

    public String ejercicio2(int numero) {
//        60, 1, 58, 3, 56, 5, 54, 7, 52, 9, 50, 11 ……
//        1   2   3  4
        int impar = 60;
        int par = 1;
        String resultado = "";
        for (int i = 0; i < numero; i++) {
            if (i % 2 != 0) {
                resultado = resultado + par + ", "; // 60,
                par = par + 2;
            } else {
                resultado = resultado + impar + ", "; // 60, 1,
                impar = impar - 2;
            }
        }
        return resultado;
    }
}
