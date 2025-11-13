package daw;

public class Main7y8 {
    public static void main(String[] args) {
        /*
         * 7-crear una funcion que devuelva un array de tamñao especifico en el
         * parametro
         * con numero aleatorio entre 1 y 30
         * 8-Funcion que recibe un array de numeros (array del paso 7 ) y devuelve un
         * nuevo array
         * sin duplicados
         * main 7 y 8
         */
        int[] arrayPrueba = { 1, 2, 1, 5, 4, 6, 4 };

        int[] arrayInt = Funciones.arrayTamanioEspecifico(15);
        System.out.println("Array 1");
        Funciones.muestroArrayConsolaNoln(arrayInt);
        int[] arrayInt2 = Funciones.comprueboValoresDuplicados(arrayInt);
        System.out.println();
        System.out.println("Array 2");
        Funciones.muestroArrayConsolaNoln(arrayInt2);

        /*
         * Funciones.muestroArrayConsolaNoln(arrayPrueba);
         * int[] arrayInt2 = Funciones.comprueboValoresDuplicados(arrayPrueba);
         * System.out.println();
         * System.out.println("Array 2" );
         * Funciones.muestroArrayConsolaNoln(arrayInt2);
         */

    }

}
