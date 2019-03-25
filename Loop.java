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
        
        //<editor-fold defaultstate="collapsed" desc="loop">
        
        Scanner entrada = new Scanner();
        
        int muestras = intconvert(entrada.next());
        
        
        int arrDeMuestras[];
        
        
        int contAux = 1;
        
        int numInit = 0;
        int sigNum = 0;
        int antNum = 0;
        
        int salida = 0;
        
        boolean sentido = false; /* false abajo */
        
        int inicial = 0;
        int fin = 0;
        
        while(muestras != 0)
        {
            //antNum = intconvert(entrada.next());
//            inicial = antNum;
//            sigNum = intconvert(entrada.next());
//            //sentido = true;//sube
//            //salida++; 
////            if ( sigNum < antNum || sigNum > antNum && muestras == 2)
////            {
////                System.out.println("NO DEBE ENTRAR A ESTE BUCLE");
////                sentido = true;//sube
////                salida++;
////                
////            }
//            

            antNum = intconvert(entrada.next());
            inicial = antNum;
            
            
            
            
            
            while(contAux != muestras)
            {
                /*
                    si baja o sube
                */
                sigNum = intconvert(entrada.next());
                
                System.out.println("ant = " + antNum + " Sig = " + sigNum);
                
                if(antNum > sigNum && sentido)
                {
                    System.out.println("baja p");
                    salida++;
                    sentido = false;
                    System.out.println("sentido queda en = " + sentido);
                    
                
                }else if(antNum < sigNum && !sentido)
                {
                    System.out.println("sube p");
                    salida++;
                    sentido = true;
                    System.out.println("sentido queda en = " + sentido);
                }
                
                antNum = sigNum;
                contAux++;
                
            }
            fin = sigNum;
            
            System.out.println( " ini " + inicial + " fin = " + fin );
            //if salida++;
            
            if (fin < inicial && !sentido) 
            {
                System.out.println("baja fin p");
                salida++;
                
            } else if(fin > inicial && sentido)
            {
             
                System.out.println("sube fin p");
                salida++;
                
            }
           
            
            System.out.println("SALIDA = " + salida);
            muestras = intconvert(entrada.next());
            contAux = 1;
        }
        
        //</editor-fold>
        
    }
    
}
