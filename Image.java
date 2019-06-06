/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image;

import java.io.*;
import java.util.*;

/**
 *
 * @author Cirilap
 */
public class Image {

        
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
    
    public static String salida = "";
    
    public static int calculo(int n1 , int n2)
    {
        return n2/n1 ; 
    }
    
    public static int intCnonvert(String n)
    {
        return Integer.parseInt(n);
    }
    
    public static String charWidth(String cad , int nMoreChar)
    {
        
        
        
        String salidaChar = "";
        int contAux = 0;
        for (int i = 0; i < cad.length(); i++) {
            
            while(contAux != nMoreChar){
                
                salidaChar+= cad.charAt(i);
                
                
                contAux++;
            }
            contAux = 0 ; 
            
            
        }
        
        return salidaChar ; 
    }
    
    public static void charHeight(String cad , int val)
    {
        
        for (int i = 0; i < val; i++) {
            
            System.out.println( cad );
            
        }
        
    }
    
    
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner();
        
        int N = intCnonvert(entrada.next());
        int M = intCnonvert(entrada.next());
        int A = 0;
        int B = 0;
        
        while( N != 0 && M != 0 )
        {

            String arrChar[] = new String[N];

            //entrada de caracteres 
            for (int i = 0; i < arrChar.length; i++) {

                arrChar[i] = entrada.next();

            }

            A = intCnonvert(entrada.next());
            B = intCnonvert(entrada.next());


            for (int i = 0; i < N; i++) {
                charHeight(charWidth(arrChar[i], calculo(M, B)) , calculo(N, A) );
            }
            
            N = intCnonvert(entrada.next());
            M = intCnonvert(entrada.next());


        }
        
        
        
        
    }
    
}
