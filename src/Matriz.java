public class Matriz {
//    int[][] items = {
//            {10,2,30},
//            {30,40,40}
//    };
//    Matriz matriz = new Matriz();
//    matriz.mostrarMatriz(items);
    public void mostrarMatriz(int[][] matriz) {
        String valores = "";
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                valores = valores + matriz[i][j] + ", ";
            }
            valores = valores + "\n";
        }
        System.out.println(valores);
    }
}
