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

         int[] arrayInt = FuncionesArrays.inicializarArray(5);

         FuncionesArrays.rellenoArray(arrayInt);
         System.out.println(Arrays.toString(arrayInt));
         // relleno array 
         int [] arrayInt2 = FuncionesArrays.cuentoContenido(arrayInt);
         // este tiene tamaño 5 

         FuncionesArrays.cuentoContenidoYMuestro(arrayInt2);

         


    }

}
