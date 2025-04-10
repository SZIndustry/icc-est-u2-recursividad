public class App {
    public static void main(String[] args) {
        int n = 5;
        int resultadofinal = factorial(n);
        //System.out.println("resultado: " + resultadofinal);
        
        App app = new App();
        app.fibonacci(n);
    }
    
    public static int factorial(int n) {
        if(n==0) {
           // System.out.println("Alncaze el caso base");
            return  1;
        }
        int resultado = n * factorial(n -1);
       // System.out.println("Calculando factorial de " + n + " * factorias("+(n-1)+"-1)");
        return resultado;
    }

    public void fibonacci(int n) {
        EjerciciosRecursividad er = new EjerciciosRecursividad();

        int resultadoFibonacci = er.fibonacci(n);
        System.out.println("Fibonacci de " + n + ": " + resultadoFibonacci);
        
        int resultadoSuma = er.sumaConsecutivos(n);
        System.out.println("Suma de los números del 1 al " + n + ": " + resultadoSuma);
    }
}