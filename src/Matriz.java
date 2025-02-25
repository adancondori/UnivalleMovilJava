public class Matriz {
//    int[][] elementos_matriz = {
//            {10,2,30},
//            {30,40,40}
//    };
//    Matriz matriz = new Matriz();
//    matriz.mostrarMatriz(elementos_matriz);
    public void mostrarMatriz(int[][] matriz) {
        String resultado = "";
        for (int i = 0; i < matriz.length; i++) {
            resultado = resultado + "| ";
            for (int j = 0; j < matriz[i].length; j++) {
                resultado = resultado + matriz[i][j] + ", ";
            }
            resultado = resultado + " |\n";
        }
        System.out.println(resultado);
    }

    public int sumaItems(int[][] matriz){
        int suma = 0;
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma = suma + matriz[i][j];
            }
        }
        return suma;
    }

    public int sumaPares(int[][] matriz){
        int suma = 0;
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    suma = suma + matriz[i][j];
                }
            }
        }
        return suma;
    }



}
