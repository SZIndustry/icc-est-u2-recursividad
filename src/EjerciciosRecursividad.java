public class EjerciciosRecursividad {
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n -2);

    }

    public int sumaConsecutivos(int n) {

        if (n == 1) {
            return 1;
        }

        int resultadoParcial = sumaConsecutivos(n-1);
        int resultado = n + resultadoParcial;
        return resultado;
    }

    public int pontenciaNumero(int base, int exponente) {
        if (exponente == 0) {
            return 1; 
        }

        else {
            return base * pontenciaNumero(base, exponente - 1);
        }

    }


    public int sumaDigitos(int n) {
        if (n < 10) {
            return n;
        }
        else {
            int ultimoDigito = n % 10;
            int restoNumero = n / 10;
            return ultimoDigito + sumaDigitos(restoNumero);
        }
    }

    public int printNums(int n) {
        if (n == 1) {
            return n;
        }

        else {
            System.out.print(n + ",");
            return printNums(n - 1);
        }
    }

    public int reverso(int n) {
        return reversoAux(n, 0);
    }
    
    public int reversoAux(int n, int invertido) {

        if (n == 0) {
            return invertido;
        } else {
            int ultimoDigito = n % 10;
            int nuevoInvertido = invertido * 10 + ultimoDigito;
            return reversoAux(n / 10, nuevoInvertido);
        }
    }
}