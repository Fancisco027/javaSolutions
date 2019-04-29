/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despertador;

import java.io.*;
import java.util.*;


/**
 *
 * @author Francisco
 */
public class Despertador {
      
//<editor-fold defaultstate="collapsed" desc="scanner">
    static class Scanner{
        java.io.BufferedReader bf = new java.io.BufferedReader(new InputStreamReader(System.in));
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
    
    public static int getAbsoluteMinutes(int h)
    {
        return (h * 60);
    }

    
//    verificar si el valor que esta mas adelante en el tiempo 
//    es menor que la primer hora dada
    public static int diffMinHrs(int horaInicio, int horaFin)
    {
        if(horaInicio > horaFin)
        {
            //se hara la resta 
        }
        
        return horaFin;
    }
        
    
     public static int getAbsoluteSeconds(int h)
    {
        return (h * 3600);
    }
     
     
    public static void main(String[] args) throws IOException {
        //<editor-fold defaultstate="collapsed" desc="despertador">

    Scanner entrada = new Scanner();

    int m1 = 0, m2 = 0, h1 = 0 , h2 = 0 ;

    h1 = intconvert( entrada.next() );
    m1 = intconvert( entrada.next() );

    h2 = intconvert( entrada.next() );
    m2 = intconvert( entrada.next() );




    int segSuperior = 0 ; 
    int segInferior = 0 ; 

    int salida = 0 ; 

    while ( h1 != 0 || h2 != 0 || m1 != 0 || m2 != 0 ) {
        
        System.out.println("==============");
        System.out.println("entro al bucle");
        System.out.println("==============");
        
        
            

        
        segSuperior = getAbsoluteMinutes(h1) + ( m1 );
        segInferior = getAbsoluteMinutes(h2) + ( m2 );

        salida = segSuperior - segInferior;

        System.out.println("salida = " + salida);
        break;

    }

//</editor-fold>
    }
    
}
