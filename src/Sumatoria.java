public class Sumatoria {

    // Dado N sumar la siguiente sumatoria
    // 1, 3, 5, 7, . . . .
    public int sumatoriaImpares(int numero) {
        int resultado = 0;
        int impar = 1;
        for (int i = 0; i < numero; i++) {
            resultado = resultado + impar;
            impar = impar + 2;
        }
        return resultado;
    }

    public int ejercicio1(int numero) {
        // 3 + 6 + 12 + 24 + 48
        int resultado = 0;
        int auxiliar = 3;
        for (int i = 0; i < numero; i++) {
            resultado = resultado + auxiliar;// 3  // 6
            auxiliar = auxiliar * 2;
        }
        return resultado;
    }
}
