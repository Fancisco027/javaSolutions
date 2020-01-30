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
 * @author Francisco
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
    
    public static int intConvert( String val ){
        return Integer.parseInt( val );
    }
    
    
    // parametros
    // Arreglo (grafo), inicio , nodoObjetivo
    
    public static String letsOrDeur( int nodoInicio, int nodoObjetivo , Vecindario[] l )
        {
            //nivel o nodo ( en donde se vizualizan los vecinos )
            int nodoActual = 0;
            
            int arrVisitados[] = new int[ l.length ];
            
            //Queue para visitar todos los nodos
            Queue< Integer > q = new LinkedList< Integer >();
            
            //primer nodo para iniciar el recorrido
            q.add( nodoInicio );
            
            while( !q.isEmpty() )
            {
                //se optiene el nodo que se analizara 
                nodoActual = q.remove();
                
                //marca como visitado el nodo que se analizara 
                arrVisitados[nodoActual] = 1;
                
                //si es nulo no se toma el siguiente
                if ( l[ nodoActual ] == null )
                    continue;
                
                //ciclo de analizis de vecinos 
                for (int i = 0; i < l[ nodoActual ].listVertex.size() ; i++)
                {   
                    //si se encuentra el nodo objetivo terminar el proceso
                    if ( l[nodoActual].listVertex.get(i) == nodoObjetivo )
                        return "Lets que lets";
                    
                   //en caso de que ya se visito, continuar con el siguiente vecino
                    if ( arrVisitados[ l[nodoActual].listVertex.get(i) ] == 1 )
                        continue;
                    
                    //se agrega a cola para despues realizar la busqueda en sus vecinos 
                    q.add( l[nodoActual].listVertex.get(i) );
                    
                }

            }
            
            return "Deu ruim";
        }
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner();

        int N = intConvert( entrada.next() );
        int M = intConvert( entrada.next() );
        int P = intConvert( entrada.next() );
        
        int ArrAyB[] = new int[2];
        int ArrKyL[] = new int[2];
        
        Vecindario arrVecindario[] = new Vecindario[N];
        
        
        
        for (int i = 0; i < M; i++) 
        {
            
            ArrAyB[0] = intConvert( entrada.next() );
            ArrAyB[1] = intConvert( entrada.next() );
            
            //ingreso de "vecindarios"
            if ( ( arrVecindario[ ArrAyB[0] - 1 ] == null ) ) 
                arrVecindario[ ArrAyB[0] - 1 ] = new Vecindario( new ArrayList() );
            
            //ingreso de "vecindarios"
            arrVecindario[ ArrAyB[0] - 1 ].listVertex.add( ArrAyB[1] - 1 );
            
        }
        String salida = "";
        for (int j = 0; j < P; j++) 
        {
            //consultas 
            ArrKyL[0] = intConvert( entrada.next() );
            ArrKyL[1] = intConvert( entrada.next() );
            
            //como es un grafo no dirigido se hace para los 2 lados (*)
            //(*)
            salida = letsOrDeur( ArrKyL[0] - 1 , ArrKyL[ 1 ] - 1  , arrVecindario );
            
            if ( !salida.equals("Lets que lets") ) 
                //(*)
                salida = letsOrDeur( ArrKyL[1] - 1 , ArrKyL[ 0 ] - 1  , arrVecindario );
            
            //out
            System.out.println(salida);
            
        }

    }
    
}
