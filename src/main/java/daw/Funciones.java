package daw;


import java.util.Random;


import javax.swing.JOptionPane;


public class Funciones {
    // crear funcion de rellenar array
    public static void menuArray() {
        String texto = """
                Seleccione una funcion de array.
                1- Suma de posiciones
                2- Media de las posiciones
                3- Encuentra un número
                """;


        JOptionPane.showMessageDialog(null, texto);
        // imprimo el texto que vamos a usar en el programa
    }


    public static int preguntoOpcion() {
        // pregunto opciones y devuelvo
        int opcionInt = 0;
        do {
            try {
                opcionInt = Integer.parseInt(JOptionPane.showInputDialog("¿Que opcion quieres? (1/3)"));


                if (!(opcionInt > 0 && opcionInt < 4)) {
                    JOptionPane.showMessageDialog(null,
                            "Numero fuera de rango" + opcionInt + "\nEl rango es del (1/3)");
                }
                break;
                // si llega hasta aqui esta bien y sale el bucle


            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Has metido una letra");
                // TODO: handle exception
            }


        } while (true);


        return opcionInt;
    }


    public static int[] inicializarArray(int tamanio) {
        //Importante controlar el tamaño antes de inicializar array
        int[] arrayInt; 
        arrayInt = new int[tamanio];
        System.out.println("El tamaño es " + arrayInt.length);
        return arrayInt;


    }


    public static int[] rellenoArray(int[] arrayInt) {
        int numero = 0;
        // para iniciar el array le meto el tamanio
        // relleno array
        for (int i = 0; i < arrayInt.length; i++) {
            // hago tantas iteraciones como el tamaño que tengo
            try {
                // cada rep del bucle vamos a preguntar por el numero que queremos meter
                numero = Integer
                        .parseInt(JOptionPane.showInputDialog("Introduzca numero que quiere guardar en posicion " + i));
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


        return arrayInt;
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


    public static void muestroArray(char[] arrayChar) {
        // Al meter un array ya esta inicializado al menos para mostrarlo tendría que
        // estarlo
        // JOptionPane.showMessageDialog(null, "El array tiene un tamaño de " +
        // arrayChar.length);


        for (int i = 0; i < arrayChar.length; i++) {
            // recorro el array y lo muestro
            // JOptionPane.showMessageDialog(null, "Muesto la posicion " + i + " y su valor"
            // + arrayChar[i]);
            System.out.println("Muesto la posicion " + i + " y su valor " + arrayChar[i]);
        }


    }


    public static void muestroArray(double[] arrayDouble) {
        // muestra el array por la pantalla para recordar y comprobar datos
        // JOptionPane.showMessageDialog(null, "El array tiene un tamaño de " +
        // arrayDouble.length);


        for (int i = 0; i < arrayDouble.length; i++) {
            // recorro el array y lo muestro
            // JOptionPane.showMessageDialog(null, "Muesto la posicion " + i + " y su valor"
            // + arrayDouble[i]);
            System.out.println("Muesto la posicion " + i + " y su valor " + arrayDouble[i]);
        }


    }


    public static void muestroArraySeparador(int[] arrayInt, String separador) {
        // Al meter un array ya esta inicializado al menos para mostrarlo tendría que
        // estarlo
        JOptionPane.showMessageDialog(null, "El array tiene un tamaño de " + arrayInt.length);


        for (int i = 0; i < arrayInt.length; i++) {
            // Recorro el array y lo muestro por pantalla
            // JOptionPane.showMessageDialog(null,);
            System.out.print("Posicion " + i + " Valor " + arrayInt[i]);
            if (i != arrayInt.length - 1) {
                // le pongo un separador elegido por el usuario.
                System.out.print(separador);
            } else {
                System.out.println("");
            }
        }


    }


    // Ejercicio de array para mañana
    /**
     * 1 Sumar los elementos de un array y mostrar
     * 2 Media aritmetica de los números de un array
     * 3 Contar números de veces que aparece un número en un array
     * rellena random y buscar el 2
     */
    public static final Random r = new Random();


    public static void muestroSumaArray(int[] arrayInt) {
        // 1 Sumar los elementos de un array y mostrar
        int suma = 0;
        int aleatorio;
        for (int i = 0; i < arrayInt.length; i++) {
            // recorro todas las iteraciones del array
            aleatorio = r.nextInt(1, 3);
            arrayInt[i] = aleatorio;
            suma += arrayInt[i];
            System.out.println("En la posicion " + i + " vamos a meter el valor: " + aleatorio);
            System.out.println("Numero dentro del array " + arrayInt[i]);
            // imprimo i


        }
        System.out.println("La suma total" + suma);


    }


    public static void muestroMediaArray(int[] arrayInt) {
        // 2 Media aritmetica de los números de un array
        int suma = 0;
        int aleatorio;
        for (int i = 0; i < arrayInt.length; i++) {
            // recorro todas las iteraciones del array
            aleatorio = r.nextInt(1, 3);
            arrayInt[i] = aleatorio;
            suma += arrayInt[i];
            System.out.println("En la posicion " + i + " vamos a meter el valor: " + aleatorio);
            System.out.println("Numero dentro del array " + arrayInt[i]);
            // imprimo i


        }
        int calculoFinal = suma / arrayInt.length;
        System.out.println("Media aritmetica" + calculoFinal);


    }


    public static void muestroEncuentroNumeroArray(int[] arrayInt) {
        /*
         * 3 Contar números de veces que aparece un número en un array
         * rellena random y buscar el 2
         */
        int numeroBuscado = Integer.parseInt(JOptionPane.showInputDialog("¿Que numero quieres buscar?"));
        int contador = 0;
        int aleatorio;
        for (int i = 0; i < arrayInt.length; i++) {
            // recorro todas las iteraciones del array
            aleatorio = r.nextInt(1, 3);
            arrayInt[i] = aleatorio;
            if (numeroBuscado == arrayInt[i]) {
                contador++;
            }
            System.out.println("En la posicion " + i + " vamos a meter el valor: " + aleatorio);
            System.out.println("Numero dentro del array " + arrayInt[i]);
            // imprimo i


        }
        if (contador == 1) {
            System.out.println("Numero buscado: " + numeroBuscado + "aparece " + contador + "vez");
        } else {
            System.out.println("Numero buscado: " + numeroBuscado + "aparece " + contador + "veces");
        }


    }


    public static int buscoUnaLetra(char[] arrayChar, char letraBuscada) {
        /*
         * Funcion que recibe un array de char y devuelve la posicion en la que se
         * encuentra el
         * char que se pasa como parametro o -1 si no esta en el array
         */
        for (int i = 0; i < arrayChar.length; i++) {
            if (letraBuscada == arrayChar[i]) {
                // se puede comparar porque son primitivos
                return i;
                // si esta devuelvo el length
            }
        }
        // no esta devuelvo -1
        return -1;
    }


    public static boolean sonIguales(int[] arrayInt, int[] arrayInt2) {
        // funcion que recibe 2 array de string y comprueba si son iguales
        // voy a meter 2 Array y comprobar si son iguales
        String texto = "";


        if (arrayInt.length != arrayInt2.length) {
            // si el tamaño de los arrays no son iguales
            texto = """
                    Tamaño diferente
                    Array 1 = %d
                    Array 2 = %d
                    """.formatted(arrayInt.length, arrayInt2.length);
            JOptionPane.showMessageDialog(null, texto);
            return false;
        }
        // si el tamaño es igual compruebo el contenido
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] != arrayInt2[i]) {
                // si lo que contiene no es lo mismo devuelvo false
                texto = """
                        Contenido distinto:
                        En la posicion = %d
                        Array 1 = %d
                        Array 2 = %d
                        """.formatted(i, arrayInt[i], arrayInt2[i]);
                JOptionPane.showMessageDialog(null, texto);
                return false;
            }
        }
        texto = """
                Array 1 y Array 2: son iguales.
                """;
        JOptionPane.showMessageDialog(null, texto);
        // si todo es igual devuelvo true
        return true;


    }


