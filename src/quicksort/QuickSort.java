/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksort;

/**
 *
 * @author guada
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
     int [] arreglo = {5,2,6,12,39,8,1};
     Ordenador o = new Ordenador ();
     o.ordenarQuicksort (arreglo);
     
        for(int i = 0; i <arreglo.length; i++)
        {
            
        
        System.out.println(arreglo [i]);
    }
    
}
    
}