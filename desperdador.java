
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
    
    
    public static int intconvert(String numero){
        return Integer.parseInt(numero);
    }

    public static getAbsoluteSeconds(int h)
    {
        return (h * 3600);
    }

public static void main(String[] args) {
    
//<editor-fold defaultstate="collapsed" desc="despertador">

    Scanner entrada = new Scanner();

    int m1 = 0, m2 = 0, h1 = 0 , h2 = 0 ;

    h1 = intconvert( entrada.next() );
    m1 = intconvert( entrada.next() );

    h2 = intconvert( entrada.next() );
    m2 = intconvert( entrada.next() );




    int segSepurrior = 0 ; 
    int segInferior = 0 ; 


    while ( h1 != 0 && h2 != 0 && m1 != 0 && m2 != 0 ) {
        

        segSuperrior = getAbsoluteSeconds(h1) + ( m1 * 60 );
        segInferior = getAbsoluteSeconds(h2) + ( m2 * 60 );

        salida = segSuperrior - segInferior;

        System.out.println(salida);


    }

//</editor-fold>

}