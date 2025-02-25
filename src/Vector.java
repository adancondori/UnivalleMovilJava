import java.util.ArrayList;

public class Vector {

    public int getMayor(int[] mayor){
        int aux = 0;
        for (int i = 0; i < mayor.length; i++) {
            if (mayor[i] > aux) {
                aux = mayor[i];
            }
        }
        return aux;
    }

//    Vector vector = new Vector();
//    int[] vectorx = {1,100,20,0};
//    System.out.println("Mayor es:" + vector.getMayor(vectorx));
    public int getSuma(int[] items){
        int aux = 0;
        for (int i = 0; i < items.length; i++) {
            aux = aux + items[i];
        }
        return aux;
    }

    // 10,4,5,6
    // longitud = 4
    public int[] invertir(int[] items) {
        int inicio=0;
        int fin=items.length - 1;
        while (inicio < fin) {
            int temp = items[fin];
            items[fin] = items[inicio];
            items[inicio] = temp;
            inicio++;
            fin--;
        }
        return items;
    }

    public void mostrarVector(int[] vector) {
        String cad = "";
        for (int i = 0; i < vector.length; i++) {
            cad = cad + vector[i] + ",";
        }
        System.out.println("[" + cad  + "]");
    }

    public void mostrarVectorArrayList(ArrayList vector) {
        String cad = "";
        for (int i = 0; i < vector.size(); i++) {
            cad = cad + vector.get(i) + ",";

        }
        System.out.println("[" + cad  + "]");
    }


}
