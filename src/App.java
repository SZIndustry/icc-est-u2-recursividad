public class App {
    public static void main(String[] args) {

        //fibonacci
        int n = 5;
        int resultadofinal = factorial(n);
        System.out.println("resultado: " + resultadofinal);

        EjerciciosRecursividad er = new EjerciciosRecursividad();

        int resultadoFibonacci = er.fibonacci(n);
        System.out.println("Fibonacci de " + n + ": " + resultadoFibonacci);
       
        int resultadoSumaF = er.sumaConsecutivos(n);
        System.out.println("Suma de los números del 1 al " + n + ": " + resultadoSumaF);


        //exponenciación
        int base = 4;
        int exponente = 2;
        EjerciciosRecursividad eX = new EjerciciosRecursividad();
        int resultado = eX.pontenciaNumero(base, exponente);

        System.out.println("La potencia de " + base + " es "  + resultado);
        System.out.println();

        
        //Suma de digitos
        int numero = 123;
        EjerciciosRecursividad eS = new EjerciciosRecursividad();
        int resultadoSuma = eS.sumaDigitos(numero);
        System.out.println("SUMA DE DIGITOS");
        System.out.println(resultadoSuma);


        //imprimir numeros
        int numerobase = 5;
        EjerciciosRecursividad eI = new EjerciciosRecursividad();
        System.out.println("Imprimir numeros");
        int suma = eI.printNums(numerobase);
        System.out.println(suma);

        //reverso 
        int num = 1234;
        EjerciciosRecursividad eR = new EjerciciosRecursividad();
        System.out.println("arreglo original: " + num);
        System.out.println("Imprimir reverso");
        int reverso = eR.reverso(num);
        System.out.println(reverso);

        

    }
    
     public static int factorial(int n) {
           if(n==0) {
            System.out.println("Alncaze el caso base");
             return  1;
         }
         int resultado = n * factorial(n -1);
         System.out.println("Calculando factorial de " + n + " * factorias("+(n-1)+"-1)");
         return resultado;
     }



}