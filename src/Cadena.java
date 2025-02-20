public class Cadena {
    // cadena = MUrcielagO
    // 5
    public int contarVocales(String cadena) {
        int count = 0;
        cadena = cadena.toLowerCase();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' ||
                    cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u' ){
                count++;
            }
        }
        return count;
    }

    public String ejecicio2(String cadena) {
        String resultado = "" ;
        for (int i = 0; i < cadena.length(); i++) {
            resultado = cadena.charAt(i) + resultado ;
        }
//        StringBuffer sb = new StringBuffer(cadena);
//        resultado = sb.reverse().toString();
        return resultado;
    }
}
