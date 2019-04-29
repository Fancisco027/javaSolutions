/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1103;

import java.io.*;
import java.util.*;

/**
 *
 * @author francisco
 */
public class Main {

        
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

    
    
    public static int parseMin(int hrs)
    {
        return 60 * hrs;
    }
    public static int ifMin(int restRasult)
    {
        return 1440 - restRasult;
    }
    
    public static int intConvert(String val)
    {
        return Integer.parseInt(val);
    }
    
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner();
        
        int h1 = intConvert( entrada.next() );
        int m1 = intConvert( entrada.next() );
        int h2 = intConvert( entrada.next() );
        int m2 = intConvert( entrada.next() );
        
        
        while( !( h1 == 0 && h2 == 0 && m1 == 0 && m2 == 0 ) )
        {
            int timeInit = parseMin( h1 ) + m1;
            int timeLimit = parseMin( h2 ) + m2;

            int salida = 0;

            if ( timeLimit < timeInit )
                
                System.out.println( ifMin( (-1) * ( timeLimit - timeInit ) ) ) ;
            
            else
                
                System.out.println( ( timeLimit - timeInit ) );
            
            h1 = intConvert( entrada.next() );
            m1 = intConvert( entrada.next() );
            h2 = intConvert( entrada.next() );
            m2 = intConvert( entrada.next() );
        }
            
            
        
    }
    
}
