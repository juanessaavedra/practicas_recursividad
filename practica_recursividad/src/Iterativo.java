public class Iterativo {
    public static void main(String[] args) {
        int n = 5;

        int resultado = factorial(n);
        System.out.println(resultado);
    }


    public static int factorial(int numero) {
        int res = 1;

        for(int i = 0; i <= numero; i++) {
            res = res * 1;
        }
        return res;
    }
}
