package duplicado;

/*
        * 7-crear una funcion que devuelva un array de tamñao especifico en el
        * parametro
        * con numero aleatorio entre 1 y 30
        * 8-Funcion que recibe un array de numeros (array del paso 7 ) y devuelve un
        * nuevo array
        * sin duplicados
        * main 7 y 8
*/
public class FuncionesArrays {
    /*
     * 7-crear una funcion que devuelva un array de tamñao especifico en el
     * parametro
     * con numero aleatorio entre 1 y 30
     */

     public static int[] genearaArrayAleatorios(int tamanio) {
        /*
         * Creo un Array de int con tamaño pasado por parametro
         * El array contiene numeros aleatorios
         * Si el parametro no es valido se genera un exception
         */
        if (tamanio<=0) {
            // genera la exception
            throw new IllegalArgumentException("El tamaño del array no puede ser <= 0");
        }

        int[] arrayInt = new int[tamanio];
        // puedo llamar a la funcion del paquete daw por que es public 
        // y sus funciones tambien.


        return arrayInt;
     }

}
