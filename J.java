/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j;


import java.io.*;
import java.util.*;

/**
 *
 * @author Francisco
 */
public class J {

    // Este problema corresponde a la competencia RPC del dia 30/03/19
    
    
    public static void main(String[] args) throws IOException {
        
       Scanner entrada = new Scanner(System.in);
        
        int n = entrada.nextInt();
        int s = entrada.nextInt();
        
        int mayor = 0;
        
        int auxKant = entrada.nextInt();
        int auxK = 0;
        
        for (int i = 1; i < n; i++) 
        {
            auxK = entrada.nextInt();
            
            mayor = ( auxKant > auxK) ? auxKant: auxK;
            
            auxKant = auxK;
            
        }
        
        int fMod = mayor * s;
        
        int redondear = (fMod)/1000;
        
        redondear+= (fMod%1000 != 0 )? 1: 0;
        
        System.out.println(redondear);
        
        
    }
    
}
