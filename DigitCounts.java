import java.util.*;
import java.lang.*;
import java.io.*;

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
//</editor-fold>    
    
    
    
    //var globales 
    public static int arr[] = {1,20,300,4000,50000,600000,7000000,80000000};
    
    public static int arrCero[] = {0,9,180,2700,36000,450000,5400000,63000000 ,720000000};
    
    public static int arrBASE10[] = {1,10,100,1000,10000,100000,1000000,10000000,100000000};
    
    

    
    public static int[] AllDigits( String cadenaEntrada){
        int arrSalida[] = new int[10];
        
        int tamanioCadEntrada = cadenaEntrada.length(); 
        
        //posicion en arr segun el tamanio de la cadena
        int BaseDigitoEvaluar = tamanioCadEntrada-1;
        
        
        //numero que tomara de arreglo base nueve
        int posArregloBaseN = BaseDigitoEvaluar - 1;
        
        
        int resultadoDG = 0;
        for (int i = 0; i < tamanioCadEntrada-1; i++) {
            
            //hacer multiplicacion segun digito
            
            resultadoDG+= Integer.parseInt(String.valueOf(cadenaEntrada.charAt(i))) * (arr[posArregloBaseN - i]);
            
            
        }
        
        for (int i = 0; i < 10; i++) {
            arrSalida[i] = resultadoDG;
           
        }
        
        return arrSalida;
    }
    
    
    //con este metodo se sumara a los digitos segun lo indique el caracter-1 de la cadena   
    public static int[] allMenosUno(int arrSalida[], int tamanio, String cadEntrada){
        
        
        //evaluar segun DG de mayor peso y sumar digitos hasta [dgMpeso-1]
        int dgMayorPeso = 0;

        int i = 0;

        double base10 = 10.0;
        
        char varTemp = 'n';
        
                
        int contCiclo = 0;
        //Recorre cadena de entrada
        
        double tamaniotemp = tamanio;
        for(i = 0 ; i < tamanio ; i++){
            varTemp = cadEntrada.charAt(i);
            
            //var para subCiclo para aumentar hasta ese DG en arrDGsalida
            contCiclo = Integer.parseInt(String.valueOf(varTemp));
            
            
            base10 = Math.pow(10.0, (tamaniotemp-1));
            if (contCiclo != 1) {
                for(int j = 1; j < contCiclo; j++) 
                {
                
                arrSalida[j]+= (int)base10;
                
                
                }
            }
            
            
            //reducir tamanio temp que es la potencia a la que se elevara segun el tamanio de la cadena
            tamaniotemp--;
        }
        
        return arrSalida;
    }
    
    public static int[] digitoDecad(String caDentrada, int[] arrSalida){
        int tamanioEn = caDentrada.length();
        
        char tempDG = 'w';
        //Jose Francisco
        int dg = 0;
        for (int i = 0; i < tamanioEn-1; i++) {
            dg = Integer.parseInt(String.valueOf(caDentrada.charAt(i)));
           
           arrSalida[dg]+= Integer.parseInt(caDentrada.substring(i+1,tamanioEn));
        }
        
        return arrSalida;
    }
    
    public static String restarDG(int[] arrSalida, int[] arrInferior){
        
        String salida = "";
        
        for (int i = 0; i < 10; i++) {
           // System.out.println(arrSalida[i]+" - "+arrInferior[i] + " = ") ;
            salida+= String.valueOf(arrSalida[i] - arrInferior[i])+" ";
            //  System.out.println(arrSalida[i]);
        }
        
        return salida;
    }
    
    //aumentar uno a entrada y evaluar si el ultimo digito es cero 
    
    
    //para encontrar ceros
    
    //metodo para encontrar el n de ceros hasta una potencia menor
    public static int CerosSobre9(char DG, String cadenaOriginal){
    int dgmultiplo = 0;
    
    //tamaño de cadena -1 Desde donde empezara en el arreglo
    int lth = cadenaOriginal.length()-1;
    
    //constantemente se sumara 
    
    return dgmultiplo;
    }
    
    
    public static int exponenteAbajo(String cadenaOriginal){
        //var salida
        int ceros = 0;
        
        //var que alamcena String modificado 
        int cadBase9 = 0;
        int cadBase9EXCEDENTE = 0;
        //evaluar si es uno o si es mayor a 1
       
        //Guardar cadena a restar
        int cadRes = (cadenaOriginal.length()>1)? Integer.parseInt(cadenaOriginal.substring(1,cadenaOriginal.length()))+1:0;
        
        
            //acomodar String para metodo
            cadBase9 = Integer.parseInt(cadenaOriginal) - (cadRes);
            
            
            
       ceros+=CerosSubDG(String.valueOf(cadBase9));
       ceros+=CerosSubDG(cadenaOriginal.substring(1,cadenaOriginal.length()));
       
            
        return ceros;
    }
    public static int CerosSubDG(String CadenaOriginal){
        int ceros = 0;
        
        int lgth = CadenaOriginal.length()-1;
        
        //se inicializa en cualquier Dg ya que ira cambiando
        char NextDG = 'a';
        
        //aux de NextDG
        int auxNextDG = 0;
        
        for (int i = 0; i < CadenaOriginal.length(); i++) {
            
            auxNextDG = Integer.parseInt(String.valueOf(CadenaOriginal.charAt(i)));
            
            ceros+= auxNextDG *(arrCero[lgth]/9);
            lgth--;
        }
      
        return ceros;
    }
    
    //metodo 2 
    //metodo que determina el excedente de ceros segun exponente
    public static int mayorAuno(String cadenaOriginal){
        int ceros=0;
        
        int lgth = (cadenaOriginal.length()>1)? cadenaOriginal.length()-2:0;
        //dg auxiliar que determina si es o no mayor a cero
        char dgAux = 'n';
        
        int i = 0;
        int indice = 1;
        
        int cerosindiv = 0;
        
        int len = 0 ; 
        
        for(i=1; i <cadenaOriginal.length(); i++){
            dgAux = cadenaOriginal.charAt(i);
       
            if (dgAux != '0') {
             
                ceros+=arrBASE10[lgth];
            
            }else{
             
                //cerosindiv = (cadenaOriginal.length()==1)?Integer.parseInt(cadenaOriginal): Integer.parseInt(cadenaOriginal.substring(i+1, cadenaOriginal.length()));
                String aux = (cadenaOriginal.length()==1)?cadenaOriginal: cadenaOriginal.substring(i+1, cadenaOriginal.length());
                
                cerosindiv = (aux.equals(""))?Integer.parseInt(String.valueOf(cadenaOriginal.charAt(cadenaOriginal.length()-1))):Integer.parseInt(aux);
                
                len = String.valueOf(cerosindiv).length();
                ceros++;
               
                if (len>0 && cerosindiv!=0) {
                
                    ceros+=(cerosindiv!=0)?cerosindiv:1;
                }
                
            }
            
            indice++;
            lgth--;
        }
        
        return ceros;
    }
    public static int Igual(String cadenaEntrada){
        int ceros = 0; 
        int cadesinCeros = cadenaEntrada.replace("0", "").length();
        
        int length = cadenaEntrada.length();
        
        ceros = length - cadesinCeros;
        //solo contar los ceros que hay en una de las cadenas 
        
        
        return ceros;
    }   
    public static void main(String[] args) throws IOException {
 
        String entradaa = "";
	        String entradab = "";   
	        
	        
	        Scanner entrada = new Scanner();
	        
	        String salida = "";
	         
	        
	        
	         entradaa = entrada.next();
	           entradab = entrada.next();
	        while(!entradaa.equals("0") && !entradab.equals("0")){
	                
	           
	           //aumentar entrada en uno 
	           
	           entradab = String.valueOf(Integer.parseInt(entradab)+1);
	
	           
	           
	
	           int arrSalida[] = AllDigits(entradab);
	           int arrInferior[] = AllDigits(entradaa);
	
	           arrSalida = allMenosUno(arrSalida, entradab.length(), entradab);
	           arrInferior = allMenosUno(arrInferior, entradaa.length(), entradaa);
	
	            //tope es 0?
	           // arrSalida[0] = (entradab.charAt(entradab.length()-1)=='0')?arrSalida[0]-1:arrSalida[0];
	           
	           arrSalida = digitoDecad(entradab, arrSalida);
	           arrInferior = digitoDecad(entradaa, arrInferior);
	           
	           
	           entradab =  String.valueOf(Integer.parseInt(entradab)-1); 
	           entradaa = String.valueOf(Integer.parseInt(entradaa));
	        
	           
	               
	            //entradaa = (entradaa.equals(entradab))?String.valueOf(Integer.parseInt(entradaa)-1):entradaa;
	                
	            if (entradaa.equals(entradab)) {
	                arrSalida[0] = Igual(entradab);
	                arrInferior[0] = 0;
	                
	            }else{
	                entradaa = String.valueOf(Integer.parseInt(entradaa)-1);
	                arrSalida[0] = exponenteAbajo(entradab);
	                arrInferior[0] = exponenteAbajo(entradaa);
	
	                 arrSalida[0]+= mayorAuno(entradab);
	                arrInferior[0]+= mayorAuno(entradaa);
	
	            }
	            
	
	            salida = restarDG(arrSalida, arrInferior);
	           
	                 System.out.println(salida.trim());
	                    
	             entradaa = entrada.next();
	           entradab = entrada.next();
	        }   
 
    }
 
}