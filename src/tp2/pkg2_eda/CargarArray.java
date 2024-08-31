package tp2.pkg2_eda;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Joaco
 */
public class CargarArray {
    
    private ArrayList <JJOO> Naciones;
    
    public CargarArray(){
        Naciones = new ArrayList();
    }
    
    public void cargar(String pais, int cmOro,int cmPlata,int cmBronce){
        Naciones.add(new JJOO(pais,cmOro,cmPlata,cmBronce));
    }
    
    public void mostrar(){
        for (JJOO Nacion : Naciones) {
            System.out.println(Nacion);
        }   
    }
    
    public void rank(){
        for (int i = 0; i < Naciones.size(); i++) {
            Naciones.get(i).setRanking(i+1);
        }
    }
    
    public void bubbleSort(){
        long inicio = System.nanoTime();
        int tamanio = Naciones.size();
        
        for (int i = 0; i < tamanio; i++) {
            
            for (int j = 0; j < tamanio - 1 - i; j++) {
                if(JJOO.comparator.compare(Naciones.get(j),Naciones.get(j+1)) > 0){
                    Collections.swap(Naciones, j, j+1);
                }
            }
        }
        long fin = System.nanoTime();
        System.out.println("El metodo de ordenamiento bubbleSort se realizo en: " + (fin - inicio) / 1000000.0 + "ms");
    }
    
    public void quickSort(){
        
        long inicio = System.nanoTime();
        Collections.sort(Naciones, JJOO.comparator);
        long fin = System.nanoTime();
        System.out.println("El metodo de ordenamiento quickSort se realizo en: " + (fin - inicio) / 1000000.0 + "ms");
    }
}
