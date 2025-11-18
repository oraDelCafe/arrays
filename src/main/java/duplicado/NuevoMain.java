package duplicado;

import java.util.Arrays;

public class NuevoMain {
    public static void main(String[] args) {
         /*
         * Pedir al usuario que rellenes un array del 1 al 5 
         */
        /*
         * Funcion a apartir de esta funcion obtener otro 
         * con tamaño 5 y contar los numeros que corresponde a esa posicion. 
         */
        /*
         * Esta funcion  llega al main y con otra funcion imprimimos la cantidad de numeros 
         * en  * 
         */

         int[] arrayInt = FuncionesArrays.inicializarArray(10);

         FuncionesArrays.rellenoArray(arrayInt);
         // relleno array 

         System.out.println(Arrays.toString(arrayInt));


    }

}
