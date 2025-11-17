package duplicado;

import java.util.Arrays;
import java.util.Random;

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
    // Atributo de clase privado accesible desde todos los metodos de esta clase
    // no accesible desde otras clases
    private static Random rFuncionesArray = new Random();

    public static int[] genearaArrayAleatorios(int tamanio) {

        // da error preguntar a vico
        /*
         * Creo un Array de int con tamaño pasado por parametro
         * El array contiene numeros aleatorios
         * Si el parametro no es valido se genera un exception
         */
        if (tamanio <= 0) {
            // genera la exception
            throw new IllegalArgumentException("El tamaño del array no puede ser <= 0");
        }

        int[] arrayInt = new int[tamanio];
        // puedo llamar a la funcion del paquete daw por que es public
        // y sus funciones tambien.

        // recorro el array y en cada posicion asigno un numero aleatorio
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = rFuncionesArray.nextInt(1, 31);
        }

        return arrayInt;
    }

    // funcion que recibe un Array de numeros y devuelve un array sin duplicados
    public static int[] quitarDuplicados(int[] arrayInt) {
        int[] arrayFinal = null;
        // para que no me de fallos por ahora lo pongo a null
        // int[] arraySinDuplicados = Arrays.copyOf(arrayInt, arrayInt.length);
        // arrays.copyof te pide el array que necesitas
        // y el tamaño del array por parametros
        // nos devuelve el array copiado pero al modificarlos 
        int[] arraySinDuplicados = new int[arrayInt.length];
        /*
         * creo array del mismo tamaño con contenido de 0 
         */
        for (int i = 0; i < arrayInt.length; i++) {
            // guardo el elemento en array sin duplicados si no está
            if (!esta(arrayInt[i], arraySinDuplicados)) {
                arraySinDuplicados[i] =  arrayInt[i];
            }
        }
        
        int contador = contarNumeros(arraySinDuplicados);
        //Crea el array para contar esos numeros los que necesio para el tamaño
        arrayFinal= new int[contador];
        int posicion = 0 ; 
         for (int i : arraySinDuplicados) {
            if (i!=0) {
                arrayFinal[posicion++]= i;
                
            }
            
         }

        /*
         * Recibo un array de números
         * Recorro el array original (El que viene por parametros)
         * Si el elemento que estoy mirando está en el nuevo array, no lo guardo
         * 
         */

        return arrayFinal;
    }
    public static int contarNumeros(int[] arrayInt) {
        // cuenta los que son distinto de 0 
        int contador=0;
        for (int i : arrayInt) {
            if (i!=0) {
                contador++;
            }
        }
        return contador;
    }

    public static boolean esta(int numeroABuscar, int[] arrayDondeBuscas) {
        for (int elemento : arrayDondeBuscas) {
            // recorro y guardo en elemento
            if (numeroABuscar== elemento) {
                // si esta devuelvo true 
                return true;   
            }   
        }
        // no esta devuelvo false
        return false;
    }

}
