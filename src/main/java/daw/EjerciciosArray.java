package daw;


import javax.swing.JOptionPane;


public class EjerciciosArray {
    /*
     * Funcion recibe array int y devuelva valor maximo
     * Funcion recibe array int y devuelva valor maximo
     * Funcion recibe array double y un numero muestra
     * el array en el main antes y despues de de llamar a la funcion
     * Función que recibe un tamñao y genera un array de letras aleatorias
     * funcion que recibe 2 array de string y comprueba si son iguales
     */


    public static void main(String[] args) {
        int[] arrayInt = { 1, 2, 3, 9, 5 };
        int[] arrayInt2 = { 1, 2, 3, 9 };
        int[] arrayInt3 = { 1, 2, 3, 9, 5 };
        int[] arrayInt4 = { 1, 2, 4, 9, 5 };
        /*
        * Ejercicio 1 
        * Funcion recibe array int y devuelva valor maximo
        */
        int resultadoMax = Funciones.valorMaximo(arrayInt);
        System.out.println("El valor maximo es: " + resultadoMax);

        /*
         * Ejercicio 2 
         * Funcion recibe array int y devuelva valor maximo
         */
        int resultadoMin = Funciones.valorMinimo(arrayInt);
        System.out.println("El valor minimo es: " + resultadoMin);


        /*
         * Ejercicio 3 
         * Funcion recibe array double y un numero muestra
         * el array en el main antes y despues de de llamar a la funcion
         *
         */
        double[] arrayDouble = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0 };


        JOptionPane.showMessageDialog(null, "Array antes de cambiar");
        System.out.println("Array 1 ");
        Funciones.muestroArray(arrayDouble);
        System.out.println();
        System.out.println("Array 2 ");
        JOptionPane.showMessageDialog(null, "Array despues de cambiar");
        Funciones.muestroArray(Funciones.multiplicaArray(arrayDouble, 2));

        /*
         * Ejercicio 4 
         * Función que recibe un tamñao y genera un array de letras aleatorias
         */
        char[] arrayChar;

        do {

            try {
                arrayChar = Funciones.inicializarArrayAleatorio(
                        Integer.parseInt(JOptionPane.showInputDialog("Introduce tamaño del array:")));
                // lo meto en un array de char
                Funciones.muestroArray(arrayChar);
                break;
                // salgo del bucle


            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Has introducido una letra");
                // si introduce una letra entra aquí y repite el bucle
            }


        } while (true);

        /*
         *Ejercicio 5 
         * funcion que recibe 2 array de string y comprueba si son iguales
         * int[] arrayInt = { 1, 2, 3, 9, 5 };
        int[] arrayInt2 = { 1, 2, 3, 9 };
        int[] arrayInt3 = { 1, 2, 3, 9, 5 };
        int[] arrayInt4 = { 1, 2, 4, 9, 5 };
         */

        boolean pregunta = Funciones.sonIguales(arrayInt, arrayInt2);


        JOptionPane.showMessageDialog(null, "Estos arrays son  iguales ? " + pregunta);
        // false
        pregunta = Funciones.sonIguales(arrayInt, arrayInt3);


        JOptionPane.showMessageDialog(null, "Estos arrays son  iguales ? " + pregunta);
        // true
        pregunta = Funciones.sonIguales(arrayInt, arrayInt4);


        JOptionPane.showMessageDialog(null, "Estos arrays son  iguales ? " + pregunta);
        // false


    }
}