    public static int valorMaximo(int[] arrayInt) {
        /*
         * Coje el valor maximo del array 
         * recibe Array y devuelve int
         */
        int numero = Integer.MIN_VALUE;
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > numero) {
                numero = arrayInt[i];
            }
        }
        return numero;


    }


    public static int valorMinimo(int[] arrayInt) {
        /*
         * Coje el valor minimo del array 
         * recibe Array y devuelve int
         */
        int numero = Integer.MAX_VALUE;
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] < numero) {
                numero = arrayInt[i];
            }
        }
        return numero;


    }


    public static double[] multiplicaArray(double[] arrayInt, int numero) {
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] *= numero;
        }
        return arrayInt;
    }

    public static boolean tamanioArray(int[] array) {
        /*
         * Compruebo tamaño del array si es valido true.
         */
        return array.length >=1;
    }

    public static int comprueboTamanio(int tamanio) {
        // introduce tamaño y compruebo que sea mayor que 0

        do {

            try {
                // separo el control de exception para poder controlar 2 cosas distintas.
                if (tamanio < 0) {
                    // tamaño es 0 o negativo
                    JOptionPane.showMessageDialog(null, "Tamaño negativo");
                    tamanio = Integer
                            .parseInt(JOptionPane.showInputDialog("Introduce un tamaño positivo y mayor a 0 "));
                }
                if (tamanio == 0) {
                    // tamaño menor a 1
                    JOptionPane.showMessageDialog(null, "Tamaño del array tiene que ser mayor a 0");
                } else {
                    // tamaño es mayor a 0
                    break;
                }


            } catch (NumberFormatException nfe) {
                // quitamos un numero a i String[] argspara que repita el bucle
                JOptionPane.showMessageDialog(null, "No has introducido un numero");
            }


        } while (true);


        return tamanio;
    }


    public static char[] inicializarArrayAleatorio(int tamanio) {
        // inicializo array y doy letras aleatorias
        char[] arrayChar;

        tamanio = comprueboTamanio(tamanio);
        // comprueba tamaño del array

        arrayChar = new char[tamanio];

        System.out.println("El tamaño es " + arrayChar.length);


        for (int i = 0; i < arrayChar.length; i++) {

            arrayChar[i] = (char) r.nextInt(97, 123);
            // al char ser primitivo se puede castear

        }

        return arrayChar;

    }

    public static boolean  esPalindromo(String texto) {
        
        int j = texto.toCharArray().length-1; 
        for (int i = 0; i < texto.toCharArray().length ; i++) {   
            if (texto.toCharArray()[i] != texto.toCharArray()[j]) {
                // no son iguales return false 
                return false;
            }
            j --;
        }
        //son iguales
        return true;
        
    }


}





