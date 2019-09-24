/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stopall;

import java.io.*;
import java.util.*;


/**
 *
 * @author francisco
 */
public class StopAll {

            
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
    
    static class Vecindario{
        
        List<Integer> listVertex;
        
        public Vecindario( List<Integer> l ){
            this.listVertex = l;
        }
        public Vecindario(){
            this.listVertex = new ArrayList<Integer>();
        }
        
    }
    
    public static Vecindario persistencia = null;
    
    public static int intConvert( String val ){
        return Integer.parseInt( val );
    }
    
    public static String letsOrDeur( Vecindario arrVertex[] , int nodoInicio , Integer nodoBusca ){
        
        if ( arrVertex[ nodoInicio ].listVertex.indexOf( nodoBusca ) == -1 ) {
            return "Lets que lets";
        }
        
        if( arrVertex[ nodoInicio ].listVertex.size() == 0  ){
            return "Deu ruim";
        }
        
        
        for (int i = 0; i < arrVertex[ nodoInicio ].listVertex.size() ; i++) {
            
            arrVertex[ nodoInicio ].listVertex.get( i );
            
            
            
        }
        
        
        
        return "";
    }
    
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner();
        //se inicializan variables de entrada
        int N = intConvert( entrada.next() );
        int M = intConvert( entrada.next() );
        int P = intConvert( entrada.next() );
        
        int ArrAyB[] = new int[2];
        int ArrKyL[] = new int[2];
        Vecindario arrVecindario[] = new Vecindario[N];
        
        for (int i = 0; i < M; i++) {
            ArrAyB[0] = intConvert( entrada.next() );
            ArrAyB[1] = intConvert( entrada.next() );
            
            Arrays.sort( ArrAyB );
            
            arrVecindario[ ArrAyB[0] - 1 ] = new Vecindario( new ArrayList() );
            
            arrVecindario[ ArrAyB[0] - 1 ].listVertex.add( ArrAyB[1] );
            
            
            
        }
        
        for (int i = 0; i < P; i++) {
            
            ArrKyL[0] = intConvert( entrada.next() );
            ArrKyL[1] = intConvert( entrada.next() );
            Arrays.sort( ArrKyL );
            
            String salida = letsOrDeur( arrVecindario , ArrKyL[0] - 1 , ArrKyL[1] - 1 );
            
            
                
                
        }
        
        
        
        
        
    }
    
}
