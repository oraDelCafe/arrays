package duplicado;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

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

    /*
     * Recibo un array de números
     * Recorro el array original (El que viene por parametros)
     * Si el elemento que estoy mirando está en el nuevo array, no lo guardo
     * 
     */
    public static int[] genearaArrayAleatorios(int tamanio) {
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
                arraySinDuplicados[i] = arrayInt[i];
            }
        }

        int contador = contarNumeros(arraySinDuplicados);
        // Crea el array para contar esos numeros los que necesio para el tamaño
        arrayFinal = new int[contador];
        int posicion = 0;
        for (int i : arraySinDuplicados) {
            if (i != 0) {
                arrayFinal[posicion++] = i;
            }
        }

        return arrayFinal;
    }

    public static int contarNumeros(int[] arrayInt) {
        // cuenta los que son distinto de 0
        int contador = 0;
        for (int i : arrayInt) {
            if (i != 0) {
                contador++;
            }
        }
        return contador;
    }

    public static boolean esta(int numeroABuscar, int[] arrayDondeBuscas) {
        for (int elemento : arrayDondeBuscas) {
            // recorro y guardo en elemento
            if (numeroABuscar == elemento) {
                // si esta devuelvo true
                return true;
            }
        }
        // no esta devuelvo false
        return false;
    }

    public static int[] inicializarArray(int tamanio) {
        // Importante controlar el tamaño antes de inicializar array
        int[] arrayInt;
        arrayInt = new int[tamanio];
        System.out.println("El tamaño es " + arrayInt.length);
        return arrayInt;

    }

    public static void rellenoArray(int[] arrayInt) {
        int numero = 0;
        // para iniciar el array le meto el tamanio
        // relleno array
        for (int i = 0; i < arrayInt.length; i++) {
            // hago tantas iteraciones como el tamaño que tengo
            try {
                // cada rep del bucle vamos a preguntar por el numero que queremos meter
                do {
                    numero = Integer
                            .parseInt(JOptionPane
                                    .showInputDialog("Introduzca numero que quiere guardar en posicion " + i));

                    if (numero >= 1 && numero <= 5) {
                        break;
                    } else {
                        System.out.println("Número tiene que ser entre 1 y 5");
                    }
                } while (true);

                // metemos el en el array el numero que introducimos
                arrayInt[i] = numero;
                // imprimo i
            } catch (NumberFormatException nfe) {
                // quitamos un numero a i String[] argspara que repita el bucle
                i--;
                JOptionPane.showMessageDialog(null, "No has introducido un numero");
                // TODO: handle exception
            }
        }

        
    }

    public static int[] cuentoContenido (int[] arrayInt) {
        /*
         * Funcion a apartir de esta funcion obtener otro 
         * con tamaño 5 y contar los numeros que corresponde a esa posicion. 
         */
        int[] respuestaInt = new int[5];// tamaño 5 
        int aux = 1; 
        for (int i = 0; i < arrayInt.length; i++) {//10
            for (int j = 0; j < respuestaInt.length; j++) {
             /*
              * if (==arrayInt[i]) {
                
            }
              */
                
            }
            
        }

        return respuestaInt;
        
    }

    public static void muestroArray(String[] ArrayString) {
        // meter un array que ya esta inicializado para mostrarlo
        JOptionPane.showMessageDialog(null, "El array tiene un tamaño de " + ArrayString.length);

        for (int i = 0; i < ArrayString.length; i++) {
            // recorro el array y lo muestro
            // JOptionPane.showMessageDialog(null,"Muesto la posicion " + i + " y su valor "
            // + ArrayString[i] );
            System.out.println(" Posicion " + i + " valor " + ArrayString[i]);
        }

    }

    public static void muestroArray(int[] arrayInt) {
        // Al meter un array ya esta inicializado al menos para mostrarlo tendría que
        // estarlo
        JOptionPane.showMessageDialog(null, "El array tiene un tamaño de " + arrayInt.length);

        for (int i = 0; i < arrayInt.length; i++) {
            // recorro el array y lo muestro
            JOptionPane.showMessageDialog(null, "Muesto la posicion " + i + " y su valor " + arrayInt[i]);
        }

    }

}
