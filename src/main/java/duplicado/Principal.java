package duplicado;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int tam = 0;
        int[] arrayMain;
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce el tamaño del Arrays");
            try {
                tam = sc.nextInt();
                arrayMain = FuncionesArrays.genearaArrayAleatorios(tam);
                System.out.println(Arrays.toString(arrayMain));
                /*
                 * metodo de Arrays que te da el contenido de array
                 * Si se imprime sin este metodo te da la posicion en memoria *
                 */
                salir = true;
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
                // cogemos el mensaje que te da en la exception
            } catch (InputMismatchException ime) {
                System.out.println("Por favor no pongas letras ...");
                sc.nextLine();
                /*
                 * RECORDAR LIMPIAR BUFFER
                 * cuando se trabaja con escaner
                 */
            }

        } while (!salir);

    }

}
