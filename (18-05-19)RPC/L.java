/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l;

import java.util.*;

/**
 *
 * @author Cirilap
 */
public class L {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n = entrada.nextInt();
        
        int nAux = 0 ; 
        
        int c = entrada.nextInt();
        
        int arrClientes[] = new int[n];
        
        // int arrCajas[] = new int[c];
        ArrayList<Integer> arrCajas = new ArrayList<Integer>();
        
        int arregloOrdenado[] = new int[c];
        
        int cAux = 0;
        
        String salida = "";
        
        for (int i = 0; i < n; i++) {
            
            nAux = entrada.nextInt();
            
            
            if (cAux != c) {
                arrCajas.add( nAux );
                arregloOrdenado[cAux] = nAux;
                cAux++; 
                salida+= String.valueOf( cAux ) + " ";
            }else{
                Arrays.sort(arregloOrdenado);
                
            }
            
            
        }
        
    }
    
}
