/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laberintos;

import java.io.*;
import java.util.*;

/**
 *
 * @author Francisco
 */
public class Laberintos {

    
            
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

    
    public static int intConvert(String val)
    {
        return Integer.parseInt(val);
    }
    
    static class laberinto{
        List<Integer> listVertex;
        public laberinto( List<Integer> lista ){
            
            listVertex = lista;
            
        }
        
    }

    public static laberinto[] inicializaGFlaberinto( int nItems , laberinto l[] ){
        
        for( int i = 0 ; i < nItems ; i++  )
        {
            l[i] = new laberinto( new ArrayList() );
        }
        return l;
    }
    
        
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner();
        
        //inicio , Vertices , Aristas
        int N = 0 , V = 0 , A = 0;
        
        //numero de casos
        int T = intConvert( entrada.next() );
        
                
        //laberinto
        laberinto arrVertex[];
        
        
        //uniones entrada
        int arrUnionesIn[] = new int[2];
        
        //se prepara variable de salida 
        int salida = 0;
        
        
        while( T != 0 )
        {
            
            //posicion inicio
            N = intConvert( entrada.next() );

            //vertices
            V = intConvert( entrada.next() );

            //aristas
            A = intConvert( entrada.next() );

            //laberinto
            arrVertex = new laberinto[ V ];

            //inicializar
            arrVertex = inicializaGFlaberinto(  arrVertex.length  , arrVertex);
            
            for (int i = 0; i < A; i++) {
                //ingreso de par de vertices
                arrUnionesIn[0] = intConvert( entrada.next() );//este numero
                arrUnionesIn[1] = intConvert( entrada.next() );//se une con este

                //se ordena
                Arrays.sort(arrUnionesIn);


                //se evalua si existe elemento en el laberinto
                if ( arrVertex[arrUnionesIn[0]].listVertex.indexOf( arrUnionesIn[1] ) == -1 ) {
                    //se ingresa en laberinto
                    arrVertex[arrUnionesIn[0]].listVertex.add(arrUnionesIn[1]);
                    salida++;
                }

                //se ingresa en laberinto


            }
            System.out.println( "Salida = " + ( salida * 2 ) );
            salida = 0;
            T--;
        }
        
        
        
        
        
        //ArrayList<Integer> p[] = new ArrayList<Integer>[5]();
        
        
        
        
        
        
        
        
        
        
        
        

    
        
    }
    
}
