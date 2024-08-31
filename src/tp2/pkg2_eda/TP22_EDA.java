package tp2.pkg2_eda;

import java.util.Scanner;

/**
 *
 * @author Joaco
 */
public class TP22_EDA {

    public static void main(String[] args) {
        
        int opcion;
        boolean fin = false;
        
        CargarArray cargarNacion = new CargarArray();
        
        Scanner leer = new Scanner(System.in);
        
        cargarNacion.cargar("Argentina", 3, 3, 3);
        cargarNacion.cargar("Brasil", 3, 2, 1);
        cargarNacion.cargar("Francia", 1, 3, 4);
        cargarNacion.cargar("Inglaterra", 1, 1, 1);
        cargarNacion.cargar("Chile", 2, 2, 2);
        
        cargarNacion.rank();
        
        while(!fin){
            System.out.println("Menu: ");
            System.out.println("1: Listar paises.");
            System.out.println("2: Ordenar con quickSort.");
            System.out.println("3: Ordenar por bubbleSort.");
            System.out.println("4: Salir.");
            
            opcion = leer.nextInt();
            
            switch (opcion){
                case 1:
                    cargarNacion.mostrar();
                    break;
                case 2:
                    cargarNacion.quickSort();
                    break;
                case 3:
                    cargarNacion.bubbleSort();
                    break;
                case 4:
                    fin = true;
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }
        leer.close();
    }
}
