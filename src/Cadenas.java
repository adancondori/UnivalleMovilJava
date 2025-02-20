public class Cadenas {
    // contar vocales
    // murcielago = 5
    public int ejercicio1(String cadena) {
        int cont = 0;
        cadena = cadena.toLowerCase();

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e'){
                cont++;
            }
        }
        return cont;
    }
}
