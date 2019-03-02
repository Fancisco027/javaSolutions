
package cambiodecartas;

import java.io.*;
import java.util.*;

/**
 *
 * @author Francisco
 */
public class CambioDeCartas {

    
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
    
    
    
    public static String indicesA = "";
    public static String indicesB = "";
    public static Scanner entrada = new Scanner();
    
    public static void main(String[] args) throws IOException {
//        
//        //<editor-fold defaultstate="collapsed" desc="Intercambio de cartas 01">
//        Scanner entrada = new Scanner();
//        HashSet<String> A = new HashSet<String>();
//        HashSet<String> B = new HashSet<String>();
//        
//        Integer na = intconvert(entrada.next());
//        Integer nb = intconvert(entrada.next());
//        Integer nbAux = 0; 
//        
//        HashSet<String> arrEvaluar = new HashSet<String>();
//        HashSet<String> to = new HashSet<String>();
//        
//        int salida = 0;
// 
//        String arrEv[] = null;
//
//        while(na != 0 && nb != 0){
//            //Agregado de cometarios por sesion
//            Collections.addAll(A, entrada.nextLine().split(" "));
//            Collections.addAll(B, entrada.nextLine().split(" "));
//            
//            if (na<nb) {
//                arrEvaluar = A;
//                to = B;
//                
//            }else{
//                arrEvaluar = B;
//                to = A;
//            }
//            /**
//             * esto es solo un script 
//             */
//            for (int i = 0; i < arrEvaluar.toArray().length; i++) 
//            {
//                if (!to.contains(arrEvaluar.toArray()[i]))
//                    salida++;
//            }
//            System.out.println("= " + salida);
//
//            salida = 0;
//             na = intconvert(entrada.next());
//             nb = intconvert(entrada.next());
//        }
//        //</editor-fold>
////        
////<editor-fold defaultstate="collapsed" desc="intercambio de cartas 02">
//
//        int arrA[] = new int[100000];
//        int arrB[] = new int[100000];
//
//        Scanner entrada = new Scanner();
//
//        int lgthA = intconvert(entrada.next());
//        int lgthB = intconvert(entrada.next());
//
//        while(lgthA != 0 && lgthB != 0){
//            
//            //ingreso de cartas para A
//            for (int i = 0; i < lgthA; i++) {
//                arrA[intconvert(entrada.next())]++;
//            }
//            //Ingreso de cartas para B
//            for (int i = 0; i < lgthB; i++) {
//                arrB[intconvert(entrada.next())]++;
//            }
//            
//            System.out.println(Arrays.toString(arrA));
//            System.out.println("|====================================================================================================================================================================================================================================|");
//            System.out.println(Arrays.toString(arrB));
//
//        }
//
//
//
//
//
////</editor-fold>




//
////<editor-fold defaultstate="collapsed" desc="intercambio 03">
//        
//        int arrA[];
//        int arrB[];
//
//        Scanner entrada = new Scanner();
//
//        int lgthA = intconvert(entrada.next());
//        int lgthB = intconvert(entrada.next());
//
//        int minCartas = 0;
//        
//        
//        
//        while(lgthA != 0 && lgthB != 0){
//            int arrEvaluar[] = null;
//            arrA = new int[100001];
//            arrB = new int[100001];
//            
//            
//            int temp = 0 ;     
//            
//            //ingreso de cartas para A
//            for (int i = 0; i < lgthA; i++) {
//                temp = intconvert(entrada.next());
//                arrA[temp]++;
//                indicesA+=" " + String.valueOf(temp);
//            }
//            //Ingreso de cartas para B
//            for (int i = 0; i < lgthB; i++) {
//                temp = intconvert(entrada.next());
//                arrB[temp]++;
//                indicesB+=" " + String.valueOf(temp);
//            }
//            
//            
//            Set<String> indicesHashA = new HashSet<String>(Arrays.asList( (indicesA.trim()).split(" ") ) );
//            Set<String> indicesHashB = new HashSet<String>(Arrays.asList( (indicesB.trim()).split(" ") ));
//            Set<String> Evaluar = null;
//            if(lgthA<=lgthB)
//            {
//                minCartas = lgthA;
//                arrEvaluar = arrB;
//                Evaluar =indicesHashA;
//               
//            }else
//            {
//                minCartas = lgthB;
//                arrEvaluar = arrA;
//                Evaluar =indicesHashB;
//            }
//            
//            int salida = 0 ; 
//            
//            for (String o : Evaluar) {
//                salida+= ( arrEvaluar[intconvert(o)] == 0)?1:0;
//                
//            }
//            //salida
//            System.out.println(salida);
//            indicesA = "";
//            indicesB = "";
//            lgthA = intconvert(entrada.next());
//            lgthB = intconvert(entrada.next());
//            
//        }
//
//
//
//
////</editor-fold>
//        


//<editor-fold defaultstate="collapsed" desc="intercambio 04">
        
        int arrA[];
        int arrHashA[];
        
        int arrB[];
        int arrHashB[];

//        Scanner entrada = new Scanner();

        int lgthA = intconvert(entrada.next());
        int lgthB = intconvert(entrada.next());

        int minCartas = 0;
        
        
        
        while(lgthA != 0 && lgthB != 0){
            int arrEvaluar[] = null;
            arrA = new int[100001];
            arrB = new int[100001];
            
            
            int temp = 0 ;     
            
            //se evalua quien tiene mas cartas, o si tienen las mismas
            ArrayList<Object> MethodResultList= fillAndHashArr(arrA, lgthA);
           // int arrARes[] = MethodResultList.get(1);
            
            
            
            Set<String> indicesHashA = new HashSet<String>(Arrays.asList( (indicesA.trim()).split(" ") ) );
            Set<String> indicesHashB = new HashSet<String>(Arrays.asList( (indicesB.trim()).split(" ") ));
            Set<String> Evaluar = null;
            if(lgthA<=lgthB)
            {
                minCartas = lgthA;
                arrEvaluar = arrB;
                Evaluar =indicesHashA;
               
            }else
            {
                minCartas = lgthB;
                arrEvaluar = arrA;
                Evaluar =indicesHashB;
            }
            
            int salida = 0 ; 
            
            for (String o : Evaluar) {
                salida+= ( arrEvaluar[intconvert(o)] == 0)?1:0;
                
            }
            //salida
            System.out.println(salida);
            indicesA = "";
            indicesB = "";
            lgthA = intconvert(entrada.next());
            lgthB = intconvert(entrada.next());
            
        }




//</editor-fold>
      

    }
    public static int intconvert(String numero){
        return Integer.parseInt(numero);
    }
    public static int[] OnlyfillArrPlayer(int arr[], int limit) throws IOException{
        int temp = 0;
        for (int i = 0; i < limit; i++) {
                temp = intconvert( entrada.next() );
                arr[temp]++;
            }
        return arr;
    }
    
    public static ArrayList<Object> fillAndHashArr(int arr[], int limit) throws IOException{
        
        int temp = intconvert( entrada.next() );
        int tempAnt = temp;
        
        arr[temp]++;
        ArrayList<Integer> hashList = new ArrayList<Integer>();
        hashList.add(temp);
        ArrayList<Object> salida = new ArrayList<Object>();
        
        for (int i = 1; i < limit; i++) {
                temp = intconvert( entrada.next() );
                
            if (tempAnt != temp) 
            {
                hashList.add(temp);
                tempAnt = temp;
            }
            
                arr[temp]++;
                
        }
        
        salida.add(arr);
        salida.add(hashList);
        
        return salida;
    }
    
}
