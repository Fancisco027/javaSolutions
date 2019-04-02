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
        
        
//<editor-fold defaultstate="collapsed" desc="loop02 to Send">
    
    
Scanner entrada = new Scanner();
    
int siguiente = 0, ant = 0; 
boolean sentido = true;
int salida = 0 ; 



int N = intconvert(entrada.next());

//contador de picos se inicializa en dos por que la primera recta se inicializa estaticamente 
int picos = 2; 





    while ( N != 0 ) {            
        
        //se hace la primer recta 
        int pInit = intconvert(entrada.next()), pInit1 = intconvert(entrada.next()) ;

            

        //definir el sentido inicial
        sentido = (pInit > pInit1) ? false : true ;

            

        ant = pInit1;
        
        while ( picos != N ) 
        {
            
            siguiente = intconvert(entrada.next());

            

            if( siguiente > ant && !sentido )
            {
                
                
                
                
                salida++;
                sentido = true;
                
            }else if ( siguiente < ant && sentido  )
            {
                
                
                
                
                salida++;
                sentido = false;
                
            }

            ant = siguiente;
            picos++;
        }
        
        int pFinal = ( N != 2 ) ? siguiente: pInit1;
        
        if( pInit > pFinal && !sentido ) 
        {
            salida++;
            sentido = true;
            
        }else if( pInit < pFinal && sentido  )
        {
            salida++;
            sentido = false;
        }
        
        if ( pInit1 > pInit && !sentido) {
            salida++;
        }else if( pInit1 < pInit && sentido )
        {
            salida++;
        }
        
        System.out.println(salida);
        
        
        
        ant = 0;
        siguiente = 0;
        picos = 2 ;
        sentido = true;
        salida = 0;
        N = intconvert(entrada.next());
    }
    
//</editor-fold>    
   
    }
    
}
