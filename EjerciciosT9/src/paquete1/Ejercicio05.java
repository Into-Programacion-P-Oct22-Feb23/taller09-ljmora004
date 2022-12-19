package paquete1;

import java.util.Scanner;

/**
 *
 * @author Luis Mora.
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        /*
        Antes de analizar el presente ejercicio,
        usted debe revisar y entender lo desarrollado
        en el archivo Ayuda01.java del paquete2
        */
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan",
            "Teresa", "Luis", "Mark", "Jennifer",
            "Alcides"};
        String inicial;
        char inicialLetra;
        boolean bandera = true;
        
        while (bandera) {
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();
            for (int i = 0; i < estudiantes.length; i++) {
                inicialLetra = estudiantes[i].charAt(0);
                String inicialDos = String.valueOf(inicialLetra);
                if (inicial.equals(inicialDos))
                    bandera=false;
            }
            
        }

    }

}
