public class Serie {
    // generar la siguiente serie 2,4,6,8........
    public String generarPares(int numero) {
        String result = "";
        int pares = 2;
        for (int i = 0; i < numero; i++) {
            result = result + String.valueOf(pares) + ", "; // 2, 4, 6,
            pares = pares + 2;
        }
        return result;
    }

    public String generarEjercicio2(int numero) {
        // 1 =  60
        // 2 = 60, 1
        //60, 1, 58, 3, 56, 5, 54, 7, 52, 9
        //1   2  3   4   5 . . . . .
        int serie1 = 60;
        int serie2 = 1;
        String resultado = "";
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0){
                resultado = resultado + String.valueOf(serie1) + ", ";
                serie1 = serie1 - 2;
            } else {
                resultado = resultado + String.valueOf(serie2) + ", ";
                serie2 = serie2 + 2;
            }
        }
        return resultado;
    }



}
