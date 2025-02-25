import java.util.ArrayList;

public class Vector {

    public void mostrarVector(int[] items) {
        String cad = "";
        for (int i = 0; i < items.length; i++) {
            cad = cad + items[i] + ", ";
        }
        System.out.println("[ " + cad + "]");
    }

    public int obtenerMayor(int[] items ) {
        int aux = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] > aux) {
                aux = items[i];
            }
        }
        return aux;
    }

    public ArrayList<Integer> elimarItem(ArrayList list, int pos){
        list.remove(pos-1);
        return list;
    }

    public int getSuma(int[] items){
        int sum = 0;
        for (int i = 0; i < items.length; i++) {
            sum = sum + items[i];
        }
        return sum;
    }
    public void mostrarArraylist(ArrayList items) {
        String cad = "";
        for (int i = 0; i < items.size(); i++) {
            cad = cad + items.get(i) + ", ";
        }
        System.out.println("[ " + cad + "]");
    }

    public int getSumaImpar(int[] items) {
        int aux = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] % 2 != 0 ){
                aux = aux + items[i];
            }
        }
        return aux;
    }

    public int[] invertir(int[] items){
        int inicio = 0;
        int fin = items.length - 1;
        while (inicio < fin) {
            int aux = items[inicio];
            items[inicio] = items[fin];
            items[fin] = aux;
            inicio++;
            fin--;
        }
        return items;
    }
}
