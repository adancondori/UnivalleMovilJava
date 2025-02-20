public class Sumatoria {
    // Suma de la serie siguiente serie 2,4,6,8......
    // Dado 4 = 20
    public int generarSumaPares(int numero) {
        int total = 0;
        int pares = 2;
        for (int i = 0; i < numero; i++) {
            total = total + pares; // 2 / 4 / 6 / 8
            pares = pares + 2;
        }
        return total;
    }

    public int generarEjercicio2(int numero) {
        // N= 2 = 61
        // N = 3 = 119
        //60, 1, 58, 3, 56, 5, 54, 7, 52, 9
        int serie1 = 60;
        int serie2 = 1;
        int resultado = 0;
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0){
                resultado = resultado + serie1;
                serie1 = serie1 - 2;
            } else {
                resultado = resultado + serie2;
                serie2 = serie2 + 2;
            }
        }
        return resultado;
    }
}
