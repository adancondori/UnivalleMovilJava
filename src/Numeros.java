public class Numeros {
    public int sumeImpares(int numero){
        int sumImp = 0;
        for (int i = 0; i <= numero; i++) {
            if (i % 2 != 0){
                sumImp = sumImp + i;
            }
        }
        return sumImp;
    }

    public int divisibleNum(int numero){
        int sum = 1;
        for (int i = 0; i <= numero; i++) {
            if (i % 5 == 0) { // verificar si es divisible
                sum = sum + i;
            }
        }
        return sum;
    }

    public int sumaDigitos(int numero){
        int resultado = 0;
        while (numero > 0) {
            int valor = numero / 10;
            resultado = resultado / valor;
        }

        return resultado;
    }
}
