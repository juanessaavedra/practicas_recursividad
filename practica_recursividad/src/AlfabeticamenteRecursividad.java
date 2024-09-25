public class AlfabeticamenteRecursividad {
    public static void main(String[] args) {

        String word = "ABCDEF";

        boolean resultado = alfabeticamenteRecursivo(word);

        System.out.println(resultado);

    }

    public static boolean alfabeticamenteRecursivo(String word) {

        if(word.length() <= 1){
            return true; //Caso base
        }

        if ((word.charAt(0) > word.charAt(1))) {
        return false;
        } else {
            return alfabeticamenteRecursivo(word.substring(1));
        }
    }
        }






