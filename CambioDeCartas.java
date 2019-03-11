
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

//
////<editor-fold defaultstate="collapsed" desc="intercambio 04">
//        
//        int arrA[];
//        int arrHashA[];
//        
//        int arrB[];
//        int arrHashB[];
//
////        Scanner entrada = new Scanner();
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
//            //se evalua quien tiene mas cartas, o si tienen las mismas
//           // ArrayList<Object> MethodResultList= fillAndHashArr(arrA, lgthA);
//           // int arrARes[] = MethodResultList.get(1);
//            
//            
//            
//            Set<String> indicesHashA = new HashSet<String>(Arrays.asList( (indicesA.trim()).split(" ") ) );
//            Set<String> indicesHashB = new HashSet<String>(Arrays.asList( (indicesB.trim()).split(" ") ));
//            Set<String> Evaluar = null;
//            
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


//<editor-fold defaultstate="collapsed" desc="intercambio 05">
    
    HashSet<String> hashA = new HashSet<String>();
    HashSet<String> hashB = new HashSet<String>();
    
    int arrA[] = new int[100001];
    int arrB[] = new int[100001];
    int arrto[] = null;
    
    HashSet<String> MinHash = new HashSet<String>();
    HashSet<String> to = new HashSet<String>();
    
    String arrHasmin[] = null;
    
    
    Scanner entrada = new Scanner();
    
    int lgthA = intconvert(entrada.next());
    int lgthB = intconvert(entrada.next());
    
    String temp = "";
    
    while (lgthA != 0 && lgthB != 0)
    {
        arrA = new int[100001];
        arrB = new int[100001];
        hashA = new HashSet<String>();
        hashB = new HashSet<String>();
        
         
        for (int i = 0; i < lgthA; i++) 
        {
            temp = entrada.next();
            hashA.add(temp);
            arrA[intconvert(temp)]++;
            
        }
        for (int i = 0; i < lgthB; i++) {
            temp = entrada.next();
            hashB.add(temp);
            arrB[intconvert(temp)]++;
        }
        
        if(hashA.size() >= hashB.size() ){ 
            MinHash = hashB;
            arrto = arrA;
        }else{
            MinHash = hashA;
            arrto = arrB;
        }
        
        int cambios = 0 ; 
        
        for (String item : MinHash) {
            cambios+= ( arrto[intconvert(item)] == 0 )?1:0;
        }
        System.out.println(cambios);
        
        cambios = 0 ; 
        
        lgthA = intconvert(entrada.next());
        lgthB = intconvert(entrada.next());
        
    }
    
            
    

//</editor-fold>
      


    }
    public static int intconvert(String numero)
    {
        return Integer.parseInt(numero);
    }
    
    
    
    
}
