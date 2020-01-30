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
    
    public static String returnStringArray( Object[] arr )
    {
        String salida = "" ; 
        for (int i = 0; i < arr.length; i++) {
            salida+= String.valueOf( arr[i] );
            
        }
        return salida;
    }
    
    // parametros
    // Arreglo (grafo), inicio , nodoObjetivo
    
    public static String letsOrDeur( int nodoInicio, int nodoObjetivo , Vecindario[] l )
        {
            int arrVisitados[] = new int[ l.length ];
            
            int cont = 0;
            
            Queue< Integer > q = new LinkedList< Integer >();
            
            Set< Integer > setToQueue = new HashSet<Integer>();
            
            q.add( nodoInicio );
            
            while( !q.isEmpty() )
            {
                cont++;
//                System.out.println("cont = " + cont + "proceso");
//                System.out.println("Tamanio de QUEUE : " + q.size());
//                System.out.println("==========================");
//                System.out.println("Elementos de cola:");
//                System.out.println( q.toString() );
//                System.out.println("/////////////////////////////");
                int nodoActual = q.remove();
                
                System.out.println("==================");
                System.out.println( "nodoActial = " + ( nodoActual + 1 ) );
                if ( l[ nodoActual ] != null )
                    System.out.println("LISTA > " + l[ nodoActual ].listVertex.toString());
                arrVisitados[nodoActual] = 1;
                
                if ( l[ nodoActual ] == null ) {
//                    Syste'm.out.println("Entro al CONDICION EN ");
//                    System.out.println( nodoActual );
                    continue;
                    //return "Deu ruim";
                }
                
//                System.out.println("==== CONDICION ===");
//                System.out.println("Se busca : " + nodoObjetivo + " a partir de: " + nodoActual);
//                System.out.println( l[ nodoActual ].listVertex.indexOf( nodoObjetivo ) );
//                System.out.println("/.=================");
                
                for (int i = 0; i < l[ nodoActual ].listVertex.size() ; i++)
                {
                    if ( l[nodoActual].listVertex.get(i) == nodoObjetivo )
                    {
                        return "Lets que lets";
                    }
                    
                    if ( arrVisitados[ l[nodoActual].listVertex.get(i) ] == 1 )
                    {
                        continue;
                    }
                    
                    q.add( arrVisitados[ l[nodoActual].listVertex.get(i) ] );
                    
                }


                //<>
                //comprobando si existe el nodo objetivo en tal lista objetivo
//                if ( l[ nodoActual ].listVertex.indexOf( nodoObjetivo ) != -1 ) 
//                {
//                    return "Lets que lets";
//                }else
//                {
////                    System.out.println("==== Agrega nodos que no existen, PRE son: ===");
////                    System.out.println( returnStringArray(  setToQueue.toArray()  )  );
////                    System.out.println("====/.========================================");
//                    setToQueue.addAll( q ) ;
////                    System.out.println("=== Agrega nodos que no existen, POST son: ===");
////                    System.out.println( returnStringArray(  setToQueue.toArray()  ) );
////                    System.out.println("====/.========================================");
////                    
//                    setToQueue.addAll( l[ nodoActual ].listVertex ) ;
//                    q.clear();
//                    q.addAll( setToQueue );
////                    System.out.println("============ La cola es, POST son: ===========");
////                    System.out.println( q.toString() );
////                    System.out.println("tope es: " + q.poll());
////                    System.out.println("====/.====================================");
//                    
//                }
                
                
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
            
//            Arrays.sort( ArrAyB );
            
            if ( ( arrVecindario[ ArrAyB[0] - 1 ] == null ) ) 
            {
                arrVecindario[ ArrAyB[0] - 1 ] = new Vecindario( new ArrayList() );
                arrVecindario[ ArrAyB[1] - 1 ] = new Vecindario( new ArrayList() );
            }
            
            arrVecindario[ ArrAyB[0] - 1 ].listVertex.add( ArrAyB[1] - 1 );
            arrVecindario[ ArrAyB[1] - 1 ].listVertex.add( ArrAyB[0] - 1 );
            //para asignacion de valores siempre restar uno
        }
        String salida = "";
        for (int j = 0; j < P; j++) 
        {
            
            ArrKyL[0] = intConvert( entrada.next() );
            ArrKyL[1] = intConvert( entrada.next() );
//            Arrays.sort( ArrKyL );
            
            salida = letsOrDeur( ArrKyL[0] - 1 , ArrKyL[ 1 ] - 1  , arrVecindario );
            if ( !salida.equals("Lets que lets") ) 
            {
                System.out.println(">FIN DE PRIMER PROCESP<");
                System.out.println("BUELTA 2");
                salida = letsOrDeur( ArrKyL[1] - 1 , ArrKyL[ 0 ] - 1  , arrVecindario );
            }
            System.out.println(salida);
            
            
        }

        
        
//        //<editor-fold defaultstate="collapsed" desc="StopAll con listas">
//        //se inicializan variables de entrada
//        int N = intConvert( entrada.next() );
//        int M = intConvert( entrada.next() );
//        int P = intConvert( entrada.next() );
//        
//        int ArrAyB[] = new int[2];
//        int ArrKyL[] = new int[2];
//        Vecindario arrVecindario[] = new Vecindario[N];
//        
//        for (int i = 0; i < M; i++) {
//            ArrAyB[0] = intConvert( entrada.next() );
//            ArrAyB[1] = intConvert( entrada.next() );
//            
//            Arrays.sort( ArrAyB );
//            
//            arrVecindario[ ArrAyB[0] - 1 ] = new Vecindario( new ArrayList() );
//            
//            arrVecindario[ ArrAyB[0] - 1 ].listVertex.add( ArrAyB[1] );
//            
//            
//            
//        }
//        
//        for (int i = 0; i < P; i++) {
//            
//            ArrKyL[0] = intConvert( entrada.next() );
//            ArrKyL[1] = intConvert( entrada.next() );
//            Arrays.sort( ArrKyL );
//            
//            System.out.println("=========array================");
//            System.out.println("ArrAyb pos[0] : " + ArrKyL[0] + " pos [1] " + ArrKyL[1]);
//            System.out.println("==============================");
//            if( arrVecindario[ ArrKyL[0] ].listVertex.indexOf( ArrKyL[1] ) == -1 ) {
//                System.out.println("    ==valor=");
//                //System.out.println("    " + arrVecindario[ ArrKyL[0] ].listVertex.get( ArrKyL[1] ) );
//                System.out.println("    " + arrVecindario[ ArrKyL[0] ].listVertex.toString() ) ;
//                System.out.println("    ========");
//                System.out.println("Deu ruim");                
//            }
//
//            else 
//                System.out.println("Lets que lets");
//                
//                
//        }
//        //</editor-fold>

        
    }
    
}
