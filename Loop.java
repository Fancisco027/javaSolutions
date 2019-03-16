/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

import java.io.*;
import java.util.*;

/**
 *
 * @author Cirilap
 */
public class Loop {

       
//<editor-fold defaultstate="collapsed" desc="scanner">
    static class Scanner{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        int espacios = 0;
        
        public String nextLine() throws IOException {
            if (espacios-- > 0) return ""; 
            else if (st.hasMoreTokens()) return new StringBuilder(st.nextToken("\n")).toString();
            return bf.readLine();
        }
        
        public String next() throws IOException {
            espacios = 0;
            while(!st.hasMoreTokens()) st = new StringTokenizer(bf.readLine());
            return st.nextToken();
        }
        
        public boolean hasNext()throws IOException {
            while(!st.hasMoreTokens()) {
                String line = bf.readLine();
                if(line == null) return false;
                if(line.equals("")) espacios = Math.max(espacios, 0) + 1;
                st = new StringTokenizer(line);
            }
            return true;
        }
    }
//</editor-fold>    
    
    
    public static int intconvert(String numero){
        return Integer.parseInt(numero);
    }
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner();
        
        int muestras = intconvert(entrada.next());
        
        
        int arrDeMuestras[];
        
        
        int contAux = 2;
        
        int numInit = 0;
        int sigNum = 0;
        int antNum = 0;
        
        int salida = 0;
        
        boolean sentido = false; /* false abajo */
        
        while(muestras != 0)
        {
            antNum = intconvert(entrada.next());
            sigNum = intconvert(entrada.next());
            
            if (sigNum > antNum) 
            {
                sentido = true;//sube
            }
            
            antNum = sigNum;
            
            while(contAux != muestras)
            {
                /*
                    si baja o sube 
                */
                sigNum = intconvert(entrada.next());
                
                if(antNum > sigNum && !sentido)
                {
                    salida++;
                }
                
                antNum = sigNum;
                contAux++;
                
            }
            
            muestras = intconvert(entrada.next());
            contAux = 0;
        }
        
        
    }
    
}
