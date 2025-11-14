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
        /* 
        int[] arrayInt = Funciones.arrayTamanioEspecifico(15);
        System.out.println("Array 1");
        Funciones.muestroArrayConsolaNoln(arrayInt);
        int[] arrayInt2 = Funciones.quitarDuplicado(arrayInt);
        System.out.println();
        System.out.println("Array 2");
        Funciones.muestroArrayConsolaNoln(arrayInt2);
*/
        
          Funciones.muestroArrayConsolaNoln(arrayPrueba);
          int[] arrayInt2 = Funciones.quitarDuplicado(arrayPrueba);
          System.out.println();
          System.out.println("Array 2" );
          Funciones.muestroArrayConsolaNoln(arrayInt2);
         
        /*
         * Metodo burbuja ordena un array de de menor a mayor
         */
        System.out.println();
        System.out.println("Ordeno array" );
        int[] arrayPrueba2 = { 3, 2, 5, 7, 4, 6, 1 };
        int[] arrayPruebaVico = { 8,3,7,2,1,10};
        int[] arrayPrueba3 = Funciones.metodoOrdenarArray(arrayPruebaVico);
        int[] arrayPrueba4 = Funciones.metodoBurbuja(arrayPruebaVico);

        for (int i = 0; i < arrayPrueba4.length; i++) {
            // recorro el array y lo muestro
            System.out.print("P: " + i + " v : " + arrayPrueba4[i] + "/ ");
        }
        System.out.println();


    } 

    

}
