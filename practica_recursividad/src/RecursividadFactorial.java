public class RecursividadFactorial {
    public static void main(String[] args) {
        int n = 5;

        int resultado = factorialRecursivo(n);

        System.out.println(resultado);
    }
    public static int factorialRecursivo(int numero){
        int res;

        if(numero==1){
            return 1;
        } else {
            res = numero * factorialRecursivo(numero-1);
        }
        return res;
    }
}

