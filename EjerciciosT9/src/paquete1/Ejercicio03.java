package paquete1;

/**
 *
 * @author Luis Mora.
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int elementosArribaMedia = 0;
        int elementosAbajoMedia = 0;
        int suma = 0;
        int media;
        int i;
        
        for(i = 0; i < arreglo.length; i++){
            suma = suma + arreglo[i];
        }
        media = suma/arreglo.length;
        
        for(i = 0; i < arreglo.length; i++){
            if(arreglo[i] > media){
                elementosArribaMedia = elementosArribaMedia + 1 ;
            }else if(arreglo[i] <= media ){
                elementosAbajoMedia = elementosAbajoMedia + 1 ;
            }
        }
        System.out.printf("Existen %d elementos por encima de la media.\n"
                + "Existen %d elementos por debajo de la media.\n", 
                elementosArribaMedia, elementosAbajoMedia);
        
    }

}
