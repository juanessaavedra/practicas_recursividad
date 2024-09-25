public class SumaNumerosRecursividad {
    public static void main(String[] args) {
        int n = 10;

        int resultado = sumaRecursiva(n);

        System.out.println(resultado);
    }

    public static int sumaRecursiva(int numero) {
        int res;
        if (numero ==1){ //Caso base
            return 1;
        } else {
            res = numero + sumaRecursiva(numero -1); //Caso recursivo
        }
        return res;
    }
}
