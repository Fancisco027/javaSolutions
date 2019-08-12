/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1235;

import java.io.*;
import java.util.*;

/**
 *
 * @author Francisco
 */
public class Main {
    
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

    public static String invertir( String cad )
    {
        
        String cadInverida = "";
        String cadTemp = "";
        
        for( int i = 0 ; i < cad.length() ; i ++  )
        {
            
            cadInverida = cad.charAt(i) + cadInverida ;
        }
        
        return cadInverida;
    }
    
    public static int intConvert ( String n ){
        return Integer.parseInt(n);
    }
    
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner();
        int N = intConvert( entrada.next() );
        int contAux = 0 ;
        
        String wrongCad = "";
        String subCadena1 = "";
        String subCadena2 = "";
        
        String salida = "";
        
        while( N != contAux )
        {
            wrongCad = entrada.nextLine();
            
            subCadena1 = invertir( wrongCad.substring( 0 , wrongCad.length() / 2  ) );
            
            subCadena2 = invertir( wrongCad.substring(  ( wrongCad.length() / 2  ) , wrongCad.length() ) );
            
            salida = subCadena1 + subCadena2 ; 
            
            System.out.println("=====================");
            System.out.println( salida );
            System.out.println("=====================");
            
            contAux++;
        }
        
        
        
        

        
    }
    
    
    
}
