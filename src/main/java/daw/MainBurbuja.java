package daw;

import java.util.Arrays;

public class MainBurbuja {

    public static void main(String[] args) {
        
        /*
         * Metodo burbuja ordena un array de de menor a mayor
         */
        System.out.println();
        System.out.println("Ordeno array");
        int[] arrayPrueba2 = { 3, 2, 5, 7, 4, 6, 1 };
        int[] arrayPruebaVico = { 8, 3, 7, 2, 1, 10 };
        String[] arrayAbc = { "d", "b", "g", "a", "e", "f", "c" };

        int[] arrayPrueba3 = Funciones.metodoOrdenarArray(arrayPruebaVico);
        int[] arrayPrueba4 = Funciones.metodoBurbuja(arrayPruebaVico);

        for (int i = 0; i < arrayPrueba4.length; i++) {
            // recorro el array y lo muestro
            System.out.print("P: " + i + " v : " + arrayPrueba4[i] + " / ");
        }
        System.out.println();

        System.out.println("Array String desordenado  \n");
        Funciones.muestroArray(arrayAbc);
        System.out.println();

        System.out.println();
        System.out.println("Array String ordenado  \n");
        Funciones.muestroArray(Funciones.metodoBurbujaLetras(arrayAbc));
        System.out.println();

        // desordeno
        String[] arrayAbc2 = { "d", "b", "g", "a", "e", "f", "c" };

        System.out.println("Array String desordenado  \n");
        System.out.println(Arrays.toString(arrayAbc2));
        System.out.println();

        System.out.println();
        System.out.println("Array String ordenado con Array sort  \n");
        System.out.println(Arrays.toString(Funciones.metodoOrdenoLetrasSort(arrayAbc2)));
        System.out.println();

    }

}
