package daw;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Características
        /*
         * Son estructuras de datos complejas
         * y permiiten almacenar datos del mismo tipo
         * Todos los arrays son estáticos -> 
         * no se redimensionan automaticamente
         * Hay que crearlos con un tamaño inicial
         * Siempre van de 0 a tamaño -1 
         */
        // DECLARAR ARRAY DE INT []
        int[] arrayInt;
        // Inicializar un array de 10 numeros;
        arrayInt = new int [10];
        // para almacenar datos den el array tenemos que 
        /*
         * usar las posiciones
         * posicion 0 el número 8
         */
        arrayInt[0]=8;
        arrayInt[3]=9;
        // Recuperar el valor de una posición del array
        
        System.out.println("El Array posicion 1 tiene "+arrayInt[1]);
        // Exception
        // ArrayIndexOutOfBoundsException
        System.out.println("El tamaño es " + arrayInt.length);
        for (int i = 0; i < arrayInt.length; i++) {
            // recorro todas las iteraciones del array
            System.out.println(arrayInt[i]);
            // imprimo i 
        }
        // meter un random que meta entre 100 y 200
        Random r = new Random();
        int aleatorio ;
        for (int i = 0; i < arrayInt.length; i++) {
            // recorro todas las iteraciones del array
            aleatorio = r.nextInt(100,201);
            arrayInt[i] = aleatorio;
            System.out.println("En la posicion " + i +" vamos a meter el valor: "+ aleatorio );
            System.out.println("Numero dentro del array " + arrayInt[i]);
            // imprimo i 
        }
        System.out.println("\nImprimo por funcion: \n");

        Funciones.muestroArraySeparador( arrayInt, " / ");
        // Ejercicio de array para mañana
        /**
         * 1 Sumar los elementos de un array y mostrar
         * 2 Media aritmetica de los números de un array
         * 3 Contar números de veces que aparece un número en un array 
         * rellena random y buscar el 2 
         * Funcion que recibe un array de char y devielve la posicion en la que se encuentra el 
         * char que se pasa como parametro o -1 si no esta en el array
         */

        Scanner sc = new Scanner(System.in);

        char[] arrayChar = {'a','b','c'};
        String letraBuscada ;

        do {
            letraBuscada = JOptionPane.showInputDialog("¿Que letra quieres buscar?").trim() ;
        System.out.println(  letraBuscada.toCharArray().length );
        if (letraBuscada.toCharArray().length >1) {
            // si la letra es mayor a 1 
            JOptionPane.showMessageDialog(null, "Buscamos una letra no un texto");
        }
        if (letraBuscada.toCharArray().length < 0) {
            // si la letra es menor a 0 
            JOptionPane.showMessageDialog(null, "Buscamos una letra no un texto");
        }

        char letraBuscadaChar = letraBuscada.charAt(0);
        
        //97 a 122 a - z 
        int posicionDeArray = Funciones.buscoUnaLetra(arrayChar, letraBuscadaChar);
        JOptionPane.showInputDialog("La posicion del array es " + posicionDeArray);
            
        } while (true);

        /*
         * 6- Funcion que recibe un String. Lo transforma a array de char 
         * y devuelve si es un palindramo. Nombre de funcion esPalindromo
         */
        
    }
}