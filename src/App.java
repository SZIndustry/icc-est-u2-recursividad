public class App {
    public static void main(String[] args)  {
        int n = 5;
        int resultadofinal = factorial(n);
        System.out.println("resultado: " + resultadofinal);
    }
    public static int factorial(int n) {
        if(n==0) {
            System.out.println("Alncaze el caso base");
            return  1;
        }
        int resultado = n * factorial(n -1 );
        System.out.println("Calculando factorial de " + n + " * factorias("+(n-1)+"-1)");
        return resultado;
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        else if (n == 1) {
            return 1;
        }
        return fibonacci(n -1) + fibonacci(n -2);

    }

}